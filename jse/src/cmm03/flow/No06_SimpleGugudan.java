package cmm03.flow;

import java.util.Scanner;

public class No06_SimpleGugudan {
	public static void main(String[] args) {
		int dan = 0, x = 0;
		Scanner scanner = new Scanner(System.in);			// 객체지향, scanner 함수 불러오기.
		System.out.println("단을 입력하세요.");	
		dan = scanner.nextInt();
		for (int i = 1; i < 10; i++) {
			x = dan * i;									// 곱셉후의 값을 저장할 x의 값을 지정, for문에 의해 i가 1씩증가할때마다 값이 바뀐다.
			System.out.println( dan 						// 사용자가 입력한 값
					+" x "									// 가독성 및 출력시 곱하기를 의미
					+ i 									// for문이 한번 진행할때 마다 1씩커지는 부분. 
					+" = "									// 가독성
					+ x);									// 곱셉의 결과값
		}
	}
}
