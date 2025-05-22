package br.com.fiap.main;

//Importação do pacote DespesaFamiliar e do Scanner
import br.com.fiap.bean.DespesaFamiliar;
import java.util.Scanner;

// Aluno: Marcelo Alexandre dos Santos RM:565465
// Aluna: Poliana Sarmento RM: 565321
// Aluno: Leonardo Rodrigues RM: 552417

//Classe Main para rodar o código:
public class Main {

    //Chamando metodo main:
    public static void main(String[] args) {

        //Instanciando o objeto despesaFamiliar e o Scanner
        DespesaFamiliar despesaFamiliar = new DespesaFamiliar();
        Scanner scan = new Scanner(System.in);

        //Criando as váriaveis que irão armazenar os valores antes de atribuí-los aos atributos da classe DespesaFamiliar
        int numeroDeMoradores;
        double rendaFamiliar, gastoComLuz, gastoComAgua, gastoComInternet, valorMensalidadeDaAcademia;

        System.out.println("\n---------------------------");
        System.out.println("CALCULADORA RENDA FAMILIAR");
        System.out.println("---------------------------");

        // Tratamento de erro, para caso o usuario digite algo que nao seja números ele entrar no catch
        try{
            //Imprimindo na tela o pedido para inserir os valores e atribuiundo eles as variáveis.
            System.out.println("Por favor, insira o valor total de renda da sua família:");
            despesaFamiliar.rendaFamiliar = scan.nextDouble();

            System.out.println("Digite quantos moradores residem em sua Casa: ");
            despesaFamiliar.numeroDeMoradores = scan.nextInt();

            System.out.println("Digite o total a ser gasto na conta de Luz: ");
            despesaFamiliar.gastoComLuz = scan.nextDouble();

            System.out.println("Digite o total a ser gasto na conta de Água: ");
            despesaFamiliar.gastoComAgua = scan.nextDouble();

            System.out.println("Digite o total a ser gasto na conta de Internet: ");
            despesaFamiliar.gastoComInternet = scan.nextDouble();

            System.out.println("Insira o valor da mensalidade da Academia: ");
            despesaFamiliar.valorMensalidadeDaAcademia = scan.nextDouble();

            // Imprimindo o valor da Renda TOtal, Total de gastos e Renda Familiar liquida com Print Formatado:
            System.out.println("----------------------------------------------");
            System.out.printf("A Renda Total da família é de: R$ %.3f\nO total de gastos da família foi: R$ %.3f\nE a Renda Familiar Liquida foi: R$ %.3f\n",
                    despesaFamiliar.rendaFamiliar, despesaFamiliar.calcularTotalDeDespesas(), despesaFamiliar.calcularRendaFamiliarLiquida());
            System.out.println("----------------------------------------------");

        }catch (Exception e){
            System.out.println("Reinicie o programa e digite um número válido!");
        }



    }

}
