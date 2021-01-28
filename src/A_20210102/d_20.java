

package A_20210102;

public class d_20 {

	public static void main(String[] args) {
		String[] strs = new String [3];
		
		strs[0] = "거북이";
		strs[1] = "토끼";
		strs[2] = "고래";
		
		for(int i = 0; i<strs.length; i++) {
			if(strs[i].length()==2) {
				System.out.println(strs[i]);
			}
		}
	}

}
