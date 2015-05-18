package oop01.syntax;


public class AverageA {
	/* 메소드내부에 있는 변수, 로컬변수
	 * static				non-static
	 * 클래스				인스턴스, 로컬(메소드 내부)
	 * 필드 : 클래스변수, 인스턴스변수.
	 */

	//	 필드 부분. ()가 없음
	String name;
	int kor;
	int eng;
	int tot; // 합계
	double avg;
	
	public static void main(String[] args) {
		/* 학생 객체생성 및 매모리 할당 */
		AverageA hulk = new AverageA();
		AverageA iron = new AverageA();
		AverageA hawk = new AverageA();
		/*이름 저장*/
		hulk.name = "헐크";
		iron.name = "아이언";
		hawk.name = "호크";
		
		/*점수*/
		hulk.kor = 100;
		hulk.eng = 80;
		iron.kor = 50;
		iron.eng = 90;
		hawk.kor = 20;
		hawk.eng = 40;
		
		/*총점, 평균 계산*/
		hulk.tot = hulk.kor + hulk.eng;
		hulk.avg = hulk.tot/2;
		iron.tot = iron.kor + iron.eng;
		iron.avg = iron.tot/2;
		hawk.tot = hawk.kor + hawk.eng;
		hawk.avg = hawk.tot/2;
		
		/*출력*/
		System.out.println("==="+iron.name+" 의 성적표===");
		System.out.println("국어 :" + iron.kor);
		System.out.println("영어 :" + iron.eng);
		System.out.println("합계 :" + iron.tot);
		System.out.println("평균 :" + iron.avg);
		System.out.println("==="+hulk.name+" 의 성적표===");
		System.out.println("국어 :" + hulk.kor);
		System.out.println("영어 :" + hulk.eng);
		System.out.println("합계 :" + hulk.tot);
		System.out.println("평균 :" + hulk.avg);
		System.out.println("==="+hawk.name+" 의 성적표===");
		System.out.println("국어 :" + hawk.kor);
		System.out.println("영어 :" + hawk.eng);
		System.out.println("합계 :" + hawk.tot);
		System.out.println("평균 :" + hawk.avg);
	
	}
}
