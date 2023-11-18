/**
 * @(#)Stack.java
 * @Description: Implementation the very basic of Stack Data Structure, in this
 *               example the stack accept String data types.
 *
 * @Author Plipus Tel <https://www.plipustel.com>
 * @Created May 20, 2012
 * @LastModified Nov 15, 2023
 * 
 * 
 */

class InitStack {

	int stackLength;
	int topIndex;
	String[] arrStack;

	public InitStack(int intStackLength) {
		this.topIndex = -1;
		this.stackLength = intStackLength;
		this.arrStack = new String[this.stackLength];
	}

	public void push(String item) {
		if (!this.isFull()) {
			this.arrStack[++topIndex] = item;
		} else {
			System.out.println("Can't push more items, stack is full, only available " + this.stackLength + " stacks");

		}

	}

	public void pop() {
		// check if stack isEmpty()
		if (this.topIndex == -1) {
			System.out.println("Stack is empty, not to delete, topIndex now " + this.topIndex);
		} else {
			this.arrStack[this.topIndex--] = "";
		}
	}

	public boolean isEmpty() {
		// Since the returning value is boolen, we can simplify the code:
		return this.topIndex == -1;
	}

	public boolean isFull() {
		// return (this.topIndex >= this.stackLength - 1) ? true : false;

		// Since the returning value is boolen, we can simplify the code:
		return this.topIndex >= this.stackLength - 1;
	}

	public int getStackSize() {
		return this.stackLength;
	}

	public void getStack() {
		if (this.isEmpty()) {
			System.out.println("Stack is empty !");
		} else {
			for (int i = arrStack.length - 1; i >= 0; i--) {
				System.out.println(arrStack[i]);
			}
		}

	}

	public String peek() {
		if (!this.isEmpty()) {
			return this.arrStack[topIndex];
		} else {
			return "No peek. Stack is empty !";
		}
	}

}

public class StackBasic {

	public static void main(String[] args) {

		/* initialization */
		InitStack Book = new InitStack(5);
		System.out.println("Stack name Book");
		System.out.println("Book stack size: " + Book.getStackSize());

		/* push() operation */
		System.out.println("+-------------------PUSH()-------------------+");
		Book.push("Data Structure"); // arrStack[0], topIndex = 0
		Book.push("Algorithm"); // arrStack[1], topIndex = 1
		Book.push("Programming"); // arrStack[2], topIndex = 2
		Book.push("Data Science"); // arrStack[3], topIndex = 3
		Book.push("Artificial Intelligent"); // arrStack[4], topIndex = 4, stack is full, length 5
		Book.push("Competitive Programming");
		Book.getStack();

		/* pop() operation */
		System.out.println("");
		System.out.println("Stack's peek: " + Book.peek());
		System.out.println("+-------------------POP()-------------------+");
		Book.pop();
		// Book.pop();
		// Book.pop();
		// Book.pop();
		// Book.pop();

		Book.getStack();
	}

}
