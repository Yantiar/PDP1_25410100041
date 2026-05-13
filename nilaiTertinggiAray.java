import java.util.Scanner;

public class nilaiTertinggiAray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlData;
        int[]nilai;

        System.out.print("Masukan jumlah data: ");
        jmlData = sc.nextInt();

        nilai = new int[jmlData];
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke"+(i+1)+" : ");
            nilai[i] = sc.nextInt();
            System.out.println();
        }
        System.out.println("Nilai Terbesar = "+getNilaiMax(nilai));
    }

    static int getNilaiMax(int[]arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
}
