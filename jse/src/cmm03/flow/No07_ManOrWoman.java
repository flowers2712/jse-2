package cmm03.flow;

import java.util.Scanner;

public class No07_ManOrWoman {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("주민번호 입력 (ex 0000000000000)");
		String ssn = scanner.next();
		char ch = ssn.charAt(7);
		
		
		System.out.println("입력한 주민번호\n> "+ssn);						// 가독성 , 입력뭘했는지 봐야하므로
		System.out.println("7번째 숫자\n> "+ch);							// 마찬가지
		
		
		switch (ch) {														// ch 기준으로 case로 진입.
		case '1': case '3':System.out.println("남자"); break;				// case 중첩 사용. 메모리를 훨씬 효율적으로 사용 가능.
		case '2': case '4':System.out.println("여자"); break;
		default:System.out.println("흠.. 다시 입력");						// break를 입력하지 않으면 switch 안에서 계속 무한 루프
				ssn = scanner.next();
				ch = ssn.charAt(7);
		}
	}
}
