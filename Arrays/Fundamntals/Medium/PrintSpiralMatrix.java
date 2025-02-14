package Arrays.Fundamntals.Medium;

import java.util.ArrayList;
import java.util.List;

public class PrintSpiralMatrix {

    public static List<Integer> printSpiralMatrix(int arr[][]) {
        List<Integer> result = new ArrayList<>();
        int left = 0, top = 0, bottom = arr.length - 1, right = arr[0].length - 1;
        while (left <= right && top <= bottom) {
            // Printing from left tp right
            for (int i = left; i <= right; i++) {
                result.add(arr[top][i]);
            }
            top++;
            // Printling top to bottom
            for (int i = top; i <= bottom; i++) {
                result.add(arr[i][right]);
            }
            right--;

            // Printing from right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(arr[bottom][i]);
                }
                bottom--;
            }

            // printing from bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(arr[i][left]);
                }
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 2,},
        {3, 4},
        {5, 6},
        {7, 8}};

        List<Integer> result = printSpiralMatrix(arr);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}
