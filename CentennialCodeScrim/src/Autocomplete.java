import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Autocomplete{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int testCases = kb.nextInt();
        kb.nextLine();
        String[] searchOptions = new String[testCases];
        for(int i = 0; i < testCases; i++){
            searchOptions[i] = kb.nextLine();
        }
        
        String hasTyped = kb.nextLine();
        int typedLength = hasTyped.length();
        List<String> myList = new ArrayList<String>();
        for(int i = 0; i < testCases; i++){
            if(searchOptions[i].substring(0, typedLength).equals(hasTyped)){
                myList.add(searchOptions[i]);
                Collections.sort(myList);
            }
        }
        for(int i = 0; i < myList.size(); i++) {
        	System.out.println(myList.get(i));
        }
    }
}
    
