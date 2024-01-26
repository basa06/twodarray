import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [][]table = new int [6][5];
        table[0][3]= 4;
        table[2][0]= -19;
        table[5][3]= 22;
        for(int[]row : table){
            System.out.println(Arrays.toString(row));
        }
    }
}