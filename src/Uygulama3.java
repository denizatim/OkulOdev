import java.util.Scanner;


public class Uygulama3 {
	
	Scanner scan = new Scanner(System.in);
	Scanner scan1 = new Scanner(System.in);
	String kelime;
	char harf;
	int tercih;
	public Uygulama3() {
		intro();
		
	}
	
	public void intro(){
		System.out.println("1: Kelime i�inde belirtilen harfin kar��la��lan ilk yerini bulmak.");
		System.out.println("2: Kelime i�inde belirtilen harfin kar��lal�lan son yerini bulmak.");
		System.out.println("3: Kelime i�inde belirtilen harften ka� adet oldu�unu bulmak.");
		System.out.println("4: Kelimenin x-y aras�ndaki par�as�n� yazd�rma."
				+ "\n\tx de�eri 0 ise kelimenin en ba��ndan itibaren, y de�eri 0 ise sonuna kadar yaz�lacak."
				+ "\n\tHem x, hem y 0 olursa kelimenin tamam� yaz�l�r.");
		System.out.println("5: Ana men�.");
		System.out.print("Tercihiniz: ");
		tercih = scan.nextInt();
		switch(tercih){
		case 1:
			System.out.print("Bir kelime giriniz: ");
			kelime = scan1.nextLine();
			System.out.print("Bir harf giriniz: ");
			harf = scan1.next().charAt(0);
			System.out.println(kelime.indexOf(harf) + 1);
			break;
		case 2:
			System.out.print("Bir kelime giriniz: ");
			kelime = scan1.nextLine();
			System.out.print("Bir harf giriniz: ");
			harf = scan1.next().charAt(0);
			System.out.println(kelime.lastIndexOf(harf) + 1);
			break;
		case 3:
			System.out.print("Bir kelime giriniz: ");
			kelime = scan1.nextLine();
			System.out.print("Bir harf giriniz: ");
			harf = scan1.next().charAt(0);
			
			int sayac = 0;
			for(int i = 0; i<kelime.length(); i++){
				if(kelime.charAt(i)==harf){
					sayac++;
				}
			}
			System.out.println("\n" + sayac + " adet vard�r.\n");
			
			break;
		case 4:
			System.out.print("Bir kelime giriniz: ");
			kelime = scan1.nextLine();
			System.out.print("x de�erini giriniz: ");
			int sayi1 = scan1.nextInt();
			System.out.print("y de�erini giriniz: ");
			int sayi2 = scan1.nextInt();
			if(sayi1== 0){
				sayi1=1;
			}
			if(sayi2 == 0){
				sayi2 = kelime.length();
			}
			System.out.println(sayi2);
			System.out.println("\n" + kelime.substring(sayi1-1, sayi2) + "\n");
			
			break;
		case 5:
			break;
		default:
		}
	}
	public void kelimeGiris(){
		System.out.print("Bir kelime giriniz: ");
		kelime = scan.nextLine();
	}
	
}
