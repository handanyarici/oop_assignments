package tahmin.app; 

import java.util.Scanner;

public class Tahmin {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int range = Math.abs(100 - 0) + 1;
		int random = (int)(Math.random() * range) +(0 <= 100 ? 0:100) ;
		
		int i = 101;
		while (i != random) { 
		System.out.println("tahmin giriniz");
		
		Scanner sc = new Scanner(System.in);
		 i = sc.nextInt();
		
		
		if(i == random) {
			System.out.println("Do�ru Tahmin");
		}
		
		else if (i < random) {
			System.out.println("Say�y� Art�r�n");
		}
		
		else {
			System.out.println("Say�y� Azalt�n");
		}
		
	}

	}

}
