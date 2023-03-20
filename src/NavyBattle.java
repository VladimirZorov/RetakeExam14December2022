import java.util.Scanner;

public class NavyBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[][] battlefield = new String[n][n];
        int mineHit = 0;
        int batCruisersHit = 0;
        int submarineRow = -1;
        int submarineColl = -1;

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("");
            for (int j = 0; j < n; j++) {
                if (line[j].equals("S")) {
                    submarineRow = i;
                    submarineColl = j;
                }
            }
            battlefield[i] = line;
        }

        battlefield[submarineRow][submarineColl] = "-";


        while (mineHit < 3 && batCruisersHit < 3) {
            String command = scanner.nextLine();
            switch (command){
                case "up":
                    submarineRow -= 1;
                    if (battlefield[submarineRow][submarineColl].equals("*")){
                        mineHit ++;
                        battlefield[submarineRow][submarineColl] = "-";
                    } else if (battlefield[submarineRow][submarineColl].equals("C")){
                        batCruisersHit ++;
                        battlefield[submarineRow][submarineColl] = "-";
                    }
                    break;
                case "down":
                    submarineRow += 1;
                    if (battlefield[submarineRow][submarineColl].equals("*")){
                        mineHit ++;
                        battlefield[submarineRow][submarineColl] = "-";
                    } else if (battlefield[submarineRow][submarineColl].equals("C")){
                        batCruisersHit ++;
                        battlefield[submarineRow][submarineColl] = "-";
                    }
                    break;
                case "left":
                    submarineColl -= 1;
                    if (battlefield[submarineRow][submarineColl].equals("*")){
                        mineHit ++;
                        battlefield[submarineRow][submarineColl] = "-";
                    } else if (battlefield[submarineRow][submarineColl].equals("C")){
                        batCruisersHit ++;
                        battlefield[submarineRow][submarineColl] = "-";
                    }
                    break;
                case "right":
                    submarineColl += 1;
                    if (battlefield[submarineRow][submarineColl].equals("*")){
                        mineHit ++;
                        battlefield[submarineRow][submarineColl] = "-";
                    } else if (battlefield[submarineRow][submarineColl].equals("C")){
                        batCruisersHit ++;
                        battlefield[submarineRow][submarineColl] = "-";
                    }
                    break;
            }

        }

        battlefield[submarineRow][submarineColl] = "S";
        if (batCruisersHit == 3) {
            System.out.println("Mission accomplished, U-9 has destroyed all battle cruisers of the enemy!");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(battlefield[i][j]);
                }
                System.out.println();
            }
        } else {
            System.out.printf("Mission failed, U-9 disappeared! Last known coordinates [%d, %d]!%n", submarineRow, submarineColl);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(battlefield[i][j]);
                }
                System.out.println();
            }
        }

    }
}
