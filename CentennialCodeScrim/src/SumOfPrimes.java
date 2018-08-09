import java.util.*;
public class SumOfPrimes {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		while(kb.hasNextLine()) {
			int num = kb.nextInt();
			System.out.println(summation(num));
		}
	}
	public static int summation(int upTil) {
		int sum = 5;
		if(upTil == 2 || upTil == 1 || upTil == 0)
			return 0;
		else if(upTil == 3)
			return 2;
		else {
			boolean isPrime = true;
			for(int i = 4; i < upTil; i++) {
				if(i % 2 == 0) 
					isPrime = false;
				else {
					for(int j = 3; j <= (int)Math.sqrt(i); j++) {
						if(i % j == 0)
							isPrime = false;
					}
				}
				if(isPrime)
					sum += i;
				isPrime = true;
			}
		}
		return sum;
	}
}
