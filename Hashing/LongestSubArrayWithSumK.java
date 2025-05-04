package Hashing;

import java.util.HashMap;

public class LongestSubArrayWithSumK {
    public static int longestSubArrayHavingSumK(int arr[],int k){
        HashMap<Integer,Integer>prefixSumMap=new HashMap<>();
        prefixSumMap.put(0,-1);
        int prefixSum = 0,maxLength=0;
        for(int currentIndex=0;currentIndex<arr.length;currentIndex++){
            prefixSum+=arr[currentIndex];
            if(prefixSumMap.containsKey(prefixSum-k)){
                int length = currentIndex - prefixSumMap.get(prefixSum-k);
                maxLength = Math.max(maxLength,length);
            }
            // putting every prefixSum as key and value to be currentIndex
            if(!prefixSumMap.containsKey(prefixSum)){
                prefixSumMap.put(prefixSum,currentIndex);
            }
        }

        return maxLength;
    }
    public static void main(String [] args){
        int arr [] = {10,5,2,7,1,9};
        int k = 15;
        System.out.println(longestSubArrayHavingSumK(arr,k));
    }
}