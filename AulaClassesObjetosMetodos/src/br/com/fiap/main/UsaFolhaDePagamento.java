package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

import java.util.Scanner;

public class UsaFolhaDePagamento {

    public static void main(String[] args) {

        FolhaDePagamento folhaDePagamento =  new FolhaDePagamento();
        Scanner scan = new Scanner(System.in);

        double salarioLiquido;

        folhaDePagamento.salarioBruto = 50000;
        folhaDePagamento.numeroDeDependentes = 3;
        folhaDePagamento.descontoINSS = 10;
        folhaDePagamento.valorPlanoDeSaude = 250;

        System.out.println("Por favor digite o seu Salário Bruto: ");
        folhaDePagamento.salarioBruto = scan.nextDouble();

        System.out.println("Agora digite o número de dependentes: ");
        folhaDePagamento.numeroDeDependentes = scan.nextInt();

        System.out.println("Insira o valor individual do plano de saúde: ");
        folhaDePagamento.valorPlanoDeSaude = scan.nextDouble();

        System.out.println("Insira a % do valor de desconto do INSS: ");
        folhaDePagamento.descontoINSS = scan.nextDouble();

        salarioLiquido = folhaDePagamento.calcularSalarioLiquido();

        System.out.println(salarioLiquido);


    }

}