package example;

public class OperatorExample {

	public static void main(String[] args) {
	//245678초를 일시분초 형식으로 변환하여 출력하세요.
	int total = 245678;
	
	int day = total / (60 * 60 * 24);	// 24*60*60 = 86400, total = total % 86400
	int hour = (total - day * 60 * 60 * 24) / (60 * 60);	// hour = total / (60 * 60), total %= 3600
	int minute = (total - day * 60 * 60 * 24 - hour * 3600) / 60;	// minute = total / 60
	int second = total % 60;	// second = total % 60
	
	System.out.println("\'"+total+"\'초는 " + day + "일 " + hour + "시간 " + minute + "분 " + second + "초");
	System.out.println("===============================================");
	
	
	//한대의 가격이 1억 5천원만인 비행기를 20대 구매할 경우 지불해야될 금액을 계산하여 출력하세요. 
	//단, 15대 이상 구매할 경우 1대당 25%의 할인율을 적용하여 계산하세요.
	
	int ap = 150_000_000, n = 20;
	long pay = (long)( n >=15 ? ap * 0.75 : ap) * n;
	
	System.out.println(n + "대 구매 시 : " + pay + "원");
	System.out.println("===============================================");
		
	}

}
