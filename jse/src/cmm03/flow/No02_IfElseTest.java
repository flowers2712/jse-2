package cmm03.flow;

import java.util.Iterator;
import java.util.Scanner;

public class No02_IfElseTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);						//scanner 호출
		int kor=0,eng=0,math=0,sum=0,avg2=0;							//각 점수를 보관할 변수 선언 및 초기화
		double t1=0.0,t2=0.0,t3=0.0;
		double avg=0.0;													//평균값은 소숫점이 될수 있으니 double로 선언 및 초기화
		String msg= "a";												//단어를 저장할 변수 선언 및 초기화
		
		System.out.println("국어점수입력 : ");							//가독성
		kor = scanner.nextInt();										//scanner로 입력된 정수값을 kor에 저장
			
		if(0 < kor == kor < 100){}else{
			System.out.println("0~100 사이의 점수를 입력하세요");
			System.out.println("국어점수입력 : ");
			kor = scanner.nextInt();
		}
		
		System.out.println("영어점수입력 : ");
		eng = scanner.nextInt();
		System.out.println("수학점수입력 : ");
		math = scanner.nextInt();
		
		
		sum = kor + eng + math;											//sum 사용 및 평균값계산
		avg = sum/3;
		t1 = sum%3;
		t2 = t1/3;
		t3 = avg + t2;

		if(avg==100){													//if, elseif 사용으로 합격여부 범위 설정.
			msg = "보너스 ㄱㄱ";
		}else if (avg > 70) {
			msg = "합격";
		}else {
			msg = "탈락";
		}
		
		avg2 = (int)avg;
		
		System.out.println("국어\t영어\t수학\t합계\t평균\n"+kor+"\t"
						+eng+"\t"+math+"\t"+sum+"\t"+avg2); 			// 가독성및 총 결과치
		System.out.println("너는 "+msg+" 입니다.\n");					//사용한 if문을 통한 결과치 출력.
		System.out.println("Double평균\n"+t3);
		System.out.println("Double평균\tt2\tt3\n"+t1+"\t"+t2+"\t"+t3);
		System.out.println("\n" + (int)avg);							//double형 avg 이지만 int로 형변환출력하면 소숫점이하를 버릴수 있다.
	}
}
