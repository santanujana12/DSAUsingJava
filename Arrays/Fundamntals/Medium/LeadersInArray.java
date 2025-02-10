package Arrays.Fundamntals.Medium;

import java.util.*;

public class LeadersInArray {

    // Time Complexity: O(n^2)
    public static ArrayList<Integer> printLeaders(int arr[], int n) {

        ArrayList<Integer> leadersList = new ArrayList<>();

        int prevMax = 0;

        // finding element 
        for (int i = 0; i < n; i++) {
            int max = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    i = j;
                }
            }
            // checking if the element is equal to the previous max element
            if (prevMax != max) {
                leadersList.add(max);
                prevMax = max;
            }

        }

        return leadersList;
    }

    // Optimal solution
    public static ArrayList<Integer> printLeadersOptimal(int arr[], int n) {

        ArrayList<Integer> leadersList = new ArrayList<>();
        
        int max = arr[n-1];

        
        // since last element will always be a leader
        for(int i=n-1; i>=0; i--){
            if(arr[i] > max){
                max = arr[i];
                leadersList.add(max);
            }
        }

        Collections.reverse(leadersList);

        return leadersList;
    }

    public static void main(String[] args) {
        int arr[] = { 737,344,561,65,885,18,131,27,335,90,267,336,375,157,548,698,273,342,275,107,561,930,747,383,486,92,242,758,782,594,86,688,978,824,964,497,524,659,114,880,958,280,195,235,341,838,403,573,686,922,388,403,864,722,688,443,714,259,399,93,590,150,652,958,854,289,123,539,782,547,494,132,306,626,761,369,913,480,602 };
        int n = arr.length;

        ArrayList<Integer> leaders = printLeadersOptimal(arr, n);

        for (var item : leaders) {
            System.out.print(item + " ");
        }

    }
}
