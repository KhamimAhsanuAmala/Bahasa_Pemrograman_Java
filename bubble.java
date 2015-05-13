import java.util.*;
import java.io.*;

public class bubble 
{
    
    int [] data = {-3,0,1,-5,2,-2,1,4,-1,5,-4};
    
    public int max = data.length;
    
    public void tukar(int a, int b)
	{
        int temp;
        temp = data[b];
        data[b] = data[a];
	data[a] = temp; 
    }
    
    public void output()
	{
        int i;
        for (int j = 0; j <= max-1; j++) 
		{
            System.out.print(data[j]+" ");
        }
        System.out.println();
    }
    
    public void sortBubbleAsc(){
        int a, b;
        int n = max-1;
        for (int i = 0; i <= n-1; i++) {
            for (int j = i+1; j <= n; j++) {
                if(data[i] > data[j]){
                    tukar(i, j);
                }
                System.out.print(i+" "+j+" | ");
                output();
            }
        }
    }
    
    
    public void sortBubbleDesc()
	{
        int a, b;
        int n = max-1;
        for (int i = 0; i <= n-1; i++) {
            for (int j = i+1; j <= n; j++) {
                if(data[i] < data[j]){
                    tukar(i, j);
                }
                System.out.print(i+" "+j+" | ");
                output();
            }
        }
    }
    
    
    public static void main(String [] khamim) 
	{
        bubble ins = new bubble();
        Scanner input = new Scanner(System.in);
		
        /*
                jangan panggil fungsi secara bersamaan. karena array bersifat global variable atau atribut
        */
        System.out.println("1. sortBubbleDesc()");
        System.out.println("2. sortBubbleAsc()");
        System.out.println("==========================");
        System.out.print("Masukan Pilihan : ");
        int p = input.nextInt();

        switch(p){
                case 1:
                        ins.sortBubbleDesc();
                break;
                case 2:
                        ins.sortBubbleAsc();
                break;
        }
    }
}
