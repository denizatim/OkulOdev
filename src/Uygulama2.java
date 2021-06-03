import java.util.Random;
import java.util.Scanner;


public class Uygulama2 {
	String[] liste = {"deniz","turgut","yusuf","nazým","hakan","sait","faik","ali","ahmet","yaþar"};
	Random random = new Random();
	Scanner scan = new Scanner(System.in);
	String secilenIsim = liste[random.nextInt(10)];
	
	public Uygulama2() {
		System.out.println("Test: " + secilenIsim);
		gameStart(secilenIsim);
		
	}
	
	public void gameStart(String isim){
		char[] isimArr = isim.toCharArray();
		char[] oyunIsim = new char[isim.length()];
		
		for(int i = 0 ; i < isim.length(); i ++){
			oyunIsim[i]='-';
		}
		for(char i : oyunIsim){
			System.out.print(i);
		}
		System.out.println();
	}
	
	public void game(String name){
		System.out.print("Bir tahminde bulun: ");
		
	}
	
}
