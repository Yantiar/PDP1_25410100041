import java.util.Scanner;

public class pesanTiketArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] kategori = new String[0];
        int[] harga = new int[0];
        int total=0, jmlTiket=0,menu=0,jmlData,pilihKategori=0;
        String tambahKategori;
        
        do { //mengulang menu
            System.out.println( "\n"+"Pemesanan Tiket Surabaya Zoo ");
            System.out.println("1. Input kategori dan harga");
            System.out.println("2. Input jumlah beli ");
            System.out.println("3. Hitung total ");
            System.out.println("4. Keluar Program ");
            
            System.out.print("Pilih Menu = ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    //menu 1 >> isian data bebas sesuai user
                    System.out.print("Berapa jumlah data: ");
                    jmlData = sc.nextInt();
                    
                    //deklarasi ulang
                    kategori = new String[jmlData];
                    harga = new int[jmlData];
                    sc.nextLine();
                    //input dan output menggunakan loop(for)
                    //indeks array dimulai dari 0
                    for (int i = 0; i < kategori.length; i++) {
                        System.out.print("\nInput kategori ke-"+(i+1)+" : ");
                        kategori[i]= sc.nextLine();
                        System.out.print("Input harga : ");
                        harga[i] = sc.nextInt();
                        sc.nextLine();
                        System.out.println();
                    }
                    //output
                    for (int i = 0; i < harga.length; i++) {
                        System.out.println("Kategori ke-"+(i+1)+" :"+kategori[i] + "  Harga:"+harga[i]);
                    }
                    break;
                case 2:
                    if (kategori.length >=1) {
                        for (int i = 0; i < harga.length; i++) {
                            System.out.println("Kategori ke-"+(i+1)+" :"+kategori[i] + "  Harga:"+harga[i]);
                            }
                        do {
                            System.out.print("\nPilih kategori (1-" + kategori.length + ") : ");
                            pilihKategori = sc.nextInt();

                            System.out.print("Jumlah Tiket = ");
                            jmlTiket = sc.nextInt();

                            total = total + harga[pilihKategori - 1] * jmlTiket;
                            
                            System.out.print("Tambah Kategori tiket yang dibeli (ya/tidak) : ");
                            tambahKategori =sc.next();
                            sc.nextLine();

                        } while(tambahKategori.equalsIgnoreCase("ya"));
                    }else{
                        System.out.println("Belum ada Kategori! Inputkan di case 1");
                    }
                    break;
                case 3:
                    //menu 3
                    if (pilihKategori >= 1) {
                        System.out.println("\n===================");
                        System.out.println("Total Bayar : "+total);
                        System.out.println("====================");
                    }else{
                        System.out.println("pilih kategori dan masukan jumlah tiket pada menu 2");
                    }
                    
                    break;
                case 4:
                    //menu 4
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }
        } while (true);
        
        
    }
}