package br.com.fiap.JOption;

import javax.swing.*;

public class MediaAritmeticaJOption {
    public static void main(String[] args) {

        float prova1, prova2, prova3, prova4, media;
        String auxiliar;

        try {

            auxiliar = JOptionPane.showInputDialog("Digite o resultado da prova 1: ");
            prova1 = Float.parseFloat(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Digite o resultado da prova 2: ");
            prova2 = Float.parseFloat(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Digite o resultado da prova 3: ");
            prova3 = Float.parseFloat(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Digite o resultado da prova 4: ");
            prova4 = Float.parseFloat(auxiliar);

            media = (prova1 + prova2 + prova3 + prova4) / 4;

            JOptionPane.showMessageDialog(null, "A média retirada do resultado das 4 provas foi de: "+media);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve algum erro! Reinicie o programa e tente novamente.");
        }
    }
}
