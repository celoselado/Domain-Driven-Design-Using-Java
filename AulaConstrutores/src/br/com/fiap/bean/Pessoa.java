package br.com.fiap.bean;

import java.time.LocalDate;

public class Pessoa {

    // atributos
    private String nome;
    private int anoNascimento;

    //construtores
    public Pessoa() {

    }
    public Pessoa(String nome, int anoNascimento) {
        this.nome = nome;
        setAnoNascimento(anoNascimento);
    }

    //getters/setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        LocalDate dataAtual = LocalDate.now();

        try {
            if (anoNascimento >= 1900 && anoNascimento <= dataAtual.getYear()){
                this.anoNascimento = anoNascimento;
            } else{
                throw new Exception("Valor inválido! (Minimo: 1900 / Maximo: Ano atual)");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //metodos
    public int calcularIdade(int anoAtual){
        return anoAtual - anoNascimento;
    }

}
