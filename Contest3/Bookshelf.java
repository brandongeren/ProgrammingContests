import java.util.*;

public class Bookshelf {
	
	public static void main(String[] args) {
		int caseNumber = 1;
		Scanner scnr = new Scanner(System.in);
		ArrayList<Integer> results = new ArrayList<Integer>();
		int numCases = scnr.nextInt();
		Hashtable<Integer, Integer> booksTable = new Hashtable<Integer, Integer>();
		LinkedList<Integer> booksQueue = new LinkedList<Integer>();
		//linkedlist.pollLast (takes off the last element and returns it)
		//linkedlist.addfirst (adds to the beginning )
		while(caseNumber <= numCases) { 
			int width = scnr.nextInt();
			String instruction = scnr.next();
			while(!instruction.equals("X")) {
				if(instruction.equals("A")) {
					int bookID = scnr.nextInt();
					int bookWidth = scnr.nextInt();
					booksTable.put(bookID, bookWidth);
					booksQueue.addFirst(bookID);
					while(sumWidths(booksTable) > width) {
						int key = booksQueue.pollLast();
						while(!booksTable.containsKey(key)) {
							key = booksQueue.pollLast();
						}
						booksTable.remove(key);
					}
					
				} else {
					int bookID = scnr.nextInt();
					booksTable.remove(bookID);
				}
				instruction = scnr.next();
			}
			
			
			System.out.println("Case " + caseNumber + ":");
			//TODO: make a for loop that outputs all the keys of the remaining elements of the hashtable
			//System.out.println(book);
			
			for(Integer id: booksTable.keySet()) {
				System.out.println(id);
			}
			caseNumber++;
			System.out.println();
		}
		scnr.close();
	}
	
	public static int sumWidths(Hashtable<Integer, Integer> booksTable) {
		int sumWidths = 0;
		for(Integer width: booksTable.values()) {
			sumWidths+= width;
		}
		return sumWidths;
	}
	
}
