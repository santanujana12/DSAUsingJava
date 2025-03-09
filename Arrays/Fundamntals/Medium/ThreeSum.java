package Arrays.Fundamntals.Medium;

import java.util.*;

public class ThreeSum {

    // Tc: O(n^3)
    public static List<List<Integer>> threeSum(int[] arr, int n, int target) {

        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>>noDup = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    List<Integer> temp = new ArrayList<>();

                    if (arr[i] + arr[j] + arr[k] == target) {
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        noDup.add(temp);
                    }
                }
            }

        }

        result.addAll(noDup);

        return result;
    }


    // TC: O(n^2) + log(n)
    public static List<List<Integer>> threeSumBetter(int[] arr, int n, int target) {

        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>>noDup = new HashSet<>();

        for (int i = 0; i < n; i++) {
            Set<Integer> isPresent=new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int thirdTerm = target-arr[i]-arr[j];
                if(isPresent.contains(thirdTerm)){
                    List<Integer>eachArray = Arrays.asList(arr[i],arr[j],thirdTerm);
                    Collections.sort(eachArray);
                    noDup.add(eachArray);
                }
                else{
                    isPresent.add(arr[j]);
                }
            }

            result.addAll(noDup);

            return result;

        }

        result.addAll(noDup);

        return result;
    }

    public static void main(String[] args) {
        int arr[] = {2, -2, 0, 3, -3, 5};
        int n = arr.length;
        int target = 0;

        List<List<Integer>> res = threeSumBetter(arr, n, target);

        for (int i = 0; i < res.size(); i++) {
            System.out.print("[");
            for (int j = 0; j < res.get(i).size(); j++) {
                System.out.print(res.get(i).get(j) + ",");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
