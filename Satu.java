import java.util.Scanner;

public class Satu {
    public static void main(String[]args)
    {
        int nilai, pengulangan, bagi, sisa;
        Scanner s = new Scanner(System.in);

        System.out.print("input angka: ");
        nilai = s.nextInt();

        pengulangan = 1;
        while (pengulangan < 11) {
            bagi = nilai / pengulangan;
            sisa = nilai % pengulangan;

            System.out.print(nilai);
            System.out.print(":");
            System.out.print(pengulangan);
            System.out.print(" = ");
            System.out.print(bagi);
            System.out.print(" sisa ");
            System.out.println(sisa);

            pengulangan = pengulangan + 1;
        }

    }
}
