import java.util.*;
public class NthPrime {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		while(kb.hasNextLine()) {
			int n = kb.nextInt(), counter = 5, dummy = 2;
			int[] primes = new int[n];
			primes[0] = 2;
			primes[1] = 3;
			boolean isPrime = true;
			while(dummy < n) {
				for(int i = 3; i <= (int)Math.sqrt(counter); i++) {
					if(counter % i == 0)
						isPrime = false;
				}
				if(isPrime) {
					primes[dummy] = counter;
					counter = 5;
					dummy++;
				}
				counter += 2;
				isPrime = true;
			}
			System.out.println(primes[n - 1]);
		}
	}
}
