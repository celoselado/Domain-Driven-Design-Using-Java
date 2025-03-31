package br.com.fiap.main;

import br.com.fiap.bean.ArCondicionado;

import java.util.Scanner;

public class UsaArCondicionado {

    public static void main(String[] args) {

        ArCondicionado controleAr = new ArCondicionado();
        Scanner scan = new Scanner(System.in);
        int opcao;
        String modo;

        controleAr.temperatura = 23;
        controleAr.modo = "resfriar";

        System.out.println("---------------------------");
        System.out.println("  SISTEMA AR CONDICIONADO  ");
        System.out.println("  Temperatura atual: " + controleAr.temperatura);
        System.out.println("  Modo atual: " + controleAr.modo);
        System.out.println("---------------------------");

        System.out.println("Digite 1 para entrar altera a temperatura e 2 para alterar o modo do Ar");
        opcao = scan.nextInt();

        switch(opcao){
            case 1:
                System.out.println("Digite a 1 para AUMENTAR a temperatura e 2 para DIMINUIR");
                opcao = scan.nextInt();

                if (opcao == 1){
                    controleAr.aumentarTemperatura();
                } else {
                    controleAr.diminuirTemperatura();
                }

                System.out.println("Temperatura atual: " + controleAr.temperatura);

            break;

            case 2:
                System.out.println("Digite o modo desejado: resfriar, aquecer ou ventilar");
                modo = scan.next();

                controleAr.trocarModo(modo);

                System.out.println("Modo atual: "+ controleAr.modo);
        }


    }

}
