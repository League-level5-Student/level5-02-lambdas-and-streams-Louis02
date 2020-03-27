package _01_Lambda_Methods;

import java.util.ArrayList;
import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((String s)->{
		
			String ans = "";
			for(int i = s.length()-1; i>=0;i--) {
				ans += s.charAt(i);
			}
		}, "repeat");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((String s)->{
			String ans  = "";
			for(int i = 0; i<s.length();i++) {
				int r = new Random().nextInt(2);
				if(r == 0) {
					char c = s.charAt(i);
					Character.toUpperCase(c);
					ans +=c;
				}
				else {
					char c = s.charAt(i);
					Character.toLowerCase(c);
					ans +=c;
				}
			}
		}, "repeat");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((String s)->{
			String ans = "";
			for(int i = 0; i<s.length();i++) {
				ans += s.charAt(i);
				ans += ".";
			}
		}, "repeat");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((String s)->{
			String ans ="";
			for(int i = 0; i<s.length(); i++) {
				if(s.charAt(i) == 'a' || s.charAt(i) == 'e'|| s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'y') {
					
				}
				else {
					ans += s.charAt(i);
				}
			}
		}, "repeat");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
