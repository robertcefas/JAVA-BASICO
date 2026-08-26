package org.example.Banco;

public class Conta {
    private String banco;
    private int agencia;
    private String numeroDeConta;
    private String tipoDeConta;
    private Double saldoAtual;
    private String limiteDisponivel;

    public Conta(String banco, int agencia, String numeroDeConta, String tipoDeConta, Double saldoAtual, String limiteDisponivel) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroDeConta = numeroDeConta;
        this.tipoDeConta = tipoDeConta;
        this.saldoAtual = saldoAtual;
        this.limiteDisponivel = limiteDisponivel;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getNumeroDeConta() {
        return numeroDeConta;
    }

    public void setNumeroDeConta(String numeroDeConta) {
        this.numeroDeConta = numeroDeConta;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public Double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(Double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public String getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(String limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "banco='" + banco + '\'' +
                ", agencia=" + agencia +
                ", numeroDeConta='" + numeroDeConta + '\'' +
                ", tipoDeConta='" + tipoDeConta + '\'' +
                ", saldoAtual=" + saldoAtual +
                ", limiteDisponivel='" + limiteDisponivel + '\'' +
                '}';
    }
}



