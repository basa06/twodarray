import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        boolean[][]con ={{true, true, false},
                        {false, true, false},
                        {false, false, true}};
        System.out.println(s(1, 2, con));
    }


    static boolean s(int S, int E, boolean[][]matrix) {
        if (S==E)
            return true;

        for (int c = 0; c<matrix[S].length; c++){
            if (matrix[S][c]==true){
                return s(c, E, matrix);
            }
        }
        return false;
            //check the columns of row S
    }
}