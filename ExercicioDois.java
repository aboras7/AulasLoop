package aulaloop;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num, i, par = 0, impar = 0;
        for (i = 1; i < 11; i++) {
            System.out.println("Digite o " + i + "° número: ");
            num = leia.nextInt();
            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("Total de números pares: " + par + "\nTotal de números ímpares: " + impar);

    }
}