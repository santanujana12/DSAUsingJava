package Recursion;

public class CalculatePower {
    public static double myPow(double x,int n){
        if(n<=0){
            return 1;
        }
        return x*myPow(x,n-1);
    }
    public static void main(String [] args){
        double x = 3.0;
        int n = 4;
        System.out.println(myPow(x,n));
    }
}
