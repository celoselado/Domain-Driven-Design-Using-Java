package br.com.fiap.JOption;

import javax.swing.*;

public class EntradaComJanelas {

    public static void main(String[] args) {

        int num1, num2, result;
        String auxiliar;

        try{

            auxiliar = JOptionPane.showInputDialog("Digite um numero inteiro: "); // Usamos o auxiliar (Variavel String) porque esse metódo (JOption) nao funciona com variaveis além do String.

            num1 = Integer.parseInt(auxiliar); // Convertendo o Auxiliar (que foi declarado como String) para int

            auxiliar = JOptionPane.showInputDialog("Digite o segundo numero inteiro: ");
            num2 = Integer.parseInt(auxiliar);

            result = num1 + num2;

            //Método para mostrar uma mensagem em janela! Precisamos passar o "Null" como primeiro parametro.
            JOptionPane.showMessageDialog(null,"Valor 1: "+num1+"\nValor 2: "+num2+"\nSoma dos valores: "+result);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Formato de número incorreto! Digite números inteiros");
        }

    }

}
