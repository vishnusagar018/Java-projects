package Demopeak;

public class Demo2 {

	public static void main(String[] args) {
		int row=5;
     	//outer loop print star
		for (int i =5; i >=row ; i--) {
			for(int j=5; j>=i+1; j--) {
				System.out.print("* ");

			}
			
			System.out.println();
		}

	}

}
