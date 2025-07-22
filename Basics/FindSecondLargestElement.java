package Basics;

public class FindSecondLargestElement {
    public static void main(String [] args){
        int arr[] = {0, 3, 5, 2, 7, 9};
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                second_largest = largest;
                largest=arr[i];
            }
            else if(arr[i]>second_largest && arr[i]!=largest){
                second_largest = arr[i];
            }
        }

        System.out.println(second_largest);
    }
}
