import java.util.Scanner;

public class Dua {

    public static void main(String[]args)
    {
        int nilai, pembagi;
        Scanner s = new Scanner(System.in);

        System.out.print("input angka: ");
        nilai = s.nextInt();

        pembagi = 1;
        do {
            if (nilai % pembagi == 0) {
                System.out.print(pembagi);
                if (pembagi < nilai) {
                    System.out.print(", ");
                }
            }
            pembagi = pembagi + 1;
        } while (pembagi <= nilai);
    }
}
