package oop01.encapsule;

public class PayA {
	private String name;
	private int salary; // �޿�
	public static final double TAX=0.1; // ���� 0.1
	private int taxVal;
	private int income; // �Ǳ޿� = �޿� - �޿�*����
	
	public void setTaxVal(int salary){
	//	System.out.println("PayA �� �Ѿ�� �Ķ���Ͱ� :" + salary);
		this.taxVal = (int) (salary*TAX);
	}
	public void setIncome(int salary){
		
		this.income = (int) (salary-taxVal);
	}
	public int getTaxVal(){
		return (int) taxVal;
	}
	public int getIncome(){
		return income;
	}
	
}
