package A_20210102;

public class d_10 {

	public static void main(String[] args) {
		boolean[] bls = new boolean[6];
		for (int i = 0; i < bls.length; i++) {
			bls[i] = i % 2 == 0;
			System.out.println(bls[i]);
		}
	}

}
