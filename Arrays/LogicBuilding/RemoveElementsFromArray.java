package Arrays.LogicBuilding;

public class RemoveElementsFromArray {
    public static int removeElement(int[] arr, int val) {
        int first = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[first] = arr[i];
                first++;
            }
        }
        return first;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;
        int removedArrSize = removeElement(arr, val);

        for (int i = 0; i < removedArrSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}