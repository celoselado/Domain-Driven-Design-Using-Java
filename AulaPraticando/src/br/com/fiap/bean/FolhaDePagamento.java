package br.com.fiap.bean;

public class FolhaDePagamento {

    public double salarioBruto;
    public int numeroDeDependentes;
    public double descontoINSS;
    public double valorPlanoDeSaude;


    public double calcularSalarioLiquido(){
        double salarioLiquido;

        salarioLiquido = (salarioBruto * descontoINSS) / 100;
        salarioLiquido = (salarioBruto - salarioLiquido) - (valorPlanoDeSaude * (numeroDeDependentes + 1));

        return salarioLiquido;
    }

}