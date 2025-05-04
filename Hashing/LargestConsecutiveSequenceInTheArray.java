package Hashing;

import java.util.HashSet;

public class LargestConsecutiveSequenceInTheArray {

    public static int largestConsecutiveSequence(int [] arr){
        HashSet<Integer>isPresent= new HashSet<>();

        
        for(int i=0;i<arr.length;i++){
            isPresent.add(arr[i]);
        }

        int maxCount = 0,count=0;

        for(int i:isPresent){
            // if isPresent does'nt contain i+1 that means it's the starting element
            if(!isPresent.contains(i-1)){
                count=1;
                int elem = i; // Taking the current element

                while(isPresent.contains(elem+1)){
                    count++;
                    elem++;
                }
                maxCount = Math.max(count,maxCount);
            }
        }

        return maxCount;

    }

    public static void main(String[] args){
        int arr[] = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(largestConsecutiveSequence(arr));
    }
}
