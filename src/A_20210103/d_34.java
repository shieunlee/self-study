package A_20210103;

public class d_34 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		int num = 15;
		
		boolean hasNum = false;
		for(int i = 0; i<nums.length; i++) {
			if(nums[i]==num) {
			hasNum = true;
			break;
		}
		}
		if(hasNum) {
				System.out.println("있다");
		}else {
			System.out.println("없다");
		}
	}
	
}
