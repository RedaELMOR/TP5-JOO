package E;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EX1 {

    static class Calcul {
        static int diviser(int a, int b) {
            if (b == 0) throw new ArithmeticException("division par zero interdite");
            return a / b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entrez a :");
        System.out.println("entrez b :");

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(Calcul.diviser(a, b));

        } catch (InputMismatchException e) {
            System.out.println(" erreur : il faut entrer des entiers ");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}