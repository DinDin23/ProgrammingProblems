import java.util.*;
public class GotChange{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int testCases = kb.nextInt();
        kb.nextLine();
        for(int i = 1; i <= testCases; i++){
            String values = kb.nextLine();
            String[] values1 = values.split(" ");
            int coinChange = Integer.parseInt(values1[0]);
            int[] actValues = new int[values1.length - 1];
            for(int j = 0; j < values1.length - 1; j++){
                actValues[j] = Integer.parseInt(values1[j + 1]);
            }
            int numOfCoins = actValues.length;
            System.out.println(dyPro(actValues, numOfCoins, coinChange));
        }
    }
    
    public static int dyPro(int[] coins, int numOfCoins, int coinChange){
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < numOfCoins; i++){
         if (coins[i] <= coinChange) {
             int sub_res = dyPro(coins, numOfCoins, coinChange - coins[i]);
             if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res){
                res = sub_res + 1;
             }
         }
       }
       return res;
    }
}