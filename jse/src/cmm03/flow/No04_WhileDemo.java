package cmm03.flow;

public class No04_WhileDemo {
	public static void main(String[] args) {
		int count=1;
		while (count < 11) {
			System.out.println("회전수는 "
					+ count + " 입니다.");
			count++;											/*count변수값을 1증가 시킨다.
			 													  이렇게 증가하다가 while의 조건 'count < 11'과 일치하지 않을때 까지 반복한다.*/
		}
	}
}
