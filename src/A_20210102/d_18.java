package A_20210102;

public class d_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] nums = new int[30];
	for(int i = 0; i<nums.length;i++) {
		nums[i] = i+1;
		if(nums[i]%3==0) {
			System.out.println("짝");
		}else {
			System.out.println(nums[i]);
		}
	}
	}

}
