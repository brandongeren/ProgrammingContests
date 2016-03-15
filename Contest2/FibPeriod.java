
import java.util.*;

public class FibPeriod {
	public static void main(String[] args) {
		int caseNumber = 1;
		Scanner scnr = new Scanner(System.in);
		int result = 0;
		while(scnr.hasNextLine()) { 
			int n = scnr.nextInt();
			if(n < 2) {
				break;
			}
			String prev = "aaaaa";
				String numbers = "";	
				for(int i = 1; i < 500000; i++) {
					String blank = "";
					double fibN = 1/Math.sqrt(5)*(Math.pow((1+Math.sqrt(5))/2, i) - 
							Math.pow((1-Math.sqrt(5))/2, i));
					
					long fib = Math.round(fibN);
					long fibMod = fib % n;
					
					blank+=fibMod;
					if(blank.equals("1") && prev.equals("0")) {
						break;
					}
					
					prev = blank;
					
					if(fibMod == 0 || fibMod == 1) {
						numbers+=fibMod;
					} else {
						numbers+="a";
					}
				}
				
				result = numbers.length();
				
					System.out.println(caseNumber + ": " + n + " " + result);
					caseNumber++;



			
		}
	}

}
