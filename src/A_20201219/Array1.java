package A_20201219;

public class Array1 {

	public static void main(String[] args) {
		// for문을 사용해서 1번방 = 10 부터 4번방 = 50/ 입력하는 코드/출력하는 코드 만드세요
		int [] nums = new int [5];
		
	//input code	
		for(int i = 0; i<nums.length; i++) {
			nums[i] = (i+1)*10;
			
	//output code
			System.out.println(i+"번방"+" = "+ nums[i]);
		}
		
		

	}

}
