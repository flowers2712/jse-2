package cmm01.var; 

class Var{
	public static void main(String[] args) {
		/*
		 * ������ ���� 8����
		 * ���� Ÿ�� : char
		 * ���� Ÿ��(���� Ÿ��) : bate, short, int, long
		 * ���� Ÿ��(�Ǽ� Ÿ��) : float, double
		 * �� Ÿ�� : boolean
		 * */
		int x;	//������ ����
		int y;
		x = 1;	// �Ҵ翬���ڸ� ����� ���� �Ҵ�(����)
		y = x + 1;
		
		
		System.out.println(y);
		/*
		 * ���� ���� ���ο�("") ���� ���ڿ��� �ܼ�â�� �״�� ���
		 * ������ �״�� ���Ǵ� ���� ������ �Ҵ�� ��(value)�� ��µȴ�.
		 * */
		System.out.println("x+1 �� �� : "+y);
	}
}