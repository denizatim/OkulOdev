import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int secim = 0;
		
		while(secim != 7){
		
		System.out.println("1: Haraket eden obje");
		System.out.println("2: �sim tahmin etme");
		System.out.println("3: Kelime analizi");
		System.out.println("4: K�t�phane d�zenleme");
		System.out.println("5: Zar atma uygulamas�");
		System.out.println("6: Hesap Makinesi");
		System.out.println("7: ��k�� yapmak");
		System.out.print("Se�ilen uygulama: ");
		
		secim = scan.nextInt();
		
		switch(secim){
		case 1:
			Uygulama1 uygulama1 = new Uygulama1();
			
			break;
		case 2:
			Uygulama2 uygulama2 = new Uygulama2();
			break;
		case 3:
			Uygulama3 uygulama3 = new Uygulama3();
			
			break;
		case 4:
			Uygulama4 uygulama4 = new Uygulama4();
			uygulama4.dizilisSec();
			break;
		case 5:
			Uygulama5 uygulama5 = new Uygulama5();
			break;
		case 6:
			Uygulama6 uygulama = new Uygulama6();
			break;
		case 7:
			System.out.println("\n��k�� Yap�ld�.");
			break;
		default:
			System.out.println("L�tfen 1 ile 7 aras�nda bir tercih yap�n�z !");
		}
		}
	}

}
