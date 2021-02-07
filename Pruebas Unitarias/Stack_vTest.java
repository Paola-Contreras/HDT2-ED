import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Stack_vTest {
 private static stack <String> stack_a= new Stack_v();
 
 
	@Test
	//Add an element to the stack
	//@return a
	public void putch() {
		String prueba="a";
		stack_a.push(prueba);
		assertEquals(prueba, stack_a.pop());
	}
	
	
	@Test
	// Take out the last element of the stack 
	// @return a
	public void pop() {
		assertEquals("a",stack_a.pop());
	}
	
	
	@Test
	//Counts the elements saved in the stack 
	// @returns 0
	public void sizeS() {
		assertEquals(0,stack_a.size());
	}
	
	
	@Test
	// Verify if the stack is empty
	//@return true 
	public void vacio() {
		assertEquals(true, stack_a.empty());
		
	}
	
	
	@Test
	// use peek in the stack 
	//@ return null 
	public void peekt() {
		assertNull(stack_a.peek());
	}
}
