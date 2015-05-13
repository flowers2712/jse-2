package cmm03.flow;

import java.util.Scanner;

public class No03_SwitchDemo {
	public static void main(String[] args) {
		System.out.println("평균점수를 입력 하세요.");
		Scanner scanner = new Scanner(System.in);
		int avg = scanner.nextInt();						// int형변수 avg 선언, scanner값으로 초기화
		String msg="";
		char grade=0;
		
		if(avg>=70){
			msg = "합격입니다.";
		}else {
			msg = "실격입니다.";
		}
		
		switch (avg/10) {
		case 10: grade='A' ; break;
		case 9 : grade='B' ; break;
		case 8 : grade='C' ; break;
		case 7 : grade='D' ; break;
		case 6 : grade='E' ; break;
		default: grade='F' ; break;
		}
		System.out.println("귀하는 "+msg+" grade : "+grade+" 입니다.");
		System.out.println("귀하는 "
				+ msg + " 학점은 "
						+ grade + " 입니다.");
	}
}
