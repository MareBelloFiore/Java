package basic;

import java.util.Scanner;

public class InputCheckApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
//		System.out.print("점수 입력[0~100] >> ");
//		int score = scanner.nextInt();
		
//		int score=-1; // 조건식이 참이 되게 하는 값을 초기값으로 설정
//		// 비정상적인 입력값인 경우 반복문 실행, 정상이면 종료
//		while(score<0 || score>100) {
//			System.out.print("점수 입력[0~100] >> ");
//			score = scanner.nextInt();
//			if(score<0 || score>100) {
//				System.out.println("[에러] 점수는 0~100 범위의 점수값만 입력 가능합니다.");
//			}
//		}
		
		/*
		int score;
		do {
			System.out.print("점수 입력[0~100] >> ");
			score = scanner.nextInt();
			if(score<0 || score>100) {
				System.out.println("[에러] 점수는 0~100 범위의 점수값만 입력 가능합니다.");
			}
		} while(score<0 || score>100);
		*/
		
		int score;
		while(true) {	// 조건식 대신 [true]를 사용하면 무조건 참 - 무한루프
			System.out.print("점수 입력[0~100] >> ");
			score = scanner.nextInt(); 
			// 입력값이 정상적인 값이면 종료
			if(score >= 0 && score <= 100) break;
			// 비정상적인 값 입력 시 에러 메세지 출력 후 반복문 재실행
			System.out.println("[에러] 점수는 0~100 범위의 점수값만 입력 가능합니다.");
		} 
		
		String grade = "";
		switch (score/10) {
		case 10:
		case 9: grade="A"; break;
		case 8: grade="B"; break;
		case 7: grade="C"; break;
		case 6: grade="D"; break;
		default: grade="F";
		}
		
		System.out.println("[결과]" + score + "점 = "+grade + "학점" );
		
		scanner.close();
	}

}
