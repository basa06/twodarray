public class Main {
    public static void main(String[] args) {
       String [][] players =
               {{"John", "doctor", "us"},
               {"Bridgette","lawyer","gb"},
               {"Greta","doctor","sw"}};
       String occupation = "doctor";
       for (String[]row: players){
           if (row[1].equals(occupation)){
               System.out.println(row[0]+" "+ row[2]);
           }

       }

       for (int row=0; row<players.length;row++){
           if (players[row][1].equals(occupation)){
               System.out.println(players[row][0]+" "+ players[row][2]);
           }

       }
    }
}