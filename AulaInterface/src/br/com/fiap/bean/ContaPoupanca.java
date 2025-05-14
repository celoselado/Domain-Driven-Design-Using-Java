package br.com.fiap.bean;

/**
 * Classe para objetos do tipo ContaPoupança
 * @author Marcelo Alexandre
 * @version 1.0
 */
public class ContaPoupanca implements ContaBancaria {

    //atributos
    private int numConta;
    private float saldo;

    //construtores
    public ContaPoupanca(){

    }

    //Metodos getters/setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    //Metodo da classe (particularidades)

    /**
     * Metodo sacar que permite sacar o valor informado.
     * Valor a ser sacado nao pode ser superior ao valor do saldo atual
     * @author Marcelo Alexandre
     * @param valor - valor a ser sacado
     * @return float - valor do saldo atual apos o saque
     */
    public float sacar(float valor) {
        try {
            if ( valor <= saldo) {
                saldo -= valor; // saldo = saldo - valor (simplificado)
            } else {
                throw new Exception("Saldo insuficiente!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return saldo;
    }

    /**
     * Metodo depositar que permite depositar o valor informado
     * @author Marcelo Alexandre
     * @param valor - valor indicado para ser depositado
     * @return float - valor do saldo após o deposito
     */
    public float depositar(float valor) {
        saldo += valor; // saldo = saldo + valor (simplificado)
        return saldo;
    }

}
