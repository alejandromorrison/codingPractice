import java.util.Scanner;

public class DaysTemp {
    public static float DaysTemp() {
        System.out.println("How many days temperature?");
        Scanner input = new Scanner(System.in);
        int days = input.nextInt();
        int daysTotal = 0;
        int above = 0;
        int[] temps = new int[days];
        for (int i=0; i<days; ++i) {
            System.out.println("Please type in a Temperature for day: " + (i+1));
            temps[i] = input.nextInt();
            daysTotal += temps[i];
        }
        float average =  daysTotal / days;

        for (int i = 0; i < temps.length; ++i) {
            if (temps[i] > average) {
                above++;
            }
        }
        System.out.println("Avg above temp is " + above);
        return average;
    }

    public static void main(String[] args) {
        System.out.println(DaysTemp());
    }
}
