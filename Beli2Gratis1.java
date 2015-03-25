import java.io.*;

public class Beli2Gratis1
{
 public static void main (String [] khamimahsanuamala) throws IOException
 {
  BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
  
  int jumlah;
  int harga;
  
  System.out.println("====================================================");
  System.out.println("  Welcome                         ");
  System.out.println("  TOKO KHAMIM JAYA          ");
  System.out.println("====================================================");
  System.out.println("");
  System.out.print("Masukkan Jumlah Barang : ");
  jumlah = Integer.parseInt(br.readLine());
  System.out.print("Masukkan Harga Satuan : Rp. ");
  harga = Integer.parseInt(br.readLine());
  
  System.out.println("");
  System.out.println("");
  System.out.println("");
  
  System.out.println("====================================================");
  System.out.println("  TOKO KHAMIM JAYA          ");
  System.out.println("   Nota Print Out           ");
  System.out.println("====================================================");
  System.out.println("");
  System.out.println("Harga Satuan : Rp. "+harga);
  System.out.println("Jumlah Beli : "+jumlah+ " Buah");
  System.out.println("Bonus item : "+((jumlah)/2)+" Buah");
  System.out.println("Total Bayar : Rp. "+(jumlah-(jumlah/2))*harga);
  System.out.println("");
  System.out.println("----------------------------------------------------");
  System.out.println("  Terima Kasih telah Berbelanja :D     ");
  System.out.println("----------------------------------------------------");
  
  
 }
}
