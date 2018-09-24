import java.util.Scanner;

public class DoubleSnapple {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        while (kb.hasNextLine()){
            int index = kb.nextInt(), numPeople = kb.nextInt();
            kb.nextLine();
            String[] names = new String[numPeople];
            for (int i = 0; i < numPeople; i++)
                names[i] = kb.nextLine();
            if(numPeople == 1 || index == 1){
                System.out.println(names[0]);
                continue;
            }
            String[] whoGoes = new String[index];
            int counter = 1, dummy = 0;
            outer : while (!(dummy == whoGoes.length - 1)) {
                for (int j = 0; j < numPeople; j++) {
                    for (int k = 0; k < counter; k++) {
                        whoGoes[dummy] = names[j];
                        dummy++;
                        if(dummy == whoGoes.length - 1){
                            whoGoes[dummy] = names[j];
                            break outer;
                        }
                    }
                }
                counter *= 2;
            }
            System.out.println(whoGoes[whoGoes.length - 1]);
        }
    }
}