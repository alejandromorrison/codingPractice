import java.util.Arrays;

public class MaxNumber {
        public static String maxProduct(int[] intArray) {
            // TODO
            int maxProduct = 0;
            String pairs = "";
            for (int i=0; i<intArray.length; ++i) {
                for (int j = i+1; j<intArray.length; ++j) {
                    if (intArray[i] * intArray[j] > maxProduct) {
                        maxProduct = intArray[i] * intArray[j];
                        pairs = Integer.toString(intArray[i]) + " " + Integer.toString(intArray[j]);
                    }
                }
            }
            return pairs;
        }

        public static void main(String[] args) {
            int[] numbers = {10, 20, 30, 40, 50};
            System.out.println(maxProduct(numbers));
        }
}
