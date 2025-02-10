package Arrays.Fundamntals.Easy;

public class LargestElement {

    public static int largestElement(int [] arr) {
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] arr =  {3, 3, 0, 99, -40};

        int largest = largestElement(arr);
        System.out.println(largest);
    }
}
