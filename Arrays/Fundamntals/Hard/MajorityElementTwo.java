package Arrays.Fundamntals.Hard;

import java.util.*;

public class MajorityElementTwo {

    public static ArrayList<Integer> majorityElementTwo(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();

        int element1 = 0, count1 = 0, element2 = 0, count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            // Making sure element 1 and element 2 are distinct elements
            if (count1 == 0 && element2!=arr[i]) {
                element1 = arr[i];
                count1++;
            } else if (count2 == 0 && element1!=arr[i]) {
                element2 = arr[i];
                count2++;
            } else if (element1 == arr[i]) {
                count1++;
            } else if (element2 == arr[i]) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        // System.out.println(element1+" "+element2);
        count1=0;count2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element1){
                count1++;
            }else if(arr[i]==element2){
                count2++;
            }
        }

        if(count1>(arr.length/3)){
            result.add(element1);
        }
        if(count2>(arr.length/3)){
            result.add(element2);
        }

        return result;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 1, 1, 3, 2 };
        ArrayList<Integer> result = majorityElementTwo(nums);

        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i)+" ");
        }
        System.out.println();
    }
}
