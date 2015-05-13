package cmm01.var;

public class No03_EscapeDemo {
	public static void main(String[] args) {
		int kor = 90;
		int eng = 85;
		int sum = 0;
		
		sum = kor + eng;
		
		System.out.print("\t성적결과\n");			//print���� ln�� ����� enter���� ������. ��� \n�� �־��ָ� �Ȱ������.
		
		System.out.println("====================");
		System.out.println("국어\t영어\t합계"); 
		System.out.println(kor+"\t"+  eng+"\t"+  sum); // '\t' 는 탭만큼의 간격을 뛰움
		
	}
}
