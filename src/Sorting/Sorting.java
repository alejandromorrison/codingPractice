package Sorting;

public class Sorting {
    /*
        What is sorting?
        Arranging data in particular format

        Types of sorting:
        -Space used: in pace-out pace
        -stability: can be stable or unstable.

        in place sorting: sorting does not require any extra space for sorting
        bubble sort - also referred as sinking sort
        selection sort
        insertion sort
        bucket sort
        merge sort
        quick sort
        heap sort
     */
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int arr[] = {10, 5, 30, 15, 50, 6};
        bs.bubbleSort(arr);
        bs.printArray(arr);
    }
}
