package Arrays.Fundamntals;

public class LinearSearch{
    public static int linearSearch(int arr[],int target){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] ={2, 3, 4, 5, 3};
        int key = 8;

        System.out.println(linearSearch(arr, key));
    }   
}