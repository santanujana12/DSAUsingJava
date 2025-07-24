package Patterns;

public class AlternateZeroesOnes {
    public static void main(String[] args) {
        int n = 4, flag = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (flag == 1) {
                    System.out.print(flag + " ");
                    flag = 0;
                } else {
                    System.out.print(flag + " ");
                    flag = 1;
                }
            }
            System.out.println();
        }
    }
}