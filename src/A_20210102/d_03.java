package A_20210102;

public class d_03 {

	public static void main(String[] args) {
		System.out.println("거꾸로 구구단");
		for(int i = 9; i>0; i--) {
			System.out.println("======="+ i + "단=======");
			for(int j = 9; j>0; j--) {
				System.out.println(i + "x" + j + "=" + i*j);
			}
		}
	}
}
