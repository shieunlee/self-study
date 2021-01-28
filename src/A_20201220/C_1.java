package A_20201220;

public class C_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = new String[3];
		
		strs[0] = "거북이";
		strs[1] = "토끼";
		strs[2] = "고래";
		
		for(int i =0; i<strs.length; i++) {
			if(strs[i].length()==2) {
				System.out.println(strs[i]);
			}
		}
	}

}
