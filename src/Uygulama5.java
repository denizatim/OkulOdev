import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Uygulama5 {
	Random random = new Random();
	Scanner scan = new Scanner(System.in);
	ArrayList<String> zarlar = new ArrayList<String>();
	int secim;
	
	public Uygulama5() {
		intr();
	}
	
	public void intr(){
		System.out.println("\n1: 2 adet zar at");
		System.out.println("2: Zar sonuçlarýný görüntüle");
		System.out.println("3: Ana menü");
		System.out.print("Seçiminiz: ");
		int sec;
		sec = scan.nextInt();
		if(sec == 1){
			int zar1 = random.nextInt(6) + 1;
			int zar2 = random.nextInt(6) + 1;
			String z1 = Integer.toString(zar1);
			String z2 = Integer.toString(zar2);
			String zar =z1 +  " " + z2;
			zarlar.add(zar);
			System.out.println("\n" + zar + "\n");
		}
		else if(sec == 2){
			System.out.println("Atýlan tüm zarlar: ");
			for(String value : zarlar){
				System.out.println(value);
			}
		}
		else if(sec == 3){
			
		}
		else{
			System.out.println("Lütfen geçerli bir numara giriniz.");
		}
	}
}
