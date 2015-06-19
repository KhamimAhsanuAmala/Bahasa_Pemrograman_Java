import java.util.*;
import java.io.*;

public class ProgramUtama
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

	public static int cari(Vector v, String kata) 
	{
		int i = -1;
		int j = 0;

		do {
			if (v.elementAt(j).equals(kata)) 
			{
				i = j;
				break;
			}
			j++;
		} while ((j < v.size()));
		return i;
	}

	public static void main(String[] khamim) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean ceklogin = false;
		
		Vector<String> username = new Vector<String>();
		Vector<String> password = new Vector<String>();
		Vector<String> status = new Vector<String>();
		
		username.add("khamim");
		password.add("cc203sdt");
		status.add("admin");
		username.add("kasir");
		password.add("kasir");
		status.add("kasir");
		
		do 
		{
			Database.menuLogin();
			cetak("Masukan username anda : ");
			String id = br.readLine();
			
			cetak("Masukan password anda : ");
			String pass = br.readLine();
			
			if (username.contains(id) && password.contains(pass)) 
			{
				if (username.indexOf(id) == password.indexOf(pass)) 
				{
					int urutan = username.indexOf(id);
					String ceksts = status.elementAt(urutan);
					
					if (ceksts.equalsIgnoreCase("admin")) 
					{
						int pil = 0;
						ceklogin = true;
						
						do 
						{
							Database.admin();
							pil = Integer.parseInt(br.readLine());
							switch (pil) 
							{
							case 1:
								BarangArea.ManageBarang();
								break;

							case 2:

								do 
								{
									Garis1();
									cetakln("||     	MInyak Wangi KHAMIM JAYA     	||");
									cetakln("||     			USER     				||");
									Garis1();
									cetakln("1. Tambah User");
									cetakln("2. Hapus User");
									cetakln("3. Ubah Password Dan Status");
									cetakln("4. Tampilkan Semua User");
									cetakln("5. Exit");

									cetak("Pilihlah menu [1-5] : ");
									pil = Integer.parseInt(br.readLine());

									switch (pil)
									{

									case 1:
										boolean loop1 = false;
										boolean loop2 = false;
										boolean loop3 = false;
										
										Garis1();
										cetakln("Tambah User Baru");
										Garis1();
										
										do
										{
											cetak("Masukkan username : ");
											String cek = br.readLine();
											
											if(username.contains(cek))
											{
											cetakln("Username "+cek+" telah terdaftar, gunakan username lainnya!");
											cetakln("");
											
											}
											else
											{
											username.add(cek);
											
											do{
											String pass1,pass2;
											cetak("Masukkan password : ");
											pass1 = br.readLine();
											
											cetak("Ulangi   password : ");
											pass2 = br.readLine();
											
											cetakln("");
											
													if(pass1.equals(pass2)){
													   password.add(pass2);
													   do
													   {
													   cetak("Masukkan status user "+cek+" [admin/kasir] : ");
													   String sts = br.readLine();
														   
														   if(sts.equalsIgnoreCase("admin") || sts.equalsIgnoreCase("kasir")){
																status.add(sts);
																cetakln("User "+cek+" telah dibuat.");
																cetakln("");
																
																loop3=true;
																loop2=true;
																loop1=true;
																
														   }
														   else
														   {
																cetakln("Tidak terdapat pilihan status '"+sts+"'");
																loop3=false;
																
																cetakln("");
														   }
													   }while(loop3==false);
													}
													else
													{
														cetakln("Password SALAH, Coba Lagi!!!!!!!!!");
														loop2=false;
													}
												}while(loop2==false);
											}
										}while(loop1==false);
										
										break;

									case 2:
										Garis1();
										cetakln("    Hapus User  ");
										Garis1();
										
										int indexunhapus;
										String userhapus;
										String userhapuspil;
										int indexpwhapus;
										int indexstshapus;

										do 
										{
											cetak("Masukkan username yang akan dihapus : ");
											userhapus = br.readLine();
											indexunhapus = cari(username,userhapus);
											indexpwhapus = indexunhapus;
											indexstshapus = indexunhapus;
										} while (indexunhapus == -1);

										cetak("Apakah anda akan menghapus user "
														+ userhapus
														+ "? [y/t] ");
										userhapuspil = br.readLine();

										if (userhapuspil.equalsIgnoreCase("y")) {
											username.removeElementAt(indexunhapus);
											password.removeElementAt(indexpwhapus);
											status.removeElementAt(indexstshapus);
											cetakln("User "
													+ userhapus
													+ " berhasil dihapus");
										}
										break;

									case 3:
										String usernameubah;
										int iunpwubah;
										int ipwpwubah;
										int istsubah;
										String pwakanubah;
										String stsakanubah;
										int isamapw;
										int isamasts;
										int j;

										Garis1();
										cetakln("Ubah Password dan Status");
										Garis1();

										do 
										{
											cetak("Masukkan username : ");
											usernameubah = br.readLine();
											iunpwubah = cari(username,usernameubah);
											ipwpwubah = iunpwubah;
											istsubah = iunpwubah;
										} while (iunpwubah == -1);

										do 
										{
											cetak("Masukkan password : ");
											pwakanubah = br.readLine();
											
											isamapw = cari(password, pwakanubah);
											cetak("Masukan status : ");
											
											stsakanubah = br.readLine();
											isamasts = cari(status, stsakanubah);
										}

										while (isamapw == -1 && isamasts == -1);

										password.removeElementAt(isamapw);
										status.removeElementAt(isamasts);
										cetak("Masukan status baru : ");
										String stsbaru = br.readLine();
										status.add(stsbaru);
										cetak("Masukkan password baru : ");
										String pwbaru = br.readLine();
										password.add(pwbaru);
										cetakln("password dan status anda sudah terganti");

										break;

									case 4:
										int i;
										Garis1();
										cetakln("|USERNAME \t PASSWORD \tSTATUS|");
										Garis1();
										for (i = 0; i < username.size(); i++) 
										{
											cetak(" "+username.elementAt(i)+ "\t\t "+ password.elementAt(i)+ "\t\t"+ status.elementAt(i));
											cetakln("");
										}
										break;

									default:
										break;
									}
								}

								while (pil < 5);

								break;

							case 3:
								// Laporan
								int z=0;
								int y=0;
								
								for(int j = 0 ; j<Penjualan.kodeTRANS.size(); j++){
								cetakln("Kode Transaksi : "+Penjualan.kodeTRANS.elementAt(j));
								Garis1();
								cetakln("ID Barang\tNama Barang\t\t\tQty\tSatuan\tHarga");
								Garis1();
								
								y=y+Integer.parseInt(Penjualan.JTRANS.elementAt(j).toString());
								while(z<y)
								{
									cetakln(Penjualan.jualID.elementAt(z)+"\t\t"+Penjualan.jualNAMA.elementAt(z)+"\t"+Penjualan.jualQTY.elementAt(z)+"\t"+Penjualan.jualHARGA.elementAt(z)+"\t"+Penjualan.subTOTAL.elementAt(z));
									z++;
									}
									Garis1();
								}
								cetakln("");
								cetakln("");
								break;
							}
						} while (pil < 4);

					} else if (ceksts.equalsIgnoreCase("kasir")) {
						ceklogin = true;
						Penjualan.transaksi();
					}
				} 
				else 
				{
					cetakln("Data tidak valid !");
				}
			} 
			else 
			{
				cetakln("Data tidak valid !");
			}
		} while (ceklogin = true);
	}
}
