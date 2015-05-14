package cmm03.flow;

import java.util.Scanner;

public class No07_ManOrWoman02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("주민번호 입력 (ex 000000-0000000)");
		String ssn = scanner.next();
		char ch = ssn.charAt(7);
		
		
		while ('0' > ch || ch > '5') {										// 입력한 값의 7번째(성별구분)이 재대로 입력이 안됫을경우 무한 루프
			System.out.println("다시 입력 하세요");
			ssn = scanner.next();
			ch = ssn.charAt(7);
		}
		
		if( ch == '1' || ch == '3' ){										// 기본 if문 . '||'는 'or' 기능
			System.out.println(" 남자 ");
		}else{																// else if( ch == '2' || ch == '4') 추가해도 되고
			System.out.println(" 여자 ");									// 위의 while문에서 1,2,3,4 가 아니면 재입력 설정을 했으므로 else만 사용.
		}
	}
}
