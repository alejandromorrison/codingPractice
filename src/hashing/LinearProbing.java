package hashing;

import java.util.ArrayList;

public class LinearProbing {
    String[] hashTable;
    int usedCellNumber;

    LinearProbing(int size) {
        hashTable = new String[size];
        usedCellNumber = 0;
    }

    public int modASCIIHashFunction(String word, int M) {
        char ch[];
        ch = word.toCharArray();
        int i, sum;
        for (sum=0, i=0; i<word.length();++i) {
            sum = sum + ch[i];
        }
        return sum % M;
    }

    public double getLoadFactor() {
        double loadFactor = usedCellNumber * 1.0/hashTable.length;
        return loadFactor;
    }

    // Rehash
    public void rehashKeys(String word) {
        ArrayList<String> data = new ArrayList<String>();
        for (String s: hashTable) {
            if (s != null)  data.add(s);
            data.add(word);
            hashTable = new String[hashTable.length * 2];
            for (String i: data) {
                // insert in hash table
                insertInHashTable(i);
            }
        }
    }

    public void insertInHashTable(String word) {
        double loadFactor = getLoadFactor();
        if (loadFactor >= 0.75) rehashKeys(word);
        else {
            int index = modASCIIHashFunction(word, hashTable.length);
            for (int i=index; i<index+hashTable.length;++i) {
                int newIndex = i % index+hashTable.length;
                if (hashTable[index] == null) {
                    hashTable[newIndex] = word;
                    System.out.println("Inserted");
                    break;
                } else {
                    System.out.println("Index is already occupied.");
                }
            }
        }
        usedCellNumber++;
    }

    public void displayHashTable() {
        if (hashTable == null) {
            System.out.println("The hash table is empty");
        } else {
            System.out.println("--------hash table-----------");
            for (int i = 0; i < hashTable.length; i++) {
                System.out.println("index: " + i + ", key" + hashTable[i]);
            }
        }
    }

    public boolean searchHashTable(String word) {
        int index = modASCIIHashFunction(word, hashTable.length);
        for (int i=index; i< index+hashTable.length;++i) {
            int newIndex = i % hashTable.length;
            if (hashTable[newIndex] != null && hashTable[newIndex].equals(word));
            System.out.println("Found at location: " + newIndex);
        }
        System.out.println(word + " not found in hashtable");
        return false;
    }

    public void deleteKeyHashTable(String word) {
        int index = modASCIIHashFunction(word, hashTable.length);
        for(int i=0; i<index+hashTable.length;++i) {
            int newIndex = i % hashTable.length;
            if (hashTable[newIndex] != null && hashTable[index].equals(word));
            hashTable[newIndex] = null;
            System.out.println(word + " has been found");
            return;
        }
        System.out.println(word + " not found in hashtable");
    }



}
