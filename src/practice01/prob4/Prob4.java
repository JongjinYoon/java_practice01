package practice01.prob4;

import java.util.Scanner;

public class Prob4 {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String str = scanner.nextLine();
		scanner.close();
		
		char[] ArrayStr = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++ ) {
			ArrayStr[i] = (str.charAt(i));
		}
		
		for(int i = 0; i < str.length(); i++ ) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print(ArrayStr[j]);
			}
			System.out.println("");
		}
	}
}
