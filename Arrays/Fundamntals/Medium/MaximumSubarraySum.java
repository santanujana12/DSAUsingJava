package Arrays.Fundamntals.Medium;

public class MaximumSubarraySum {

    public static int maxSubarraySum(int arr[]) {
        int maxResult = -99999;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum > maxResult) {
                    maxResult = sum;
                }
            }
        }

        return maxResult;
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, -7, -2, -10, -4 };
        System.out.println(maxSubarraySum(arr));
    }
}
