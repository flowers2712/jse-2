package cmm03.flow;

public class No01_BlockDemo {
	public static void main(String[] args) {
		boolean condition = true; 				//논리 변수 선언 및 초기화
		if(condition){							//boolean 변수를 사용하면 주로 if문을 사용한다.
			System.out.println("참");
		}else {									//위의 if문조건에 만족하지 않는다면 else문 실행.
			System.out.println("거짓");
		}
	}
}
