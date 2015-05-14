package cmm04.array;

public class No02_stringArrayDemo {
	public static void main(String[] args) {
		String[] juso = new String[3];						// 방식 1번, 번거로움
		juso[0] = "서울";									// string 변수 이므로 ""로 묶어준다.
		juso[1] = "종로";
		juso[2] = "광화문";
		
		String[] juso2 = {"영등포","사당","강남"};			// int배열 선언 처럼 {}묶어서 칸의 개수와 할당을 동시에 한다.
		
		for(int i=0; 
				i<juso2.length;								// 중요!! ☆★ 배열이름.length
				i++){					
			System.out.println("주소는 "+juso[i]);
		}
		
		/*
		 * for문에서 int i=0 초기화 하고 그다음 부분에서
		 * i< 배열이름. c+s 한뒤 length 선택하면 알아서 최대개수를 설정하여 필요한 만큼만(존재하는 배열수 많큼) i를 설정한다.
		 * */
		
		
		/*
		String[] test2 = new String[10];					// string뒤에 [](배열선언) 해도되고 변수뒤에 []선언해도 된다.
		for (int i = 0; i < 10; i++) {
			test2[i] = "서울 00"+i+"번지";
			System.out.println(test2[i]);
		}*/
		
		/*
		int i = 0;
		while (i<10) {
			String[] test = 
		*/
	}
}
