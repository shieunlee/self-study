package A_20210127;
//중복되는거 세기
public class MactchNumber5 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,1,2,3,1,1,1,2,2,2};
		int[] fNums = {1,2,3};
		int[] cnts = new int[fNums.length];
		
		for(int i = 0 ; i<nums.length; i++) {
			for(int j = 0; j<fNums.length; j++) {
				if(nums[i]==fNums[j]) {
					cnts[j]++;
				}
			}
		}
		for(int i = 0; i<fNums.length; i++) {
			System.out.println(fNums[i] + ":" + cnts[i]);
		}
	}
}
