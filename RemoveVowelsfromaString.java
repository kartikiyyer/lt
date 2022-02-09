import java.io.*;
import java.util.*;

class RemoveVowelsfromaString {

	String takeInput() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			return br.readLine();
		} catch(IOException e) {
			e.printStackTrace();
		}
		return "";
	}

	public static void main(String args[]) {
		RemoveVowelsfromaString a = new RemoveVowelsfromaString();
		System.out.println("Enter Input String:");
		String input = a.takeInput();
		String output = new String();
		ArrayList<Character> vowels = new ArrayList<Character>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');

		for(int i=0;i<input.length();i++) {
			if(!vowels.contains(input.charAt(i))) {
				output += input.charAt(i);
			}
		}
		System.out.println(output);

	}
}