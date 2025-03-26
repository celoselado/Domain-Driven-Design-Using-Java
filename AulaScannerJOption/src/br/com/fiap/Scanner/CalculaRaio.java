package br.com.fiap.Scanner;

import java.util.Scanner;

public class CalculaRaio {
    public static void main(String[] args) {

        final float PI = 3.14f;
        float raio, area;

        Scanner scan;

        try {

            scan = new Scanner(System.in);
            System.out.print("Digite o valor do raio do círculo: ");
            raio = scan.nextFloat();

            area = (raio * raio) * PI;

            System.out.println("A área do circulo é igual a: "+ area);

        } catch (Exception e) {
            System.out.println("Houve um erro! Reinicie o programa e digite o raio corretamente.");
        }


    }
}
