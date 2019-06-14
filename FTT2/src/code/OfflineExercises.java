package code;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original,
	// there are two chars.

	// doubleChar("The") → "TThhee"
	// doubleChar("AAbb") → "AAAAbbbb"
	// doubleChar("Hi-There") → "HHii--TThheerree"

	public String doubleChar(String input) {
		int inputLen = input.length();
		int counter = 0;
		String output = "";
		
		while (counter < inputLen){
			output += input.substring(counter,counter+1) + input.substring(counter,counter+1);
			counter++;
		}
		
		return output;
	}
	//
	// A sandwich is two pieces of bread with something in between. Return the
	// string that is between the first and last appearance of "bread" in the
	// given string, or return the empty string "" if there are not two pieces
	// of bread.

	// getSandwich("breadjambread") → "jam"
	// getSandwich("xxbreadjambreadyy") → "jam"
	// getSandwich("xxbreadyy") → ""

	public String getSandwich(String input) {
		int inputLen = input.length();
		int counter = 0;
		String output = "";
		String current = "";
		String filling = "";
		int betweenBread = 0;
		
		while (counter < inputLen - 1){
			
			current = input.substring(counter,counter+5); 
			
			if (current.equals("bread")) {
				if (betweenBread == 0) {
					betweenBread = 1;
				}
				else if (betweenBread == 1) {
					output = filling;
					betweenBread = 0;
				}		
				counter += 5;
			}
			
			if (betweenBread == 1) {
				filling += input.substring(counter,counter+1);
			}
			counter += 1;
		}
		
		return output;
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false

	public boolean evenlySpaced(int a, int b, int c) {
		int small,medium,large = 0;
		
		if (a > b && a > c) {
			large = a;
			if (b > c) {
				medium = b;
				small = c;
			}
			else {
				medium = c;
				small = b;
			}
		}
		else if (a > b) {
			large = c;
			medium = a;
			small = b;
		}
		else {
			if (c > b) {
				large = c;
				medium = b;
				small = a;
			}
			else {
				large = b;
				if (a > c) {
					medium = a;
					small = c;
				}
				else {
					medium = c;
					small = a;
				}
			}
		}
			
		int gap = large - medium;
		int gap2 = medium - small;
		
		if (gap == gap2) {
			return true;
		}
		else {
			return false;
		}
	}

	// Given a string and an int n, return a string made of the first and last n
	// chars from the string. The string length will be at least n.

	// nTwice("Hello", 2) → "Helo"
	// nTwice("Chocolate", 3) → "Choate"
	// nTwice("Chocolate", 1) → "Ce"

	public String nTwice(String input, int a) {
		int inputLen = input.length();
		int counter = 0;
		String output = "";
		
		while (counter < inputLen){
			if (counter+1 <= a || inputLen - (counter) <= a) {
				output += input.substring(counter,counter+1);			
			}
			counter++;
		}		
		return output;
	}

	// Given a string, return true if it ends in "ly".

	// endsLy("oddly") → true
	// endsLy("y") → false
	// endsLy("oddy") → false

	public boolean endsly(String input) {
		input =" " + input + " ";
		int inputLen = input.length();
		
		if (input.substring(inputLen-3,inputLen-1).equals("ly")) {
			return true;
		}
		else {
			return false;
		}
	}

	// Given a string, return recursively a "cleaned" string where adjacent
	// chars that are the same have been reduced to a single char. So "yyzzza"
	// yields "yza".

	// stringClean("yyzzza") → "yza"
	// stringClean("abbbcdd") → "abcd"
	// stringClean("Hello") → "Helo"
	public String stringClean(String input) {
		int inputLen = input.length();
		int counter = 1;
		String currentLetter = input.substring(0,1);
		String checkLetter = "";
		String output = currentLetter;
		
		while (counter < inputLen){
			checkLetter = input.substring(counter,counter+1);
			if (checkLetter.equals(currentLetter)) {
				counter++;
			}
			else {
				currentLetter = checkLetter;
				output += currentLetter;
				counter++;
			}
		}	
		return output;
	}

	// The fibonacci sequence is a famous bit of mathematics, and it happens to
	// have a recursive definition. The first two values in the sequence are 0
	// and 1 (essentially 2 base cases). Each subsequent value is the sum of the
	// previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13,
	// 21 and so on. Define a recursive fibonacci(n) method that returns the nth
	// fibonacci number, with n=0 representing the start of the sequence.

	// fibonacci(0) → 0
	// fibonacci(1) → 1
	// fibonacci(2) → 1

	public int fibonacci(int input) {
		if (input == 0) {
			return 0;
		}
		else if (input == 1) {
			return 1;
		}
		else {
			return fibonacci(input - 2) + fibonacci(input - 1);
		}
	}

	// We have a number of bunnies and each bunny has two big floppy ears. We
	// want to compute the total number of ears across all the bunnies
	// recursively (without loops or multiplication).
	//
	// bunnyEars(0) → 0
	// bunnyEars(1) → 2
	// bunnyEars(2) → 4

	public int bunnyEars(int input) {
		if (input == 0) {
			return 0;
		}
		else {
			return bunnyEars(input - 1) + 2;
		}
	}
}
