package com.bancodigital.demo;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;


@Service
public class OperacoesBancariasService {

    @Transactional
    public void depositar(Conta conta, double valor) {
        conta.depositar(valor);
    }

    @Transactional
    public void sacar(Conta conta, double valor) {
        conta.sacar(valor);
    }

    @Transactional
    public void transferir(Conta origem, Conta destino, double valor) {
        origem.transferir(destino, valor);
    }
}
