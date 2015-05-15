package testing;

import java.util.Scanner;

public class arraytest2 {
	public static void main(String[] args) {
	/*	Scanner scanner = new Scanner(System.in);
		System.out.println("필요한 단수 입력");
		int a = scanner.nextInt();
		
		while(a < 2 || a > 19){
			System.out.println("잘못된 입력 재입력");
			a = scanner.nextInt();
		};
		
		for(int i=1;i-1<a; i++){
			System.out.println("2*"+i+"\t3*"+i+"\t4*"+i+"\t5*"+i);
		};	

		System.out.println("\n");
			
		for(int i=1;i-1<a; i++){
			System.out.println("6*"+i+"\t7*"+i+"\t8*"+i+"\t9*"+i);
		};*/
		
		for(int x=2; x<10; x++){
			for(int y=2; y<10; y++){
				System.out.print(x+" * "+y+" = "+x+"\t");
				System.out.print((x+1)+" * "+y+" = "+(x+1)*y+"\t");
				System.out.print((x+2)+" * "+y+" = "+(x+2)*y+"\t");
				System.out.println((x+3)+" * "+y+" = "+(x+3)*y+"\t");
			};
		};
	}
}