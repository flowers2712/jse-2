package cmm04.array;

public class No03_ForloopArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			sum += arr[i];
		}
		System.out.println("배열 원소의 합은 "+sum);
		
		/* for문의 i<arr.length 에서 length-1, 2*i, i+1 등으로 원하는 원소만 뽑아낼수 있다.
		 * */
	}
}
