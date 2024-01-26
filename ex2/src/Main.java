public class Main {
    public static void main(String[] args) {
       final int N=2;
       int [][] table = new int[N][N];
       for(int r = 0; r<N; r++){
           for (int c=0; c<N; c++){
               int val=(r+1)/(c+1);
               table[r][c]=val;
               System.out.print(val);
           }
           System.out.println();//cuz u need to move on to the next line

       }

    }
}