package Arrays.LogicBuilding;

import java.util.Scanner;

public class BestTimeToBuyAndSellStocks {

    // brute solution
    public static int maxProfit(int[] arr) {
        int maxProfit = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > arr[i] && i != j) {
                    int diff = Math.abs(arr[i] - arr[j]);
                    if (diff > maxProfit) {
                        maxProfit = diff;
                    }
                }
            }
        }
        return maxProfit;
    }

    // optimal
    public static int maxProfitOptimal(int arr[]) {
        int minValue = arr[0];
        int maxProfit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
            int profit = arr[i] - minValue;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(maxProfitOptimal(arr));
        }
    }
}
