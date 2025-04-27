package br.com.fiap.main;

import br.com.fiap.bean.Pessoa;

import java.util.Scanner;

public class MainVersao2 {
    public static void main(String[] args) {

        Pessoa pessoa1;
        Scanner scan = new Scanner(System.in);
        String nome;
        int anoNascimento;

        try {
            System.out.println("Digite o seu nome e ano de nascimento:");
            nome = scan.nextLine();
            anoNascimento = scan.nextInt();

            pessoa1 = new Pessoa(nome, anoNascimento);
            int idadePessoa1 = pessoa1.calcularIdade(2025);

            System.out.printf("Pessoa 1 \nNome: %s \nIdade: %d anos", pessoa1.getNome(), idadePessoa1);


        } catch (Exception e) {
            System.out.println("Nome ou ano de nascimento inválido(s)!");
        }

    }
}
