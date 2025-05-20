package br.com.fiap.bean;

public class Contato extends Paciente{

    //Herança para puxar idPaciente da classe Paciente
    private String idContato;
    private String nmCompleto;
    private String dsParentesco;

    public String getIdContato() {
        return idContato;
    }

    public void setIdContato(String idContato) {
        this.idContato = idContato;
    }

    @Override
    public String getNmCompleto() {
        return nmCompleto;
    }

    @Override
    public void setNmCompleto(String nmCompleto) {
        this.nmCompleto = nmCompleto;
    }

    public String getDsParentesco() {
        return dsParentesco;
    }

    public void setDsParentesco(String dsParentesco) {
        this.dsParentesco = dsParentesco;
    }
}
