package Power;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Sayiyi giriniz : ");
		int number=scan.nextInt();
		System.out.println("Ussu giriniz : ");
		int power=scan.nextInt();
		int c=1 ;
		for(int i =1; i<= power ; i++ ) {
			c*=number  ;
			
		}System.out.println(c);
	}

}
