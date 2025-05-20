package br.com.fiap.bean;

public class Telefone {

    //Precisa de herança puxando idPaciente da classe Paciente e idContato da classe Contato
    private String idTelefone;
    private int ddi;
    private int ddd;
    private int stPrincipal;

    public String getIdTelefone() {
        return idTelefone;
    }

    public void setIdTelefone(String idTelefone) {
        this.idTelefone = idTelefone;
    }

    public int getDdi() {
        return ddi;
    }

    public void setDdi(int ddi) {
        this.ddi = ddi;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getStPrincipal() {
        return stPrincipal;
    }

    public void setStPrincipal(int stPrincipal) {
        this.stPrincipal = stPrincipal;
    }
}
