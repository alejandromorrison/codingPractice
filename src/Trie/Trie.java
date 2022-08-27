package Trie;

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
        System.out.println("Created");
    }

    // Insertion
    public void insert(String word) {
        TrieNode current = root;

        for (int i=0; i<word.length(); ++i) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                node = new TrieNode();
                current.children.put(ch, node);
            }
            current = node;
        }
        current.endOfString = true;
    }

    // Search
    public boolean search(String word) {
        TrieNode currentNode = root;
        for (int i=0; i<word.length();++i) {
            char ch = word.charAt(i);
            TrieNode node = currentNode.children.get(ch);
            if (node == null) {
                System.out.println("Word: " + word + " does not exist");
                return false;
            }
            currentNode = node;
        }
        if (currentNode.endOfString == true) {
            System.out.println("Word: " + word + " exist");
            return true;
        } else {
            System.out.println("Word: " + word + " does not exist but is a prefix of another string");
        }
        return currentNode.endOfString;
    }

    // Deletion
    private boolean delete(TrieNode parentNode, String word, int index) {
        char ch = word.charAt(index);
        TrieNode currentNode = parentNode.children.get(ch);
        boolean canbdeleted;

        if (currentNode.children.size() > 1) {
            delete(currentNode, word, index+1);
            return false;
        }
        if (index == word.length()-1) {
            if (currentNode.children.size() >= 1) {
                currentNode.endOfString = false;
                return false;
            } else {
                parentNode.children.remove(ch);
                return true;
            }
        }
        if (currentNode.endOfString == true) {
            delete(currentNode, word, index+1);
            return false;
        }
        canbdeleted = delete(currentNode, word, index+1);
        if (canbdeleted == true) {
            parentNode.children.remove(ch);
            return true;
        } else {
            return false;
        }
    }

    public void delete(String word) {
        if (search(word) == true) {
            delete(root, word, 0);
        }
    }
}
