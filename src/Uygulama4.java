import java.util.Scanner;
public class Uygulama4 {
	
	public void dizilisSec(){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Diziliş A: Sırasıyla kırmızı, yeşil, mavi kitaplar");
		System.out.println("Diziliş B: Eşit sayıda sırasıyla kırmızı, yeşil ve mavi kitaplar");
		
		System.out.println("Kitap sayısını giriniz");
		
		int kitapSayisi = scan.nextInt();
		
		int kalan = kitapSayisi%42;
		int bolum = kitapSayisi/42;
		if (kalan % 3 == 0){
			if(kitapSayisi >= 42){
				System.out.println(bolum + " rafa kitaplar Diziliş B şeklinde yapılmıştır.\n");
			}
			
			if(kalan != 0){
				System.out.println("1 rafa " + kalan/3 + " kırmızı " + kalan/3 +
						" yeşil ve " + kalan/3 + " mavi kitap B şeklinde dizilmiştir.\n");
			}		
		}
		else{
			int sayi = kalan % 3;
			if(kitapSayisi >= 42){
				System.out.println(bolum + " rafa kitaplar B şeklinde dizilmiştir.\n");
			}		
			if(sayi != 0){
				System.out.println("Bir rafta A şeklinde " + kalan + " adet kitap bulunur.\n");
			}			
		}		
	}	
}
