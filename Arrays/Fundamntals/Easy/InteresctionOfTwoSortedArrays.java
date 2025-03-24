package Arrays.Fundamntals.Easy;

import java.util.ArrayList;

public class InteresctionOfTwoSortedArrays {

    // Unoptimized approach
    public static int[] findIntersection(int arr1[], int arr2[]) {

        ArrayList<Integer> result = new ArrayList<>();
        int[] visited = new int[arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && visited[j] == 0) {
                    result.add(arr1[i]);
                    visited[j] = 1;
                    break;
                }
            }
        }

        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }

        return res;

    }

    // Optimized approach
    public static int[] findIntersectionOptimized(int arr1[], int arr2[]) {
        ArrayList<Integer> result = new ArrayList<>();

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                result.add(arr1[i]);
                i++;
                j++;
            }
        }

        int res[] = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            res[k] = result.get(k);
        }

        return res;
    }

    public static void main(String[] args) {
        int arr1[] = { -45, -45, 0, 0, 2 };
        int arr2[] = { -50, -45, 0, 0, 5, 7 };

        int result[] = findIntersectionOptimized(arr1, arr2);

        for (var item : result) {
            System.out.print(item + " ");
        }
    }
}
