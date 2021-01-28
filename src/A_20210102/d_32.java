package A_20210102;

import java.util.Scanner;

public class d_32 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("몇단까지 출력할까유? :");
		String gu = s.nextLine();
		
		int num = Integer.parseInt(gu);
		
		for(int i = 1; i<=num; i++) {
			System.out.println(i+"단");
			for(int j=1; j<10; j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
		}
			
		
	}
}
