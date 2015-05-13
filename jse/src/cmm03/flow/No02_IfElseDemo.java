package cmm03.flow;

import java.util.Scanner;

public class No02_IfElseDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		 * 객체지향 :  남이 짜놓은 코드를 하나의 예약어로 불러와 사용하는것.
		 * import 값이 생기고 맨앞이 대문자로 바뀐다.
		 * 1. scanner + c.s.
		 * 2. scanner = new sc +c.s.
		 * 3. sys +c.s.
		 * 4. .in 선택
		 * 5. ;
		 * */
		System.out.println("값을 입력하세요..");			//가독성
		/*int i;
		i = 0;*/
		int i = 0;											//인트형 변수 i 를 선언하고 0 으로 초기화.
		i = scanner.nextInt();								/*키보드 입력 툴, int형 scanner이기에 정수를 입력하면 i에 저장된다.
		 													  위에서 불러온 scanner를 사용
		 													  1. sc + c.s. 로 scanner변수를 불러오고
		 													  2. .next후에 int 선택
		 													  3. ; 																*/
		System.out.println("입력값은 "+i+" 입니다.");		//입력한 값에 대한 가독성을 높이기 위해 사용.
	}
}
