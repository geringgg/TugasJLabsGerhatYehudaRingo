package com.TugasDua;

 class Kalkulator {
	

	private int angka1;
	private int angka2;
	private int hasil;
	
	public int getAngka1() {
		return angka1;
	}
	public void setAngka1(int n) {
		angka1 = n;
	}
	public int getAngka2() {
		return angka2;
	}
	public void setAngka2(int n) {
		angka2 = n;
	}

	 public int gethasil(){ 
		 return hasil; 
		 }
	
	public void hitungPenjumlahan() {
		hasil = angka1+angka2;
	}
	
	public void hitungPengurangan() {
		hasil = angka1-angka2;
		
	}public void hitungPerkalian() {
		hasil = angka1*angka2;
		
	}public void hitungPembagian() {
		hasil = angka1/angka2;
	}
	
}
