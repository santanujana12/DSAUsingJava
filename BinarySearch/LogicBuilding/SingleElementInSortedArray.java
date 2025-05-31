package BinarySearch.LogicBuilding;

public class SingleElementInSortedArray {

    public static int singleNonDuplicate(int arr[]) {

        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // checking if mid id odd/even because comparison should be done with the left
            // index
            if (mid % 2 == 1) {
                mid--;
            }

            // if mid+1 == mid then duplicate and move the start to mid+2
            if (mid+1<arr.length && arr[mid] == arr[mid + 1]) {
                start = mid + 2;
            } else {
                end = mid - 1;
            }
        }

        return arr[start];
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6 };
        System.out.println(singleNonDuplicate(nums));
    }
}
