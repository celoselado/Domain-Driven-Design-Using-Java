package br.com.fiap.Televisor;

import java.util.Scanner;

public class UsaTelevisor {

    public static void main(String[] args) {

        Televisor televisao = new Televisor();
        Scanner scan = new Scanner(System.in);

        televisao.volume = 5;
        televisao.canal = 100;
        int controle, resp;

        System.out.println("Canal atual: "+televisao.canal+"\nDeseja mudar de canal?\nDigite 1 para SIM e 2 para NÃO");
        resp = scan.nextInt();

        if (resp == 1){
            System.out.print("Digite o canal que você deseja assistir: ");
            controle = scan.nextInt();

            televisao.trocarCanal(controle);
            System.out.println("Você agora está no canal: "+ controle);

        } else {
            System.out.println("Canal atual: "+televisao.canal);
        }

    }

}
