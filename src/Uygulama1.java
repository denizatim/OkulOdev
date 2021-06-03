
public class Uygulama1 {
	char[][] dizi = new char[3][3];
	
	
	public Uygulama1() {
		basla();
		dizi[1][1] = 'x';
		yazdir(dizi);
	}
	
	public void basla(){
		for(int i = 0; i < 3 ; i ++){
			for(int j = 0; j<3; j++){
				dizi[i][j]='-';
			}
		}
	}
	
	public void yazdir(char[][] c){
		for(int i = 0; i < 3 ; i ++){
			for(int j = 0; j<3; j++){
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
	}
	
}
