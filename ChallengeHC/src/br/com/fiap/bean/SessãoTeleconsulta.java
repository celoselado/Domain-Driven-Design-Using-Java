package br.com.fiap.bean;

import java.util.Date;

public class SessãoTeleconsulta {

    //Precisa de herança para puxar idPaciente / idProfissional
    private String idSessao;
    private Date dtDisponivel;
    private Date dtHoraAgendado;
    private  String dsLinkVideoConferencia;
    private char stStatus;

    public Date getDtHoraAgendado() {
        return dtHoraAgendado;
    }

    public void setDtHoraAgendado(Date dtHoraAgendado) {
        this.dtHoraAgendado = dtHoraAgendado;
    }

    public Date getDtDisponivel() {
        return dtDisponivel;
    }

    public void setDtDisponivel(Date dtDisponivel) {
        this.dtDisponivel = dtDisponivel;
    }

    public String getIdSessao() {
        return idSessao;
    }

    public void setIdSessao(String idSessao) {
        this.idSessao = idSessao;
    }

    public String getDsLinkVideoConferencia() {
        return dsLinkVideoConferencia;
    }

    public void setDsLinkVideoConferencia(String dsLinkVideoConferencia) {
        this.dsLinkVideoConferencia = dsLinkVideoConferencia;
    }

    public char getStStatus() {
        return stStatus;
    }

    public void setStStatus(char stStatus) {
        this.stStatus = stStatus;
    }
}
