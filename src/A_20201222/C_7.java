package A_20201222;

import java.util.Scanner;

public class C_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("몇 살이니?");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		System.out.println("니 나이 : " + str);
		int age = Integer.parseInt(str);
		if(age>=1 && age<200) {
			System.out.println("정상입력!!");
		}else {
			System.out.println("아 쫌!");
		}
	}

}
