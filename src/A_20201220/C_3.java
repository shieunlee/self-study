package A_20201220;

public class C_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] menus = new String[4];
		
		menus[0] = "아이스크림";
		menus[1] = "치킨";
		menus[2] = "피자";
		menus[3] = "스파게티";
		
		String[] tmpMenus = menus;
		menus = new String[tmpMenus.length + 1];
		
		for(int i = 0; i<menus.length; i++) {
			if(i<tmpMenus.length) {
				menus[i] = tmpMenus[i];
			}else {
				menus[i] = "맥주";
			}
			System.out.println(menus[i]);
		}
	}

}
