package br.com.fiap.bean;

import java.util.Date;

public class Paciente extends Usuario{

    // Herança para puxar o idUsuario da classe Usuario
    private String idPaciente;
    private String nmCompleto;
    private Date dtNascimento;
    private String nrCpf;
    private char dsSexoBiologico;
    private String dsEstadoCivil;

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNmCompleto() {
        return nmCompleto;
    }

    public void setNmCompleto(String nmCompleto) {
        this.nmCompleto = nmCompleto;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getNrCpf() {
        return nrCpf;
    }

    public void setNrCpf(String nrCpf) {
        this.nrCpf = nrCpf;
    }

    public char getDsSexoBiologico() {
        return dsSexoBiologico;
    }

    public void setDsSexoBiologico(char dsSexoBiologico) {
        this.dsSexoBiologico = dsSexoBiologico;
    }

    public String getDsEstadoCivil() {
        return dsEstadoCivil;
    }

    public void setDsEstadoCivil(String dsEstadoCivil) {
        this.dsEstadoCivil = dsEstadoCivil;
    }

    public void cadastrarPaciente(){

    }

}



