import java.util.Scanner;

public class Nomor1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Meminta input dari user
        System.out.print("Masukkan nilai N : ");
        int N = input.nextInt();
        /* Pekerjaan anda mulai dari sini */

        //Menampilan deret FizzBuzz
        System.out.println("Deret FizzBuzz dari 0 hingga " + N + ":");
        tampilkanDeretFizzBuzz(N);
    }

    //Prosedur menampilkan FizzBuzz
    public static void tampilkanDeretFizzBuzz(int N) {
        for (int i = 0; i <= N; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
        

        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor1.class.getDeclaredMethods().length); 
    }
    
}

