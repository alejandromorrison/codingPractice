package Array;

import java.util.Arrays;

public class ReturnMiddle {
    //Obsolete solution
    static int[] middle(int[] arr) {
        // TODO
        int size = arr.length -2;
        int[] newList = new int[size];
        for (int i=1; i<size;++i) {
            newList[i] = arr[i];
        }
        return newList;
    }

    // Better solution
    static int[] middle1(int[] arr) {
        return Arrays.copyOfRange(arr, 1, arr.length-1);
    }

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        System.out.println(middle(list));


        System.out.println(middle1(list));
    }
}
