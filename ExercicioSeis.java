package aulaloop;

import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num, i = 0;
        double media,soma=0;

        do {
            System.out.println("Digite um número: ");
            num = leia.nextInt();
           if (num %3 == 0 && num !=0) {
               soma += num;
               i++;
           }
        } while (num != 0);
        media = (soma / i);
        System.out.println("A média de todos os números múltiplos de 3 é: " + media);
    }
}