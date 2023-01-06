package colorsArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Colors {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		File file = new File ("C:\\Users\\bmana\\Desktop\\Skillspire\\colorsArrayList.txt");
		Scanner input =new Scanner(file);
		SecondaryColors secondary = new SecondaryColors();
		secondary.printColors(input);
		
	}

}
