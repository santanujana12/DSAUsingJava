package Arrays.Fundamntals.Medium;

public class ReverseMatrixBy90Degrees {

    public static void reverseMatrixBy90Degrees(int matrix[][]) {

        // Transposing of matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        int n = matrix[0].length;
        // Reverse each row of matrix
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix1[j];
                matrix1[j] = matrix1[n - j - 1];
                matrix1[n - j - 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 2}, {5, 3, 1}, {5, 3, 5}
        };

        reverseMatrixBy90Degrees(matrix);

        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix1[j] + " ");
            }
            System.out.println();
        }
    }
}
