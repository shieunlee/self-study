package A_20210102;

public class d_21 {

	public static void main(String[] args) {
		String[] strs = new String[5];
		
		strs[0] = "거북이";
		strs[1] = "토끼";
		strs[2] = "고양이";
		strs[3] = "고래";
		strs[4] = "이리";
		
		for(int i = 0; i<strs.length;i++) {
			if(strs[i].contains("이")) {
				System.out.println(strs[i]);
			}
		}
	}

}
