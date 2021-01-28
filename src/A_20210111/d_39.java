package A_20210111;

import java.util.Random;

public class d_39 {

	public static void main(String[] args) {
	int[][] rooms = new int [4][];
	Random r = new Random();
	
	for(int i = 0; i<rooms.length; i++) {
		rooms[i] = new int[r.nextInt(10)+1];
		
	}
	int sum = 0;
	for(int i = 0; i<rooms.length; i++) {
		sum += rooms[i].length;
		System.out.println(i + "," + rooms[i].length);
	}
	System.out.println("total room num" + sum);
	}
}
