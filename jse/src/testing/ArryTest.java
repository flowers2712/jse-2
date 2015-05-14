package testing;

public class ArryTest {
	public static void main(String[] args) {
		int[] intArr;
		intArr = new int[10];
		
		int i = 0;
		while (i < 10) {
			intArr[i] = (i + 1) * 100;
			System.out.println(intArr[i]);
			i++;
		}
	}
}
