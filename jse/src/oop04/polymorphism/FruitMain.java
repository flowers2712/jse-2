package oop04.polymorphism;


public class FruitMain {
	public static void main(String[] args) {
		// �������̽��� ��ü�� ����� ����.
		FruitInterface apple = new AppleImpl();
		FruitInterface orange; // FruitInterface Ÿ���� ���������� ����
		orange = new OrangeImpl(); 
			// Ŭ���� OrangeImpl �� ��ü�� �����Ͽ� orange �� �Ҵ��Ͽ���.
		FruitInterface banana = new BananaImpl();
		apple.display("���ִ� ");
		orange.display("������ ");
		banana.display("��� ");
	//	orange.getCount();
	// 	�������̽��� ����� �޼ҵ常 ȣ���� �����ϴ�.
		
		
	}
}
