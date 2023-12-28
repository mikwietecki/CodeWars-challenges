package SixKyu.SumOfDigits;

public class DRoot {

    public static int digitatl_root(int n) {
        String numberStr = Integer.toString(n);
        int sum = 0;

        while (numberStr.length() > 1) {
            sum = 0;
            for (int i = 0; i < numberStr.length(); i++) {
                int digit = Character.getNumericValue(numberStr.charAt(i));
                sum += digit;
            }
            numberStr = Integer.toString(sum);
        }

        return sum;
    }
}
