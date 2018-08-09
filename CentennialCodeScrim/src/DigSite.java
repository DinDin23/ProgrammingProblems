import java.io.*;
import static java.lang.System.*;
import java.util.*;
public class DigSite{
	public static int size = 1;
	public static void main(String[] args) {
			Scanner kb = new Scanner(System.in);
			int r = kb.nextInt(), c = kb.nextInt(), X2 = 0, Y3 = 0, Z5 = 0, Q1 = 0, notDefined = 0;
			char[][] digSite = new char[r][c];
			kb.nextLine(); 
			for (int i = 0; i < r; i++) {
				char[] line = kb.nextLine().toCharArray();
				for (int j = 0; j < c; j++) {
					digSite[i][j]=line[j];
				}
			}
			
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					if (digSite[i][j]=='#') {
						digSite[i][j]='A';
						DFS(i, j, digSite);
					}
						switch(size) {
						case 2:
							X2++;
							break;
						case 3:
							Y3++;
							break;
						case 5:
							Z5++;
							break;
						case 1:
							Q1++;
							break;
						default:
							notDefined++;
							break;
						}
					}
					size = 1;
				}
				System.out.println("X Fossils: " + X2);
				System.out.println("Y Fossils: " + Y3);
				System.out.println("Z Fossils: " + Z5);
				System.out.println("Y Fossils: " + Q1);
				System.out.println("Unidentified Fossils: " + notDefined);
		}
	public static void DFS(int r, int c, char[][] digSite) {
		//left
		if (r-1 >= 0 && digSite[r-1][c]=='#') {
			size++;
			digSite[r-1][c] = 'A';
			DFS(r-1, c, digSite);
		}
		//right
		if (r+1 < digSite.length && digSite[r+1][c]=='#') {
			size++;
			digSite[r+1][c] = 'A';
			DFS(r+1, c, digSite);
		}
		//down
		if (c+1 < digSite[0].length && digSite[r][c+1]=='#') {
			size++;
			digSite[r][c+1] = 'A';
			DFS(r, c+1, digSite);
		}
		//up
		if (c-1 >= 0 && digSite[r][c-1]=='#') {
			size++;
			digSite[r][c-1] = 'A';
			DFS(r,c-1, digSite);
		}
	}

}
