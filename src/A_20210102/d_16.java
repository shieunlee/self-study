package A_20210102;

public class d_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] ages = new int [3];
	
	ages[0] = 10;
	ages[1] = 5;
	ages[2] = 22;
	
	int tmp = ages[0];
	ages[0] = ages[1];
	ages[1] = tmp;
	
	for(int i = 0; i<ages.length;i++) {
	System.out.println(ages[i]);
	}
	
	}

}
