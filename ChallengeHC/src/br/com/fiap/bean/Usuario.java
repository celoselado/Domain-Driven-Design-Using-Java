package br.com.fiap.bean;

public class Usuario {

    private String idUsuario;
    private String dsLogin;
    private String csAcessoTemporario;
    private String dtExpiracaoCodigo;
    private String dsFotoPerfil;
    private String stPreferencialLogin;

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getDsLogin() {
        return dsLogin;
    }

    public void setDsLogin(String dsLogin) {
        this.dsLogin = dsLogin;
    }

    public String getCsAcessoTemporario() {
        return csAcessoTemporario;
    }

    public void setCsAcessoTemporario(String csAcessoTemporario) {
        this.csAcessoTemporario = csAcessoTemporario;
    }

    public String getDtExpiracaoCodigo() {
        return dtExpiracaoCodigo;
    }

    public void setDtExpiracaoCodigo(String dtExpiracaoCodigo) {
        this.dtExpiracaoCodigo = dtExpiracaoCodigo;
    }

    public String getStPreferencialLogin() {
        return stPreferencialLogin;
    }

    public void setStPreferencialLogin(String stPreferencialLogin) {
        this.stPreferencialLogin = stPreferencialLogin;
    }

    public String getDsFotoPerfil() {
        return dsFotoPerfil;
    }

    public void setDsFotoPerfil(String dsFotoPerfil) {
        this.dsFotoPerfil = dsFotoPerfil;
    }
}
