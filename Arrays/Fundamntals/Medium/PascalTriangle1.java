package Arrays.Fundamntals.Medium;

// Find the value according to row and col given 
// formula nCr
public class PascalTriangle1 {

    public static int findTheValue(int r, int c) {
        int result = 1;
        if (c > r - c) {
            c = r - c;
        }
        if(c==1){
            return r;
        }
        for (int i = 0; i < c; i++) {
            result = result * (r - i);
            result /= i + 1;
        }

        return result;
    }

    public static void main(String[] args) {
        int row = 14, column = 2;
        System.out.println(findTheValue(row, column));
    }
}
