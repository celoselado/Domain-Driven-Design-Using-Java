package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

import javax.swing.*;
import java.util.Scanner;

public class JOpFolhaDePagamento {

    public static void main(String[] args) {

        FolhaDePagamento folhaDePagamento =  new FolhaDePagamento();
        Scanner scan = new Scanner(System.in);

        int numeroDeDependentes;
        double salarioBruto, valorPlanoDeSaude, salarioLiquido, descontoINSS;
        String auxiliar;

        try {
            auxiliar = JOptionPane.showInputDialog("Por favor digite o seu Salário Bruto: ");
            salarioBruto = Double.parseDouble(auxiliar);
            folhaDePagamento.salarioBruto = salarioBruto;


            auxiliar = JOptionPane.showInputDialog("Por favor digite o seu Número de Dependentes: ");
            numeroDeDependentes = Integer.parseInt(auxiliar);
            folhaDePagamento.numeroDeDependentes = numeroDeDependentes;

            auxiliar = JOptionPane.showInputDialog("Por favor digite o valor individual do Plano de Saúde: ");
            valorPlanoDeSaude = Double.parseDouble(auxiliar);
            folhaDePagamento.valorPlanoDeSaude = valorPlanoDeSaude;

            auxiliar = JOptionPane.showInputDialog("Insira a % do valor de desconto do INSS: ");
            descontoINSS = Double.parseDouble(auxiliar);
            folhaDePagamento.descontoINSS = descontoINSS;

            //folhaDePagamento.descontoINSS = scan.nextDouble();

            salarioLiquido = folhaDePagamento.calcularSalarioLiquido();

            String mensagem = String.format("Salário bruto: R$ %.2f\nDependentes: %d\nINSS: %.1f%%\nPlano de Saúde: R$ %.2f\nSalário Líquido: R$ %.2f",
                    folhaDePagamento.salarioBruto, folhaDePagamento.numeroDeDependentes, folhaDePagamento.descontoINSS, folhaDePagamento.valorPlanoDeSaude,
                    folhaDePagamento.calcularSalarioLiquido());

            JOptionPane.showMessageDialog(null, mensagem);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Você digitou algo de errado! Reinicie o programa e insira as informações corretamente!");
        }

    }

}