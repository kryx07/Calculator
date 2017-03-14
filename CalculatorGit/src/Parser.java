import java.util.ArrayList;
import java.util.Arrays;

public class Parser {

	
	public int calculateIntFrom(String input){
		int total=0;
		String[] inputArr=input.split("(?<=[-+*/])|(?=[-+*/])");
		ArrayList <String> numbers = new ArrayList<String>(Arrays.asList(inputArr));
		
		for(int i=0; i<numbers.size(); i++){
			System.out.println(numbers.get(i));
		}
		
		
		
		
		return total;
	}
}
