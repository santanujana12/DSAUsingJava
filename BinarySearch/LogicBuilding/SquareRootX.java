package BinarySearch.LogicBuilding;

public class SquareRootX {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        long left = 2;
        long right = x / 2; 

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long product = mid * mid;

            if (product == x) {
                return (int) mid;
            } else if (product > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return (int) right;
    }

    public static void main(String[] args) {
        SquareRootX sqrtCalculator = new SquareRootX();
        int x = 8;
        int result = sqrtCalculator.mySqrt(x);
        System.out.println("The integer square root of " + x + " is: " + result);
    }
}
