import java.util.Scanner;

public class Tiga {
    public static void main(String[]args)
    {
        int batas, count_genap, count_ganjil;
        Scanner s = new Scanner(System.in);

        System.out.print("input batasan angka: ");
        batas = s.nextInt();

        count_genap  = 0;
        count_ganjil = 0;

        System.out.print("Angka-angka yang merupakan kelipatan 3 atau 5 kurang dari "+ batas +" adalah: ");
        for (int i = 1; i < batas; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                System.out.print(i);
                System.out.print(" ");
                if (i % 2 == 0) {
                    count_genap = count_genap + 1;
                } else {
                    count_ganjil = count_ganjil + 1;
                }
            }
        }
        System.out.println();
        System.out.println("Jumlah angka genap : " + count_genap);
        System.out.print("Jumlah angka ganjil : " + count_ganjil);
    }
}
