public class evenFibonnaciNumbers {
//    Each new term in the Fibonacci sequence is generated by adding the previous two terms.
//    By starting with 1 and 2, the first 10 terms will be:  1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//    By considering the terms in the Fibonacci sequence whose values do not exceed four million,
//    find the sum of the even-valued terms.

    public static int fibNumbers() {
        int fib1 = 1;
        int fib2 = 2;
        int sum = 2;
        int n = 0;

        while (n < 4000000) {
            n = fib1 + fib2;
            fib1 = fib2;
            fib2 = n;

            if ( n % 2 == 0) {
                sum = sum + n;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci numbers:\n");
        System.out.println(fibNumbers());
    }
}
