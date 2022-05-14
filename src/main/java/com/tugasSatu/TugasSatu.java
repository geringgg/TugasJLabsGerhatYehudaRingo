package com.tugasSatu;

import java.util.TreeMap;
import java.util.TreeSet;

public class TugasSatu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> namaAnggota = new TreeSet<>();
		
		namaAnggota.add("Gerhat");
		namaAnggota.add("Unyil");
		namaAnggota.add("Upin");
		
		for (String nama : namaAnggota) {
			System.out.println(nama);
		}
		
		TreeMap<Integer,String> kodeNamaAnggota = new TreeMap<>();
		kodeNamaAnggota.put(1,"Gr");
		kodeNamaAnggota.put(2,"Un");
		kodeNamaAnggota.put(3,"Up");
		
		for (Integer key : kodeNamaAnggota.keySet()) {
			System.out.println("Nama : " + kodeNamaAnggota.get(key) + " Key nya adalah = " + key);
		}
	}

}
