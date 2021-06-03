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
		System.out.println("\n1: D�rt i�lem men�s�");
		System.out.println("2: Karek�k alma");
		System.out.println("3: K�pk�k alma");
		System.out.println("4: Kuvvet alma");
		System.out.println("5: Fakt�riyel hesab� yapma");
		System.out.println("6: Ana Men�");
		System.out.print("Se�iminiz: ");
		
	}
	public void secim(){
		switch(secim1){
		case 1:
			dortIslem();
			break;
		case 2:
			veriGirisi1();
			System.out.println("\nKarek�k = " + karekok(sayi1) + "\n");
			break;
		case 3:
			veriGirisi1();
			System.out.println("\nK�pk�k = " + kupkok(sayi1) + "\n");
			break;
			
		case 4:
			veriGiris();
			System.out.println("\nSonuc = " + kuvvetAlma(sayi1, sayi2) + "\n");
			break;
		case 5:
			System.out.println("Say� : ");
			int sayi = scan.nextInt();
			System.out.println("\nSonuc = " + faktoriyel(sayi) + "\n");
			
			break;
		case 6:
			
			break;
		default:
			System.out.println("L�tfen 1 ile 6 aras�nda bir tercih yap�n�z !");
		}
	}
	public void dortIslem(){
		System.out.println("1: Toplama");
		System.out.println("2: ��karma");
		System.out.println("3: �arpma");
		System.out.println("4: B�lme");
		System.out.println("5: �nceki Men�");
		System.out.print("Se�iminiz: ");
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
			System.out.println("\n�arp�m = " + carp(sayi1, sayi2) + "\n");
			break;
		case 4:
			veriGiris();
			System.out.println("\nB�l�m = " + bol(sayi1, sayi2) + "\n");
			break;
		case 5:
			break;
		default:
			System.out.println("\nL�tfen do�ru bir se�im yap�n�z.\n");	
		}
	}
	public void veriGiris(){
		System.out.print("Say� 1: ");
			sayi1 = scan.nextDouble();
			System.out.print("Say� 2: ");
			sayi2 = scan.nextDouble();
	}
	public void veriGirisi1(){
		System.out.println("Say� : ");
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
