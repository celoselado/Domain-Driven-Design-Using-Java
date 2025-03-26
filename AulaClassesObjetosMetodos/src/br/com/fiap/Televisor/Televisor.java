package br.com.fiap.Televisor;

public class Televisor {

    public int volume;
    public int canal;

    public void  aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void trocarCanal(int novoCanal) {
        canal = novoCanal;
    }

}
