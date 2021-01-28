package A_20201219;

public class Array2 {

	public static void main(String[] args) {
		/*
		 * bls[0] = true;
		 * bls[1] = false;
		 * bls[2] = true;
		 * bls[3] = false;
		 * bls[4] = true;
		 * bls[5] = false;
		 * 출력
		 */
		
		boolean[] bls = new boolean[6];
	
		for(int i=0; i<bls.length; i++) {
			bls[i] = i%2==0;
			System.out.println(bls[i]);
			}
		}
		
	}


