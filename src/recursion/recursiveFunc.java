package recursion;

public class recursiveFunc {
    static void recursiveMethod(int n) {
        if (n < 1)
            System.out.println("n is less than 1");
        else {
            recursiveMethod(n-1);
            System.out.println(n);
        }
    }

    //Iterative Solution
    static int powerOFTwoIT(int n) {
        var i = 0;
        var power = 1;
        while (i<n) {
            power = power * 2;
            i=i+1;
        }
        return power;
    }

    public static void main(String[] args) {
        recursiveMethod(100);
    }
}
