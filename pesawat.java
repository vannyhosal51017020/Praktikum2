import java.util.Scanner;
public class pesawat {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
	    int nilai;
	    System.out.print("Masukkan Kode = ");
	    nilai = input.nextInt();
	    
	    if (nilai == 1){
	    	System.out.println("Pesawat Garuda");}
	    else if (nilai == 2){
	    	System.out.println("Pesawat Batik");}
	    else if (nilai == 3){
	    	System.out.println("Pesawat Lion");}	
	    else 
	     	System.out.println("Kode yang dimasukkan salah");
	    
	    
	}
	
	}
 