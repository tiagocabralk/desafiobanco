package com.dio.diobank;

public class Corrente extends Conta{

    public Corrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extrato() {
        System.out.println("===== Extrato Corrente =====");
        super.buscarExtrato();
    }
}
