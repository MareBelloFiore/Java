package basic;

import java.util.Scanner;

// 컴퓨터(난수값) vs 사용자(입력값)
// 사용자 승리 >> 대결 반복
// 사용자 패배 >> 대결 종료
// 대결 종료 후 사용자 승리 횟수 출력
public class RpaGameApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = 0;	// 승리 횟수 저장
		
		// 가위바위보 대결 - 반복
		while(true) {
			// 컴퓨터에게 가위바위보 중 하나를 제공받아 저장
			// 1 : 가위, 2 : 바위, 3 : 보
			// 1 ~ 3 범위의 정수값을 난수로 제공받아 저장
			int computer = (int)(Math.random()*3)+1;
			
			// 사용자에게 가위바위보 중 하나를 입력받아 저장
			// 입력값이 1 ~ 3 범위의 정수값이 아닌 경우 에러 메세지 출력 후 재입력 요청
			int user;
			while(true) {	// 입력값 검증
				System.out.print("가위바위보[1: 가위, 2: 바위, 3: 보] >> ");
				user = scanner.nextInt();
				if(user>=1 && user <=3) break;	// 정상값 입력 시 반복문 종료
				System.out.println("[에러]가위, 바위, 보 중 하나를 선택해주세요.");
			}
			
			// 컴퓨터와 사용자의 가위바위보를 출력
			System.out.print("[입력]컴퓨터 >> ");
			switch (computer) {
			case 1: System.out.print("가위"); break;
			case 2: System.out.print("바위"); break;
			case 3: System.out.print("보"); break;
			}
			
			System.out.print(", 사용자 >> ");
			switch (user) {
			case 1: System.out.print("가위"); break;
			case 2: System.out.print("바위"); break;
			case 3: System.out.print("보"); break;
			}
			System.out.println();
			
			// 컴퓨터와 사용자의 대결의 승패를 판단하여 결과 출력
			if(computer==user) {
				System.out.println("[결과] 비겼습니다.");
			} else if(computer==1 && user==2 || computer==2 && user==3 || computer==3 && user==1) {
				System.out.println("[결과] 승리했습니다.");
				count++;	// 승리횟수 1 증가
			}  else {
				System.out.println("[결과] 패배했습니다.");
				break;	// 대결 종료 
			}
			System.out.println();
		}
		
		System.out.println("============================================");
		// 승리 횟수 출력
		if(count==0) {
			System.out.println("[메세지] 사용자가 컴퓨터에게 한 번도 이기지 못했습니다.");
		} else {
			System.out.println("[메세지] 사용자가 컴퓨터에게 "+count+"번 승리했습니다.");
		}
		
		scanner.close();
	}
}
