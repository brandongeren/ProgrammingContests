
import java.util.*;

public class WinningPercentage {
	public static void main(String[] args) {
		int caseNumber = 1;
		Scanner scnr = new Scanner(System.in);
		ArrayList<Integer> results = new ArrayList<Integer>();
		while(scnr.hasNextLine()) { 
			int percentage = scnr.nextInt();
			int numPairs = scnr.nextInt();
			if (percentage == 0 && numPairs == 0) {
				break;
			}
			int won = 0;
			int played = 1;
			System.out.println("Case " + caseNumber + ": p = " + percentage + ", n = " + numPairs);
			while (numPairs > 0) {
				while(true) {
					if(percentage <= ((double) won)/((double) played) * 100) {
						if(percentage + 1 > ((double) won)/((double) played) * 100) {
							break;
						} else {
							played++;
							won = 0;
						}
					} else {
						won++;
					}
				}
				System.out.println("    " + won + " games out of " + played);
				numPairs--;
				won++;
			}
			caseNumber++;
		}
	}

}
