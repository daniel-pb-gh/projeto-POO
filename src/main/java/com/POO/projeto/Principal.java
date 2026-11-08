package com.POO.projeto;

import corejava.Console;

public class Principal {
    public static void main(String[] args) {

        boolean continua = true;
        while (continua) {
            System.out.println('\n' + "========================================================");
            System.out.println('\n' + "O que você deseja fazer?");
            System.out.println('\n' + "1. Tratar Produtos");
            System.out.println("2. Tratar Acomodações");
            System.out.println("3. Tratar Clientes");
            System.out.println("4. Sair");

            int opcao = Console.readInt('\n' + "Digite um número entre 1 e 4:");

            System.out.println();

            switch (opcao) {
                case 1 -> PrincipalProduto.principal();
                case 2 -> PrincipalAcomodacao.principal();
                case 3 -> PrincipalCliente.principal();
                case 4 -> continua = false;
                default -> System.out.println('\n' + "Opção inválida!");
            }
        }
    }
}
