package interview;

import java.util.HashMap;

public class FiboMemo {
    public static void main(String[] args) {
        HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
        System.out.println(fibo(10, memo));
    }

    public static int fibo(int n, HashMap<Integer, Integer> memo) {
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;

        if (!memo.containsKey(n))
            memo.put(n, fibo(n-1, memo) + fibo(n-2, memo));

        return memo.get(n);
    }
}
