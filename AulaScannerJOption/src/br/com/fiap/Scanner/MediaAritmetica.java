package br.com.fiap.Scanner;

import java.util.Scanner;

public class MediaAritmetica {

    public static void main(String[] args) {

        float prova1, prova2, prova3, prova4, media;
        Scanner scan; // Criando um objeto e declarando ele como Scanner.

        try {

            scan = new Scanner(System.in); // Instanciação do objeto (Poder usar ele dentro do codigo.)
            System.out.print("Digite o resultado da primeira prova: ");
            prova1 = scan.nextFloat();
            System.out.print("Digite o resultado da segunda prova: ");
            prova2 = scan.nextFloat();
            System.out.print("Digite o resultado da terceira prova: ");
            prova3 = scan.nextFloat();
            System.out.print("Digite o resultado da quarta prova: ");
            prova4 = scan.nextFloat();

            media = (prova1 + prova2 + prova3 + prova4) / 4;

            System.out.println("A média alcançada pelo aluno foi de: "+media);


        } catch (Exception e) {
            System.out.println("Houve um erro! Tente novamente digitando números!");
        }


    }

}
