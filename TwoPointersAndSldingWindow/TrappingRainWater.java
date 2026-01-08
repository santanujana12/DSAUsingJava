package TwoPointersAndSldingWindow;
import java.util.*;

public class TrappingRainWater {

    public static int trap(int[] height) {
        int totalWaterCount = 0;
        int n = height.length;

        if (n <= 2) {
            return 0;
        }

        int[] maxL = new int[n];
        int[] maxR = new int[n];

        maxL[0] = height[0];
        for (int i = 1; i < n; i++) {
            maxL[i] = Math.max(maxL[i - 1], height[i]);
        }

        maxR[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxR[i] = Math.max(maxR[i + 1], height[i]);
        }

        for (int i = 0; i < n; i++) {
            totalWaterCount += Math.min(maxL[i], maxR[i]) - height[i];
        }

        return totalWaterCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];

        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        System.out.println(trap(height));
        sc.close();
    }
}
