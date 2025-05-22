package br.com.fiap.main;

import br.com.fiap.bean.Aluno;

import javax.swing.*;
import java.time.LocalDate;

// RM: 565465 - Marcelo Alexandre dos Santos
// RM: 565321 - Poliana Batista Sarmento
// RM: 552417 - Leonardo Rodrigues Martins
// RM: 564538 - Aline Lourenço Carvalho

public class MainAluno {

    public static void main(String[] args) {

        // Declarando e instanciando 4 objetos a partir da classe Aluno, sendo 2 deles com os parametros
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno(565465, "Marcelo Alexandre dos Santos", 2003);
        Aluno aluno4 = new Aluno(565321, "Poliana Batista Sarmento", 2002);
        LocalDate anoAtual = LocalDate.now();

        // Atribuindo valores a todos os objetos
        aluno1.setNomeCompleto("Aline Lourenço Carvalho");
        aluno1.setRegristroMatricula(564538);
        aluno1.setAnoDeNascimento(1998);

        aluno2.setNomeCompleto("Leonardo Rodrigues Martins");
        aluno2.setRegristroMatricula(552417);
        aluno2.setAnoDeNascimento(2003);

        // Declarando variáveis auxiliares e o Ano sendo armazenado com o objeto anoAtual da classe LocalDate
        String auxiliar;
        int auxiliarRM, auxiliarAnoNasc, idadeAluno1 ,idadeAluno2;

        // Usando o Try para prevenir erros do usuario
        try {
            auxiliar = JOptionPane.showInputDialog("Digite o nome do Aluno 1: ");
            aluno1.setNomeCompleto(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Digite o RM do Aluno 1: ");
            auxiliarRM = Integer.parseInt(auxiliar);
            aluno1.setRegristroMatricula(auxiliarRM);

            auxiliar = JOptionPane.showInputDialog("Digite o Ano de Nascimento do Aluno 1: ");
            auxiliarAnoNasc = Integer.parseInt(auxiliar);
            aluno1.setAnoDeNascimento(auxiliarAnoNasc);

            auxiliar = JOptionPane.showInputDialog("Digite o nome do Aluno 2: ");
            aluno2.setNomeCompleto(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Digite o RM do Aluno 2: ");
            auxiliarRM = Integer.parseInt(auxiliar);
            aluno2.setRegristroMatricula(auxiliarRM);

            auxiliar = JOptionPane.showInputDialog("Digite o Ano de Nascimento do Aluno 2: ");
            auxiliarAnoNasc = Integer.parseInt(auxiliar);
            aluno2.setAnoDeNascimento(auxiliarAnoNasc);

            // Criando o Printformatado com JOPtionPane
            String mensagemAlunos = String.format("Aluno 1: %s \nRM: %d \nIdade: %d \n\nAluno 2: %s \nRM: %d \nIdade: %d \n\nAluno 3: %s \nRM: %d \nIdade: %d \n\nAluno 4: %s \nRM: %d \nIdade: %d"
                    ,aluno1.getNomeCompleto(), aluno1.getRegristroMatricula(), aluno1.calcularIdade(anoAtual),aluno2.getNomeCompleto(), aluno2.getRegristroMatricula(),
                    aluno2.calcularIdade(anoAtual),aluno3.getNomeCompleto(), aluno3.getRegristroMatricula(), aluno3.calcularIdade(anoAtual),aluno4.getNomeCompleto(), aluno4.getRegristroMatricula(),
                    aluno4.calcularIdade(anoAtual));
            JOptionPane.showMessageDialog(null, mensagemAlunos);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "RM ou Ano de Nascimento inválido! Digite novamente");
        }






    }

}
