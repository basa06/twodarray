public class Main {
    public static void main(String[] args) {
        String[][] players =
                        {{"John", "doctor", "us"},
                        {"Bridgette", "lawyer", "doctor"},
                        {"Greta", " ", "sw"}};
        String key = "doctor";
        for (int r = 0; r < players.length; r++) {
            for (int c = 0; c < players[r].length; c++) {
                if (players[r][c].equals(key)) {
                    System.out.println(r + ", " + c);
                }
            }
        }
    }
}