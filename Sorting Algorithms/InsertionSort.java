public class InsertionSort {

    // Idea is to insert the element at the correct position in the sorted array
    // Front part of the array will always be sorted
    public static int[] insertionSort(int[] arr) {
        int n = arr.length;
         for(int i=1;i<n;i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
              int temp = arr[j];
              arr[j]=arr[j-1];
              arr[j-1]=temp;
              j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        int[] sortedArr = insertionSort(arr);
        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " ");
        }
    }
}
