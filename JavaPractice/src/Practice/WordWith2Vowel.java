package Practice;

import java.util.Scanner;

public class WordWith2Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		Scanner scan = new Scanner(System.in);		
		System.out.println("Enter sentence");
		String sentence = scan.nextLine();
		
		String[] words = sentence.split(" ");
		for(String word : words){
			count = 0;
			for(int i=0;i<word.length();i++) {
				if(Character.toUpperCase(word.charAt(i)) == 'A' ||
						Character.toUpperCase(word.charAt(i)) == 'E' ||
								Character.toUpperCase(word.charAt(i)) == 'I' ||
										Character.toUpperCase(word.charAt(i)) == 'O' ||
												Character.toUpperCase(word.charAt(i)) == 'U') {
					
					count++;
				}
			}
			if(count == 2) {
				System.out.println(word);
			}
		}
				
	}

}
