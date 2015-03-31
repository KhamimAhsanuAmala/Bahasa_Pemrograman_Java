import java.io.*;
import java.util.*;

public class SoalAcak
{
	public static void main (String [] khamim) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		
		int soal;
		int a=0;
		int b=1;
		int angka1;
		int angka2;
		int jawab;
		
		String keluaran="";
		
		
		System.out.print("Masukkan Jumlah Hitungan : ");
		soal=Integer.parseInt(br.readLine());
		
		
		while(a<soal+1)
		{
			angka1=(int)(Math.random()*10.0);
			angka2=(int)(Math.random()*20.0);
			
			int kuncijawab=angka1+angka2;
			
			System.out.print(a+1+".) "+angka1+" + "+angka2+ " = ");
			jawab=Integer.parseInt(br.readLine());
			
			keluaran = "\n"+a+".\t"+jawab+"\t"+kuncijawab+"\t"+((jawab==kuncijawab)?"Benar" : "Salah");
			
			a++;
		}
			System.out.println ("Hasil:");  
			System.out.println ("\nNo."+"\tJawaban"+"\tKunci"+"\tStatus");  
			System.out.println (" "+keluaran);  
		
		//while(a<101);
	}
}
