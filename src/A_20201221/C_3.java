package A_20201221;

public class C_3 {

	public static void main(String[] args) {
		// TODO Auto-generated  stub
		String str="가나다라마바사";
		System.out.println(str.substring(1,3));
		System.out.println(str.contains("가")&&str.contains("다"));
		str = str.replace("가나", "우리");
		System.out.println(str);
		str = "  하  이  ";
		str = str.replace("  ","");
		System.out.println(str);

	}

}
