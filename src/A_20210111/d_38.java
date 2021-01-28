package A_20210111;

import java.util.Scanner;

public class d_38 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print(",를 사용해 값을 입력하세요: ");
		String str = s.nextLine();
		String[] strs = str.split(",");
		int[] nums = new int[strs.length];

		for (int i = 0; i < strs.length; i++) {
			nums[i] = Integer.parseInt(strs[i]);
			System.out.println(nums[i]);

		}

	}

}
