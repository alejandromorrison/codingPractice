package ProblemSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class find_missing {

    public static void findnumber(List<Integer> arr) {
        Collections.sort(arr);
        int counter = 1;
        int size = arr.size() + 1;
        List<Integer> missing = new ArrayList<>();
        if (counter == size)
            System.out.println("Done");
        else {
            if (arr.get(counter) != counter) {
                System.out.println(arr.get(counter));
                counter++;
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        //3, 7, 8, 1, 2, , 8, 4, 5
        numbers.add(3);
        numbers.add(7);
        numbers.add(1);
        numbers.add(2);
        numbers.add(8);
        numbers.add(4);
        numbers.add(5);

        findnumber(numbers);
    }
}
