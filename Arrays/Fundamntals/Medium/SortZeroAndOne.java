package Arrays.Fundamntals.Medium;

public class SortZeroAndOne {

    // Implementation of DNF Algorithm
    public static void sortZeroAndOne(int[]arr){
        int n = arr.length;

        int start=0,mid=0,end=n-1;
        while(mid<=end){
            if(arr[mid]==0){
                int temp=arr[start];
                arr[start]=arr[mid];
                arr[mid]=temp;
                start++;mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==2){
                int temp=arr[end];
                arr[end]=arr[mid];
                arr[mid]=temp;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 1, 0 };
        
        sortZeroAndOne(arr);

        for(var i:arr){
            System.out.println(i);
        }
    }
}
