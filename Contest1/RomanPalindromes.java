
import java.util.HashMap;
import java.util.Scanner;

public class RomanPalindromes {
	public static void main(String[] args) {
	
		int caseNumber = 1;
		
		int currentRow = 0;

		
		HashMap<String, Integer> Mymap = new HashMap<String, Integer>();
		
		Mymap.put("I", 1);
		Mymap.put("V", 5);
		Mymap.put("X", 10);
		Mymap.put("L", 50);
		Mymap.put("C", 100);
		Mymap.put("D", 500);
		Mymap.put("M", 1000);
		
		Scanner scnr = new Scanner(System.in);
		
		while(scnr.hasNext()) {
			String test = scnr.next().trim();
			StringBuilder sb = new StringBuilder(test.length()*2);
			if(test.length() % 2 == 0){
				sb.append(test);
				sb.reverse();
				sb.append(test);
			}else{
				sb.append(test.substring(1, test.length()));
				sb.reverse();
				sb.append(test);
			}
			test = sb.toString();
			int a=0;
			int b=1;
			int total = 0;
			while(test.length() > b){
				if(Mymap.get(test.substring(a, b)) > Mymap.get(test.substring(a+1, b+1))){
					total += Mymap.get(test.substring(a, b)) + Mymap.get(test.substring(a+1, b+1));
				}else if(Mymap.get(test.substring(a, b)) < Mymap.get(test.substring(a+1, b+1))){
					total += Mymap.get(test.substring(a+1, b+1)) - Mymap.get(test.substring(a, b));
				}
				else{
					total += Mymap.get(test.substring(a, b))*2;
				}
				a++;
				b++;
			}
			
			System.out.println("Case " + caseNumber + ": total = " + total);
			System.out.println("");
			caseNumber++;
			
			currentRow++;	
		}
		
		
	}
}
