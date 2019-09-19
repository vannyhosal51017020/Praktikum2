public class latihan6{
	public static void main (String [] args) {
		char hurufAwal = 'a';
		System.out.print("Masukkan huruf awal nama anda : " );
		try{
			hurufAwal = (char)System.in.read();
		}catch(Exception e){
		    System.out.print("Salah ko menginput cess...!" );	
		}
		switch(hurufAwal){
		case (char)-1 : System.out.print("bukan huruf depan !!!" );break;
		case 'a' : System.out.print("apa namamu amin ?" );break;
		case 'b' : System.out.print("apa namamu bambang ?" );break;
		case 'c' : System.out.print("apa namamu ceceo ?" );break; 
		case 'd' : System.out.print("apa namamu daud ?" ); break;
		case 'e' : System.out.print("apa namamu endang ?" ); break;
		default  : System.out.print("aku tidak bisa menebak" ); break;
		}
		}
		}