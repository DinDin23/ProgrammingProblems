import java.util.Scanner;

public class NIMTowers {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        while (kb.hasNextLine()){
            int F = kb.nextInt();
            if(F == 1 || F == 3 || F == 7)
                System.out.println("Ted");
            else if(F % 7 == 0)
                System.out.println("Ed");
            else
                System.out.println("Ted");
        }
    }
}
