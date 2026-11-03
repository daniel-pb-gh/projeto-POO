package com.POO.projeto;

import com.POO.projeto.model.Produto;
import com.POO.projeto.service.ProdutoService;
import corejava.Console;

import java.util.List;

public class PrincipalProduto
{
	public static void principal() {

        ProdutoService produtoService = new ProdutoService();

		String nome;
		double preco;
		Produto umProduto;

		boolean continua = true;
		while (continua) {
			System.out.println('\n' + "========================================================");
			System.out.println('\n' + "O que você deseja fazer?");
			System.out.println('\n' + "1. Cadastrar um produto");
			System.out.println("2. Alterar um produto");
			System.out.println("3. Remover um produto");
			System.out.println("4. Listar relação de produtos");
            System.out.println("5. Listar produtos ordenados por nome");
            System.out.println("6. Listar produtos ordenados por nome descendentemente");
			System.out.println("7. Voltar");

            int opcao = Console.readInt('\n' + "Digite um número entre 1 e 6:");

            switch (opcao) {
                case 1 -> {
                    nome = Console.readLine('\n' + "Digite o nome do produto: ");
                    preco = Console.readDouble("Digite o preço do produto: ");

                    Produto produto = new Produto(nome, preco);
                    produtoService.cadastrar(produto);

                    System.out.println("Produto cadastrado com sucesso!");
                }
                case 2 ->    // Alterar
                {
                    int numero = Console.readInt('\n' +
                            "Digite o número do produto que você deseja alterar: ");

                    umProduto = produtoService.recuperar(numero);

                    if (umProduto != null) {
                        System.out.println('\n' + "O que você deseja alterar?");
                        System.out.println('\n' + "1. Nome");
                        System.out.println("2. Preço");

                        int opcaoAlteracao = Console.readInt('\n' + "Digite 1 ou 2:");

                        switch (opcaoAlteracao) {
                            case 1 -> {
                                String novoNome = Console.readLine("Digite o novo nome: ");
                                umProduto.setNome(novoNome);
                                System.out.println('\n' + "Alteração de nome efetuada com sucesso!");
                            }
                            case 2 -> {
                                double novoLanceMinimo = Console.readDouble("Digite o novo preço: ");
                                umProduto.setPreco(novoLanceMinimo);
                                System.out.println('\n' + "Alteração do preço com sucesso!");
                            }
                            default -> System.out.println('\n' + "Opção inválida!");
                        }
                    } else {
                        System.out.println('\n' + "Produto não encontrado!");
                    }
                }
                case 3 ->    // Remover
                {
                    int numero = Console.readInt('\n' +
                            "Digite o número do produto que você deseja remover: ");

                    if (produtoService.remover(numero) != null)
                        System.out.println('\n' + "Produto removido com sucesso!");
                    else
                        System.out.println('\n' + "Produto não encontrado!");

                }
                case 4 -> {    // Listar tudo
                    if (produtoService.vazio())
                        System.out.println('\n' + "Não há produtos cadastrados.");
                    else {
                        for (Produto produto : produtoService.recuperarTodos()) {
                            System.out.println(produto);
                        }
                    }
                }
                case 5 -> {    // Ordenar por nome

                    if (produtoService.vazio())
                        System.out.println('\n' + "Não há produtos cadastrados.");
                    else {
                        List<Produto> produtos = produtoService.recuperarProdutosOrdenadosPorNome();
                        for (Produto produto : produtos) {
                            System.out.println(produto.toString());
                        }
                    }
                }
                case 6 -> {    // Ordenar por nome na ordem inversa

                    if (produtoService.vazio())
                        System.out.println('\n' + "Não há produtos na lista.");
                    else {
                        List<Produto> produtos = produtoService.recuperarProdutosOrdenadosDescendentementePorNome();
                        for (Produto produto : produtos) {
                            System.out.println(produto.toString());
                        }
                    }
                }
                case 7 ->    // Sair
                        continua = false;
                default -> System.out.println('\n' + "Opção inválida!");
            }
		}
	}
}