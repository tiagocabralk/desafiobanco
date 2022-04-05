package com.dio.diobank;

public interface Caixa {
    abstract void sacar(double valor);
    abstract void depositar(double valor);
    abstract void transferir(double valor, Conta contaDestino);
    abstract void extrato();
}
