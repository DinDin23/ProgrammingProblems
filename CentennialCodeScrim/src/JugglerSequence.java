import java.util.*;
public class JugglerSequence{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int testCases = kb.nextInt();
        for(int i = 0; i < testCases; i++){
            double num = kb.nextDouble(), counter = 1;
            long biggest = (long)num;
            while(num != 1){
                if(num % 2 == 0){
                    num =  (int)Math.sqrt(num);
                    counter++;
                }
                else{
                    int dummy = (int)num;
                    num = (int)Math.sqrt(Math.pow(num, 3));
                    if(num > dummy)
                        biggest = (long)num;
                    counter++;
                }
            }
            System.out.println((int)counter + " " + (int)biggest);
        }
    }
}
    