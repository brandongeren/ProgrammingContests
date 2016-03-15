
import java.util.*;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		while(scnr.hasNextLine()) { 
			int n = scnr.nextInt();
			for(int i = 1; i < 1000; i++) {
				double fibN = 1/Math.sqrt(5)*(Math.pow((1+Math.sqrt(5))/2, i) - 
						Math.pow((1-Math.sqrt(5))/2, i));
				
				long fib = Math.round(fibN);
				long fibMod = fib % n;
				System.out.println(fibMod);
			}
		}

	}
}
