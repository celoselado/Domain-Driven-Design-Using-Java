package br.com.fiap.JOption;

import javax.swing.*;

public class CalculaRaioJOption {
    public static void main(String[] args) {

        final float pi = 3.14f;
        float raio, area;
        String auxiliar;

        try {

            auxiliar = JOptionPane.showInputDialog("Digite o raio do circulo: ");
            raio = Float.parseFloat(auxiliar);

            area = (raio * raio) * pi;

            JOptionPane.showMessageDialog(null, "A área do circulo é de: "+area);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ocorreu um erro! Reinicie o programa e reinsira as informações corretamente.");
        }

    }
}
