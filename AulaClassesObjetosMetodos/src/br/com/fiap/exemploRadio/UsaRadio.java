package br.com.fiap.exemploRadio;

public class UsaRadio {

    public static void main(String[] args) {

        Radio radio1 = new Radio(); // Declaração e instanciação do objeto! (Ele passa a existir)

        radio1.estacao = 54.3f; // Declarando o valor do atributo estação
        radio1.volume = 6; // Declarando o valor do atributo volume

        radio1.trocarEstacao(91.3f); // Usando o metodo trocar volume. Entre parenteses passamos o parametro (nesse caso a frequencia obs: olhar a calsse radio)
        radio1.aumentarVolume(); // Usamos o metodo de aumentar o volume! Ele vai subir +1 no valor que declaramos ao volume ali em cima
        radio1.aumentarVolume();

        // Mostrando o valor que ficou volume (Apos usar o metodos 2 vezes) e a estação atual (Apos alterar usando o metodo)
        System.out.println("Volume atual: " + radio1.volume + "\nEstação atual: "+radio1.estacao);

    }

}
