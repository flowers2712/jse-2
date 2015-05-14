package cmm04.array;

public class No01_IntArryDemo {
	public static void main(String[] args) {
		int[] intArr;												// 배열 선언'[]' 추가. 큰박스
		intArr = new int[10];										/* new : 새매모리를 할당한다는 의미
		 															   할당하는 이유는 박스를 칸막이로 나눠서 쓰겠다는 의미.파티션 설정하는 느낌.
		 															   []안에 몇개의 칸으로 나눌지 설정해야한다.
		 															   */
		int[] intArr2 = {100,200,300,400,500,600,700,800,900,1000}; 	//배열 칸을 설정 하지않고 바로 값을 할당하면서 나눔.
		
		/*// intArr[0] = 100;											// 선언한 10개의 칸(0~9) 중 첫번째 칸에 100을 할당해라.
		for (int i = 0; i < 10; i++) {								// for문 으로 0~9 칸에 값을 할당.
			intArr[i] = (i + 1 ) * 100;
			System.out.println(intArr[i]);							// 잘 할당됫는지 확인.
		}*/
	}
}
