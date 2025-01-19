package Arrays.LogicBuilding;

public class MoveZeroesToEnd {


    public static void moveZeroesToEnd(int arr[]) {
        int index=0,n=arr.length;

        // checking if arr[i]!=0 then swap first index which is present at index 0 -> n
        // This fills all the non-zero element first and then loop from index to n to fill the zeroes
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }

        for(int i=index;i<n;i++){
            arr[i]=0;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 0, 1, 3, -2 };

        moveZeroesToEnd(arr);

        for (var item : arr) {
            System.out.print(item + " ");
        }
    }
}
