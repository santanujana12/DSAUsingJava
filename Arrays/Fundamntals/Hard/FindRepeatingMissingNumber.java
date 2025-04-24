package Arrays.Fundamntals.Hard;
import java.util.Arrays;

public class FindRepeatingMissingNumber {
    public static int[] findMissingRepeatingNumbers(int [] arr){
        int result[] = new int[2];
        int n = arr.length;

        Arrays.sort(arr);
        int duplicateElement = -2313,currentSum=0;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                duplicateElement = arr[i];
            }
            currentSum+=arr[i];
        }
        currentSum+=arr.length-1;
        currentSum-=duplicateElement;
        int expectedSum = (n*(n+1))/2;
        // System.out.println(expectedSum);
        
        int missingNumber = expectedSum-currentSum;

        result[0]=duplicateElement;
        result[1]=missingNumber;

        return result;
    }


    public static void main(String [] args){
        int arr[]={1, 2, 3, 6, 7, 5, 7};

        int result[] = findMissingRepeatingNumbers(arr);

        for(var i:result){
            System.out.print(i+" ");
        }
    }
}
