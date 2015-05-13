package cmm02.op;

public class No04_ConditionDemo {
	public static void main(String[] args) {
		int val01 = 1, val02 = 2;
		
		if((val01==1)&&(val02==2)){
			System.out.println("val01 의 값은 1이고, val02의 값은 2이다."); 
			 //로그인할때 ID PWD 확인.
		}
		if((val01==1)||(val02==2)){
			System.out.println("val01 이 1 이거나. val02 가 1이다.");
		}
	}
}
