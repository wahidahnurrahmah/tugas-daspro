import java.util.Scanner;
public class wahidah {
	public static void main (String args[]) {
	Scanner keyboard = new Scanner(System.in);
	
	senjata weapon = new senjata();
	
	System.out.print("Nama Senjata : ");
	weapon.nama = keyboard.nextLine();
	
	weapon.peluru=10;
	
	System.out.println("Ammo= "+weapon.peluru);
	System.out.println("tembak");
	weapon.tembak();
	
	if(weapon.peluru==0){
		System.out.println("peluru habis");
		weapon.isipeluru();
		System.out.println("peluru telah diisi");
		System.out.println("peluru sisa= "+weapon.peluru);

	







		
		
		
		

		
	}
	}
}



	
	


class senjata {
	String nama;
	int peluru;
		
	
	void tembak(){
		do{
		peluru--;
		System.out.println("dorr!! sisa peluru = "+peluru);
		}while(peluru>0);
		
	}
	
	void isipeluru(){
		peluru = 30;
	}
}





		
		
		
		
