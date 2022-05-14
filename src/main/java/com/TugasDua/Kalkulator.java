package com.TugasDua;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kalkulator {

	public static void main(String[] args) {

		Boolean wenttocatch = false;
		int pilihan = 0;
		Scanner sc = new Scanner(System.in);
		do {
			try {

				System.out.println("");
				System.out.println("==========================");
				System.out.println("Kalkulator");
				System.out.println("1. Penjumlahan (+)");
				System.out.println("2. Pengurangan (-)");
				System.out.println("3. Perkalian (*)");
				System.out.println("4. Pembagian (/) ");
				System.out.println("==========================");
				
				
					pilihan = sc.nextInt();
					Boolean tmp0 = exception(pilihan, wenttocatch);
					if (tmp0.equals(true)) {
						test(pilihan, sc);
						wenttocatch = true;
					}
					
				
			} catch (InputMismatchException e) {
				sc.next();
				wenttocatch = true;
				System.out.println("Enter Valid Integer");
			}
		} while (wenttocatch);
	}
	public static Boolean exception(int pilihan, Boolean wenttocatch) {
		if (pilihan < 1 || pilihan > 4) {
			System.out.println("just number 1-4");
			wenttocatch = true;
			return false;
		} else {
			return true;
		}
	}
	
	public static Integer test(int pilihan, Scanner input) {
		int r = 0;

		System.out.println("");
		System.out.print("Masukan Bilangan Pertama : ");
		int ang1 = input.nextInt();
		// kalkulator.setAngka1(ang1);
		System.out.println("");
		System.out.print("Masukan Bilangan Kedua : ");
		int ang2 = input.nextInt();
		// kalkulator.setAngka2(ang2);
		System.out.println("==========================");

		if (pilihan == 1) {
			r = ang1 + ang2;
		}
		if (pilihan == 2) {
			r = ang1 - ang2;
		}
		if (pilihan == 3) {
			r = ang1 * ang2;
		}
		if (pilihan == 4) {
			r = ang1 / ang2;
		}
		System.out.println(r);
		return r;

	}

}