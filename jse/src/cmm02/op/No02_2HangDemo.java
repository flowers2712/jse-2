package cmm02.op;

public class No02_2HangDemo {
	public static void main(String[] args) {
		int x = 20, y = 7;
		// 변수가 같은 타입이면 ,로 동시에 선언할수 있다.
		int add = 0, sub = 0, gob = 0, mok = 0, nmg = 0;
		
		add = x + y;
		sub = x - y;
		gob = x * y;
		mok = x / y;
		nmg = x % y;
		
		System.out.println("x + y 의 결과값 : "+ add);
		System.out.println("x - y 의 결과값 : "+ sub);
		System.out.println("x * y 의 결과값 : "+ gob);
		System.out.println("x / y 의 결과값 : "+ mok);
		System.out.println("x % y 의 결과값 : "+ nmg);
		
		/*
		 나눗셈은 / 와 %로 나뉘며
		 / : 나머지를 버린 몫의 값만 나온다.
		 * : 몫을 제외하고 나머지만 결과값으로 내보낸다.
		 
		 
		 * */
		
	}
}
