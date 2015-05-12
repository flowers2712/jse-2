package cmm02.op;

public class No01_DanHangDemo2 {

	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		
		j = i++;
		System.out.println("i의 값 : "+ i);
		System.out.println("j = i++ 의 값: "+j);
		
		int x = 5;
		int y = 0;
		y = ++x;
		System.out.println("x의 값 : "+ x);
		System.out.println("y = ++x 의 값: "+y);
		/*
		 * 컴퓨터는 ++를 나눠서 하기때문에 값이 다르다.
		 * i++ 는 j값을 초기화 한다음에 ++가 실행되므로
		 * 뒤의 ++를 인식하기전에 j값이 결정된다.
		 * */
		
	}
	
}
