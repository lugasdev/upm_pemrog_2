import java.util.Scanner;

public class Lima {
    public static void main(String[]args)
    {
        int[] nilai = new int[5];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Input bilangan ke-" + (i + 1) + " : ");
            nilai[i] = s.nextInt();
        }

        System.out.println();
        System.out.print("Data yang diinput adalah : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(nilai[i] + " ");
        }
    }
}
