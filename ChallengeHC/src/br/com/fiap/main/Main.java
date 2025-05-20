package br.com.fiap.main;


import br.com.fiap.bean.Paciente;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao;
        String auxiliar, nmCompleto, nrCpf, dsEstadoCivil;
        char dsSexoBiologico;
        Date dtNascimento;

        System.out.println("-----------------------------");
        System.out.println("          IMREA Hc           ");
        System.out.println("-----------------------------");
        System.out.println("1 - Cadastrar Usuário");
        System.out.println("2 - Sair");
        System.out.println("-----------------------------");
        opcao = scanner.nextInt();

        if (opcao == 1){
            Paciente paciente = new Paciente();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            System.out.println("-----------------------------");

            System.out.println("Digite o seu nome: ");
            nmCompleto = scanner.next();
            System.out.println("Digite o seu CPF: ");
            nrCpf = scanner.next();
            System.out.println("Sexo M/F: ");
            dsSexoBiologico = scanner.next().charAt(0);
            System.out.println("Estado civil SOLTEIRO/CASADO: ");
            dsEstadoCivil = scanner.next();
            System.out.println("Digite sua DATA DE NASCIMENTO:");
            auxiliar = scanner.next();
            LocalDate data = LocalDate.parse(auxiliar, formatter);

            System.out.println("---------------------------------------------");
            System.out.println("---------- Cadastrado com sucesso! ----------");
            System.out.println("----------          MENU           ----------");
            System.out.println("----------  1= CONSULTAS           ----------");
            System.out.println("----------  2= AGENDAMENTO         ----------");
            System.out.println("----------  3= FAQ                 ----------");
            System.out.println("---------------------------------------------");

            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Nenhuma data agendada! Deseja realizar um agendamento? ");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Sair");
                    System.out.println("--------------------------------------------------------");
                    opcao = scanner.nextInt();

                    if (opcao == 1){
                        // Metodo Agendamento abaixo

                    } else {
                        System.out.println("Obrigado por usar nosso aplicativo! ");
                    }
                    break;
                case 2:
                    System.out.println("------------------------------------------------");
                    //Metodo Agendamento abaixo

                    break;
                case 3:
                    System.out.println("---------      FAQ        ------------");
                    //metodo FAQ abaixo

                    break;
            }

        }else {
            System.out.println("Obrigado por usar nosso aplicativo! ");
        }

    }
}
