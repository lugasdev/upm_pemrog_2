import java.util.Scanner;

public class Empat {
    public static void main(String[]args)
    {
        int baris, kolom;
        Scanner s = new Scanner(System.in);

        System.out.print("Input jumlah baris: ");
        baris = s.nextInt();

        System.out.print("Input jumlah kolom: ");
        kolom = s.nextInt();

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                if ((i+j) % 2 == 0) {
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
}
