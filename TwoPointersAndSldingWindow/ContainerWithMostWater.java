package TwoPointersAndSldingWindow;

import java.util.*;

public class ContainerWithMostWater {

    public static int maxArea(List<Integer> height) {
        int max_area = -1;
        int i = 0, j = height.size() - 1;

        while (i < j) {
            int area = Math.min(height.get(i), height.get(j)) * (j - i);
            max_area = Math.max(area, max_area);

            if (height.get(i) > height.get(j)) {
                j--;
            } else {
                i++;
            }
        }

        return max_area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> height = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            height.add(a);
        }

        System.out.println(maxArea(height));

        sc.close();
    }
}
