import java.util.Arrays;  
import java.util.Scanner;  
import static java.lang.Math.*;  

public class Sequential_Search  
{  
	public static void main(String [] args)  
{  
	Scanner sc = new Scanner(System.in);  
	
	int j, k, number, size;  
	boolean found = false;  
	
	System.out.print("Masukan Ukuran Array = ");  
	
	size = sc.nextInt();  
	
	int[] intArray = new int[size];  
		for (j=0; j<size; j++)  
		intArray[j] = (int) (random()*10);  
		
		System.out.println("Element bertipe data integer dengan Array of Random di antara kumpulan data 0 - " + size);  
		System.out.print("Masukan nomor yang di cari = ");  
		
		number = sc.nextInt();  
		k=0;  
		
		while (!found && k<size)  
		
	if (intArray[k]==number) 
	{		
	found=true;  
	else  
		k +=1;  
		System.out.println();  
	}
	
	if (found)
	{		
		System.out.println("Posisi Data Ditemukan = " + k);  
	}
	else  
	
		System.out.println("Nomor yang dicari tidak ditemukan");  
		System.out.println("\nDeret Array of Ramdom\n");  
		System.out.println(Arrays.toString(intArray));  
    }  
} 
