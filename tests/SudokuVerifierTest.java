import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class SudokuVerifierTest 
{

// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891

	@Test
	public void testVerify() 
	{
		fail("Not yet implemented");
	}
	
	@Test
	public void testLength0() 
	{
		SudokuVerifier sudokuverifier = new SudokuVerifier();
		String candidateSolution = "";
		
		assertEquals(-1, sudokuverifier.verify(candidateSolution));
	}
	
	@Test
	public void testLength80() 
	{
		SudokuVerifier sudokuverifier = new SudokuVerifier();
		String candidateSolution = ""
				+ "123456789"
				+ "123456789"
				+ "123456789"
				+ "123456789"
				+ "123456789"
				+ "123456789"
				+ "123456789"
				+ "123456789"
				+ "12345678";
		
		assertEquals(-1, sudokuverifier.verify(candidateSolution));
	}
	
	@Test
	public void testLength81() 
	{
		SudokuVerifier sudokuverifier = new SudokuVerifier();
		String candidateSolution = ""
				+ "123456789"
				+ "123456789"
				+ "123456789"
				+ "123456789"
				+ "123456789"
				+ "123456789"
				+ "123456789"
				+ "123456789"
				+ "123456789";
		
		assertEquals(0, sudokuverifier.verify(candidateSolution));
	}
	

}
