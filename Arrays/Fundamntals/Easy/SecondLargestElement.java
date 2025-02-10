package Arrays.Fundamntals;

public class SecondLargestElement {

    public static int secondLargestElement(int [] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++) {
            if(arr[i]>largest) {
               secondLargest = largest;
               largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest = arr[i];
            }
        }

        return secondLargest==Integer.MIN_VALUE?-1:secondLargest;
    }

    public static void main(String[] args) {
        int arr[] =  {7, 7, 2, 2, 10, 10, 10};
        int secondLargest = secondLargestElement(arr);

        System.out.println(secondLargest);
    }
}
