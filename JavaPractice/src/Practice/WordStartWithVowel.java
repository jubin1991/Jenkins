package Practice;

import java.util.Scanner;

public class WordStartWithVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter sentence");
		String sentence = scan.nextLine();
		
		String[] words = sentence.split(" ");
		for(String word : words){
			if(Character.toUpperCase(word.charAt(0)) =='A' ||
					Character.toUpperCase(word.charAt(0)) =='E' ||
						Character.toUpperCase(word.charAt(0)) =='I' ||
							Character.toUpperCase(word.charAt(0)) =='O' ||
								Character.toUpperCase(word.charAt(0)) =='U') {
				System.out.println(word);
			}
				
		}
		
		//Math.ceil(Math.sqrt(2));
		/*System.out.println(Math.ceil(Math.sqrt(2)));
		
		double x = 125.4;
	      double y = 0.4873;
	   
	      // call ceal for these these numbers
	      System.out.println("Math.ceil(" + x + ")=" + Math.ceil(x));
	      System.out.println("Math.ceil(" + y + ")=" + Math.ceil(y));
	      System.out.println("Math.ceil(-0.65)=" + Math.ceil(-0.65));*/

	}

}
