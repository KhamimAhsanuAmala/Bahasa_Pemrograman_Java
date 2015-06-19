import java.util.*;
import java.io.*;

public class Penjualan
{
	public static void cetak(String isi)
	{
		System.out.print(isi);
	}
	
	public static void cetakln(String isi2)
	{
		System.out.println(isi2);
	}
	
	public static void Garis1()
	{
		System.out.println("==========================");
	}
	
		public static final Vector<String>jualID = new Vector<String>();
		public static final Vector<String>jualNAMA = new Vector<String>();
		public static final Vector jualQTY = new Vector();
		public static final Vector jualHARGA = new Vector();
		public static final Vector subTOTAL = new Vector();
		public static final Vector kodeTRANS = new Vector();
		public static final Vector JTRANS = new Vector();

	public static void transaksi() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Vector<String>ID = new Vector<String>(BarangArea.barangID);
		Vector<String>NAMA = new Vector<String>(BarangArea.barangNAMA);
		Vector<String>HARGA = new Vector<String>(BarangArea.barangHARGA);
		
		boolean ada = false;
		
		
		int urutan = 0;
		int pil = 0;
		int st = 0;
		int idtr = 0;
		do
		{
			Database.kasir();
			pil = Integer.parseInt(br.readLine());
			switch(pil)
			{
				case 1:
				idtr= kodeTRANS.size()+1;
				for(int i = 0; i<kodeTRANS.size();i++)
				{
					if(idtr == Integer.parseInt(kodeTRANS.elementAt(i).toString())){
					idtr++;
				}
			}
			kodeTRANS.add(idtr);
			cetakln("Kode Transaksi : "+idtr);
				int xxx=0;
				do
				{
				cetak("Masukan ID Barang : ");
				String idbarang = br.readLine();
				if(ID.contains(idbarang))
				{
					urutan = ID.indexOf(idbarang);
					
					cetakln("Nama  Barang : "+NAMA.elementAt(urutan));
					cetakln("Harga Barang : "+HARGA.elementAt(urutan));
					cetak("Jumlah yang ingin dibeli : ");
					int qtybarang = Integer.parseInt(br.readLine());
					
					st = qtybarang * Integer.parseInt(HARGA.elementAt(urutan));
					
					jualID.add(idbarang);
					jualNAMA.add(NAMA.elementAt(urutan));
					jualQTY.add(qtybarang);
					jualHARGA.add(HARGA.elementAt(urutan));
					subTOTAL.add(st);
					xxx++;
				}
				else
				{
					ada = false;
					cetakln("ID Barang "+idbarang+" tidak ditemukan!");
					}
					cetak("Transaksi lagi ?[Y/N] : ");
					String again = br.readLine();
					if(again.equalsIgnoreCase("y")){
					ada = false;
					}else{
					ada = true;
					cetakln("Terima kasih telah berbelanja.");
					JTRANS.add(xxx);
					}
				}while(ada==false);
			break;
			
			case 2:
			/* System.out.println("=====================================================================");
			System.out.println("ID Barang\tNama Barang\t\t\tQty\tSatuan\tHarga");
			System.out.println("=====================================================================");
			for(int i = 0 ; i<jualID.size(); i++){
			System.out.println(jualID.elementAt(i)+"\t\t"+jualNAMA.elementAt(i)+"\t"+jualQTY.elementAt(i)+"\t"+jualHARGA.elementAt(i)+"\t"+subTOTAL.elementAt(i));
				} */
			break;
			
			}
		}while(pil<2);
	}
}
