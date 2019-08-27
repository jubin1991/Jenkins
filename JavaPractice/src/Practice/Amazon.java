package Practice;

import java.util.ArrayList;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "BdAcbCaD";
		String out = "";
		char ch2;
		
		ArrayList<String> al = new ArrayList<String>();
		for(int i=0;i<s.length();i++) {
			al.add(Character.toString(s.charAt(i)));					
		}
		
		/*for(int k=0;k<al.size();) {
			char ch1 = al.get(0).charAt(0);
			for(int j=k+1;j<al.size();j++) {	
				char ch2 = al.get(j).charAt(0);
				if(Character.isUpperCase(ch1)) {
					if(ch1+32 == ch2) {
						out = out+ch1+ch2;
						al.remove(j);
						al.remove(k);
						k=0;
						break;
					}
				}
				else {
					if(ch1-32 == ch2) {
						out = out+ch1+ch2;
						al.remove(j);
						al.remove(k);
						k=0;
						break;
					}
				}
			}
		}*/
		
		for(int k=0;k<al.size();k++) {
			char ch1 = al.get(k).charAt(0);
			if(Character.isUpperCase(ch1)) {
				for(int j=k+1;j<al.size();j++) {	
					ch2 = al.get(j).charAt(0);
					if(ch1+32 == ch2) {
						out = out+ch1+ch2;
						al.remove(j);
						break;
					}
				}
			}
			else {
				for(int j=k+1;j<al.size();j++) {	
					ch2 = al.get(j).charAt(0);
					if(ch1-32 == ch2) {
						out = out+ch1+ch2;
						al.remove(j);
						break;
					}
				}
			}			
		}
		//System.out.println(out);
		int q = 1; System.out.println(out);
		//System.out.println(out);

	}
}
