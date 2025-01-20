package Arrays.Fundamntals;

public class FindMissingNumbers {

    // Good way
    // TC: O(n)
    // SC: O(n)
    public static int findMissingNumbers(int arr[], int n) {

        // storing all the values in the frequency array
        int freq[] = new int[n+1];

        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }

        for(int i=0;i<=n;i++){
            if(freq[i]==0){
                return i;
            }
        }

        return -1;
    }

    // Optimal way
    public int findMissingNumberUsingAP(int arr[], int n) {
        int sum1 = (n * (n + 1)) / 2;
        int sum2 = 0;

        for(int i=0;i<n;i++){
            sum2+=arr[i];
        }

        return sum1-sum2;
    }

    public static void main(String[] args) {
        int n = 6;

        int arr[] = {1, 3, 6, 4, 2, 5};

        findMissingNumbers(arr, n);
    }
}