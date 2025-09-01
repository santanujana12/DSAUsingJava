package Math;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static int findSumOfSquares(int n){
        int sum = 0;
        while(n>0){
            int d = n%10;
            d*=d;
            sum+=d;
            n/=10;
        }
        return sum;
    }
    public static boolean isHappy(int n){
        Set<Integer>freq = new HashSet<>();
        while(true){
            n = findSumOfSquares(n);
            if(n==1){
                return true;
            }else if(freq.contains(n)){
                return false;
            }
            else{
                freq.add(n);
            }
        }
    }
    public static void main(String[] args) {
        int n = 2;
        boolean result = isHappy(n);
        System.out.println(result);
    }
}
