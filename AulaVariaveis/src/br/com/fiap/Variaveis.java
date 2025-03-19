package br.com.fiap;

public class Variaveis {

    public static void main(String[] args) {

        //Constantes são valores que não podem e não vão ser alterados! Para que seja uma constante devemos
        //Colocar o "final" no inicio e sempre em maiusculo e se for composto temos que separar com _
        // ! Exemplo: "PI" e não "pi".
        final double PI = 3.14;
        final float GRAVIDADE_TERRESTE = 9.8f;

        char sexo = 'M'; // Diferente da string, para declarar com o char temos que usar a aspas simples.
        byte idade = 35;
        short codigo = 15635;
        int alunos = 50, classes = 11; //Podemos criar 2 variáveis na mesma linha! Exemplo: Alunos 50, Classes 11.
        long brasileiros = 216535103700L; //Para declarar como Long precisamos colocar "L" no final do valor.
        float media = 8.55f; //Assim como o long, para declarar como Float, precisamos colocar "f" no final.
        double dolar = 5.68;
        boolean verifica =  false;
        String nomeCompleto = "Marcelo Alexandre dos Santos"; // Para usar String, deve-se prestar atenção que a declaração começa com S maiúsculo.

        System.out.println("Sexo: "+sexo);
        System.out.println("Código: "+codigo+" Alunos: "+alunos+" Classes: "+classes+" Média: "+media);
        System.out.println("Habitantes: "+brasileiros+" Cotação do dólas: U$"+dolar+" Alternativa: "+verifica);
        System.out.println("Nome: "+nomeCompleto);
        System.out.println("Valor de PI: "+PI+"\nA gravidade da terra é: "+GRAVIDADE_TERRESTE);
        //Acima temos o \n para pular para a linha de baixo! Dessa forma nao precisamos criar outro sout.






    }

}
