
import java.util.Scanner;

public class Cannonballs {
	public static void main(String[] args) {
		int caseNumber = 1;

		Scanner scnr = new Scanner(System.in);
		
		int cases = scnr.nextInt();

		
		for(int i=0; i< cases; i++) { 
			Scanner scnr = new Scanner(System.in);
			
			int total = 0;
			for(int j=1; j<=n; j++) {
				total+=j*(j+1)/2;
			}
			
			System.out.println(caseNumber + ": " + n + " " + total);
			caseNumber++;

		}
	}
}
