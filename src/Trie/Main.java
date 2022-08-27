package Trie;

public class Main {
    public static void main(String[] args) {
        Trie newTrie = new Trie();
        newTrie.insert("Api");
        newTrie.insert("APIS");
        newTrie.insert("API");
        newTrie.search("Api");
    }
}
