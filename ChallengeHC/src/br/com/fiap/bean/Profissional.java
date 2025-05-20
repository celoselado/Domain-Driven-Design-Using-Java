package br.com.fiap.bean;

public class Profissional extends Usuario {

    // Herança para puxar o idUsuario da classe Usuario
    private String idProfissional;
    private String nmCompleto;
    private String dsEspecialidade;

    public String getIdProfissional() {
        return idProfissional;
    }

    public void setIdProfissional(String idProfissional) {
        this.idProfissional = idProfissional;
    }

    public String getNmCompleto() {
        return nmCompleto;
    }

    public void setNmCompleto(String nmCompleto) {
        this.nmCompleto = nmCompleto;
    }

    public String getDsEspecialidade() {
        return dsEspecialidade;
    }

    public void setDsEspecialidade(String dsEspecialidade) {
        this.dsEspecialidade = dsEspecialidade;
    }
}
