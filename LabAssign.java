
import java.util.Scanner;
import java.lang.Math;
import java.lang.String;

public class LabAssign {
	
	public static void main(String[] args) {
		
		Scanner value = new Scanner(System.in);
		Scanner myObj = new Scanner(System.in);
		Scanner myPhrase = new Scanner(System.in);
		
		System.out.println("Part 1: Using x and y from the user we will calculate the total using the equation: (square root(pi * y* squared))/ (2 * x)");
		System.out.println("Enter a value for x!");
		int x = value.nextInt();
		
		System.out.println("Enter a value of y!");
		int y = value.nextInt();
		
		double c = calc(x,y);
		
		double roundOff = Math.round(c * 100.0) / 100.0;
		
		System.out.println("The total is  " + roundOff);
		System.out.println(" ");
		System.out.println("Lets move on to Part 2");
		
		System.out.println("Enter a string");
		String str = myObj.nextLine();
		
		String outPut = wordCap(str);
		
		System.out.println("Therefore, just capitalizing the first letter we get:  " + outPut);
		//System.out.print(outPut);
		
		System.out.println(" ");
		System.out.println("Lets move on to part 3 now, we will take a string and key from user and determine if key is in string!");
		System.out.println(" ");
		System.out.println("Enter a string!");
		String str1 = myPhrase.nextLine();
		
		System.out.println("Enter a key!");
		String key1 = myPhrase.nextLine();
		
	    findKeyWord(str1, key1);
		
	}
	/**
	This method will help us calculate the answer for the above calculation. The equation in question
	that we are using is (square root(pi * y squared))/ (2 * x).
	Inputs: Our inputs for this code will be x and y value that is obtained from the user
	Outputs: We will get the total that will be the answer for the equation.
	 */
	
	public static double calc(int a, int b) {
		
		double num1 = 2 * a;
		
		double num2 = (Math.PI * Math.pow(b, 2));
		
		double num3 = Math.sqrt(num2);
		
		double total = num3 / num1;
		
		return total;
	}
	/**
	 This method will help us take a string and get the first letter of that string capitalized. Therefore, we will
	 need a string and some method to capitalize only the first letter and make the rest of the letters lower
	 case.
	 Inputs: Our inputs for this code will be a string that will be retrieved from the user.
	 Outputs: Our outputs will be the string with the first letter being a capital and the rest of the string being a lower case.
	 */
	
	public static String wordCap(String d) {
		if(d==null) {
			
			return d;
			
		} else {
			
			d = d.toLowerCase();
			
		} return d = d.substring(0,1).toUpperCase() + d.substring(1).toLowerCase();
	}
	/**
	This method will help us see if key is included in the string that is provided by the user. Both of the string and the 
	key will be received from the user and then we will get the result if key is in string.
	Inputs: Our inputs for this code will be the string and the key that are retrieved by the user
	Outputs: The outputs of this code are either true if key is present or false if key is not present
	 */
	static void findKeyWord(String c, String d) {
		
		if(c.contains(d)) {
			
			System.out.println("True");
			
		}else {
			
			System.out.println("False");
			
		}
	}
}


