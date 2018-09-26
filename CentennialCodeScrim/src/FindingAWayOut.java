import java.util.*;

public class FindingAWayOut {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        for (int i = 0; i < num; i++) {
            int r = kb.nextInt(), c = kb.nextInt(), portal = 0, counter = 0;
            kb.nextLine();
            char[][] map = new char[r][c];
            for (int j = 0; j < r; j++) {
                char[] line = kb.nextLine().replace(" ", "").toCharArray();
                for (int k = 0; k < c; k++) {
                    map[j][k] = line[k];
                }
            }
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    if (map[j][k] == '-'){
                        if (j - 1 >= 0 && map[j - 1][k] == '*')
                            counter++;
                        if (j + 1 <= map.length - 1 && map[j + 1][k] == '*')
                            counter++;
                        if (k - 1 >= 0 && map[j][k - 1] == '*')
                            counter++;
                        if (k + 1 <= map[0].length - 1 && map[j][k + 1] == '*')
                            counter++;
                    }
                    if (counter == 4)
                        portal++;
                    counter = 0;
                }
            }
            if (portal == 0)
                System.out.println("No Portals Found");
            else
                System.out.println(portal + " Portals Found");
        }
    }
}
