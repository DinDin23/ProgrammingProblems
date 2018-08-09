import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Alchemy {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int testCases = kb.nextInt();
		String[] elemType = new String[testCases];
		double[] amNee = new double[testCases];
		for(int i = 0; i < testCases; i++) {
			elemType[i] = kb.next();
			double convert = Double.parseDouble(kb.next());
			amNee[i] = convert;
		}
		int casesTwo = kb.nextInt();
		int counter = 0;
		double multiple = 0;
		for(int i = 1; i <= casesTwo; i++) {
			String target = kb.next();
			double amountOf = Double.parseDouble(kb.next());
				for(int j = 0; j < elemType.length; j++) {
					if(elemType[j] == target) {
						counter = j;
						System.out.println(counter);
						break;
					}
				}	
			multiple = amountOf * amNee[counter];
			System.out.println();
			System.out.print(target + " " + multiple);
			multiple = 0;
			counter = 0;
			target = null;
			amountOf = 0;
		}
		
	}
}
