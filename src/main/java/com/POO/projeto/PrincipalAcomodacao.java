package com.POO.projeto;

import com.POO.projeto.model.Acomodacao;
import com.POO.projeto.service.AcomodacaoService;
import corejava.Console;

import java.util.List;

public class PrincipalAcomodacao {
    public static void principal() {
        AcomodacaoService acomodacaoService = new AcomodacaoService();

        Integer numeroDoQuarto;
        double preco;
        Acomodacao umaAcomodacao;

        boolean continua = true;
        while (continua) {
            System.out.println('\n' + "========================================================");
            System.out.println('\n' + "O que você deseja fazer?");
            System.out.println('\n' + "1. Cadastrar uma Acomodação");
            System.out.println("2. Alterar uma Acomodação");
            System.out.println("3. Listar todas as Acomodações");
            System.out.println("4. Voltar");

            int opcao = Console.readInt('\n' + "Digite um número entre 1 e 6:");

            switch (opcao) {
                case 1 -> {
                    numeroDoQuarto = Console.readInt('\n' + "Digite o número da Acomodação: ");
                    preco = Console.readDouble("Digite o preço da Acomodação: ");

                    Acomodacao acomodacao = new Acomodacao(numeroDoQuarto, preco);
                    acomodacaoService.cadastrar(acomodacao);

                    System.out.println("Acomodação cadastrada com sucesso!");
                }
                case 2 ->
                {
                    numeroDoQuarto = Console.readInt('\n' +
                            "Digite o numero da Acomodação que deseja alterar: ");

                    umaAcomodacao = acomodacaoService.recuperar(numeroDoQuarto);

                    if (umaAcomodacao != null){
                        System.out.println('\n' + "O que você deseja alterar?");
                        System.out.println('\n' + "1. Numero da Acomodação");
                        System.out.println("2. Preço da Acomodação");

                        int opcaoAlteracao = Console.readInt('\n' + "Digite 1 ou 2: ");

                        switch (opcaoAlteracao){
                            case 1 -> {
                                Integer novoNumero = Console.readInt("Digite o novo número da Acomodação: ");
                                umaAcomodacao.setNumeroDoQuarto(novoNumero);
                                System.out.println('\n' + "Alteração do número da Acomodação realizada com sucesso!");
                            }
                            case 2 -> {
                                double novoPreco = Console.readDouble("Digite o novo Preço da Acomodação: ");
                                umaAcomodacao.setPreco(novoPreco);
                                System.out.println('\n' + "Alteração de lance mínimo efetuada com sucesso!");
                            }
                            default -> System.out.println('\n' + "Opção inválida!");
                        }

                    } else {
                        System.out.println('\n' + "Acomodação não encontrada!");
                    }
                }
                case 3 -> {
                    if (acomodacaoService.vazio())
                        System.out.println('\n' + "Não há acomodações cadastradas.");
                    else {
                        List<Acomodacao> lista = acomodacaoService.recuperarTodos();
                        for (Acomodacao acomodacao : lista) {
                            System.out.println(acomodacao.toString());
                        }
                    }
                }
                case 4 ->
                    continua = false;
                default -> System.out.println('\n' + "Opção inválida");

            }
        }
    }
}