## Stack
Implemented by: Plipus Tel <a href="https://www.plipus.tel.com" target="_blank">https://www.plipustel.com</a><p>

## What is Stack?
Is a linear data structure in which insertion and deletion are allowed only at the top of stack 
(or at the end). Stack follows LIFO (Last In First Out) rule. Just like in real world stack data structure could be the stack of books, stack
of coins, stack of money, stack of discs, etc. Common operations: push(), peek(), isEmpty(), getSize(), isFull()
  
<ul>
  	<li>pop():  <code>O(1) complexity</code></li>
  	<li>peek() 	<code>O(1) complexity</code></li>
  	<li>push() 	<code>0(1) complexity</code></li>
  	<li>searching() <code>0(n) complexity</code></li>
  	<li>size() <code>0(1) complexity</code></li>
</ul>
Stack is also known as an Abstract Data Type (ADT) that defines sets of operations and behavior for certain purpose.
  
## Basic Algorithm
Stack implementation will use the array as data structure (could also linked list, etc), with the stack rules:
<ul>
  <li>1. Define first the length of stack 'L'</li>
  <li>2. Define an arrayStack with the size 'L'</li>
  <li>3. Define the TopIndex < 0 which fall in -1</li>
  <li>4. Operations:
  	<ul>
  		<li> <b>push(<i><String|Char|Int> element</i>):</b><br>
     	a. check first if arrayStack is empty<br>
     	   if not empty then <br>
     			pre-increment the TopIndex, to make sure it self increment (increment immediately)<br>
     			arrStack[++TopIndex] = Item<p>
     			OR<p>
     			arrStack[TopIndex++] = Item<br>
     			TopIndex = TopIndex + 1;<p>
         	else then<br>
     	 		Abort
     	</li>
     	<li> <b>pop():</b><br>
	    	a. check first if arrayStack is empty<br>
	    	 	if not empty then <br>
	     			decrease the index<br>
	     			arrStack[TopIndex--]<br>	
	        	else then<br>
	      			Abort<p>
      	</li>
     	<li><b>isEmpty():</b><br>
       	Check if the TopIndex is equal to -1 (TopIndex == -1 ? True : False)<p>
  		</li>
     	<li><b>isFull():</b><br>
     	Check if TopIndex == ArrayStackSize - 1 ? True : False
     	</li>
    </ul>
 </ul>  
  
## Example Implementation of Stack:
<ul>
	<li>Nested brackets/braces expression checker</li>
 	<li>code parsing</li>
 	<li>folder directories path</li>
 	<li> compiler syntax </li>
	<li>checking for bracket and braces</li>
	<li>copy paste undo</li>
	<li> Depth First Search (DFS) etc..</li>
</ul>


## Author Website
<a href="https://www.plipus.tel.com" target="_blank">https://www.plipustel.com</a>
  