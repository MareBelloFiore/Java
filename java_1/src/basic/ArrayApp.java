package basic;

// 

public class ArrayApp {
	public static void main(String[] args) {
		int[] num = new int[3];
		
		
		System.out.println("num = "+num);
		System.out.println("=================================");
		
		System.out.println("num[0] = "+num[0]);
		System.out.println("num[1] = "+num[1]);
		System.out.println("num[2] = "+num[2]);
		
		System.out.println("=================================");
		System.out.println("num.length = "+num.length);
		System.out.println("=================================");
		
		int index = 0;
		num[index]=10;
		num[index+1]=20;
		num[index+2]=30;
		
		// for 구문 사용 - 일괄처리
		for(int i=0; i<num.length; i++) {
			System.out.println("num["+i+"] = "+num[i]);
		}
		System.out.println("=================================");
		
		int[] su1 = new int[] {10, 20, 30};
		
		for(int i=0; i<su1.length; i++) {
			System.out.println("su1["+i+"] = "+su1[i]);
		}
		System.out.println("=================================");
		int[] su2 = {10, 20, 30};
		for(int temp:su2) {
			System.out.print(temp+"\t");
		}
		System.out.println();
		System.out.println("=================================");
		// 배열의 모든 요소값에 대한 합계를 계산
		int[] array= {54,70,55,79,65,11,34,75,41,80};
		
		int tot = 0;
		for(int i=0; i<array.length;i++) {
			tot += array[i];
		}
		
		System.out.println("합계 = "+tot);
		System.out.println("=================================");
		// 배열 요소값이 30~60 범위의 정수값이 저장된 요소의 갯수를 계산
		int count=0;
		
		for(int element: array) {
			if(element >= 30 && element <= 60) {
				count++;
			}
		}
		
		System.out.println("30~60 범위의 요소의 개수 = "+count);
		System.out.println("=================================");
		
		
	}
}
