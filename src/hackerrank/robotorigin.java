package hackerrank;

public class robotorigin {

    public static boolean judgeCircle(String moves) {
        int UD = 0;
        int LR = 0;

        for (int i=0; i< moves.length(); ++i) {
            char currentMove = moves.charAt(i);
            if (currentMove == 'U') UD++;
            if (currentMove == 'D') UD--;
            if (currentMove == 'L') LR--;
            if (currentMove == 'R') LR++;
        }

        return UD == 0 && LR == 0;
    }

    public static void main(String[] args) {
        System.out.println(judgeCircle("UUUUUDDLRRRRRDDDDLLLLLUUUU"));
    }
}
