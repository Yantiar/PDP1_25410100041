import java.util.Scanner;

public class uts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[]barang = new String[0];
        int[]harga = new int[0];
        int jml_data,total=0;
        double diskon,total_bayar,potongan ;

        do {
            System.out.print("masukan jumlah barang = ");
            jml_data = sc.nextInt();    
        } while (jml_data < 5);
        
        barang = new String[jml_data];
        harga = new int[jml_data];
        sc.nextLine();

        for (int i = 0; i < barang.length; i++) {
            System.out.print("\nmasukan nama barang-"+(i+1)+" : ");
            barang[i]= sc.nextLine();
            System.out.print("Input harga : ");
            harga[i] = sc.nextInt();
            sc.nextLine();
            System.out.println();
        }
        for (int i = 0; i < harga.length; i++) {
            System.out.println("Barang ke-"+(i+1)+" :"+barang[i] + "  Harga:"+harga[i]);
        }

        for (int i = 0; i < harga.length; i++) {
            total += harga[i];
        }
        System.out.println("=======================");
        System.out.println("Total Belanja = "+total);

        if (total>=100000) {
            System.out.println("mendapat diskon 10%");
            diskon = 0.1;
        }else if (total>50000) {
            System.out.println("mendapat diskon 5%");
            diskon = 0.05;
        }else{
            diskon = 0;
        }
        
        potongan = total*diskon;
        System.out.println("potongan = "+potongan);
        total_bayar = total-(total*diskon);
        System.out.println("==================");
        System.out.println("Total Bayar = "+total_bayar);
        

        sc.close();
        
    }
}
