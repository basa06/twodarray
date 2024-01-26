public class Main {
    public static void main(String[] args) {

        final int n = 5;
        int z = 1;
        int[][] matrix = new int[n][n];

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        while (z <= n * n) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = z++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = z++;
            }
            right--;

            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = z++;
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = z++;
            }
            left++;
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
