package A_20210102;

import java.util.Scanner;

public class d_27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("너 몇살이니?: ");
		String str = scan.nextLine();
		
		int age = Integer.parseInt(str);
		
		System.out.println("니나이: "+ age);
		
		if(age>0 && age<200) {
			System.out.println("정상입력");
		}else {
			System.out.println("아 쫌!");
		}
	}

}
