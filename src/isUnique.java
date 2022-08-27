import java.util.Arrays;
import java.util.HashMap;

public class isUnique {
    public static boolean isUnique(int[] intArray) {
        // TODO
        // creating a hashmap and populating it.
        HashMap<Integer, Integer> list = new HashMap<>();
        // declaring a current number to compare with the next one.
        int current = intArray[0];
        // sorting the array
        Arrays.sort(intArray);
        // verifying if the input is not zero. otherwise it will return false
        if (intArray.length == 0)
            return false;
        // creating a for-loop so i can iterate through the array
        // and compare if the current is not current put on the list
        for (int i=1; i<intArray.length; ++i) {
            if (current != intArray[i])
                list.put(i, intArray[i]);
            // otherwise we will be increating the current number according to the arraylist
            if (i < intArray.length)
                current = intArray[i+1];
            break;
        }
        // comparing is the list and the array length are the same is true
        if (list.size() == intArray.length)
            return true;
        // otherwise return false
        return false;
    }

    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6,6};
        System.out.println(isUnique(intArray));
    }
}
