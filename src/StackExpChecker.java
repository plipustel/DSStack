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
import java.util.ArrayList;


class ExpStack {
	private ArrayList<Character> ExpStack;
	
	boolean valid = false;
	
	
	public ExpStack(String strExp) {
		ExpStack = new ArrayList<>();
		
		for(int i = 0; i < strExp.length(); i++) {
			if(strExp.charAt(i) == '(' || strExp.charAt(i) == '[' || strExp.charAt(i) == '{' || strExp.charAt(i) == '<') {
				ExpStack.add(strExp.charAt(i));
			} else {
				if( isBalanced(peek(), strExp.charAt(i)) ) {
					pop();
					if(ExpStack.isEmpty()) {
						valid = true;
					}
				} else {
					valid = false;
				}
			}
		}
		
		if(!valid) {
			System.out.println("Invalid !");
		} else {
			System.out.println("Valid !");
		}
	}
	
	public boolean isBalanced(char open, char close) {
		if(open == '(' && close == ')') {
			return true;
		} else if(open == '[' && close == ']') {
			return true;
		} else if(open == '{' && close == '}') {
			return true;
		} else if(open == '<' && close == '>') {
			return true;
		} 
		
		return false;
	}
	
	public void GetStackExp() {
		for(int i = ExpStack.size() - 1;  i >= 0; i--) {
			System.out.println("[" + i + "]\s" + ExpStack.get(i));
		}
	}
	
	public int GetStackExpSize() {
		if(!ExpStack.isEmpty()) {
			return ExpStack.size();	
		}
		return 0;
	}
	
	public void pop() {
		if(!ExpStack.isEmpty()) {
			ExpStack.remove(ExpStack.size() - 1);
		}
	}
	
	public char peek() {
		if(!ExpStack.isEmpty()) {
			return ExpStack.get(ExpStack.size() - 1);
		} 
		return 0;
	}
}

public class StackExpChecker {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String inputExp = new String();
				
		System.out.println("Enter expression. \nEx: [{(A+B)*(C-D)+[<c,f>]}]:");
		inputExp = sc.nextLine();
		
		
		ExpStack Paranthesis = new ExpStack(inputExp);

//		
//		System.out.println("Stack Size:" + Paranthesis.GetStackExpSize());
//		Paranthesis.GetStackExp();
		
		
	}

}
