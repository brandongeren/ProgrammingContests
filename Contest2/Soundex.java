
import java.util.*;

public class Soundex {
	public static void main(String[] args) {
		int caseNumber = 1;
		Scanner scnr = new Scanner(System.in);
		while(scnr.hasNextLine()) { 
			String name = scnr.next();
			if(name.equals(".")) {
				break;
			}
			
			String nameCpy = name + "";

			
			if(name.substring(0, 1).equalsIgnoreCase(name.substring(1,2))) {
				nameCpy = nameCpy.substring(0,1) + nameCpy.substring(2, nameCpy.length());
			}
			
			String result = "";
			result+= nameCpy.substring(0,1);
			
			nameCpy = nameCpy.replace('b', '1');
			nameCpy = nameCpy.replace('f', '1');
			nameCpy = nameCpy.replace('p', '1');
			nameCpy = nameCpy.replace('v', '1');
			nameCpy = nameCpy.replace('c', '2');
			nameCpy = nameCpy.replace('g', '2');
			nameCpy = nameCpy.replace('j', '2');
			nameCpy = nameCpy.replace('k', '2');
			nameCpy = nameCpy.replace('q', '2');
			nameCpy = nameCpy.replace('s', '2');
			nameCpy = nameCpy.replace('x', '2');
			nameCpy = nameCpy.replace('z', '2');
			nameCpy = nameCpy.replace('d', '3');
			nameCpy = nameCpy.replace('t', '3');
			nameCpy = nameCpy.replace('l', '4');
			nameCpy = nameCpy.replace('n', '5');
			nameCpy = nameCpy.replace('m', '5');
			nameCpy = nameCpy.replace('r', '6');
			
			nameCpy = nameCpy.replace('B', '1');
			nameCpy = nameCpy.replace('F', '1');
			nameCpy = nameCpy.replace('P', '1');
			nameCpy = nameCpy.replace('V', '1');
			nameCpy = nameCpy.replace('C', '2');
			nameCpy = nameCpy.replace('G', '2');
			nameCpy = nameCpy.replace('J', '2');
			nameCpy = nameCpy.replace('K', '2');
			nameCpy = nameCpy.replace('Q', '2');
			nameCpy = nameCpy.replace('S', '2');
			nameCpy = nameCpy.replace('X', '2');
			nameCpy = nameCpy.replace('Z', '2');
			nameCpy = nameCpy.replace('D', '3');
			nameCpy = nameCpy.replace('T', '3');
			nameCpy = nameCpy.replace('L', '4');
			nameCpy = nameCpy.replace('N', '5');
			nameCpy = nameCpy.replace('M', '5');
			nameCpy = nameCpy.replace('R', '6');

			
			for(int k=1; k< nameCpy.length(); k++) {
				for(int i=1; i<=nameCpy.length()-1; i++) {
					if(nameCpy.substring(i-1,i).equals(nameCpy.substring(i, i+1))) {
						nameCpy = nameCpy.substring(0, i) + nameCpy.substring(i+1, nameCpy.length());
					}
				}
			}
			
			nameCpy = nameCpy.substring(1, nameCpy.length());

			ArrayList<String> strings = new ArrayList<String>();

			
			
			ArrayList<String> vowels = new ArrayList<String>();
			vowels.add("a");
			vowels.add("e");
			vowels.add("o");
			vowels.add("i");
			vowels.add("u");
			vowels.add("h");
			vowels.add("w");
			vowels.add("y");
			vowels.add("A");
			vowels.add("E");
			vowels.add("O");
			vowels.add("I");
			vowels.add("U");
			vowels.add("H");
			vowels.add("W");
			vowels.add("Y");
			

			List<String> nameList = new ArrayList<String>(Arrays.asList(nameCpy.split("")));
			
			nameList.removeAll(vowels);

			
			nameCpy = "";
			for(String l: nameList) {
				nameCpy += l;
			}
			
			

		
			
			
			
			result += nameCpy;
			if(result.length() >4){
				result = result.substring(0, 4);
			}
			
			
			while(result.length() < 4) {
				result+= "0";
			}
			
			
			System.out.println(result + "    " + name);
			caseNumber++;
		}
		scnr.close();
	}

}
