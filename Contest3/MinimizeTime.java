import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MinimizeTime {
	public static void main(String[] args) {
		int caseNumber = 1;
		Scanner scnr = new Scanner(System.in);
		int numCases = scnr.nextInt();
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2){
	        // let your comparator look up your car's color in the custom order
				return o1-o2;
			}
		};

		while(scnr.hasNext()) { 
			ArrayList<Integer> requests = new ArrayList<Integer>();
			int element = scnr.nextInt();
			while(element != -1) {
				requests.add(element);
				element = scnr.nextInt();
			}
			requests.sort(comparator);
			double wait = 0.0;
			ArrayList<Double> waitTimes = new ArrayList<Double>();
 			for(int i=0; i < requests.size()-1; i++) {
				wait+= requests.get(i);
				waitTimes.add(wait);
			}
 			double average = 0.0;
 			for(int i=0; i < waitTimes.size(); i++) {
 				average += waitTimes.get(i);
 			}
 			
			average = average/requests.size();
			String averageString = "" + average;
		
			averageString = String.format("%.3f", average);

			System.out.println("Case " + caseNumber + ": " + requests.size() + " requests scheduled. Average wait: " + averageString);
			caseNumber++;
		}
	}

}
