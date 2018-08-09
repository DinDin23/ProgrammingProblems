import java.util.*;

public class FindingAWayOut {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int testCases = kb.nextInt();
		for(int i = 0; i < testCases; i++) {
			int r = kb.nextInt(), c = kb.nextInt(), numOfPortals = 0, counter = 0;
			kb.nextLine();
			char[][] map = new char[r][c];
			for(int j = 0; j < r; j++) {
				char[] dummy = kb.nextLine().toCharArray();
				for(int m = 0; m < c; m++)
					map[j][m] = dummy[m];
			}
			for(int j = 0; j < r; j++) {
				for(int m = 0; m < c; m++) {
					if(map[j][m] == '-') {
						if(j - 1 >= 0 && map[j - 1][m] == '*') {
							counter++;
							System.out.println("sougiresugfres");
						}
						if(j + 1 <= map.length && map[j + 1][m] == '*') {
							System.out.println("sdhfgesf");
							counter++;
						}
							
						if(m + 1 <= map[0].length && map[j][m + 1] == '*') {
							System.out.println("ufgesyfyesf");
							counter++;
						}
						if(m - 1 >= 0 && map[j][m - 1] == '*') {
							System.out.println("s");
							counter++;
						}
					}
					if(counter == 0)
						numOfPortals++;
				}
				counter = 0;
			}
			if(numOfPortals == 0)
				System.out.println("No Portals Found");
			else
				System.out.println(numOfPortals + " Portals Found");
		}
	}
}
