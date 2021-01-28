package A_20210102;

public class d_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "가나다라마바사";
		
		System.out.println(str.length());
		System.out.println(str.indexOf("카"));
		System.out.println(str.substring(1,3));
		System.out.println(str.contains("가"));
		System.out.println(str.replace("가나", "우리"));
		
		String str1 = "  하  이  ";
		str1= str1.replace("  ", "");
		System.out.println(str1);
	}

}
