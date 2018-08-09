import java.util.Scanner;

public class Kepler {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		while(kb.hasNextLine()){
            double orbPer = kb.nextDouble();
            if(orbPer == 0){
                break;
            }
            double cubeAns = Math.pow(orbPer, 2);
            double semMaj = Math.cbrt(cubeAns);
            System.out.printf("%.2f", semMaj);
        }
	}

}
