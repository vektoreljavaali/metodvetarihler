package com.erenresort.islem;



public class islemci {

	public double islem(String islemtipi,double[] sayidizisi) {
	   double sonuc ;
	   
	switch (islemtipi) {
	case "topla": sonuc= topla(sayidizisi);	break;
	case "cikart": sonuc= cikart(sayidizisi);break;
	case "carp": sonuc= carp(sayidizisi);break;
	case "bol": sonuc= bol(sayidizisi);break;
	default:sonuc= topla(sayidizisi);break;
	}
		
		
		return sonuc;
	}// topla iþlemi sonu
		
	private double topla(double[] sayidizisi) {
		double toplam=0;
		
		for (double item : sayidizisi) {
			toplam+=item;	
		}
		
		
	return toplam;
	} 
	
	private double cikart(double[] sayidizisi) {
			
		return 0;
	} 
		
	private double carp(double[] sayidizisi) {
		
		return 0;
	} 

	private double bol(double[] sayidizisi) {
			
		return 0;
	} 
	
	
	public String kelimeanalizi(String kelime) {
		
		String[] dbkaliplar = new String[] {
				"oracle",
				"mssql",
				"mysql",
				"mongodb",
				"access",
				"sqllite"
		};
		
		String[] islemkalibi = new String[] {
				"baðlan",
				"baðlanmak",
				"baðlantý",
				"kullan",
				"kullanmak"
		};
		
		String db="";
		boolean islem=false;
		
		for (String string : dbkaliplar) {
			if(kelime.trim().toUpperCase().contains(string.toUpperCase()))
			{
				db=string;
			}
		}
		
		for (String string : islemkalibi) {
			if(kelime.trim().toUpperCase().contains(string.toUpperCase()))
			{
				islem=true;
			}
		}
		
		if(!db.isEmpty() && islem==true ) {
			
			return "Veri tabaný olarak "+db+" iþleme alýnmýþtýr.";
		}
		else
		{
			
			return "yapmak istediðiniz iþlem anlaþýlamamýþtýr.";
		}
		
		
	}//kelimeanalizi sonu
	
	
	public int toplam(int a,int b) {
		
		return a+b;
	}
	
	public int toplam(int a,double b) {
		
		return a+(2*(int)b);
	}
	
	public int toplam(double a, double b) {
		
		return (int)(a+b)*2;
	}
	
	public int toplam(double a, int b) {
		
		return (int)a+b;
	}
	
}
