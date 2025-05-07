package Hashing;

import java.util.HashMap;

public class CountSubarraysWithGivenSum {

    public static int countSubArraysWithGivenSum(int arr[], int k) {
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();

        prefixSumMap.put(0,1);

        int count = 0;
        int prefixSum = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            // System.out.println(prefixSum);
            if (prefixSumMap.containsKey(prefixSum - k)) {
                count+=prefixSumMap.get(prefixSum-k);
            }
            // Increment value of prefixSum if exists else initialize the same with 0
            prefixSumMap.put(prefixSum, prefixSumMap.getOrDefault(prefixSum,0)+1);
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int k = 3;
        System.out.println(countSubArraysWithGivenSum(arr, k));
    }
}
