package aulaloop;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade, sexo, categoria, back = 0, front = 0, mob = 0, full = 0;
        String continua = "S";
        while (continua.equalsIgnoreCase("S")) {

            System.out.println("Olá, colaborador! \nDigite sua idade: ");
            idade = leia.nextInt();

            // Sexo:
            System.out.println("Digite seu sexo: 1-M, 2-F, 3- Outros ");
            sexo = leia.nextInt();

            while (sexo < 1 || sexo > 3) {
                System.out.println("Digite seu sexo: 1-M, 2-F, 3- Outros ");
                sexo = leia.nextInt();}

                //Categoria:

                System.out.println("Digite a categoria: ");
                System.out.println("1-Back\n2-Front\n3-Mobile\n4-Fullstack");
                categoria = leia.nextInt();

                while (categoria < 1 || categoria > 4) {
                    System.out.println("1-Back\n2-Front\n3-Mobile\n4-Fullstack");
                    categoria = leia.nextInt();}

                if (categoria == 1) {
                    back++;
                } else if (categoria == 2 && sexo == 2) {
                    front++;
                } else if (categoria == 3 && sexo == 1 && idade > 40) {
                    mob++;
                } else if (categoria == 4 && sexo == 2 && idade < 30) {
                    full++;
                }

                System.out.println("Deseja continuar (S/N): ");
                leia.skip("\\R");
                continua = leia.nextLine();
            }
            System.out.println("Total de pessoas desenvolvedoras Backend: "+ back);
            System.out.println("Total de mulheres desenvolvedoras Frontend: "+ front);
            System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: "+mob);
            System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: "+full);
        }
    }

