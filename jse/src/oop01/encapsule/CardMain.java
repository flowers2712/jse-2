package oop01.encapsule;

public class CardMain {
	public static void main(String[] args) {
		System.out.println("ī���� ���� : " + CardVO.height  );
		System.out.println("ī���� �ʺ� : " + CardVO.width);
		
		CardVO myCard = new CardVO("heart",3);
		CardVO yourCard = new CardVO("heart",7);
		
		
		/*yourCard �ν��Ͻ��� �����Ͻð�
		 * ���̴� heart �̰� ���ڴ� 7�� ���Դٰ�
		 * ������ ��..
		 * ���ӷ��� ���� ���� ī�尡 �¸��ϴ� �����Դϴ�.
		 * 
		 * */
		
		System.out.println("��� ī����" +"����"+"��" +yourCard.getNumber()+"�̰�"
				+ "�� ī��" + "����"+ "��"+ myCard.getNumber()+" �̹Ƿ� "
				+ "����� �̰���ϴ�.");
		
	}
}






