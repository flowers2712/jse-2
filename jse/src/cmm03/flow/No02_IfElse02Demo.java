package cmm03.flow;

import java.util.Scanner;

public class No02_IfElse02Demo {
	public static void main(String[] args) {
		// �������� ����� ����Ʈ ���� �ش�.!!
		Scanner scanner = new Scanner(System.in);
		int kor = 0, eng = 0, math = 0, sum = 0;
		double avg = 0.0;
		String msg = "message";
		
		System.out.println("���������� �Է��ϼ���");
		kor = scanner.nextInt();
		System.out.println("���������� �Է��ϼ���");
		eng = scanner.nextInt();
		System.out.println("���������� �Է��ϼ���");
		math = scanner.nextInt();
		sum = kor + eng + math;
		avg = sum/3;
		//avg = Math.floor(sum/3);
		
		if(avg==100){
			msg = "���ʽ�����";
		}else if(avg > 70){
			msg = "���� �հ��Դϴ�";
		}else{
			msg = "������� ������";
		}
		
		System.out.println("���� = " + kor);
		System.out.println("���� = " + eng);
		System.out.println("���� = " + math);
		System.out.println("��� = " + (int)avg);
		System.out.println("������ ���� ��� " + msg + " �Դϴ�.");
		
		
	}
}
