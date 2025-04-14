package br.fiap.com.main;

import br.fiap.com.bean.Televisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Televisor televisor = new Televisor();
        Scanner scan = new Scanner(System.in);


        int  opcao, canal, volume;




            System.out.println("-------------------------");
            System.out.println("-    TELEVISOR    -");
            System.out.println("Digite o canal desejado: ");
            canal = scan.nextInt();
            televisor.setCanal(canal);
            System.out.println("Digite o volume desejado: ");
            volume = scan.nextInt();
            System.out.println("----------------------------");
            televisor.setVolume(volume);

        try {

            System.out.println(" - Digite uma opção - ");
            System.out.println(" 1 - Definir Canal");
            System.out.println(" 2 - Definir Volume");
            System.out.println(" 3 - Aumentar Volume");
            System.out.println(" 4 - Diminuir volume");
            System.out.println("----------------------");

            opcao = scan.nextInt();
            if (opcao == 1){
                System.out.println("Digite o canal desejado: ");
                canal = scan.nextInt();
                televisor.setCanal(canal);
                System.out.printf("Canal atual: %d",televisor.getCanal());
            } else if (opcao == 2) {
                System.out.println("Digite o volume desejado: ");
                volume = scan.nextInt();
                televisor.setVolume(volume);
                System.out.printf("Volume atual: %d", televisor.getVolume());
            } else if (opcao == 3){
                televisor.aumentarVolume();
                System.out.printf("Volume atual: %d", televisor.getVolume());
            } else if (opcao == 4){
                televisor.diminuirVolume();
                System.out.printf("Volume atual: %d", televisor.getVolume());
            }

        } catch (Exception e) {
            throw new RuntimeException("Você digitou um");
        }

    }

}
