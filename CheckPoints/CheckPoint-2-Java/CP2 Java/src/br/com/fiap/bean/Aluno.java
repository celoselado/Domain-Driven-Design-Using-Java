package br.com.fiap.bean;

import java.time.LocalDate;

// RM: 565465 - Nome: Marcelo Alexandre dos Santos
// RM: 565321 - Poliana Batista Sarmento
// RM: 552417 - Leonardo Rodrigues Martins
// RM: 564538 - Aline Lourenço Carvalho

public class Aluno {

    // Declaração de Atributos
    private int regristroMatricula;
    private String nomeCompleto;
    private int anoDeNascimento;


    // Criando construtores (Vazio e com parametros) Parte da Aline
    public Aluno() {
    }

    public Aluno(int regristroMatricula, String nomeCompleto, int anoDeNascimento) {
        this.regristroMatricula = regristroMatricula;
        this.nomeCompleto = nomeCompleto;
        this.anoDeNascimento = anoDeNascimento;
    }


    // Criando Getters e Setters - Parte da Aline
    public int getRegristroMatricula() {
        return regristroMatricula;
    }

    public void setRegristroMatricula(int regristroMatricula) {

        try {
            if (regristroMatricula >= 80000 && regristroMatricula <= 599999){
                this.regristroMatricula = regristroMatricula;
            } else{
                throw new Exception("Insira um Número de Matricula (RM) maior/igual do que 80000 e menor/igual do que 599999");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(int anoDeNascimento) {
        LocalDate dataAtual = LocalDate.now();

        try {
            if (anoDeNascimento >= 1945 && anoDeNascimento <= dataAtual.getYear()){
                this.anoDeNascimento = anoDeNascimento;
            } else {
                throw new Exception("Valor inválido! Digite um Ano de Nascimento maior/igual do que 1945 e menor/igual do que o ano atual!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    // Criando metodo calcularIdade usando o objeto dataAtual - Parte da Poli
    public int calcularIdade(LocalDate dataAtual) {
        int idadeAluno;
        idadeAluno = dataAtual.getYear() - getAnoDeNascimento();

        return idadeAluno;
    }

}
