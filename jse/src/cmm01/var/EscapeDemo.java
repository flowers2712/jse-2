package cmm01.var;

public class EscapeDemo {
	public static void main(String[] args) {
		int kor = 90;
		int eng = 85;
		int sum = 0;
		
		sum = kor + eng;
		
		System.out.print("\t성적처리\n");			//print뒤의 ln을 지우면 enter값이 사라진다. 대신 \n을 넣어주면 똑같아진다.
												//\n = ln
		System.out.println("====================");
		System.out.println("국어\t영어\t총점"); //같은 ""안에 있는값이면 \t를 같이 사용가능
		System.out.println(kor+"\t"+  eng+"\t"+  sum);
		
	}
}
