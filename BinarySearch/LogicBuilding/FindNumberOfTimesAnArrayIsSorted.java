package BinarySearch.LogicBuilding;

import java.util.*;

class Solution {
    /* Function to find the number of
       rotations in a rotated sorted array */
    public int findKRotation1(ArrayList<Integer> nums) {
        int low = 0, high = nums.size() - 1;
        int ans = Integer.MAX_VALUE;
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (nums.get(low) <= nums.get(high)) {
                if (nums.get(low) < ans) {
                    index = low;
                    ans = nums.get(low);
                }
                break;
            }
            
            // If left part is sorted update the ans
            if (nums.get(low) <= nums.get(mid)) {
                if (nums.get(low) < ans) {
                    index = low;
                    ans = nums.get(low);
                }
                // Eliminate left half
                low = mid + 1;
            } else {
                if (nums.get(mid) < ans) {
                    index = mid;
                    ans = nums.get(mid);
                }
                // Eliminate right half
                high = mid - 1;
            }
        }
        // Return the index as answer
        return index;
    }



    public static int findKRotation(ArrayList<Integer> arr) {

        int start = 0, end = arr.size() - 1;
        int minimum = Integer.MAX_VALUE, index = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // check if left side is sorted
            if (arr.get(start) <= arr.get(mid)) {
                minimum = Math.min(arr.get(start), minimum);
                index = arr.indexOf(minimum);
                start = mid + 1;
            } else {
                minimum = Math.min(arr.get(mid), minimum);
                index = arr.indexOf(minimum);
                end = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int nums[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i : nums) {
            arr.add(i);
        }

        System.out.println(findKRotation(arr));
    }
}
