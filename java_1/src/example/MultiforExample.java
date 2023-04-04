package example;

public class MultiforExample {
	public static void main(String[] args) {
		//★★★★★
		//★★★★
		//★★★
		//★★
		//★
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print("★");
			}
			System.out.println();
		}

		System.out.println("===============================================================");
		//★★★★★
		//☆★★★★
		//☆☆★★★
		//☆☆☆★★
		//☆☆☆☆★
		
		// i = 5 4 3 2 1
		// j= 0 1 2 3 4
		for(int i = 5; i >= 1; i--) {
			for(int j = 1; j<=5; j++) {
				if(i+j<6) {
					System.out.print("☆");
				} else {
					System.out.print("★");
				}
			}
			System.out.println();
		}

		System.out.println("===============================================================");
		//★
		//★★★
		//★★★★★
		//★★★★★★★
		//★★★★★★★★★
		
		// i = 1 2 3 4 5
		// j = 1 3 5 7 9
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j<= 2 * i -1 ; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		


		System.out.println("===============================================================");
		//★☆☆☆★
		//☆★☆★☆
		//☆☆★☆☆
		//☆★☆★☆
		//★☆☆☆★
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(i+j==6 || i-j==0) {
					System.out.print("★");
				} else {
					System.out.print("☆");
				}
			}
			System.out.println();
		}
		
		System.out.println("===============================================================");
		
		
	}
}