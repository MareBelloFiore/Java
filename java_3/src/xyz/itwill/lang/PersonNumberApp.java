package xyz.itwill.lang;

import java.util.Scanner;

//주민번호를 입력받아서 생년월일과 성별을 출력하는 프로그램
//=> 주민번호는 14자리로 입력받고 7번째 자리에 반드시 - 문자가 존재
//=> 비정상적인 주민번호가 입력된 경우 에러 메세지를 출력 후 재입력되도록 처리
//ex) 주민번호[ex. 901225-1234567] >> 000101-4567890
//	  [결과]생년월일 = 2000년 1월 1일, 성별 = 여자
public class PersonNumberApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		//주민번호 저장을 위한 변수
		String number;
		//정상적인 주민번호를 입력받기 위한 반복문 - 입력값 검증
		while(true) {
			System.out.print("주민번호[ex. 901225-1234567] >> ");
			//입력받은 문자열에서 앞과 뒤의 공백만 제거
			//number=scanner.nextLine().trim();
			//입력받은 문자열에서 모든 공백을 제거
			number=scanner.nextLine().replace(" ", "");
			//정상적인 주민번호가 입력된 경우 반복문 종료
			//if(number.length() ==14 && number.charAt(6) == '-') break;
			if(number.length() ==14 && number.indexOf("-") == 6) break;
			
			System.out.println("[에러]형식에 맞게 주민번호를 입력해주세요.");
		}
		
		scanner.close();
		
		//입력된 문자열에서 8번째 위치의 문자 하나를 분리하여 저장
		String seperation=number.substring(7,8);
		//System.out.println(seperation);
		
		//생년월일을 저장하기 위한 변수 - 입력받은 주민번호를 분리하여 변수에 저장
		String birthday="";
		if(seperation.equals("1") || seperation.equals("2")) {//20세기(19XX)에 태어난 경우
			birthday+="19";
		} else if(seperation.equals("3") || seperation.equals("4")){//21세기(20XX)에 태어난 경우
			birthday+="20";
		}
		
		birthday+=number.substring(0, 2)+"년 ";
		birthday+=number.substring(2, 4)+"월 ";
		birthday+=number.substring(4, 6)+"일 ";
		
		//성별을 저장하기 위한 변수 
		String gender="";
		if(seperation.equals("1") || seperation.equals("3")) {//20세기(19XX)에 태어난 경우
			gender+="남자";
		} else if(seperation.equals("2") || seperation.equals("4")){//21세기(20XX)에 태어난 경우
			gender+="여자";
		}
		
		
		System.out.println("생년월일 = "+birthday+", 성별 = "+gender);
	}
}
