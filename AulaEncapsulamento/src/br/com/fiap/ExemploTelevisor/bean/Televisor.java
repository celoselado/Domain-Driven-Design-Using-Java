package br.fiap.com.bean;

public class Televisor {
    //Atributos
    private int volume;
    private int canal;

    //Getter e Setters


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        try {
            if (volume > 0 && volume <= 20){
                this.volume = volume;
            } else {
                throw new Exception("Você inseriu um volume inválido!");
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        try {
            if (canal == 2 || canal == 4 || canal == 5 || canal == 7 || canal == 13 ){
                this.canal = canal;
            } else {
                throw new Exception("Canais aceitos: 2, 4, 5, 7 ou 13.");
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }

    public void aumentarVolume(){
        if (volume > 0 && volume < 20){
            volume++;
        }
    }

    public void diminuirVolume(){
        if (volume > 0 && volume <= 20){
            volume--;
        }
    }

}
