package com.POO.projeto;

import com.POO.projeto.model.Cliente;
import com.POO.projeto.service.ClienteService;
import corejava.Console;

import java.util.List;

public class PrincipalCliente
{
    public static void principal() {

        ClienteService clienteService = new ClienteService();

        String nome;
        String endereco;
        String email;
        Cliente umCliente;

        boolean continua = true;
        while (continua) {
            System.out.println('\n' + "========================================================");
            System.out.println('\n' + "O que você deseja fazer?");
            System.out.println('\n' + "1. Cadastrar um cliente");
            System.out.println("2. Alterar um cliente");
            System.out.println("3. Remover um cliente");
            System.out.println("4. Listar relação de clientes");
            System.out.println("5. Listar clientes ordenados por nome");
            System.out.println("6. Buscar cliente por e-mail");
            System.out.println("7. Voltar");

            int opcao = Console.readInt('\n' + "Digite um número entre 1 e 7:");

            switch (opcao) {
                case 1 -> {    // Cadastrar
                    nome = Console.readLine('\n' + "Digite o nome completo do cliente: ");
                    endereco = Console.readLine("Digite o endereço do cliente: ");
                    email = Console.readLine("Digite o e-mail do cliente: ");

                    Cliente cliente = new Cliente(nome, endereco, email);

                    if (clienteService.cadastrar(cliente) != null)
                        System.out.println('\n' + "Cliente cadastrado com sucesso!");
                    else
                        System.out.println('\n' + "Já existe um cliente com esse e-mail!");
                }
                case 2 ->    // Alterar
                {
                    int numero = Console.readInt('\n' +
                            "Digite o número do cliente que você deseja alterar: ");

                    umCliente = clienteService.recuperar(numero);

                    if (umCliente != null) {
                        System.out.println('\n' + "O que você deseja alterar?");
                        System.out.println('\n' + "1. Nome");
                        System.out.println("2. Endereço");
                        System.out.println("3. E-mail");

                        int opcaoAlteracao = Console.readInt('\n' + "Digite 1, 2 ou 3:");

                        switch (opcaoAlteracao) {
                            case 1 -> {
                                String novoNome = Console.readLine("Digite o novo nome: ");
                                umCliente.setNomeCompleto(novoNome);
                                System.out.println('\n' + "Alteração de nome efetuada com sucesso!");
                            }
                            case 2 -> {
                                String novoEndereco = Console.readLine("Digite o novo endereço: ");
                                umCliente.setEndereco(novoEndereco);
                                System.out.println('\n' + "Alteração de endereço efetuada com sucesso!");
                            }
                            case 3 -> {
                                String novoEmail = Console.readLine("Digite o novo e-mail: ");
                                Cliente outro = clienteService.recuperarClientePorEmail(novoEmail);
                                if (outro != null && outro != umCliente) {
                                    System.out.println('\n' + "Já existe um cliente com esse e-mail!");
                                } else {
                                    umCliente.setEmail(novoEmail);
                                    System.out.println('\n' + "Alteração de e-mail efetuada com sucesso!");
                                }
                            }
                            default -> System.out.println('\n' + "Opção inválida!");
                        }
                    } else {
                        System.out.println('\n' + "Cliente não encontrado!");
                    }
                }
                case 3 ->    // Remover
                {
                    int numero = Console.readInt('\n' +
                            "Digite o número do cliente que você deseja remover: ");

                    if (clienteService.remover(numero) != null)
                        System.out.println('\n' + "Cliente removido com sucesso!");
                    else
                        System.out.println('\n' + "Cliente não encontrado!");
                }
                case 4 -> {    // Listar tudo
                    if (clienteService.vazio())
                        System.out.println('\n' + "Não há clientes cadastrados.");
                    else {
                        for (Cliente cliente : clienteService.recuperarTodos()) {
                            System.out.println(cliente);
                        }
                    }
                }
                case 5 -> {    // Ordenar por nome
                    if (clienteService.vazio())
                        System.out.println('\n' + "Não há clientes cadastrados.");
                    else {
                        List<Cliente> clientes = clienteService.recuperarClientesOrdenadosPorNome();
                        for (Cliente cliente : clientes) {
                            System.out.println(cliente);
                        }
                    }
                }
                case 6 -> {    // Buscar por e-mail
                    email = Console.readLine('\n' + "Digite o e-mail do cliente: ");
                    umCliente = clienteService.recuperarClientePorEmail(email);

                    if (umCliente != null)
                        System.out.println(umCliente);
                    else
                        System.out.println('\n' + "Cliente não encontrado!");
                }
                case 7 ->    // Voltar
                        continua = false;
                default -> System.out.println('\n' + "Opção inválida!");
            }
        }
    }
}
