package recursion;

public class RecursionMethodCalls {
    static void firstMethod() {
        secondMethod();
        System.out.println("Im the first method");
    }

    static void secondMethod() {
        thirdMethod();
        System.out.println("Im the second method");
    }

    static void thirdMethod() {
        fourthMethod();
        System.out.println("Im the third method");
    }

    static void fourthMethod() {
        System.out.println("Im the fourth method");
    }

    public static void main(String[] args) {
        firstMethod();
    }
}
