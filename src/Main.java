import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scn = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        n = scn.nextInt();

        System.out.print("4'ün kuvvetleri : ");
        for (int i = 1; i <= n; i *= 4) {
            System.out.print(i + ",");
        }
        System.out.println();
        System.out.print("5'in kuvvetleri : ");

        for (int k = 1; k <= n; k *= 5) {
            System.out.print(k + ",");
        }
    }
}