// Contoh If Else

public class Latihan1{
	public static void main (String [] args) {
		char hurufAwal = 'a';
		System.out.print("Masukkan huruf awal nama anda : " );
		try{
			hurufAwal = (char)System.in.read();
		}catch(Exception e){
		System.out.print("Salah ko menginput cess...!" );	
		}
		if (hurufAwal == 'a')
		   	System.out.print("apa namamu amin ?" );
		else if (hurufAwal == 'b')
		   	System.out.print("apa namamu bambang ?" ); 
		else if (hurufAwal == 'c')
		   	System.out.print("apa namamu ceceo ?" ); 
		 else if (hurufAwal == 'd')
		   	System.out.print("apa namamu daud ?" ); 
		 else if (hurufAwal == 'e')
		   	System.out.print("apa namamu endang ?" ); 
		 else
		    System.out.print("aku tidak bisa menebak" ); 		
		}
}