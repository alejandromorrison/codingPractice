package hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class main2 {

    // array to remove the duplicates
    public static int[] removeDuplicates(int[] list) {
        int[] test = new int[1];
        return test;
    }

    // Using hashmap
    public int[] twoSwumHashMap(int[] nums, int target) {
        Map<Integer, Integer> input = new HashMap<>();
        for (int i=0; i < nums.length; ++i) {
            input.put(nums[i], i);
        }

        for (int i=0; i < nums.length; ++i) {
            int secondNumber = target-nums[i];
            if (input.containsKey(secondNumber) && input.get(secondNumber)!= i)
                return new int[] {i, input.get(secondNumber)};
        }

        throw new IllegalArgumentException("No such number found");
    }

    private static int recursionTest(int num){
        if (num < 10){
            num += 1;
            System.out.println(num);
            return recursionTest(num);
        }
        return num;
    }

    public static void main(String[] args) {
//        int[] nums = {2, 7, 11, 15};
//        int target = 13;
//        main2 twoSum = new main2();
//        System.out.println(Arrays.toString(twoSum.twoSwumHashMap(nums, target)));
        recursionTest(0);

    }
}
