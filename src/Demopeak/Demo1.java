package Demopeak;

public class Demo1 {
	public static void main(String []arg) {
		int row=5;
		//outer loop print star

		for (int i = 1; i <=row; i++) {
			//inner loop print star

			for (int j = 1; j <=i; j++) {
				System.out.print("* ");
				
			}
			//move to the next line after printing each row
			System.out.println();
			
		}
	}

}
