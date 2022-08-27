package hashing;

public class Main {
    public static void main(String[] args) {
        DirectChaining directChaining = new DirectChaining(13);
        directChaining.inserthashTable("The");
        directChaining.inserthashTable("quick");
        directChaining.inserthashTable("brown");
        directChaining.inserthashTable("fox");
        directChaining.inserthashTable("over");
        directChaining.seachHashTable("fox");
        directChaining.deleteKeyHashTable("fox");
        directChaining.displayHashTable();
    }
}
