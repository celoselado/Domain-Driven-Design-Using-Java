package br.com.fiap.bean;

public class Email extends Paciente{

    // Herança para puxar o idPaciente da classe Paciente
    private String idEmail;
    private String dsEmail;

    public String getDsEmail() {
        return dsEmail;
    }

    public void setDsEmail(String dsEmail) {
        this.dsEmail = dsEmail;
    }

    public String getIdEmail() {
        return idEmail;
    }

    public void setIdEmail(String idEmail) {
        this.idEmail = idEmail;
    }
}
