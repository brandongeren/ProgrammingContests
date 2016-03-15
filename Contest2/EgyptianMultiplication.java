
import java.util.ArrayList;
import java.util.Scanner;

public class EgyptianMultiplication {
	public static void main(String[] args) {
		int caseNumber = 1;

		Scanner scnr = new Scanner(System.in);
		
		while(scnr.hasNextLine()) { 
			int n = scnr.nextInt();
			if(n==-1) {
				break;
			}
			int m = scnr.nextInt();
			
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			
			String mBin = Integer.toBinaryString(n);
			String one = "1";
			
			int mBinLength = mBin.length();
			
			for(int i=mBinLength; i > 0; i--) {
				if(mBin.substring(i-1, i).equals(one)) {
					numbers.add( m*((int) Math.pow(2, mBinLength-i)));
					
				}
			}
			
			System.out.print("Case " + caseNumber + ": " + n + " x " + m + " = ");
			int length = numbers.size();
			for(Integer num: numbers) {
				System.out.print(num);
				if(numbers.indexOf(num) == length -1) {
					break;
				}
				System.out.print(" + ");
			}
			System.out.println("");
			caseNumber++;

			
		}
		scnr.close();
	}
}
