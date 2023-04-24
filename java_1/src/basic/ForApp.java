package basic;

public class ForApp {

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			System.out.println("Java Programming");
		}
		System.out.println("==================================");
		
		for(int i=5; i>=1; i--) {
			System.out.println("1234");
		}
		System.out.println("==================================");
		
		for(int i = 2; i<=10; i+=2) {
			System.out.println("abcd");
		}
		System.out.println("==========================================");
		
		for(int i=1; i<=5; i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("==========================================");
		
		for(int i=2; i<=10; i+=2) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("==========================================");
		
		int begin =80, end=20;
//		if(begin>end) {
//			System.out.println("[에러] 시작값이 종료값보다 작아야 합니다.");
//			System.exit(0);	// 프로그램 강제 종료 메소드 호출
//		}
		// 시작값이 종료값보다 큰 경우 두 변수에 저장된 값을 서로 바꿔서 작성
		 if(begin > end){
				int temp=begin;
				begin=end;
				end=temp;
			}	
		// 치환 알고리즘
		
		int sum = 0;
		for(int i=begin; i<= end; i++) {
			sum += i;
		}
		System.out.println(begin+"~"+end+" 범위의 정수들의 합계 = "+sum);
		System.out.println("==========================================");
		
		for(int i = 1, j = 5; i <= 3; i++, j--) {
			System.out.println("i = "+i+", j = "+j);
		}
		System.out.println("==========================================");
		int i =1;
		
		for(;i<=4;i++) {	// 초기식 생략(세미콜론은 생략X)
			System.out.print(i+"\t");
		}
		
		for(;i>=1;i--) {
			System.out.print(i+"\t");
		}
		
		System.out.println();
		System.out.println("==========================================");
		/*
		for(;;) {	// 조건식이 생략된 경우 무조건 참으로 처리 - 무한루프
		System.out.println("무한 반복되어 실행되는 명령");
		}
		//System.out.println("==========================================");
		*/
		
		
		}
	}


