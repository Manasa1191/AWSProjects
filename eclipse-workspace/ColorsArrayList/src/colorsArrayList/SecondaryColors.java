package colorsArrayList;

import java.util.ArrayList;
import java.util.Scanner;
// This class contains method that finds secondary colors and prints them on console.
public class SecondaryColors {
// A method that mentions secondary colors from a file 	
	public void printColors(Scanner input) {
		// arraylist with secondary colors
					ArrayList<String> sec_col = new ArrayList<>(); 
					sec_col.add("orange");
					sec_col.add("violet");
					sec_col.add("purple");
					sec_col.add("green");
					
		//Read from a file and print its contents 
					while (input.hasNext()) {
						String word = input.next();
						if(sec_col.contains(word)) {
							System.out.print(word+"[Secondary]"+",");
						}
						else {
							System.out.print(word+",");
						}
					}
					
	}
	
}
