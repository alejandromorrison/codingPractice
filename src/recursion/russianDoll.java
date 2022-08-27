package recursion;

public class russianDoll {
    public static void openRussianDoll(int doll) {
        if (doll == 1)
            System.out.println("All russian dolls are opened");
        else
            openRussianDoll(doll-1);
    }
}
