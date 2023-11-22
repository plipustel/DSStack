
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

class StackExp {

	private int topIndex = -1;
	public ArrayList<Character> StackBraces;
	private int stackLength;
	public String expression;

	public StackExp(String newExp) {
		this.stackLength = newExp.length();
		this.StackBraces = new ArrayList<>();
		this.expression = newExp;
		
		for (int i = 0; i < this.stackLength; i++) {
			if (this.expression.charAt(i) == '(' || this.expression.charAt(i) == '{' || this.expression.charAt(i) == '['
					|| this.expression.charAt(i) == '<') {
				this.push(this.expression.charAt(i));
			} 
		}
		
		
	}

	public boolean checkExpression() {
		if(isEmpty()) {
			return false;
		} else {
//			for (int i = 0; i < this.stackLength; i++) {
//				if (this.expression.charAt(i) == '(' || this.expression.charAt(i) == '{' || this.expression.charAt(i) == '['
//						|| this.expression.charAt(i) == '<') {
//					this.push(this.expression.charAt(i));
//				} else {
//					if (this.isBalanced(this.peek(), this.expression.charAt(i))) {
//
//						this.pop();
//						
//						if(isEmpty() ) {
//							return true;
//						}
//					} else {
//						return false;
//					}
//				}
//			}
			
		}
		return false;
	
	}

	private boolean isBalanced(char open, char close) {
		if( open == '(' && close == ')') {
			return true;
		} else if( open == '[' && close == ']') {
			return true;
		} else if( open == '{' && close == '}') {
			return true;
		} else if( open == '<' && close == '>') {
			return true;
		} else {
			return false;
		}
	}
	
	private void push(char braces) {
		
		this.StackBraces.add(braces);

	}

	private char peek() {
		return this.StackBraces.get(topIndex);
	}

	private void pop() {
		//this.StackBraces[this.topIndex--] = ' ';
	}

	private boolean isEmpty() {
		return this.topIndex == -1;
	}

	/* Don't need since we use Dynamic Array */
	private static void isFull() {

	}

	public void getStack() {
	
		for (int i = this.StackBraces.size() - 1; i >= 0; i--) {
			System.out.println(StackBraces.get(i));
		}
		
	}
}

public class StackExpChecker {
	public static void main(String[] args) {
		String exp = new String();

		System.out.print("Input expression \nex.[(A+B)*{A-B}+<e,f>]:");
		Scanner sc = new Scanner(System.in);
		exp = sc.nextLine();

		StackExp expInput = new StackExp(exp);
		expInput.getStack();
		
		if(expInput.checkExpression()) {
			System.out.println(expInput.expression + " is VALID !");	
		} else {
			System.out.println(expInput.expression + " is INVALID !");	
		}
		
	}

}
