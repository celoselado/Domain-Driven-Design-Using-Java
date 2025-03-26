package br.com.fiap.ExemploRadio;

public class Radio {

    // Atributos
    public int volume;
    public float estacao;

    // Métodos
    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void trocarEstacao(float frequencia){
        estacao = frequencia;
    }

}
