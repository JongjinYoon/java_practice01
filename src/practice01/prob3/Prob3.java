package practice01.prob3;

import java.util.Scanner;

public class Prob3 {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int number = scanner.nextInt();
		scanner.close();
		int sum = 0;
		
		if(number%2 == 0) {
			for(int i = 0; i < number + 1; i++) {
				if(i%2 == 0)
					sum = sum + i;
			}
			System.out.print("결과 값 : " + sum);
		}
		
		else {
			for(int i = 0; i < number + 1; i++) {
				if(i%2 != 0)
					sum = sum + i;
			}
			System.out.print("결과 값 : " + sum);
		}
	}
}
