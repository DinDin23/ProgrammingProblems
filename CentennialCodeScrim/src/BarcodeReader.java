import java.util.*;
public class BarcodeReader{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int shopItems = kb.nextInt();
        HashMap<Integer, String> map = new HashMap<Integer, String>(shopItems);
        for(int i = 0; i < shopItems; i++){
            int barcode = kb.nextInt();
            kb.nextLine();
            String name = kb.nextLine();
            map.put(barcode, name);
        }
        int testCases = kb.nextInt();
        for(int i = 0; i < testCases; i++){
            System.out.println(map.get(kb.nextInt()));
        }
    }
}
    