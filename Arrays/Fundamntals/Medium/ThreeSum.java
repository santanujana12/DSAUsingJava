package Arrays.Fundamntals.Medium;

import java.util.*;

public class ThreeSum {

    // Tc: O(n^3)
    public static List<List<Integer>> threeSum(int[] arr, int n, int target) {

        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> noDup = new HashSet<>();

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
    // SC: O(n)
    public static List<List<Integer>> threeSumBetter(int[] arr, int n, int target) {

        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> noDup = new HashSet<>();

        for (int i = 0; i < n; i++) {
            Set<Integer> isPresent = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int thirdTerm = target - arr[i] - arr[j];
                if (isPresent.contains(thirdTerm)) {
                    List<Integer> eachArray = Arrays.asList(arr[i], arr[j], thirdTerm);
                    Collections.sort(eachArray);
                    noDup.add(eachArray);
                } else {
                    isPresent.add(arr[j]);
                }
            }
        }

        result.addAll(noDup);

        return result;
    }

    // TC: O(n^2)+O(nlogn)
    // SC: O(1)
    public static List<List<Integer>> threeSumOptimal(int[] arr, int n, int target) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(arr);

        // Using two pointer approach
        for(int i=0;i<n;i++){
            // Remove duplicate on i
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            int j = i+1;
            int k = n-1;

            while(j<=k){

                // Remove duplicates on j and k
                if(j<k && arr[j]==arr[j+1]){
                    j++;
                }else if(k>j && arr[k]==arr[k-1]){
                    k--;
                }else{
                    int sum = arr[i]+arr[j]+arr[k];
                    if(sum>target){
                        k--;
                    }else if(sum<target){
                        j++;
                    }else{
                        List<Integer>eachRow = new ArrayList<>();
                        eachRow.add(arr[i]);
                        eachRow.add(arr[j]);
                        eachRow.add(arr[k]);

                        result.add(eachRow);
                        j++;
                        k--;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 2, -2, 0, 3, -3, 5 };
        int n = arr.length;
        int target = 0;

        List<List<Integer>> res = threeSumOptimal(arr, n, target);

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
