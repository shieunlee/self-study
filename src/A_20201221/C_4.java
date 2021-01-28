package A_20201221;

public class C_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "진혁,상혁,은선,예린";
		String[] names = str.split(",");
		
		for(int i = 0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
