package example;

public class VariableExample {

	public static void main(String[] args) {
		//가로의 길이가 7이고 세로의 길이가 10인 사각형의 넓이를 계산하여 출력하세요.
		int a = 7, b = 10;
		System.out.println("가로의 길이가 "+a+"이고"+" 세로의 길이가 "+b+"인 사각형의 넓이 = "+a * b);
		System.out.println("======================================================");
		
		
		//높이가 9이고 밑변의 길이가 7인 삼각형의 넓이를 계산하여 출력하세요.
		int c = 9, d = 7;
		double e = (c*d)/2.;
		System.out.println("높이가 "+c+"이고"+" 밑변의 길이가 "+d+"인 삼각형의 넓이 = "+e);
		System.out.println("======================================================");
		
		
		//10명의 전체 몸무게가 759Kg인 경우 평균 몸무게를 계산하여 출력하세요.
		int f = 759, g = 10;
		double h = (double)f / g;
		System.out.println("평균 몸무게 = "+h+"kg");
		System.out.println("======================================================");
		
		
		//이름이 [홍길동]인 학생이 국어점수 89점, 영어점수 93점, 수학점수 95점을 받은 경우
		//총점과 평균을 계산하여 이름, 총점, 평균을 출력하세요.
		//단, 평균은 소숫점 한자리까지만 출력하고 나머지는 절삭 처리 하세요.
		String name = "홍길동";
		int kor = 89, eng = 93, mat = 95;
		int tot = kor + eng + mat;
		double avg = tot/3.;
		
		System.out.println(name + "의 점수 합계 = "+tot + ", 점수 평균 = "+(int)(avg*10)/10.0);
		System.out.println("======================================================");
	}

}
