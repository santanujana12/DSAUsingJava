public class SelectionSort {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] selectionSort(int[] arr) {
      int n = arr.length;
      for (int i = 0; i < n; i++) {
            int minimum = 767788;
            int index = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < minimum) {
                    minimum = arr[j];
                    index = j;
                }
            }
            // Checking if the first element is smallest
            if (arr[i] > minimum) {
                swap(arr, i, index);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        int[] sortedArr = selectionSort(arr);
        // for (int i = 0; i < sortedArr.length; i++) {
        //     System.out.print(sortedArr[i] + " ");
        // }

        for(var items:sortedArr){
            System.out.print(items+" ");
        }
    }
}
