package Arrays.Fundamntals.Medium;

public class PascalTriangle2 {


    public static int[] pascalTriangle2(int n){
        int arr[] = new int[n];

        arr[0] = 1;
        int ans=1;
        for(int i=1;i<n;i++){
            ans=(ans*(n-i))/i;
            arr[i]=ans;
        }

        arr[n-1]=1;

        return arr;
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = pascalTriangle2(n);

        for(var i:arr){
            System.out.print(i+" ");
        }
    }
}
