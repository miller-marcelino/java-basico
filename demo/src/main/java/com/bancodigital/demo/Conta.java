package com.bancodigital.demo;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public abstract class Conta {
    private String numeroConta;
    private double saldo;

    public Conta(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso. Novo saldo: R$ " + this.saldo);
    }

    public abstract void sacar(double valor);

    public abstract void transferir(Conta destino, double valor);
}


