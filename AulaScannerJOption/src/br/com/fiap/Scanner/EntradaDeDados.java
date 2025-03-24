package br.com.fiap.Scanner;

import java.util.Scanner;

public class EntradaDeDados {

    public static void main(String[] args) {

        int num1, num2, result;
        Scanner scan; //Declaração do objeto

        try {
            scan = new Scanner(System.in); // Instanciação do objeto (Poder usar ele.)
            System.out.print("Olá por favor, digite o primeiro número inteiro: ");
            num1 = scan.nextInt(); //Metodo para scannear uma variável inteira! Se for scanner String ou Float trocamos ali o nextInt.
            System.out.print("Agora digite o segundo número inteiro: ");
            num2 = scan.nextInt();
            result = num1 + num2;
            System.out.println("Valor 1: "+num1+"\nValor 2: "+num2+"\nSoma dos valores: "+result);

        } catch (Exception e) {
            System.out.println("Formato de número incorreto! Por favor, utilize números inteiros.");
        }

    }

}
