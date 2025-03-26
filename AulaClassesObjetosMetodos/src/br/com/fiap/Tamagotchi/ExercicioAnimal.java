package br.com.fiap.Tamagotchi;

import java.util.Scanner;

public class ExercicioAnimal {

    public static void main(String[] args) {

        Animal cachorro = new Animal();
        Scanner scan = new Scanner(System.in);
        int opcao;

        cachorro.nome = "cachorro";

        System.out.println("---------------------------------");
        System.out.println("BEM VINDO AO TAMAGOTCHI CACHORRO ");
        System.out.println("---------------------------------");

        System.out.println("Qual vai ser o nome do seu cachorrinho?");
        cachorro.nome = scan.next();
        System.out.println("Qual vai ser a cor dele?");
        cachorro.cor = scan.next();
        System.out.println("\n----------------------------------------------------------------------");
        System.out.println("Que nome bonito! O que você deseja que o " + cachorro.nome + " faça?");
        System.out.println("1. Latir \n2. Passear \n3. Brincar \n4. Beber Água \n5. Comer Ração");
        System.out.println("----------------------------------------------------------------------");
        opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                cachorro.latido();
                break;
            case 2:
                cachorro.passear();
                break;
            case 3:
                cachorro.brincar();
                break;
            case 4:
                cachorro.beberAgua();
                break;
            case 5:
                cachorro.comer();
                break;
        }


    }

}
