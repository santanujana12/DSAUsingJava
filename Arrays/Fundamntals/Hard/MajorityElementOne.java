package Arrays.Fundamntals.Hard;

import java.util.HashMap;

public class MajorityElementOne {

    // Space complexity O(n)
    public static int findMajorityElement(int[] arr) {
        int result = -1;
        int n = arr.length;

        HashMap<Integer,Integer>freq = new HashMap<>();

        // add frequency to check for each values
        for(int i=0;i<arr.length;i++){
            if(freq.containsKey(arr[i])){
                freq.put(arr[i],freq.get(arr[i])+1);
            }else{
                freq.put(arr[i],0);
            }
        }


        // Now checking if the value of each value freq is greater than n/2
        for(int i=0;i<arr.length;i++){
            int value = freq.get(arr[i]);
            if(value>=n/2){
                result = arr[i];
                break;
            }
        }
        return result;
    }

    // further optimizing Moore's voting algorithm
    public static int MooresVotingAlgorithm(int arr[]){
        int element = 0;
        int count = 0;
        // checking if the current element is equal to next element then increase the count else decrease the count
        // if count becomes equal to 0 then change the element
        for(int i=0;i<arr.length;i++){
            if(count==0){
                count=1;
                element=arr[i];
            }else if(element!=arr[i]){
                count--;
            }else{
                count++;
            }
        }

        int finalCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                finalCount++;
            }
        }

        if(finalCount>=(arr.length/2)){
            return element;
        }
        return 0;
    }
    

    public static void main(String[] args) {
        int arr[] = { 7, 0, 0, 1, 7, 7, 2, 7, 7 };

        System.out.println(MooresVotingAlgorithm(arr));
    }
}
