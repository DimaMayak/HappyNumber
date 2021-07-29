

public class Solution {
    public static int helpSumSquare(int n) {
        int sum = 0;
        while ((n / 10 > 0) || (n % 10 > 0)) {
            sum = sum + (n % 10) * (n % 10);
            n = n / 10;
        }
        return sum;
    }

    public static boolean isHappy(int n) {
        while (n > 9) {
            n = helpSumSquare(n);
        }
        return ((helpSumSquare(n) == 1) || (n == 7));
    }
}
