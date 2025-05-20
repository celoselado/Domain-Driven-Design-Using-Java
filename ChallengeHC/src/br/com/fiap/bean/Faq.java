package br.com.fiap.bean;

public class Faq extends Usuario {

    // Herança para puxar idUsuário da classe Usuario
    private String idFaq;
    private String dsPergunta;
    private String dsResposta;

    public String getIdFaq() {
        return idFaq;
    }

    public void setIdFaq(String idFaq) {
        this.idFaq = idFaq;
    }

    public String getDsPergunta() {
        return dsPergunta;
    }

    public void setDsPergunta(String dsPergunta) {
        this.dsPergunta = dsPergunta;
    }

    public String getDsResposta() {
        return dsResposta;
    }

    public void setDsResposta(String dsResposta) {
        this.dsResposta = dsResposta;
    }
}
