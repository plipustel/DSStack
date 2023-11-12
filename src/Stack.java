/**
 * @(#)Stack.java
 *
 *
 * @Author Plipus Tel <https://www.plipustel.com>
 * @Created May 20, 2012
 * @LastModified Nov 12, 2023
 * 
 * 
 * 
 * 1. STACK
 * Is a linear data structure in which insertion and deletion are allowed only at the top of stack 
 * (or at the end). Stack follows LIFO (Last In First Out). In real world imagine stack of books, stack
 * of coins, stack of disc, etc. Common operations: push(), peek(), isEmpty(), getSize(), isFull()
 * - pop()  -> O(1) complexity
 * - peek() -> O(1) complexity
 * - push() -> 0(1) complexity
 * - searching() -> 0(n) complexity
 * - size() -> 0(1) complexity
 * 
 *  Stack is also Abstract Data Type (ADT) that defines sets of operations and behavior for certain purpose.
 * 
 * 2. ALGORITHM
 * Stack implementation will be using array data structure, with the stack  rules
 * 1. Define first he length of stack 'L'
 * 2. Define an arrayStack with the size 'L'
 * 3. Define the TopIndex < 0 which fall in -1
 * 4. Operations
 *    - PUSH():
 *    	a. check first if arrayStack is empty
 *    	 	if not empty then 
 *    			pre-increment the TopIndex, to make sure it self increment (increment immediately)
 *    			arrStack[++TopIndex] = Item
 *    
 *    			OR
 *    
 *    			arrStack[TopIndex++] = Item
 *    			TopIndex = TopIndex + 1;
 *   		
 *       	else then
 *     	 		Abort
 *     
 *    - POP():
 *    	a. check first if arrayStack is empty
 *    	 	if not empty then 
 *    			decrease the index
 *    			arrStack[TopIndex--] 		
 *       	else then
 *     	 		Abort
 *     
 *    - isEmpty():
 *      Check if the TopIndex is equal to -1 (TopIndex == -1 ? True : False)
 * 
 *    - isFull():
 *    	Check if TopIndex == ArrayStackSize - 1 ? True : False
 *   
 * 
 * 3. REAL IMPLEMENTATION OF STACK:
 * Nested brackets/braces expression checker, code parsing, folder directories path, compiler syntax 
 * checking for bracket and braces, copy paste undo, Depth First Search (DFS) etc..
 * 
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
