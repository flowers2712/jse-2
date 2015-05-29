package api02.util.calendar;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		// Calendar �� getInstance() �� ����ƽ�̶�
		// Ŭ������ ���� �ٷ� �ҷ��ͼ� �ν��ͽ��� �����Ѵ�.
		// �׷��� new Calendar() �� ����
		// ������ ������ ������� �ʰ� �Ʒ�ó�� �����ߴ�.
		Calendar date = Calendar.getInstance();
		System.out.print("���ó�¥ :"); // println �� �� ������� �����̰�, ln �� ����� ������ ����.
		System.out.print(date.get(Calendar.YEAR)+"��");
		System.out.print((date.get(Calendar.MONTH)+1)+"��");
		System.out.print(date.get(Calendar.DATE)+"��");
		/*
		 * �� ����� �״�� ����ϸ� ���ó�¥ :2015��4��29�� ��� ���´�.
		 * �ڹ� API Ʃ�丮���� ����.."calendars is JANUARY which is 0" �̶�� �����ִ�.
		 * ���� ���� 0���� �����ϹǷ� �� �Ŀ��� 1�� ���ؼ� ����ؾ��Ѵ�.
		 * (date.get(Calendar.MONTH)+1) ��ȣ��ġ�� ����!!
		 * */
		System.out.println();
		System.out.print("����ð� :");
		System.out.print(date.get(Calendar.HOUR)+"��");
		System.out.print(date.get(Calendar.MINUTE)+"��");
		System.out.print(date.get(Calendar.SECOND)+"��");
		
		/*
		 * ���α׷� Ʈ���̾� ���� 30�� ������� ���� ���� �ɸ� ���� �� ���̽����..
		 * 30�� ���� �ð��� �ڵ����� ��ȯ�ϴ� ������ �ʿ��մϴ�.
		 * �Ʒ��� ���� ó���ϸ� �˴ϴ�.
		 * */
		System.out.println("���� ���� ������ �ð��� ������ �� ");
		System.out.println("30�� ���� ��¥�� ����� �Ҷ�.");
		date.add(Calendar.DATE, 30);
		System.out.println(toString(date));
		System.out.println("7�ð����� �ð��� ����� �Ҷ�");
		date.add(Calendar.HOUR, -7); // �Ķ���� �� ���̳ʽ� ���� �־ ó���Ͻø� ��.
		System.out.println(toString(date)); // ����ƽ�̶� ��ü ���� ���� �ٷ� ������ ��.
		/*
		 * ������ ���α׷��� �ۼ��Ҷ� Ư�����ڸ� �Ƚ��ؾ� �ϴ� ��쿡�� ������ ���� ó��.
		 * ���� 22�� 30�� 45 �ʿ� �˶��� �︮�� �ϴ� ����� �ְ��� �Ҷ�..
		 * */
		date.set(Calendar.HOUR, 22);
		date.set(Calendar.MINUTE, 30);
		date.set(Calendar.SECOND, 45);
		System.out.print("������ �ð��� :");
		System.out.print(date.get(Calendar.HOUR)+"��");
		System.out.print(date.get(Calendar.MINUTE)+"��");
		System.out.print(date.get(Calendar.SECOND)+"��");
		
		
		/*
		 * �ٷ� ����� �ϸ� �ý��ۿ��� �����ϴ� �ð����� ���ɴϴ�.
		 * ���� toString() �� �������̵� �ؾ� �մϴ�.
		 * ���⼭�� static ���� ������ �ۼ��մϴ�.
		 * */
		
	}
	public static String toString(Calendar date){
		return date.get(Calendar.YEAR)+"��"
				+date.get(Calendar.MONTH)+"��"
				+date.get(Calendar.DATE)+"��";
	}
}








