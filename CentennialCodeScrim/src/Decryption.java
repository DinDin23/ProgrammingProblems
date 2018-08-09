import java.util.*;
public class Decryption{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int testCases = kb.nextInt();
        kb.nextLine();
        for(int i = 1; i<= testCases; i++){
            int lengthOfCipher = kb.nextInt();
            kb.nextLine();
            String enMessage = kb.nextLine();
            char[] deMessage = enMessage.toCharArray();
            for(int m = 0; m < deMessage.length / lengthOfCipher; m++){
                for(int j = 0; j < lengthOfCipher; j++){
                   
                   deMessage[j] = deMessage[lengthOfCipher - j -1];
                   
                }
                System.out.println(deMessage);
            }
        }
    }
}
    