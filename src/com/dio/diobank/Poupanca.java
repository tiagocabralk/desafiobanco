package com.dio.diobank;

public class Poupanca extends Conta{

    public Poupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extrato() {
        System.out.println("===== Extrato Poupança =====");
        super.buscarExtrato();
    }
}
