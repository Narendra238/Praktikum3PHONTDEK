import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Panggil Konstraktor
        Persegi persegi = new Persegi();
        PersegiPanjang persegipanjang = new PersegiPanjang();
        Lingkaran lingkaran = new Lingkaran();

        System.out.print("Masukkan Sisi Persegi = ");//Persegi
        persegi.setSisi(input.nextDouble());
        System.out.println("Hasil Keliling Persegi = "+persegi.HitungKeliling());
        System.out.println("Hasil Luas Persegi = "+persegi.HitungLuas());

        System.out.print("Masukkan Panjang Persegi Panjang = ");//Persegi Panjang
        persegipanjang.setPanjang(input.nextDouble());
        System.out.print("Masukkan Lebar Persegi Panjang = ");
        persegipanjang.setLebar(input.nextDouble());
        System.out.println("Hasil Keliling Persegi Panjang = "+persegipanjang.HitungKeliling());
        System.out.println("Hasil Luas Persegi Panjang = "+persegipanjang.HitungLuas());

        System.out.print("Masukkan Jari-jari lingkaran = ");//Lingkaran
        lingkaran.setJarijari(input.nextDouble());
        System.out.println("Hasil Keliling Lingkaran = "+lingkaran.HitungKeliling());
        System.out.println("Hasil Luas Lingkaran = "+lingkaran.HitungLuas());

    }
}