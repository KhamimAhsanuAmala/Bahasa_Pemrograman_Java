import java.io.*;
public class DaftarMakanan {
    public static void main (String[] khamim) throws IOException
	{
        int SopBuntut = 35000,
            SopAyam = 16000,
            NasiGoreng = 15000,
            NasiRames = 13000,
            NasiCampur = 12000,
            EsTeh = 2000,
            EsJeruk = 6000,
            EsKopyor = 8000,
            EsDawet = 4000,
            EsTeller = 9000,
            total = 0;
        String loop;
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
        String pilihMenu = "";
        System.out.println("====================================");
        System.out.println("|     Restoran And Cafe            |");
        System.out.println("|     STASIUN BENOWO SURABAYA      |");
        System.out.println("|     Menu Makanan dan Minuman     |");
        System.out.println("====================================");
        System.out.println("|  1. Sop Buntut       : Rp 35000  |");
        System.out.println("|  2. Sop Ayam         : Rp 16000  |");
        System.out.println("|  3. Nasi Goreng      : Rp 15000  |");
        System.out.println("|  4. Nasi Rames       : Rp 13000  |");
        System.out.println("|  5. Nasi Campur      : Rp 12000  |");
        System.out.println("|  6. Es Teh           : Rp 2000   |");
        System.out.println("|  7. Es Jeruk         : Rp 6000   |");
        System.out.println("|  8. Es Kopyor        : Rp 8000   |");
        System.out.println("|  9. Es Dawet         : Rp 4000   |");
        System.out.println("|  10.Es Teller        : Rp 9000   |");
        System.out.println("------------------------------------");
 
        
 
        for (loop = "Y"; loop.equals ("Y") || loop.equals ("y");)
        {
        System.out.print("Pilih Menu (1 s/d 10)    : ");
        int pilihan = Integer.parseInt(br.readLine());
 
        switch(pilihan)
		{
			case 1:
					System.out.println("Anda memilih Sop Buntut    : Rp 35000");
					pilihMenu = "Sop Buntut "+pilihMenu;
					total = total + SopBuntut;
					break;
			 case 2:
					System.out.println("Anda memilih Sop Ayam : Rp 16000");
					pilihMenu = "Sop Ayam "+pilihMenu;
					total = total + SopAyam;
					break;
			case 3:
					System.out.println("Anda memilih Nasi Goreng  : Rp 15000");
					pilihMenu = "Nasi Goreng "+pilihMenu;
					total = total + NasiGoreng;
					break;
			case 4:
					System.out.println("Anda memilih Nasi Rames  : Rp 14000");
					pilihMenu = "Nasi Rames "+pilihMenu;
					total = total + NasiRames;
					break;
			case 5:
					System.out.println("Anda memilih Nasi Campur : Rp 13000");
					pilihMenu = "Nasi Campur "+pilihMenu;
					total = total + NasiCampur;
					break;
			case 6:
					System.out.println("Anda memilih Es Teh : Rp 2000");
					pilihMenu = "Es Teh "+pilihMenu;
					total = total + EsTeh;
					break;
			case 7:
					System.out.println("Anda memilih Es Jeruk : Rp 6000");
					pilihMenu = "Es jeruk "+pilihMenu;
					total = total + EsJeruk;
					break;
			case 8:
					System.out.println("Anda memilih Es Kopyor : Rp 8000");
					pilihMenu = "Es Kopyor "+pilihMenu;
					total = total + EsKopyor;
					break;
			case 9:
					System.out.println("Anda memilih Es Dawet : Rp 4000");
					pilihMenu = "Es Dawet "+pilihMenu;
					total = total + EsDawet;
					break;
			case 10:
					System.out.println("Anda memilih Es Teller : Rp 9000");
					pilihMenu = "Es Teller "+pilihMenu;
					total = total + EsTeller;
					break;
			default:
            System.out.println("MAAF! Anda Tidak Memesan Makanan Maupun Minuman/kosong");
        }
 
        System.out.print("Ada Tambahan Lain? (Y/N) : ");
        loop = br.readLine();
        }
        System.out.println("Menu yang anda pesan adalah              : "+pilihMenu);
        System.out.println("Total : Rp " +total);
		System.out.println("Terimakasih Atas Kunjungan Anda");
    }
}
