package br.com.fiap.JOptionPane;

import javax.swing.*;

public class CalculaIdadeJOption {
    public static void main(String[] args) {

        int ano, anoNasc, idade;
        String auxiliar;

        try {

            auxiliar = JOptionPane.showInputDialog("Digite o ano em que estamos: ");
            ano = Integer.parseInt(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Digite o ano em que você nasceu:");
            anoNasc = Integer.parseInt(auxiliar);

            idade = ano - anoNasc;

            JOptionPane.showMessageDialog(null, "Você tem "+idade+" anos!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Houve algum erro! Reinicie o programa e tente novamente inserindo numeros inteiros.");
        }

    }
}
