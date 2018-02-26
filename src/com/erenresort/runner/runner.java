package com.erenresort.runner;

import java.util.Scanner;

import com.erenresort.islem.islemci;

public class runner {

	public static void main(String[] args) {
		
		islemci islem = new islemci();
		
	//System.out.println(islem.topla(new double[] {
	//		123.344423,
	//		323232.342323,
	//		423444.432667,			
	//		}));
    //
	//Scanner sc = new Scanner(System.in);
	//
	//System.out.println("hangi veritabanýna iþlem yapmak istediðinizi yazýnýz....");
	//System.out.println();
	//
	//String kelime =  sc.nextLine();
	//
	//System.out.println(islem.kelimeanalizi(kelime));
		
		
		System.out.println( islem.toplam(12.5, 52.34d));
		
		
		
		
	
	
	}// main sonu
	

}
