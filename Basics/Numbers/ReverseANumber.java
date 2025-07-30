package Basics.Numbers;

public class ReverseANumber {
    public static void main(String[] args) {
        int n = -1223;
        int originalNumber = n;
        int reverseNumber = 0;
        n = Math.abs(n);
        if (n > Integer.MAX_VALUE) {
            while (n > 0) {
                int rem = n % 10;
                reverseNumber = reverseNumber * 10 + rem;
                n /= 10;
            }
            if (originalNumber < 0) {
                System.out.println(-reverseNumber);
            } else {
                System.out.println(reverseNumber);
            }
        }
    }
}
