import java.util.Scanner;

public class soal1_sulit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan jumblah siswa :");
        int siswa = input.nextInt();
        double totalnilai =0;
        for (int i = 0; i < siswa; i++) {
            System.out.println("masukan nilai siswa ke-" + (i+1) + " :");
            double nilai = input.nextDouble();
            totalnilai += nilai;

            System.out.println("jumblah siswa adalah :" + siswa);
            System.out.println("total nilai semua siswa :" + (totalnilai));
            System.out.println("rata rata nilai siswa :" + totalnilai / siswa);
            
        }
    }
    
}
