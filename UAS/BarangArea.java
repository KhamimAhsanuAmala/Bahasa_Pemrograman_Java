import java.util.*;
import java.io.*;

public class BarangArea 
{
	public static final Vector<String> barangID = new Vector<String>(Arrays.asList(Database.DBbarangID));
	public static final Vector<String> barangNAMA = new Vector<String>(Arrays.asList(Database.DBbarangNAMA));
	public static final Vector<String> barangHARGA = new Vector<String>(Arrays.asList(Database.DBbarangHARGA));
	
	//=================================== Method Saya ==========================================================
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
	//=================================== Batas Method Custom ================================================================
	
	public static void ManageBarang() throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int pil = 0;

		do 
		{
			Garis1();
			cetakln("||     Minyak Wangi KHAMIM JAYA   ||");
			cetakln("||     		BARANG   		   ||");
			Garis1();
			cetakln("1. Tambah Barang");
			cetakln("2. Hapus Barang");
			cetakln("3. Ubah Barang");
			cetakln("4. Cari barang");
			cetakln("5. Tampilkan Semua Barang");
			cetakln("6. Exit");

			cetak("Pilihlah menu [1-5] : ");
			pil = Integer.parseInt(br.readLine());

			switch (pil) 
			{
			case 1:
				boolean loop = false;
				
				cetakln(" ");
				cetakln(" ");
				
				do
				{
				cetak("ID Barang : ");
				String idbarang = br.readLine();
				
				if (barangID.contains(idbarang)) 
				{
					cetakln("ID Barang " + idbarang + " sudah ada !");
							loop=false;
				} 
				else 
				{
					barangID.add(idbarang);
					cetak("Nama Barang : ");
					barangNAMA.add(br.readLine());
					
					cetak("Harga Barang : ");
					barangHARGA.add(br.readLine());
					
					cetakln("");
					cetakln("");
					
					cetak("Tambahkan barang lagi ? [Y/N] : ");
					String lagi = br.readLine();
					
					if(lagi.equalsIgnoreCase("y"))
					{
					loop=false;
					}
				else
					{
					loop=true;
					}
				}
				}
				while(loop==false);
				break;

			case 2:
				cetakln("Hapus Barang");
				int indexunhapus;
				String userhapus;
				String userhapuspil;
				int indexpwhapus;

				do 
				{
					cetak("Masukkan ID barang yang akan dihapus : ");
					userhapus = br.readLine();
					indexunhapus = cari(barangID, userhapus);
					indexpwhapus = indexunhapus;
				} while (indexunhapus == -1);

				cetak("Apakah anda akan menghapus barang "
						+ userhapus + "? [y/t] ");
				userhapuspil = br.readLine();

				if (userhapuspil.equalsIgnoreCase("y")) 
				{
					barangID.removeElementAt(indexunhapus);
					barangNAMA.removeElementAt(indexpwhapus);
					barangHARGA.removeElementAt(indexpwhapus);
					cetakln("Barang ID " + userhapus
							+ " berhasil dihapus");
				}
				break;

			case 3:
				boolean ubahbarang = false;
				int urutan = 0;
				do {
					cetakln("Masukan ID Barang yang ingin diubah : ");
					String idubah = br.readLine();
					if (barangID.contains(idubah)) {
						ubahbarang = true;
						urutan = barangID.indexOf(idubah);
						cetakln("Mengganti Data Barang");
						cetakln("ID Barang\t Nama Barang\t Harga");
						cetakln(barangID.elementAt(urutan) + "\t"
								+ barangNAMA.elementAt(urutan) + "\t\t"
								+ barangHARGA.elementAt(urutan));
						cetak("[Y/N]");
						String ganti = br.readLine();
						if (ganti.equalsIgnoreCase("y")) {
							cetak("Masukan nama barang  : ");
							barangNAMA.setElementAt(br.readLine(), urutan);
							cetak("Masukan harga barang : ");
							barangHARGA.setElementAt(br.readLine(), urutan);
						} 
						else
						{
							cetakln("Data barang " + idubah
									+ " tidak diubah.");
						}
					} 
					else
					{
						cetakln("Data ID Barang " + idubah
								+ " tidak ditemukan !");
						ubahbarang = false;
					}
				} while (ubahbarang == false);
				break;
			
			case 4:
			cetakln("Masukan ID Barang : ");
			String cari = br.readLine();
			if(barangID.contains(cari)){
				urutan = barangID.indexOf(cari);
				cetakln("Nama  Barang : "+barangNAMA.elementAt(urutan));
				cetakln("Harga Barang : "+barangHARGA.elementAt(urutan));
			}else{
				cetakln("Data barang dengan ID '"+cari+"' tidak ditemukan!");
			}
			break;

			case 5:
				int i;
				Garis1();
				cetakln("ID Barang\t Nama Barang\t\t\t\t Harga");
				Garis1();
				for (i = 0; i < barangID.size(); i++) {
					cetak(barangID.elementAt(i).toString() + "\t\t "
							+ barangNAMA.elementAt(i) + "\t\t "
							+ barangHARGA.elementAt(i));
					cetakln("");
				}
				break;

			default:
				break;
			}
		}

		while (pil < 6);
	}

	public static int cari(Vector v, String kata) {
		int i = -1;
		int j = 0;

		do {
			if (v.elementAt(j).equals(kata))
				i = j;
			j++;
		} while ((j < v.size()) && (i == -1));
		return i;
	}
}
