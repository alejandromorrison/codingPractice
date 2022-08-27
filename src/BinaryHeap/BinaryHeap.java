package BinaryHeap;

public class BinaryHeap {
    int arr[];
    int sizeOfTree;

    public BinaryHeap(int size) {
        arr = new int[size+1];
        this.sizeOfTree = 0;
        System.out.println("Binary tree created");
    }

    public boolean isEmpty() {
        return sizeOfTree == 0;
    }

    // peek of heap only return the root of heap
    public int peek() {
        if (isEmpty())  System.out.println("Binary head is empty");
        return arr[1];
    }

    public int sizeOfBH() {
        return sizeOfTree;
    }

    public void levelOrder() {
        for (int i=1; i<= sizeOfTree; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    public void heapifyBottomToTop(int index, String heatType) {
        int parent = index/2;
        if (index <1)
            return;

        if (heatType == "Min") {
            if (arr[index] < arr[parent]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        } else if (heatType == "Max") {
            if (arr[index] > arr[parent]) {
                int temp = arr[index];
                arr[parent] = temp;
            }
        }

        heapifyBottomToTop(parent, heatType);
    }

    public void insert(int value, String typeHeap) {
        arr[sizeOfTree+1] = value;
        sizeOfTree++;
        heapifyBottomToTop(sizeOfTree, typeHeap);
        System.out.println("Inserted " + value + " successfully in heap");
    }

    public void heapifyToptoBottom(int index, String heapType) {
        int left = index*2;
        int right = index*2+1;
        int swapChild;

        if (sizeOfTree < left)
            return;

        if (heapType == "Max") {
            if (sizeOfTree == left) {
                if (arr[index] < arr[left]) {
                    int temp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = temp;
                }
                return;
            } else {
                if (arr[left] > arr[right]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }
                if (arr[index] > arr[swapChild]) {
                    int temp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = temp;
                }
            }
            heapifyToptoBottom(swapChild, heapType);
        }
    }

    public int extractHeadOfBP(String headType) {
        if (isEmpty())
            return -1;
        else {
            int extractedValue = arr[1];
            arr[1] = arr[sizeOfTree];
            sizeOfTree--;
            heapifyToptoBottom(1, headType);
            return extractedValue;
        }
    }

    // delete the whole thing

    public void delete() { arr = null; }

}
