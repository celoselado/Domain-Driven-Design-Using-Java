package br.com.fiap.bean;

// Aluno: Marcelo Alexandre dos Santos RM:565465
// Aluna: Poliana Sarmento RM: 565321
// Aluno: Leonardo Rodrigues RM: 552417

// Criando a classe Despesa Familiar e o molde para criar objetos:
public class DespesaFamiliar {

    // Definindo Atributos:
    public double rendaFamiliar;
    public int numeroDeMoradores;
    public double gastoComLuz;
    public double gastoComAgua;
    public double gastoComInternet;
    public double valorMensalidadeDaAcademia;

    //Criando os métodos calcularTotalDeDespesas:
    public double calcularTotalDeDespesas(){
        double totalDeDespesas;

        totalDeDespesas = gastoComAgua + gastoComInternet + gastoComLuz + (valorMensalidadeDaAcademia * numeroDeMoradores);

        // Retornando o valor na variável totalDeDespesas:
        return totalDeDespesas;
    }

    public double calcularRendaFamiliarLiquida(){
        double rendaFamiliarLiquida;

        rendaFamiliarLiquida = rendaFamiliar - calcularTotalDeDespesas();

        // Retornando o valor na variável rendaFamiliarLiquida:
        return rendaFamiliarLiquida;
    }

}
