import java.io.*;
import java.util.*;

public class CobaArray
{
	public static void main (String [] khamimahsanu) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		//Scanner sc = new Scanner (System.in);
		
		int [] drandom = new int[10];
		/*data [0]=1;
		data [1]=2;
		data [2]=3;
		data [3]=4;
		data [4]=5; */
		
		int min;
		int max;
		int sum=0;
		double ratarata=0;
		int input;
		
		
		
		for(int i=0; i<drandom.length; i++)
			
			drandom[0]=(int)(Math.random()*100.0);
			drandom[1]=(int)(Math.random()*100.0);
			drandom[2]=(int)(Math.random()*100.0);
			drandom[3]=(int)(Math.random()*100.0);
			drandom[4]=(int)(Math.random()*100.0);
			drandom[5]=(int)(Math.random()*100.0);
			drandom[6]=(int)(Math.random()*100.0);
			drandom[7]=(int)(Math.random()*100.0);
			drandom[8]=(int)(Math.random()*100.0);
			drandom[9]=(int)(Math.random()*100.0);
		{
		System.out.println("Menapilkan Hasil Bilangan Random  dslam Array  :");
		min = drandom[0];
		max = drandom[0];
		
		for(int j=0; j<drandom.length; j++)
		{
			if(min>drandom[j])
				min=drandom[j];
			if(max<drandom[j])
				max=drandom[j];
			
			
			System.out.println("Data Random ke ["+j+"]= "+drandom[j]);
				sum+=drandom[j];
		}
		ratarata=sum/(double)drandom.length;
		System.out.println("Jumlah : "+sum);
		System.out.println("rata-rata : "+ratarata);
		System.out.println("Tertinggi : "+max);
		System.out.println("Terendah : "+min);
		System.out.println("");
		

		//System.out.println("Data Dua : "+data[4]);
		
		
		
		}
	}
}
