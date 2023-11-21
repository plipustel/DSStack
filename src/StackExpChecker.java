/**
 * @Author: Plipus Telaumbanua, S.Kom <https://www.plipustel.com>
 * @Last Modified: Nov 2023
 * @Desriptions: Implementation of Stack Data Structure
 * @Disclaimer: Use for educational purpose only. Not for any types of commercial/profitable manner.
 * 
 * 1. CASE: Expression Checker {}, [], <>, () nested braces/brackets
 * 
 * 2. RULES:
 * 
 * 
 * 3. ALGORITHM:
 * 
 */

import java.util.Scanner;

public class StackExpChecker {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String expString = new String();
				
		System.out.print("Enter expression. Ex: [(A+B) * (C-D)]:");
		expString = sc.nextLine();
		
		System.out.println("Result: " + expString);
	}

}
