import java.util.*;
public class PattonWarsPalindrome{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        while(kb.hasNextLine()){
            
            int num = kb.nextInt(), counter = 0;
            boolean dummy = true;
            
            while(counter <= 10 && dummy == false){
            
                String line = Integer.toString(num);
                StringBuilder line1 = new StringBuilder();
            
                line1.append(line);
                line1.reverse();
            
                int num1 = Integer.valueOf(line1.toString()), sum = num + num1;
            
                String summation = Integer.toString(sum);
            
                if(summation.length() % 2 == 0){
                    for(int i = 0; i < (summation.length() / 2); i++){
                        if(summation.charAt(i) != summation.charAt(summation.length() - i))
                            dummy = false;
                    }
                }
                else{
                    for(int i = 0; i < (summation.length() / 2); i++){
                        if(summation.charAt(i) != summation.charAt(summation.length() - i))
                            dummy = false;
                    }
                }
            
                if(dummy)
                    System.out.println(summation);
            
                counter++;
                if(counter > 10 && dummy == false)
                    System.out.println("NONE, " + summation);
            }
        }
    }
}