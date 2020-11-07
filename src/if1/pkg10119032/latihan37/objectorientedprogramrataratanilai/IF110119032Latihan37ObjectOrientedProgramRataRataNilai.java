package if1.pkg10119032.latihan37.objectorientedprogramrataratanilai;
import java.util.Scanner;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi program untuk menampilkan
 * rata-rata nilai menggunakan konsep pendekatan berbasis objek
 */
public class IF110119032Latihan37ObjectOrientedProgramRataRataNilai {

    public int banyakMhs;
    public double totalNilai, nilaiRataRata;
    public double[] nilaiMhs;
    
    public void inputMhs(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan banyak mahasiswa : ");
        banyakMhs = scanner.nextInt();    
    }
    
    public void inputNilai(){
        totalNilai = 0;
        nilaiMhs = new double[banyakMhs];
        
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < banyakMhs; i++) {
           System.out.print("Nilai Mahasiswa ke- " + (i+1) + " : ");
           nilaiMhs[i] = scanner.nextInt();
           totalNilai += nilaiMhs[i];
        }
    }
    
    
    public void nilaiRataRata(){
        nilaiRataRata = totalNilai/banyakMhs;
    }
    
    public static void main(String[] args) {

        IF110119032Latihan37ObjectOrientedProgramRataRataNilai nilai = 
                new IF110119032Latihan37ObjectOrientedProgramRataRataNilai();
        
        nilai.inputMhs();
        nilai.inputNilai();
        nilai.nilaiRataRata();
        
        System.out.print("\n");
        System.out.println("Maka, Rata-rata dari Nilai adalah : " + nilai.nilaiRataRata);
        System.out.println("Developed by : Ginanjar Tubagus Gumilar");
    }
    
}