public class Database 
{
	
	public static void Garis()
	{
		System.out.println("============================================");
	}
	
	public static void cetak(String isi)
	{
		System.out.print(isi);
	}
	
	public static void cetakln(String isi2)
	{
		System.out.println(isi2);
	}	
	
	public static final String[] DBbarangID = { "SGA01", "SGB02", "SGC01",
			"SGD01", "SGE01" };

	public static final String[] DBbarangNAMA = { "MontBlanc Emblem",
			"One Millio Paco dee Rebana", "D&G Intenso",
			"Lacoste White", "DunHill Innocense"};

	public static final String[] DBbarangHARGA = { "269000", "380000", "350000",
			"340000", "345000" };

	public static void menuLogin() 
	{
		cetakln(" ");
		Garis();
		cetakln("|| Minyak Wangi KHAMIM JAYA   ||");
		cetakln("|| Dimohon Untuk Login Dahulu ||");
		Garis();
		cetakln(" ");
	}

	public static void kasir() {
		Garis();
		cetakln("          Minyak Wangi KHAMIM JAYA         ");
		cetakln("                  KASIR AREA               ");
		Garis();
		cetakln("1. Penjualan");
		cetakln("2. Log Out");
		Garis();
		cetak("Masukkan menu pilihan anda (1-2) : ");
	}

	public static void admin() {
		Garis();
		cetakln("            Minyak Wangi KHAMIM JAYA        ");
		cetakln("                 ADMIN AREA                 ");
		Garis();
		cetakln("1. Atur Barang");
		cetakln("2. Atur User Kasir");
		cetakln("3. Laporan");
		cetakln("4. Log Out");
		Garis();
		cetak("Masukkan menu pilihan anda (1-4) : ");
	}
}
