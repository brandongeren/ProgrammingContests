
import java.util.ArrayList;
import java.util.Scanner;

public class LastTerm {
	public static void main(String[] args) {
		
		int caseNumber = 1;
		
		Scanner scnr = new Scanner(System.in);
		
		while(scnr.hasNext()) {
			
			
			int terms = 1;

			String test = scnr.next().trim();
			
			int n = Integer.parseInt(test);
			
			if(n==0) {
				break;
			}
			
			while(n != 15) {
				ArrayList<Integer> factors = new ArrayList<Integer>();
				
				factors.add(1);
				factors.add(n);
				
				for(int i = 2; i <= n/2; i++) {
					if(n%i==0) {
						factors.add(i);
					}
				}
				
				
				int total=0;
				
				for(Integer factor: factors) {
					String factorString = factor.toString();
					for(int i = 0; i < factorString(); i++) {
						total+=Integer.parseInt(factorString.substring(i, i+1));
					}
				}
				
				n = total;
				terms++;
			}
			System.out.println("Case " + caseNumber + ": " + terms + " terms");
			System.out.println("");
			caseNumber++;
		}
	}
}
