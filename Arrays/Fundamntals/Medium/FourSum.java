package Arrays.Fundamntals.Medium;

import java.util.*;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < arr.length - 2; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }
                int k = j + 1;
                int l = arr.length - 1;
                while (k < l) {
                    int sum = arr[i] + arr[j] + arr[k] + arr[l];
                    if (sum > target) {
                        l--;
                    } else if (sum < target) {
                        k++;
                    } else {
                        List<Integer> eachRow = new ArrayList<>();
                        eachRow.add(arr[i]);
                        eachRow.add(arr[j]);
                        eachRow.add(arr[k]);
                        eachRow.add(arr[l]);
                        result.add(eachRow);
                        l--;
                        k++;
                        while (k < l && arr[k] == arr[k - 1]) {
                            k++;
                        }
                        while (l > k && arr[l] == arr[l + 1]) {
                            l--;
                        }
                    }
                }
            }
        }

        return result;
    }

    // Driver function
    public static void main(String[] args) {
        int arr[] = { 1, -2, 3, 5, 7, 9 };
        int target = 7;

        List<List<Integer>> result = fourSum(arr, target);

        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                System.out.print(result.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
}