package xyz.itwill.lang;

import java.util.Scanner;

//사칙 연산식을 입력받아 연산결과를 계산하여 출력하는 프로그램
//ex)연산식 입력 >> 20 + 10
//	[결과]30
//=> 입력 연산식에서 사용 가능한 연산자는 사칙 연산자(*,/,+,-)만 허용
//=> 형식에 맞지 않는 연산식이 입력된 경우 에러 메세지 출력 후 프로그램 종료
//=> 입력 연산식에 공백 입력이 가능하도록 처리
public class ConsoleCalculateApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("연산식 입력 >> ");
		String input=scanner.nextLine().replace(" ", "");//입력받은 연산식의 모든 공백을 제거하여 변수에 저장

		scanner.close();
		
		String[] opArray= {"*","/","+","-"};//연산자를 문자열 배열로 저장
		
		//연산식에서 연산자를 검색해서 연산자의 시작위치를 반환받아 저장
		int index=-1;//연산자의 시작위치를 저장하기 위한 변수(아직 못찾았기 때문에 -1 을 값으로 준다)
		for(String operator : opArray) {//배열은 for문을 활용
			//String.lastIndexof(String str) : String 객체에 저장된 문자열에서 매개변수로 전달받은
			//문자열(문자)을 끝부터 차례대로 검색하여 시작위치를 반환하는 메소드
			//=> 매개변수로 전달받은 문자열을 찾을 수 없는 경우 -1 반환
			index=input.lastIndexOf(operator);
			
			if(index != -1) break;	//연산식에서 연산자를 찾은 경우 반복문 종료
		}
		
		//연산자가 없거나 연산자가 잘못된 위치에 있을 경우(+AB, AB+)
		if(index <= 0 || index >= input.length()-1) {
			System.out.println("[에러]연산식을 잘못 입력하셨습니다.");
			System.exit(0);
		}
		
		try {
			//첫번째 피연산자를 분리하여 정수값으로 변환하여 저장
			//=> Integer.parseInt(String str) 메소드 호출 시 NumberFormatException 발생 가능
			int num1=Integer.parseInt(input.substring(0, index));
			
			//연산자를 분리하여 저장
			String operator=input.substring(index, index+1);
			
			//두번째 피연산자를 분리하여 정수값으로 변환하여 저장
			int num2=Integer.parseInt(input.substring(index+1));
			
			//연산자를 비교하여 피연산자에 대한 연산결과를 계산하여 저장
			int result=0;
			switch (operator) {
			case "*": result=num1 * num2; break;
			case "/": result=num1 / num2; break;
			case "+": result=num1 + num2; break;
			case "-": result=num1 - num2; break;
			}
			
			//연산 결과 출력
			System.out.println("[결과] "+result);
			
		} catch(NumberFormatException e) {// 숫자가 아닌 녀석을 숫자형으로 변환하다가 생기는 에러
			System.out.println("[에러]연산식에 숫자가 아닌 값이 입력되었습니다.");
		} catch (ArithmeticException e) {// 0으로 나눌 시 에러
			System.out.println("[에러]0으로 나눌 수 없습니다.");
		} catch (Exception e) {	// 그 외의 에러
			System.out.println("[에러]프로그램에 예기치 못한 오류가 발생했습니다.");
		}
		
	}
}
