package api01.lang.system;

import java.text.SimpleDateFormat;

public class CurrentTimeDemo {
	public static void main(String[] args) {
		// System �� ����ƽ Ŭ������
		// ����ƽ �޼ҵ��� currentTimeMillis() ��
		// ��ü �������� (new System �̷����� ���� ����)
		// �ٷ� �޼ҵ带 ȣ���Ͽ���.
		long curTime = System.currentTimeMillis();
		System.out.println("����ð� :"+ curTime);
		/*
		 * �� ����� ����ð� :1432779440757 ���´�.
		 * �̰��� ���α׷� ���ο��� �ν��ϴ� �ð�������
		 * ����ڰ� �ν��ϴ� �ð����� ��ȯ�ؾ� �Ѵ�.
		 * */
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
		String nowTime = sdf.format(curTime);
		System.out.println("����ð� :"+ nowTime);
		
	}
}
