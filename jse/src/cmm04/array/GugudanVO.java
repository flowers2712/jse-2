package cmm04.array;

import java.util.Scanner;

public class GugudanVO {
	public void calc() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("필요한 단수 입력");
		int a = scanner.nextInt();

		while(a < 2 || a > 19){
			System.out.println("잘못된 입력 재입력");
			a = scanner.nextInt();
		}
		
		for(int i=1;i-1<a; i++){
			System.out.println("");
			for(int j=2; j<6; j++){
			System.out.print(j+"*"+i+"="+j*i+"\t");
			}
		}
		System.out.println("");
		for(int i=1;i-1<a; i++){
			System.out.println("");
			for(int j=6; j<10; j++){
			System.out.print(j+"*"+i+"="+j*i+"\t");
			}
		}

	}
}
