import java.util.*;
public class GoingDown{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int testCases = kb.nextInt();
        for(int i = 0; i < testCases; i++) {
        	int testNum = kb.nextInt();
        	boolean dumBoo = true;
        	int counter = 2, multiple = 0;
        	while(dumBoo) {
        		multiple = counter * testNum;
        		int len = (int)Math.log10(multiple) + 1;
        		int max = multiple % 10;
        		multiple /= 10;
        		for(int j = 0; j < len; j++) {
        			
        			
        		}
        	}
        	
        }
        
    }
}
    