import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class ConstantIrritation {
	public static void main(String[] args) {
		int caseNumber = 1;
		Scanner scnr = new Scanner(System.in);
		while(scnr.hasNextLine()) { 
			
				String dataString = ""; 
				String input = scnr.nextLine();
				if(input.equals("\n")) {
					break;
				}
				Scanner lineScanner = new Scanner(input);
				String directive = lineScanner.next();
			
				if(directive.equals("dw")) {
					directive = ".word";
				}			
				if(directive.equals("db")) {
					directive = ".byte";
				}
				if(directive.equals("dd")) {
					directive = ".long";
				}
				if(directive.equals("dq")) {
					directive = ".quad";
				}

				while(lineScanner.hasNext()) {
					dataString+=lineScanner.next();
				}
				
				ArrayList<String> data = new ArrayList<String>();
				
				Scanner dataScanner = new Scanner(dataString);
				dataScanner.useDelimiter(",");
				while(dataScanner.hasNext()) {
					data.add(dataScanner.next());
				}
				
				ArrayList<String> newData = new ArrayList<String>();
				
				for(String constant: data) {
					if(constant.substring(constant.length()-1).toLowerCase().equals("h")) {
						constant = "0x" + constant.substring(0, constant.length() -1);
					} else if(constant.substring(constant.length()-1).toLowerCase().equals("d")) {
						constant = constant.substring(0, constant.length() -1);
					} else if(constant.substring(constant.length()-1).toLowerCase().equals("b")) {
						constant = "0x" + Long.toHexString(Long.parseLong(constant.substring(0, constant.length() -1), 2));
//						BigInteger cons = new BigInteger(constant.substring(0, constant.length() -1), 2);
//						cons = new BigInteger(cons.toString(), 10);
//						constant = "0x" + cons;
					} else if(constant.substring(constant.length()-1).toLowerCase().equals("o")) {
						constant = "0" + constant.substring(0, constant.length() -1);
					}
					
					//Integer.parseInt(binaryString, 2)
					newData.add(constant);
				}
				
				String newDataString = newData.toString();
				
				System.out.println("\t" + directive + "\t" + newDataString.substring(1, newDataString.length() - 1));
				System.out.println();
				dataScanner.close();
				lineScanner.close();
			
			
		}
		scnr.close();
	}
}
