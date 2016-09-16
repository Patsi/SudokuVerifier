
public class SudokuVerifier 
{
	
	public int verify(String candidateSolution) 
	{
		// returns -1 if the candidate solution in not correct lengtt
		if (candidateSolution.length() != 81)
		{
			return -1;
		}
		// returns -1 if the candidate solution does not  contain only numbers 1-9
		else if (!candidateSolution.matches("[1-9]+"))
		{
			return -1;
		}
		//return -2 if the candidate row does not contain each number exactly 1 time
		else if (testRow(candidateSolution))
		{
			return -2;
		}
		//return -3 if the candidate collumn does not contain each number exactly 1 time
		else if (testColumn(candidateSolution))
		{
			return -2;
		}
		
		// returns 0 if the candidate solution is correct
		else return 0;
		
		//check
	}

	private boolean testRow(String candidateString) 
	{
		for (int i = 0; i < 81; i = i + 9)
		{			
			String row = candidateString.substring(0,9);
			if (! row.contains("1")) return false;
			if (! row.contains("2")) return false;
			if (! row.contains("3")) return false;
			if (! row.contains("4")) return false;
			if (! row.contains("5")) return false;
			if (! row.contains("6")) return false;
			if (! row.contains("7")) return false;
			if (! row.contains("8")) return false;
			if (! row.contains("9")) return false;
		}		
		return true;
	}

	
	private boolean testColumn(String candidateString) 
	{
		for (int i = 0; i < 9; i++)
		{
			String column = "";
			for (int j = 0; j < 81; j = j + 9)
			{
				column = column + candidateString.substring(j + i,1);
			}
			// to becontinued
		}
		
		return true;
	}
}
