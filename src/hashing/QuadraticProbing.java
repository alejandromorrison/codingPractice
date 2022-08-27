package hashing;

import java.util.ArrayList;

public class QuadraticProbing {
    String[] hashTable;
    int usedCellNumber;

    QuadraticProbing(int size) {
        hashTable = new String[size];
        usedCellNumber = 0;
    }

    public int modASCIIHashFunction(String x, int M) {
        char ch[];
        ch = x.toCharArray();
        int i, sum;
        for (sum=0, i=0; i< x.length(); ++i) {
            sum += ch[i];
        }
        return sum % M;
    }

    public double getLoadFactor() {
        return usedCellNumber * 1.0 / hashTable.length;
    }

    public void rehashkeys(String newStringToBeInserted) {
        usedCellNumber = 0;
        ArrayList<String> data = new ArrayList<String>();
        for (String s: hashTable) {
            if (s != null)
                data.add(s);
        }
    }

    public void insertKeyInHashTable(String word) {
        double loadFactor = getLoadFactor();
        if (loadFactor >= 0.75) {
            rehashkeys(word);
        } else {
            int index = modASCIIHashFunction(word, hashTable.length);
            int counter=0;
            for (int i=index; i< index+hashTable.length;++i) {
                int newIndex = (index+ (counter * counter)) % hashTable.length;
                if (hashTable[newIndex] == null) {
                    hashTable[newIndex] = word;
                    System.out.println(word + " inserted");
                    break;
                } else {
                    System.out.println(newIndex + " is already occupied. trying next one");
                }
                counter++;
            }
        }
        usedCellNumber++;
    }
}
