package Arrays.Fundamntals.Medium;

import java.util.*;

public class RearrangeArrayElements {

    // Unoptimized solution
    public static int[] rearrangeArray(int[] nums) {
        List<Integer> positiveNumbers = new ArrayList<>();
        List<Integer> negativeNumbers = new ArrayList<>();
        int result[] = new int[nums.length];

        // Separate positive and negative numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positiveNumbers.add(nums[i]);
            } else {
                negativeNumbers.add(nums[i]);
            }
        }

        int i = 0, j = 0;
        int k = 0;

        // Alternate adding positive and negative numbers
        while (i < positiveNumbers.size() && j < negativeNumbers.size()) {
            result[k++] = positiveNumbers.get(i++);
            result[k++] = negativeNumbers.get(j++);
        }

        // If there are remaining positive numbers
        while (i < positiveNumbers.size()) {
            result[k++] = positiveNumbers.get(i++);
        }

        // If there are remaining negative numbers
        while (j < negativeNumbers.size()) {
            result[k++] = negativeNumbers.get(j++);
        }

        return result;
    }

    // Optimal solution
    public static int[] rearrangeArrayOptimal(int[] nums) {
        int result[] = new int[nums.length];
        int postiveIndex = 0, negativeIndex = 1; // since negativeIndex will always be in Odd position

        for(int i=0;i<nums.length;i++){
             if(nums[i]>0){
                result[postiveIndex]=nums[i];
                postiveIndex+=2; // This gives space to negative numbers
             }else{
                result[negativeIndex]=nums[i];
                negativeIndex+=2;
             }
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 5, -1, -3, -4};
        int result[] = rearrangeArrayOptimal(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
