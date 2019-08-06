package practice01.prob2;

public class Prob2 {
	public static void main (String args[]) {
		int i,j;
		int k = 0;
		
		for(i=0; i<9; i++)
		{
			for(j=0; j<10; j++) {
				k = i + j + 1;
				System.out.print(k + " ");
			}
			System.out.println("");
		}
	}
}
