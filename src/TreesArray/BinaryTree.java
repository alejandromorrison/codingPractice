package TreesArray;

public class BinaryTree {
    String[] arr;
    int lastUsedIndex;

    public BinaryTree(int size) {
        arr = new String[size+1];
        this.lastUsedIndex=0;
        System.out.println("Blank tree of size " + size + " has been created");
    }

    boolean isFull() {
        return arr.length-1 == lastUsedIndex;
    }

    void insert(String value) {
        if (!isFull()) {
            arr[lastUsedIndex+1] = value;
            ++lastUsedIndex;
            System.out.println("The value of " + value + " has been inserted");
        } else {
            System.out.println("The binary tree is full");
        }
    }

    void preOrder(int index) {
        if (index > lastUsedIndex)
            return;

        System.out.print(arr[index] + " " );
        preOrder(index * 2);
        preOrder(index * 2 + 1);
    }

    void inOrder(int index) {
        if (index > lastUsedIndex)
            return;

        inOrder(index * 2);
        System.out.print(arr[index] + " ");
        inOrder(index * 2 + 1);
    }

    void postOrder(int index) {
        if (index > lastUsedIndex)
            return;


        postOrder(index * 2); // left
        postOrder(index * 2 + 1); // right
        System.out.print(arr[index] + " ");
    }

    public void levelOrder() {
        for (int i=1; i<= lastUsedIndex;++i) {
            System.out.print(arr[i] + " ");
        }
    }

    public int search(String value) {
        for (int i=1; i<=lastUsedIndex;++i) {
            if (arr[i] == value) {
                System.out.println(value + " exists at the location " + i);
                return i;
            }
        }
        System.out.println("The value does not exist");
        return -1;
    }

    public void delete(String value) {
        int location = search(value);
        if (location == -1)
            return;
        else {
            arr[location] = arr[lastUsedIndex];
            lastUsedIndex--;
            System.out.println("The node has been successfully deleted");
        }
    }

    void deleteTree() {
        try {
            arr = null;
            System.out.println("The binary tree has been deleted");
        } catch (Exception e) {
            System.out.println("Error deleting the tree");
        }
    }
}
