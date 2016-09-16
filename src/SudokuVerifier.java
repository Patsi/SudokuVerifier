
public class SudokuVerifier {
	
	public int verify(String candidateSolution) 
	{
		// returns -1 if the candidate solution in not correct lengtt
		if (candidateSolution.length() != 81)
		{
			return -1;
		}
		// returns -1 if the candidate solution does not  contain only numbers
		else if (!candidateSolution.matches("\\d"))
		{
			return -1;
		}
		
		// returns 0 if the candidate solution is correct
		else return 0;
		
		//check
	}
}
