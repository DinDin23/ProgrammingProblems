import java.util.Scanner;

public class Football{
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String team1 = kb.next();
		String team2 = kb.next();
		int counter1 = 0;
		int counter2 = 0;
		while(kb.hasNextLine()) {
			String typeOfScore = kb.next();
			String whoScored = kb.next();
			if(kb.nextLine() == "0 0") {
				break;
			}
			else if(typeOfScore == "TOUCHDOWN" && whoScored == team1) {
				counter1+=6;
			}
			else if(typeOfScore == "EXTRAPOINT" && whoScored == team1) {
				counter1+=1;
			}
			else if(typeOfScore == "CONVERSION" && whoScored == team1) {
				counter1+=2;
			}
			else if(typeOfScore == "FIELDGOAL" && whoScored == team1) {
				counter1+=3;
			}
			else if(typeOfScore == "SAFETY" && whoScored == team1) {
				counter2+=2;
			}
			else if(typeOfScore == "TOUCHDOWN" && whoScored == team2) {
				counter2+=7;
			}
			else if(typeOfScore == "EXTRAPOINT" && whoScored == team2) {
				counter2+=1;
			}
			else if(typeOfScore == "CONVERSION" && whoScored == team2) {
				counter2+=2;
			}
			else if(typeOfScore == "FIELDGOAL" && whoScored == team2) {
				counter2+=3;
			}
			else if(typeOfScore == "SAFETY" && whoScored == team2) {
				counter1+=2;
			}
		}
		if(counter1 > counter2) {
			System.out.println(team1 + " " + counter1);
		}
		else if(counter1 == counter2) {
			System.out.println("TIE");
		}
		else {
			System.out.println(team2 + " " + counter2);
		}
	}
}

	
	
		
