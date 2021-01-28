package A_20201220;

public class B_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ages = new int[3];
		ages[0] = 10;
		ages[1] = 5;
		ages[2] = 22;

//		// 내림차순
//	
//		int tmp = ages[0];
//		ages[0] = ages[2];
//		ages[2] = ages[1];
//		ages[1] = tmp;
//
//		for (int i = 0; i < ages.length; i++) {
//			System.out.println(ages[i]);
//		}
	
		//오름차순
		int tmps = ages[0];
		ages[0] = ages[1];
		ages[1] = tmps;
		
		for(int i = 0; i<ages.length;i++) {
			System.out.println(ages[i]);
		}
	}

}
