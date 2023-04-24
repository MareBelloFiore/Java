package basic;

import java.util.Scanner;

public class ScannerApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름을 입력 : ");
		// Scanner.nextLine() : 입력스트림에 전달된 값을 문자열로 변환
		// 키보드로 입력된 값을 문자열로 반환하여 변수에 저장
		// => 키보드 입력값이 없는 경우 프로그램의 흐름이 일시 중지
		String name = scanner.nextLine();
		
		System.out.print("나이 입력 : ");
		int age = scanner.nextInt();
		
		System.out.println("[결과]"+name+"님의 나이는 "+age+"살 입니다.");
		
		scanner.close();
	}
}
