package cmm01.var;

public class No03_EscapeDemo {
	public static void main(String[] args) {
		int kor = 90;
		int eng = 85;
		int sum = 0;
		
		sum = kor + eng;
		
		System.out.print("\t����ó��\n");			//print���� ln�� ����� enter���� ������. ��� \n�� �־��ָ� �Ȱ������.
												//\n = ln
		System.out.println("====================");
		System.out.println("����\t����\t����"); //���� ""�ȿ� �ִ°��̸� \t�� ���� ��밡��
		System.out.println(kor+"\t"+  eng+"\t"+  sum);
		
	}
}
