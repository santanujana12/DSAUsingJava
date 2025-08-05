package Arrays.LogicBuilding;

import java.util.Arrays;

public class MergeTwoSortedArraysGFG {
    public static void mergeArrays(int[] a, int[] b) {
        int pointer_a = a.length - 1, pointer_b = 0;
        while (pointer_a >= 0 && pointer_b < b.length && a[pointer_a] > b[pointer_b]) {
            int temp = a[pointer_a];
            a[pointer_a] = b[pointer_b];
            b[pointer_b] = temp;
            pointer_a--;
            pointer_b++;
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }

    public static void main(String[] args) {
        int a[] = { 2, 4, 7, 10 };
        int b[] = { 2, 3 };
        mergeArrays(a, b);
        System.out.print("a: ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("b: ");
        for (int i : b) {
            System.out.print(i + " ");
        }
    }
}
