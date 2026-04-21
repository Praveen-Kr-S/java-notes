package Java_basics;

public class patterns {
	
	public static void main(String[] args) {
//		half pyramid
		for(int i = 1; i <= 5; i++){
			for(int j=1; j<=i;j++) {
				System.out.print(i+" ");
			}
		System.out.println();
		}
		System.out.println("++++++++++++++++++++");
//		Inverted half pyramid
		for(int i = 1; i <= 5; i++){
			for(int j=5; j>=i;j--) {
				System.out.print(i+" ");
			}
		System.out.println();
		}
		
		System.out.println("++++++++++++++++++++");
//		Inverted half pyramid with ascii
		
		char n = 65;
		for(int i = 1; i <= 5; i++){
			for(int j=5; j>=i;j--) {
				System.out.print(n+" ");
				n+=1;
			}
		System.out.println();
		}
		
		System.out.println("++++++++++++++++++++");
//		Hollow square
		for(int i = 1; i <= 5; i++){
			for(int j =1; j <= 5; j++) {
				if(i==1 || i==5 || j == 1 || j == 5) {
					System.out.print(i+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}

		System.out.println("++++++++++++++++++++");
//		Plus Pattern
		for(int i = 1; i <= 5; i++){
			for(int j =1; j <= 5; j++) {
				if(i==3 || j==3) {
					System.out.print(i+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("++++++++++++++++++++");
//		Cross Pattern
		for(int i = 1; i <= 5; i++){
			for(int j =1; j <= 5; j++) {
				if(i==j || i+j==6) {
					System.out.print(i+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("++++++++++++++++++++");
//		Cross Pattern with strings
		String s = "APPLE";
		for(int i = 1; i <= 5; i++){
			for(int j =1; j <= 5; j++) {
				if(i==j || i+j==6) {
					System.out.print(s.charAt(i-1)+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
	}
}
