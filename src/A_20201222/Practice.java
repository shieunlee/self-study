package A_20201222;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(j==5) {
					return;
				}
				System.out.println(j);
			}
			System.out.println(i);
		}
		System.out.println("난 실행됨");
		}
	}
