package Arrays.LogicBuilding;

public class MergeTwoSortedArraysLeetCode {

    public static void mergeArrays(int nums1[], int m, int nums2[], int n) {
        int pointer_a = m - 1, pointer_b = n - 1;
        for (int i = m + n - 1; i >= 0; i--) {
            if (pointer_a >= 0 && (pointer_b < 0 || nums1[pointer_a] >= nums2[pointer_b])) {
                nums1[i] = nums1[pointer_a];
                pointer_a--;
            } else if (pointer_b >= 0 && nums2[pointer_b] >= nums1[pointer_a]) {
                nums1[i] = nums2[pointer_b];
                pointer_b--;
            }
        }
    }

    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        int m = 3, n = 3;
        mergeArrays(nums1, m, nums2, n);
        for (int i : nums1) {
            System.out.print(i + " ");
        }
    }
}
