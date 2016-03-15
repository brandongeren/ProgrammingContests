import java.math.BigInteger;
import java.util.Scanner;

public class BigRoots {

		public static void main(String[] args) {
			
			int caseNumber = 1;
			
			
			
			BigInteger bigNumber = new BigInteger("4357186184021382204545");
			
			double bigNumberDouble = bigNumber.doubleValue();
						
			Scanner scnr = new Scanner(System.in);
			long zero = 0;
			BigInteger bi0 = BigInteger.valueOf(zero);
			
			while(scnr.hasNextLine()) { 
				
				
				int n = scnr.nextInt();
				long nLong = Long.valueOf(n);
				if(BigInteger.valueOf(n).equals(bi0)) {
					break;
				}
				
				
				String pAsString = scnr.next().trim();
				
				BigInteger p=new BigInteger(pAsString);

				double pDouble = p.doubleValue();
				
				int k = (int) Math.round(Math.pow(pDouble, 1.0/n));
				
				Integer kInteger = new Integer(k);
				
				BigInteger bigK = new BigInteger(kInteger.toString());
				
				String printThis = "";
				
				BigInteger hopefullyP = bigK.pow(n);
				
				if(hopefullyP.equals(p)) {
					printThis = "Case " + caseNumber + ": " + k;
				} 
				
//				else if(hopefullyP.compareTo(p) < 0) {
//					while(bigK.pow(n).compareTo(p) < 0) {
//						bigK = bigK.add(BigInteger.ONE);
//					}
//					if(bigK.equals(p)) {
//						printThis = "Case " + caseNumber + ": " + bigK;
//					}
//				} 
				
				else { 
					printThis = "Case " + caseNumber + ": " + "No solution";
				}
				
				System.out.println(printThis);
				System.out.println();
				caseNumber++;
				
			
				
			}

//		}
	}
}
