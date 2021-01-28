package A_20201220;

public class B_1 {

	public static void main(String[] args) {
		//boolean
		boolean[] bls = new boolean[6];
		
		for(int i = 0; i<bls.length; i++) {
			bls[i] = i%2==0;
			System.out.println(bls[i]);
		}
	}

}
