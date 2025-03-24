package Arrays.Fundamntals.Easy;
import java.util.*;

public class UnionOfTwoSortedArrays {

    public static int[] union(int arr1[], int arr2[]) {
        SortedSet<Integer> ts = new TreeSet<Integer>();

        for(int i=0;i<arr1.length;i++){
            ts.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++){
            ts.add(arr2[i]);
        }

        int result[] = new int[ts.size()];
        int elem = 0;

        for(int index:ts){
           result[elem] = index;
           elem++;
        }

        return result;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 3, 4, 5, 7};
        int arr2[] = {2, 3, 5, 6};

        int result[] = union(arr1, arr2);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
