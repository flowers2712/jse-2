package oop01.encapsule;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ű�� �Է��� �ּ���.");
		double height=scanner.nextDouble();
		System.out.println("�����Ը� �Է��� �ּ���");
		double weight=scanner.nextDouble();
		KaupVO vo = new KaupVO(height, weight);
		vo.setIdx(height,weight);
		System.out.println(vo.toString());
		System.out.println("�Ϸ�");
	}
}
/*vo.setHeight(height);
vo.setWeight(weight);*/

/*int idx=0;
vo.setIdx(idx);
vo.getMsg();*/