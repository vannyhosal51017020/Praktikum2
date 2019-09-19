import java.util.Scanner;
public class latihan5 
{
	public static void main (String [] args) 
	{
		Scanner input = new Scanner (System.in);
		
		System.out.print("Masukkan Nilai = ");
		
		int nilai = input.nextInt();
		
		if (nilai <0 )
		{
			System.out.println("" + nilai + "bilangan negatif");
		}
					
		else if (nilai >=0)
		{
			System.out.println("" + nilai + "bilangan positif");
		}
		}
		}