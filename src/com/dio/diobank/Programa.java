package com.dio.diobank;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Tiago");

        Conta cc = new Corrente(cliente1);

        cc.depositar(200.00);
        cc.extrato();

        Conta cp = new Poupanca(cliente1);

        cp.depositar(550.80);
        cp.extrato();
        cc.transferir(150,cp);
        cp.extrato();
        cc.extrato();


    }
}
