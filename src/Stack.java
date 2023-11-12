/**
 * @(#)Stack.java
 *
 *
 * @Author Plipus Tel <https://www.plipustel.com>
 * @Created May 20, 2012
 * @LastModified Nov 12, 2023
 * 
 */


import java.util.*;

class theStack {
	public int stackSize;
	public char[] stackArr;
	public int topIndex;

	public theStack(int size) {
		stackSize = size;
		stackArr = new char[stackSize];
		topIndex = -1; /* Stack is empty, 0 index means stack is filled */
	}

	public boolean isEmpty() {
		return (topIndex == -1); /* Index -1 means empty, 0 index is still have value */
	}

	public boolean isFull() {
		return (topIndex == stackSize - 1);
	}

	public void push(char c) {
		/*
		 * j++ means j will be incremented after the statement above it just already
		 * executed ++j means j will be incremented before the statement above it
		 * executed
		 *
		 * int j = 2; int k = 3 * (j++); // No incrementing done yet. j still 2 k -> 3 *
		 * (2) = 6 now, j already to be 3;
		 *
		 * int j = 2; int k = 3 * (++j); // Do incrementing first. Now, j is 3 k -> 3 *
		 * (3) = 9
		 */
		stackArr[++topIndex] = c; /* Alocate one space before pushing an item */
	}

	public char pop() {
		return stackArr[topIndex--];
	}

}

public class Stack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Stack");
		String strInput = new String();

		Scanner sc = new Scanner(System.in);
		System.out.print("Input : ");
		strInput = sc.nextLine();

		theStack myStack = new theStack(strInput.length());

		for (int i = 0; i < strInput.length(); i++) {
			myStack.push(strInput.charAt(i));
		}

		System.out.print("Output : ");
		while (!myStack.isEmpty()) {
			System.out.print(myStack.pop());
		}
		System.out.println();

	}

}
