import java.util.Scanner;

public class Uygulama6 {
	
	Scanner scan;
	int secim1;
	double sayi1;
	double sayi2;
	
	public Uygulama6() {
		intro();
		scan = new Scanner(System.in);
		secim1 = scan.nextInt();
		secim();
	}
	
	public void intro(){
		System.out.println("\n1: Dört iþlem menüsü");
		System.out.println("2: Karekök alma");
		System.out.println("3: Küpkök alma");
		System.out.println("4: Kuvvet alma");
		System.out.println("5: Faktöriyel hesabý yapma");
		System.out.println("6: Ana Menü");
		System.out.print("Seçiminiz: ");
		
	}
	public void secim(){
		switch(secim1){
		case 1:
			dortIslem();
			break;
		case 2:
			veriGirisi1();
			System.out.println("\nKarekök = " + karekok(sayi1) + "\n");
			break;
		case 3:
			veriGirisi1();
			System.out.println("\nKüpkök = " + kupkok(sayi1) + "\n");
			break;
			
		case 4:
			veriGiris();
			System.out.println("\nSonuc = " + kuvvetAlma(sayi1, sayi2) + "\n");
			break;
		case 5:
			System.out.println("Sayý : ");
			int sayi = scan.nextInt();
			System.out.println("\nSonuc = " + faktoriyel(sayi) + "\n");
			
			break;
		case 6:
			
			break;
		default:
			System.out.println("Lütfen 1 ile 6 arasýnda bir tercih yapýnýz !");
		}
	}
	public void dortIslem(){
		System.out.println("1: Toplama");
		System.out.println("2: Çýkarma");
		System.out.println("3: Çarpma");
		System.out.println("4: Bölme");
		System.out.println("5: Önceki Menü");
		System.out.print("Seçiminiz: ");
		int secim2 = scan.nextInt();
		switch(secim2){
		case 1:
			veriGiris();
			System.out.println("\nToplam = " + topla(sayi1, sayi2) + "\n");
			break;
		case 2:
			veriGiris();
			System.out.println("\nKalan = " + cikar(sayi1, sayi2) + "\n");
			break;
		case 3:
			veriGiris();
			System.out.println("\nÇarpým = " + carp(sayi1, sayi2) + "\n");
			break;
		case 4:
			veriGiris();
			System.out.println("\nBölüm = " + bol(sayi1, sayi2) + "\n");
			break;
		case 5:
			break;
		default:
			System.out.println("\nLütfen doðru bir seçim yapýnýz.\n");	
		}
	}
	public void veriGiris(){
		System.out.print("Sayý 1: ");
			sayi1 = scan.nextDouble();
			System.out.print("Sayý 2: ");
			sayi2 = scan.nextDouble();
	}
	public void veriGirisi1(){
		System.out.println("Sayý : ");
		sayi1 = scan.nextDouble();
	}
	public double topla(double sayi1, double sayi2){
		return sayi1 + sayi2;
	}
	public double cikar(double sayi1, double sayi2){
		return sayi1 - sayi2;
	}
	public double carp(double sayi1, double sayi2){
		return sayi1 * sayi2;
	}
	public double bol(double sayi1, double sayi2){
		return sayi1 / sayi2;
	}
	public double karekok(double sayi1){
		return Math.sqrt(sayi1);
	}
	public double kupkok(double sayi1){
		sayi2 = Math.pow(sayi1, 1.0/3.0);
		return sayi2;
	}
	public double kuvvetAlma(double sayi1, double sayi2){
		return Math.pow(sayi1,sayi2);
	}
	public int faktoriyel(int sayi1){
		int sonuc = 1;
		for(int i = 1 ; i <= sayi1 ; i++ ){
			sonuc = sonuc * i;
		}
		return sonuc;
	}

}
