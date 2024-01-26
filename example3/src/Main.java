public class Main {
    public static void main(String[] args) {
        final int N = 7;
        int [][] A = new int [N][N];
        int k = 1;
        int startrow=0, endrow=0, startcol=0;
        while (k<=N*N){
            int row = startrow;
            int col = startcol;
            while (row<=endrow){//for each diagonal
                A[row][col]=k;
                k++;
                row++;
                col--;
            }
            if (startcol<=N-2){
                startcol++;
                endrow++;
            }
            else{
                startrow++;
            }

        }
        for(int[]row:A){
            for (int i:row){
                System.out.print(i+" ");

            }
            System.out.println();
        }
    }
}