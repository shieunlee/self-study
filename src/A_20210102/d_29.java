package A_20210102;

import java.util.Scanner;

public class d_29 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("가장 좋아하는 축구선수는: ");
		
		String player = scan.nextLine();
		
		String[] names = {"송홍민", "손흔민", "송흥민", "손날두"};
		for(int i = 0; i<names.length;i++) {
			if(names[i].equals(player)) {
				System.out.println("손흥민을 검색하신건가요?");
			}
		}
	}

}
