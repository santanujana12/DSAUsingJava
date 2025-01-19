package Arrays.LogicBuilding;


public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int nums[]) {

        if (nums.length == 0) {
            return 0;
        }

        // Taking second element as the first element will always be unique
        // this index will remain in its position until an unique element is found then
        // only it will be incremented
        int uniqueIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                // Replace the unique element
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }

        return uniqueIndex;
    }

    public static void main(String[] args) {
        int nums[] = { -30, -30, 0, 0, 10, 20, 30, 30 };

        int noDupCount = removeDuplicates(nums);

        for (int i = 0; i < noDupCount; i++) {
            System.out.print(nums[i]+" ");
        }
        // for (int i = 0; i < nums.length; i++) {
        // System.out.print(nums[i] + " ");
        // }

    }
}
