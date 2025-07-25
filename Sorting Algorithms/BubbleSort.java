public class BubbleSort {
    public int[] bubbleSort(int[] arr) {
        int n = arr.length;

        // Idea is to repeatedly swap the adjacent elements if they are in wrong order
        // Largest element will be bubbled to the end of the array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

}