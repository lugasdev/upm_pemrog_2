import java.util.Scanner;

public class Satu {
    public static void main(String[]args)
    {
        int nilai, iterasi, bagi, sisa;
        Scanner s = new Scanner(System.in);

        System.out.print("input angka: ");
        nilai = s.nextInt();

        iterasi = 1;
        while (iterasi < 11) {
            bagi = nilai/iterasi;
            sisa = nilai % iterasi;

            System.out.print(nilai);
            System.out.print(":");
            System.out.print(iterasi);
            System.out.print(" = ");
            System.out.print(bagi);
            System.out.print(" sisa ");
            System.out.println(sisa);

            iterasi = iterasi + 1;
        }

    }
}
