package A_20210102;

import java.util.Scanner;

public class d_31 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요: ");
		String str = s.nextLine();
		
		int num = Integer.parseInt(str);
		int[] nums = new int[num];
		
		for(int i = 0; i<nums.length; i++) {
			nums[i] = (i+1)*5;
			System.out.println(nums[i]);
		}
		}
}
