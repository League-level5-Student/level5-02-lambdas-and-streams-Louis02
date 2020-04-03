package _04_Searching_With_Streams;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class StreamSearcher {
	// 1. This method takes an array of Strings and a String. The method returns the number
	// of times the String parameter appears in the String array. This method will
	// use Streams to help us out.
	public long containsCount(String[] strArr, String strToCount) {
		//2. Convert the String array to a stream
		Stream<String> strStream = Arrays.stream(strArr);
			
		
		//3. Use the filter method with a lambda to extract all the String
		//   elements that match the String parameter.
		strStream.filter((String s)->{
			boolean ans = false;
			if(strStream.equals(s)) {
				ans = true;
			}
			else {
				ans = false;
			}
			return ans;
		});
		//4. Return the count of the filtered stream.
		long ans = strStream.count();
		return ans;
	}
}
