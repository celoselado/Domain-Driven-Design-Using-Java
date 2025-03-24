package br.com.fiap.Scanner;

import java.util.Scanner;

public class CalculaIdade {

    public static void main(String[] args) {

        int ano, anoNasc, idade;
        Scanner scan;

        try {

            scan = new Scanner(System.in);
            System.out.print("Digite o ano em que estamos: ");
            ano = scan.nextInt();
            System.out.print("Digite o ano em que você nasceu: ");
            anoNasc = scan.nextInt();

            idade = ano - anoNasc;

            System.out.println("Você tem "+idade+" anos!");

        } catch (Exception e) {
            System.out.println("Algo deu errado! Tente de novo, mas digite apenas numeros inteiros.");
        }

    }

}
