import java.util.Scanner;

public class ganjilGenap {
    public static void main(String[] args) {
        /*
        clue :
        - tipe fungsi int
        - return value boolean
        */

        Scanner sc = new Scanner(System.in);
        int a = 0;
        
        System.out.println("Masukan angka :");
        a = sc.nextInt();

        //memanggil fungsi tanpa system.out.println
        isGanjil(a);


    }

    static boolean isGanjil(int angka){
        if (angka %2 == 0) {
           System.out.println("genap");
            return false;
        }
        System.out.println("ganjil");
        return true;
    }
}
