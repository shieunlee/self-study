package A_20210102;

import java.util.Scanner;

public class d_30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		
		System.out.print("첫번째 숫자: ");
		String strNum1 = scan.nextLine();
		System.out.print("연산자: ");
		String operator = scan.nextLine();
		System.out.print("두번쨰 숫자: " );
		String strNum2 = scan.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		if(operator.contentEquals("+")) {
			System.out.println(num1 + num2);
		}else if(operator.contentEquals("-")) {
			System.out.println(num1-num2);
		}
	}

}
