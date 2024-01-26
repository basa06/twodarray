public class Main {
    public static void main(String[] args) {
        final int n = 6;
        int[][] vals =new int [n][n];
        for (int r = 0; r<=n-1; r++){
            vals[r][0]=1;
            for (int c = 1; c<=r; c++){
                vals[r][c]=vals[r-1][c]+vals[r-1][c-1];
            }
        }

        for (int i =0;i< vals.length; i++){
            for (int j =0; j<vals[i].length; j++){
                System.out.print(vals[i][j]+" ");
            }
            System.out.println();
        }
        //binomial theorem pascals triangle
    }
}