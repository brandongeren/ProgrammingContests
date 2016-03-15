import java.util.ArrayList;
import java.util.Scanner;

public class Circles {
	public static void main(String[] args) {
		int caseNumber = 1;
		Scanner scnr = new Scanner(System.in);
		while(scnr.hasNextLine()) { 
			float r1 = scnr.nextFloat();
			float r2 = scnr.nextFloat();
			float r3 = scnr.nextFloat();
			
			if(r1 == -1.0) {
				break;
			}
			System.out.println("Case " + caseNumber + ": radius = " + String.format("%.3f", 2*Math.sqrt(r1 * r2 * r3)/(Math.sqrt(r1) +Math.sqrt(r2) +Math.sqrt(r3) - Math.sqrt(r1 + r2 + r3)) ));
			System.out.println();
			caseNumber++;
		}
	}
}
