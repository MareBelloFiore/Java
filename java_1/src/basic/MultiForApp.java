package basic;

public class MultiForApp {
	public static void main(String[] args) {
		int cnt = 0;
		
		for(int i=1; i<=3; i++) {	// A나라 -> 섬
			for(int j=1; j<=4; j++) {	// 섬 -> B나라
				cnt++;
			}
		}
		
		System.out.println("이동방법의 갯수 = "+cnt);
		System.out.println("================================");
		
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
		
		
		System.out.println("");
		System.out.println("================================");
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		
		System.out.println("");
		System.out.println("================================");
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("================================");
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=(5-i); j++) {
				System.out.print("☆");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("================================");
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i+j<6) {
					System.out.print("☆");
				} else {
					System.out.print("★");
				}
			}
			System.out.println();
		}
	}
}
