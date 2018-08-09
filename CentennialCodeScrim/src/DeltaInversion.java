import java.util.*;
public class DeltaInversion {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int testCases = kb.nextInt();
        for(int i = 0; i < testCases; i++){
            int amount = kb.nextInt();
            int[] nums = new int[amount];
            for(int j = 0; j < amount; j++)
                nums[j] = kb.nextInt();
            int[] delta = new int[amount - 1];
            for(int j = 0; j < delta.length; j++)
                delta[j] = nums[j + 1] - nums[j];
            for(int j = 0; j < delta.length; j++){
                if(delta[j] <= 0)
                    delta[j] = Math.abs(delta[j]);
                else
                    delta[j] -= (delta[j] * 2);
            }
            //System.out.println(Arrays.toString(delta) + " " + Arrays.toString(nums));
            for(int j = 1; j < nums.length; j++)
                nums[j] = nums[j - 1] + delta[j - 1];
            for(int j = 0; j < nums.length; j++)
                System.out.print(nums[j] + " ");
            System.out.println();
        }
    }
}
