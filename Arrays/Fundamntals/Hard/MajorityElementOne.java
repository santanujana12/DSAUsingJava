package Arrays.Fundamntals.Hard;

import java.util.HashMap;

public class MajorityElementOne {

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

    public static void main(String[] args) {
        int arr[] = { 7, 0, 0, 1, 7, 7, 2, 7, 7 };

        System.out.println(findMajorityElement(arr));
    }
}
