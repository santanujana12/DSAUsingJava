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

    // Resolving the same with More optimal algorithm Kadene's algorithm
    public static int KadeneAlgorithm(int arr[]){
        int maxResult = -99999;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            // add current element to the sum
            sum+=arr[i];
            // check if maxResult is less than sum then update maxResult with sum
            if(sum>maxResult){
                maxResult=sum;
            }
            // reset sum to 0 if sum is found to be negative
            if(sum<0){
                sum=0;
            }
        }

        return maxResult;
    }


    public static void main(String[] args) {
        int arr[] = { -2, -3, -7, -2, -10, -4 };
        System.out.println(KadeneAlgorithm(arr));
    }
}
