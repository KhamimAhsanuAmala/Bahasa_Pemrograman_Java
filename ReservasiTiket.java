import java.io.*;
import java.util.*;
import java.text.*;
 
 
public class ReservasiTiket 
{
 public static void main (String [] khamimahsanu) throws IOException
{
  BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
  
	String kolom="";
	Date tanggal =new Date();
  
	int tot=0;
	String pilihan="";
	
	int[][]bangku=                          
       {{0,0,0,0,0,0},
       {0,0,0,0,0,0},
       {0,0,0,0,0,0},
       {0,0,0,0,0,0},
       {0,0,0,0,0,0},
       {0,0,0,0,0,0},
       {0,0,0,0,0,0},
       {0,0,0,0,0,0},
       {0,0,0,0,0,0},
       {0,0,0,0,0,0},
       {0,0,0,0,0,0},
       {0,0,0,0,0,0},
       {0,0,0,0,0,0},
       {0,0,0,0,0,0},
       {0,0,0,0,0,0},};
  do
  {
    
  System.out.println(""+DateFormat.getInstance().format(tanggal));
  System.out.println("*************************************************");
  System.out.println("    Penjualan Tiket Murah    ");
  System.out.println("*************************************************");
  System.out.println("1. Reservasi Tiket ");
  System.out.println("2. Pembayaran ");
  System.out.println("3. Pilih Kursi ");
  System.out.println("4. Keluar ");
  System.out.println("=*************************************************");
  System.out.print("Masukkan Pilihan : ");
  int pilih = Integer.parseInt(br.readLine());
  
   switch (pilih) {
   
    case 1 :
        String jawaban="";
        do
		{
        System.out.println("********Pemesanan Tiket********");
                double harga=0;
                double bayar=0;
                double kembalian=0;
                
				int batasdepan=0;
                int batasbelakang=0;
                
				System.out.println("Pilih Kelas tiket");
                System.out.println("1.VIP\n2.Eksekutif\n3.Bisnis\n4.Ekonomi");
                System.out.print("Masukan Pilihan Anda[1-4] : ");
  
  int jawab=Integer.parseInt(br.readLine());
                
				if (jawab==1)
				{
                    batasdepan=0;
                    batasbelakang=1;
                    harga=0.75*100000+100000;
                }
				else if (jawab==2)
				{
                    batasdepan=2;
                    batasbelakang=4;
                    harga=0.5*100000+100000;
                }
				else if (jawab==3)
				{
                    batasdepan=5;
                    batasbelakang=9;
                    harga=0.3*100000+100000;
                }
				else if (jawab==4)
				{
                    batasdepan=10;
                    batasbelakang=14;
                    harga=100000;
                }
                
              int kursikosong=0;
              int jumlah=0;
               
			   for(int i=batasdepan;i<batasbelakang+1;i++)
  {
   for(int j=0;j<bangku[i].length;j++)
   {
    if(bangku[i][j]==0)
    {
    kursikosong++;
    }
   }
  }
                
                System.out.println("\nJumlah kursi tersedia : "+kursikosong);
                do
				{
                System.out.print("Jumlah tiket yang dipesan : ");
                jumlah=Integer.parseInt(br.readLine());
                
                if (jumlah<=kursikosong)
                {
                int a=0;
                for(int i=batasdepan;i<batasbelakang+1;i++)
  {
   for(int j=0;j<bangku[i].length;j++)
   {
    if(bangku[i][j]==0)
    {
     if (j==0)
	 {
      kolom="A";
     }
	 else if (j==1)
	 {
      kolom="B";
     }
	 else if (j==2)
	 {
      kolom="C";
     }
	 else if (j==3)
	 {
      kolom="D";
     }
	 else if (j==4)
	 {
      kolom="E";
     }
	 else if (j==5)
	 {
      kolom="F";
     }
	 
		if (a<jumlah)
		{
		System.out.print("Kursi yang dipesan :"+(i+1)+kolom+"\n");
        bangku[i][j]=1;
        a++;
		}
      }
    }
  }
                
				bayar=harga*jumlah;
                System.out.println("Sub total : "+bayar);
                tot+=bayar;
                System.out.print("Apakah Anda Ingin Memesan lagi? : [Y/N] ");
				
                jawaban=br.readLine();
                }
				else
				{
                    System.out.println("Maaf, Jumlah kursi yang anda pesan tidak tersedia");
                }
                }while(jumlah>kursikosong);
   }while(jawaban.equalsIgnoreCase("y"));
    break;
     
    case 2:
        int tunai=0;
        System.out.println("\n\t++++++++++++++++DATA TRANSAKSI++++++++++++++++++++");
        System.out.println("Total bayar : "+tot);
        do{
        System.out.println("Tunai : ");
        tunai=Integer.parseInt(br.readLine());
        if (tunai<tot){
            System.out.println("Pembayaran kurang");
        }else{
            System.out.println("Kembalian : "+(tunai-tot));
            tot=0;
        }
        }while(tunai<tot);
        System.out.println("Transaksi berakhir");
        break;
        
    case 3 :
        System.out.println("\n\t>++++++++++++DATA KURSI++++++++++++++++++++++");
        System.out.println("VIP : Baris 1-2");
        System.out.println("Eksekutif : Baris 3-5");
        System.out.println("Bisnis : Baris 6-10");
        System.out.println("Ekonomi : Baris 10-15");
        System.out.println("**************************************************");
  System.out.println("Baris/Kolom\t A\t B\t C\t D\t E\t F");
  System.out.println("********************************************************");
  for(int i=0;i<bangku.length;i++)
  { 
   System.out.print(i+1+"\t\t|");
   for(int j=0;j<bangku[i].length;j++)
   {
    System.out.print(bangku[i][j]+"\t");
   }
   System.out.println("\n");
                }
    break;
    case 4 :
	System.out.println();
	System.out.println("****************************************");
	System.out.println("Terimakasih Telah Memesan Tiket Murah :D");
	System.out.println("****************************************");
      System.exit(0);
      break;
       default: break;
   }
  }while(true);
  
   }
 }
