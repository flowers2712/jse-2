package cmm02.op;

public class No03_3HangDemo {
	public static void main(String[] args) {
		int left = 1, right = 0, result = 0;
		boolean boo = false;
		
		result = boo ? left : right; 
		/*
		 boo, left, right 3개를 이용해서 3항연산자라 한다.
		 boolean 변수 = (true, false) 둘중 하나를 선택
		 boo는 true면 왼쪽, false면 오른쪽 값으로 된다.
		*/
									 
		System.out.println("참이냐 거짓이냐 1 이면 참, 0 이면 거짓 : "+ result);
	}
}
