import java.util.Scanner;

public class Euler1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
        int sum = 0;
        int upTil = kb.nextInt();
        for(int i = 0; i < upTil; i += 5)
            sum += i;
        for(int j = 0; j < upTil; j += 3){
            if(j % 15 != 0){
                sum += j;
            }
        }
        System.out.println(sum);

	}

}
