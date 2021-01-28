package A_20201219;

public class MultiplicationTable {
	public static void main(String[] args) {
		//구구단을 만들어봅시다.
		
		int num1 = 9;
		
		for(; num1>=1; num1--) {
			System.out.println(num1 + "단");
			for(int num2 = 9; num2>=1; num2--) {
				System.out.println(num1 + "X" + num2 + "=" + num1*num2);
			}
		}
	}
}
