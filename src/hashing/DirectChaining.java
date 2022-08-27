package hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class DirectChaining {
    LinkedList<String>[] hashTable;
    int maxChainSize = 5;

    DirectChaining(int size) {
        hashTable = new LinkedList[size];
    }

    public int modASCIIHashfunction(String word, int m) {
        char ch[];
        ch = word.toCharArray();
        int i, sum;
        for(sum=0, i=0; i< word.length(); i++) {
            sum = sum + ch[i];
        }
        return sum % m;
    }

    public void inserthashTable(String word) {
        int newIndex = modASCIIHashfunction(word, hashTable.length);

        if (hashTable[newIndex] == null) {
            hashTable[newIndex] = new LinkedList<String>();
            hashTable[newIndex].add(word);
        } else {
            hashTable[newIndex].add(word);
        }
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

    public boolean seachHashTable(String word) {
        int newIndex = modASCIIHashfunction(word, hashTable.length);

        if (hashTable[newIndex] != null && hashTable[newIndex].contains(word)) {
            System.out.println("\n" + "\"" + word + "\"" + "found in Hastable at location: " + newIndex);
            return true;
        } else {
            System.out.println("\n" + "\"" + word + "\"" + "not found in Hastable");
            return false;
        }
    }

    public void deleteKeyHashTable(String word) {
        int newIndex = modASCIIHashfunction(word, hashTable.length);
        boolean result = seachHashTable(word);
        if ( result == true) {
            hashTable[newIndex].remove(word);
            System.out.println("\n" + "\"" + word + "\"" + "Has been deleted ");
        }
    }
}
