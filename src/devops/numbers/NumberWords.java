package devops.numbers;

import java.io.IOException;

public class NumberWords {

	public String toWords( int number ) {		
		if (number < 0 || number > 9){
				return "Number out of range";
				}
			else{
				String result = "" ;
				result = String.valueOf( number );
				return result.trim() ;
			}
		
		
/*		String result = "" ;
		result = String.valueOf( number );
		return result.trim() ;
	*/	
	}

}
