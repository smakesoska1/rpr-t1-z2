package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
    public static int sumaCifara(int broj) {
        int suma = 0;
        while (broj > 0) {
            suma += broj % 10;
            broj /= 10;
        }
        return suma;
    }

    public static void main(String[] args) {
        int n = 0;
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite n: ");
        n = ulaz.nextInt();
        System.out.println("Brojevi djeljivi sumom svojih cifara su: ");
        for (int i = 1; i < n; i++) {
            if (i % sumaCifara(i) == 0) System.out.print(i + " ");
        }
    }
}
