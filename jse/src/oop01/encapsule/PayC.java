package oop01.encapsule;

public class PayC {
	private String name;
	private int salary; // �޿�
	public static final double TAX=0.1; // ���� 0.1
	private int taxVal;
	private int income; // �Ǳ޿� = �޿� - �޿�*����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getTaxVal() {
		return taxVal;
	}
	public void setTaxVal(int taxVal) {
		this.taxVal = taxVal;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	
	
}
