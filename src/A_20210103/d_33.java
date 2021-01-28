package A_20210103;

import java.util.Random;
import java.util.Scanner;

public class d_33 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("6개의 숫자를 \",\"구분자로 입력해 주세요");
		String str = s.nextLine();
		String[] strs = str.split(",");
		
		int[] mylotto = new int[strs.length];
		for(int i = 0; i<strs.length; i++) {
			mylotto[i] = Integer.parseInt(strs[i]);
		}
		int[] lotto = new int[6];
		Random r = new Random();
		for(int i = 0; i<lotto.length; i++) {
			lotto[i] = r.nextInt(45)+1;
			for(int j = 0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.print("니가 찍은 번호[");
		for(int i = 0; i<6; i++) {
			System.out.print(mylotto[i]+",");
		}
		System.out.println("]");
		System.out.print("당첨번호[");
		for(int i = 0; i<6; i++) {
			System.out.print(lotto[i]+",");
			
		}System.out.print("]");
	}
	

}
