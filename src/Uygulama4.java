import java.util.Scanner;
public class Uygulama4 {
	
	public void dizilisSec(){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dizili� A: S�ras�yla k�rm�z�, ye�il, mavi kitaplar");
		System.out.println("Dizili� B: E�it say�da s�ras�yla k�rm�z�, ye�il ve mavi kitaplar");
		
		System.out.println("Kitap say�s�n� giriniz");
		
		int kitapSayisi = scan.nextInt();
		
		int kalan = kitapSayisi%42;
		int bolum = kitapSayisi/42;
		if (kalan % 3 == 0){
			if(kitapSayisi >= 42){
				System.out.println(bolum + " rafa kitaplar Dizili� B �eklinde yap�lm��t�r.\n");
			}
			
			if(kalan != 0){
				System.out.println("1 rafa " + kalan/3 + " k�rm�z� " + kalan/3 +
						" ye�il ve " + kalan/3 + " mavi kitap B �eklinde dizilmi�tir.\n");
			}		
		}
		else{
			int sayi = kalan % 3;
			if(kitapSayisi >= 42){
				System.out.println(bolum + " rafa kitaplar B �eklinde dizilmi�tir.\n");
			}		
			if(sayi != 0){
				System.out.println("Bir rafta A �eklinde " + kalan + " adet kitap bulunur.\n");
			}			
		}		
	}	
}
