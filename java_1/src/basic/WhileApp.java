package basic;

public class WhileApp {

	public static void main(String[] args) {
		int i = 1;
		while(i<=5) {
			System.out.println("Java Programming");
			i++;
		}
		System.out.println("===================================");
		
		int j = 1, tot = 0;
		do {
			tot+=j;
			j++;
		} while(j<=100);
		System.out.println("1~100 범위의 정수들의 합계 = "+tot);
		System.out.println("===================================");
		
		int cnt = 0, gae = 1;	// cnt : 접는 횟수, gae : 사각형 모양 갯수
		while(gae < 500) {	// gae가 500개 미만이면 계속 반복, 이상이면 종료
			cnt ++;
			gae *= 2;
		}
		
		System.out.println(cnt+"번 접으면 "+gae+"개의 사각형이 만들어 집니다.");
		System.out.println("===================================");
		
		// 1 ~ X 범위의 정수들의 합계까 300 이상이 만들어지려면 X가 얼마인지 계산
		int tot3 = 0, x = 0;
		while(tot3 <300) {
			x++;
			tot3 += x;
		}
		System.out.println("1부터 "+x+"까지의 정수들의 합 = "+tot3);
		System.out.println("===================================");
	}
}
