import java.util.ArrayList;
import java.util.Scanner;

public class Nomor2 {

    //Daftar harga buku
    private static final int[] hargaBuku = {350000,450000, 500000, 95000};
    private static final String[] namaBuku = {"Sherlock Holmes", "Arsene Lupin", "Game of Thrones", "Psychology of Money"};
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /* Pekerjaan anda mulai dari sini */
         ArrayList<Integer> hargaBelanja = new ArrayList<>();
        char pilihan;
        
        //Menampilkan daftar buku
        System.out.println("Daftar Buku: ");
        for (int i = 0; i < namaBuku.length; i++) {
            System.out.println((i + 1) + ". " + namaBuku[i] + " " + hargaBuku[i]);
        }

        //Menampung pilihan user
        do {
            System.out.print("Masukan pilihan buku [1/2/3/4]: ");
            int pilihanBuku = input.nextInt();
            hargaBelanja.add(hargaBuku[pilihanBuku - 1]);

            System.out.print("Input lagi (Y/N)?: ");
            pilihan = input.next().charAt(0);
        } while (pilihan == 'Y' || pilihan == 'y');

        int totalHarga = hitungTotalHarga(hargaBelanja);
        int totalVoucher = hitungVoucher(totalHarga);

        System.out.println("Total voucher belanja = " + totalVoucher);
        System.out.println("Total yang harus dibayar = " + (totalHarga - totalVoucher));
    }
    
    // Prosedur untuk menghitung total harga
    public static int hitungTotalHarga(ArrayList<Integer> hargaBelanja) {
        int total = 0;
        for (int harga : hargaBelanja) {
            total += harga;
        }
        return total;
    }

     // Prosedur untuk menghitung voucher
    public static int hitungVoucher(int totalHarga) {
        if (totalHarga < 200000) {
            return 0;
        } else if (totalHarga <= 500000) {
            return 50000;
        } else if (totalHarga <= 750000) {
            return 100000;
        } else if (totalHarga <= 1000000) {
            return 150000;
        } else {
            return 200000;
        }
        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor2.class.getDeclaredMethods().length); 
}

