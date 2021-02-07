import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class CalcuTest {

	//Atributs 
	private Calcu calculator;

	@Test
	void test() {
		calculator= new Calcu();
	}
	
	
	@Test
	// Sum the given numbers 
	// @return 10 
	public void sum() {
		assertEquals(10,calculator.suma(4, 6));
	}
	
	
	@Test
	// Substract the given numbers
	// @return -2
	public void rest() {
		assertEquals(-2,calculator.resta(3, 5));
	}
	
	
	@Test
	//Multiply the given numbers 
	//@return 20
	public void  multiplication() {
		assertEquals(20,calculator.multiplicacion(4, 5));
	}
	
		
	@Test
	//Divide the given numbers
	//@return 1
	public void divide() {
		assertEquals(1,calculator.division(2, 2));
	}
	

}
