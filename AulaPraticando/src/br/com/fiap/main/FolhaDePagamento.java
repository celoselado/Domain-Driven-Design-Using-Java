package br.com.fiap.main;

import java.util.Scanner;

public class FolhaDePagamento {

    public static void main(String[] args) {

        br.com.fiap.bean.FolhaDePagamento folhaDePagamento =  new br.com.fiap.bean.FolhaDePagamento();
        Scanner scan = new Scanner(System.in);

        double salarioBruto;
        int numeroDeDependentes;
        double valorPlanoDeSaude;
        double descontoINSS;
        double salarioLiquido;

        folhaDePagamento.salarioBruto = 50000;
        folhaDePagamento.numeroDeDependentes = 3;
        folhaDePagamento.valorPlanoDeSaude = 250;
        folhaDePagamento.descontoINSS = 10;

        System.out.println("Por favor digite o seu Salário Bruto: ");
        salarioBruto = scan.nextDouble();
        folhaDePagamento.salarioBruto = salarioBruto;

        //folhaDePagamento.salarioBruto = scan.nextDouble(); FORMA DIRETA DE ADICIONAR O VALOR AO OBJETO.

        System.out.println("Agora digite o número de dependentes: ");
        numeroDeDependentes = scan.nextInt();
        folhaDePagamento.numeroDeDependentes = numeroDeDependentes;

        //folhaDePagamento.numeroDeDependentes = scan.nextInt();

        System.out.println("Insira o valor individual do plano de saúde: ");
        valorPlanoDeSaude = scan.nextDouble();
        folhaDePagamento.valorPlanoDeSaude = valorPlanoDeSaude;

        //folhaDePagamento.valorPlanoDeSaude = scan.nextDouble();

        System.out.println("Insira a % do valor de desconto do INSS: ");
        descontoINSS = scan.nextDouble();
        folhaDePagamento.descontoINSS = descontoINSS;

        //folhaDePagamento.descontoINSS = scan.nextDouble();

        salarioLiquido = folhaDePagamento.calcularSalarioLiquido();

        System.out.printf("Salário bruto: R$ %.2f\nDependentes: %d\nINSS: %.1f%%\nPlano de Saúde: R$ %.2f\nSalário Líquido: %.2f",
                folhaDePagamento.salarioBruto, folhaDePagamento.numeroDeDependentes, folhaDePagamento.descontoINSS, folhaDePagamento.valorPlanoDeSaude,
                folhaDePagamento.calcularSalarioLiquido());


    }

}