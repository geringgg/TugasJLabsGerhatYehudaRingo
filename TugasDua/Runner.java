package com.TugasDua;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args){
		
			Kalkulator kalkulator = new Kalkulator();
			Scanner input = new Scanner(System.in);
			boolean menu = true;
			
			while(menu==true) {
				System.out.println("");
				System.out.println("==========================");
				System.out.println("Kalkulator Sederhana");
				System.out.println("1. Penjumlahan");
				System.out.println("2. Pengurangan");
				System.out.println("3. Perkalian");
				System.out.println("4. Pembagian");
				System.out.println("==========================");
				int pilihan = input.nextInt();
				
				try {
					String s = test(pilihan, menu,input);
					System.out.println(s);
					
		
				} catch (Exception e) {
					System.out.println(e);
					
				}

				
			}
	
	
	}
	public static Integer except(int pilihan, boolean menu,Scanner input) {
		
		Kalkulator kalkulator = new Kalkulator();
		
		int r = 0;
		
		System.out.println("");
		System.out.print("Masukan Bilangan Pertama : ");
		int ang1 = input.nextInt();
		kalkulator.setAngka1(ang1);
		System.out.println("");
		System.out.print("Masukan Bilangan Kedua : ");
		int ang2 = input.nextInt();
		kalkulator.setAngka2(ang2);
		System.out.println("==========================");
		
		if(pilihan==1) {
			kalkulator.hitungPenjumlahan();
			r = ang1 + ang2;
		}
//		else if(pilihan==2) {
//			kalkulator.hitungPengurangan();
//			System.out.println("Hasil Pengurangan : ");
//			System.out.println(ang1 + "-" + ang2 + " = " + kalkulator.gethasil());
//		}
//		else if(pilihan==3) {
//			kalkulator.hitungPerkalian();
//			System.out.println("Hasil Perkalian : ");
//			System.out.println(ang1 + "X" + ang2 + " = " + kalkulator.gethasil());
//		}
//		else if(pilihan==4) {
//			kalkulator.hitungPembagian();
//			System.out.println("Hasil Pembagian : ");
//			System.out.println(ang1 + "/" + ang2 + " = " + kalkulator.gethasil());
//		}
//		else if(pilihan<1 || pilihan>4){
//			System.out.println("Input salah");
//		}
//		else {
//			menu = false;
//		}
		return r;
		
	}
	
	public static String test (int pilihan, boolean menu, Scanner input) {
		String s = "";
		if(pilihan<1 || pilihan>4){
			s = "Input Salah";
			menu = false;
		} else if (!isStringInt(pilihan)) {
			s = "Masukan format angka";
			menu = false;
			
		}
		else {
			int t = except(pilihan, menu,input);
		}
		return s;
	}
	public static boolean isStringInt(int s)
	{
	    try
	    {
//	        Integer.parseInt(s);
	        return true;
	    } catch (NumberFormatException ex)
	    {
	        return false;
	    }
	}
	public static boolean StringInt(int s)
	{
	    try
	    {
//	        Integer.parseInt(s);
	        return true;
	    } catch (NumberFormatException ex)
	    {
	        return false;
	    }
	}
}
