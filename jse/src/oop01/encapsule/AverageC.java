package oop01.encapsule;

public class AverageC {
	/*�ʵ� ����*/
	String name;
	int kor;
	int eng;
	int tot; // �հ�
	double avg;
	
	/*�̸� �����ϴ� ���*/
	public void setName(String foo){
		this.name = foo;
	}
	/*���������� �����ϴ� ���*/
	public void setKor(int kor){
		this.kor = kor;
	}
	/*���������� ���ϴ� ���*/
	public void setEng(int eng){
		this.eng = eng;
	}
	/*�հ� ������ ���ϴ� ���*/
	public void setTot(int kor, int eng){
		this.tot = kor + eng;
	}
	/*��� ������ ���ϴ� ���*/
	public void setAvg(int tot){
		this.avg = tot/2;
	}
	/*��� ������ ���ϴ� ��� 2...���� �������� �ΰ������� ���ϱ�*/
	/*Overloading : �����ε�*/
	public void setAvg(int kor, int eng){
		this.avg = (kor+eng)/2;
	}
}
