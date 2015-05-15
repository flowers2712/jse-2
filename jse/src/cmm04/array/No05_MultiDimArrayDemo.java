package cmm04.array;

public class No05_MultiDimArrayDemo {
	public static void main(String[] args) {
		String[][] names = {
				{"Mr.","Ms.","Mrs"},
				{"Smith","Johns","Alex"}};
		
		System.out.println(names[0][0]+names[1][0]); // Mr.Smith
		System.out.println(names[0][1]+names[1][2]); // Ms.Alex
		
		
		/* [][] 0/0 : Mr.	 0/1 : Ms.		0/2 : Mrs
		 * [][] 1/0 : Smith	 1/1 : Johns	1/2 : Alex
		 * */
	}
}
