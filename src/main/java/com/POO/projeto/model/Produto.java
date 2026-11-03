package com.POO.projeto.model;

import com.POO.projeto.annotation.Id;

public class Produto {
	@Id
	private int Id;
	private String nome;
	private double preco;

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	public int getId() {
		return Id;
	}
	public String getNome()	{
		return nome;
	}

	@Override
	public String toString() {
		return "Produto{" +
				"Id=" + Id +
				", nome='" + nome + '\'' +
				", preco=" + preco +
				'}';
	}
	public double getPreco() {
		return preco;
	}
	private void setId(int Id) {
		this.Id = Id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}