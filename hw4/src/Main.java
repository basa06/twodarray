public class Main {
    public static void main(String[] args) {
       int [][] vals = {
               {1,2,3,4},
               {2,3,4,1},
               {8,99,8,7},
               {7,3,2,11}};

       //sum of rows

        for (int r = 0; r<vals.length; r++){
            int sumrows=0;
            for (int c = 0; c<vals[r].length; c++){
                sumrows=sumrows+vals[r][c];
            }
            System.out.print(sumrows+ " ");
        }
        System.out.println();
        //sum columns
        for (int r = 0; r<vals.length; r++){
            int sumcol=0;
            for (int c = 0; c<vals[r].length; c++){
                sumcol=sumcol+vals[c][r];
            }
            System.out.print(sumcol+" ");
        }
        System.out.println();
        int sum=0;
        for (int r = 0; r<vals.length; r++){
            for (int c = 0; c<vals[r].length; c++){
                sum = sum+vals[r][c];
            }
        }
        System.out.println(sum);

    }
}