package practice01.prob5;

public class Prob5 {
	public static void main (String args[]) {
		for(int i = 1; i < 100; i++) {
			if(i < 10) {
				if(i%3 == 0) {
					System.out.println(i + " 짝");
				}
			}
			else if(i < 20 && i > 10 ) {
				if((i-10)%3 == 0) {
					System.out.println(i + " 짝");
				}
			}
			else if(i < 30 && i > 20) {
				if((i-20)%3 == 0) {
					System.out.println(i + " 짝");
				}
			}
			else if(i < 40 && i >= 30) {
					System.out.println(i + " 짝");
			}
			else if(i < 50 && i > 40) {
				if((i-40)%3 == 0) {
					System.out.println(i + " 짝");
				}
			}
			else if(i < 60 && i > 50) {
				if((i-50)%3 == 0) {
					System.out.println(i + " 짝");
				}
			}
			else if(i < 70 && i >= 60) {
				System.out.println(i + " 짝");
			}
			else if(i < 80 && i > 70) {
				if((i-70)%3 == 0) {
					System.out.println(i + " 짝");
				}
			}
			else if(i < 90 && i > 80) {
				if((i-80)%3 == 0) {
					System.out.println(i + " 짝");
				}
			}
			else if(i < 100 && i >= 90) {
				System.out.println(i + " 짝");
			}
		}
	}
}
