package com.example.app.conta;

public class Gerente extends Funcionario implements Autenticavel{

	private String senha;
	private int qtdFuncionariosGerenciados;
	
	@Override
	public boolean login(String senha) {
		if(this.senha == senha) {
			System.out.println("Acesso autorizado!");
			return true;
		}
		System.out.println("Acesso negado!");
		return false;
	}
	
	// implementacao obrigatoria
	@Override
	public double getBonus() {
		return this.salario * 0.15 + 1000;
	}
	
	// sobreposicao total
	@Override
	public double getBonificacao() {
		return this.salario * 0.15;
	}
	
	// sobreposicao parcial
	@Override
	public double getPromocao() {
		return super.getPromocao() + 1000; // chama o m�todo da classe m�e
	}
	
	public Gerente() {
		super();
	}
	
	public Gerente(String nome, String cpf, double salario, String senha, int qtd) {
		super(nome, cpf, salario);
		this.senha = senha;
		this.qtdFuncionariosGerenciados = qtd;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getQtdFuncionariosGerenciados() {
		return qtdFuncionariosGerenciados;
	}

	public void setQtdFuncionariosGerenciados(int qtdFuncionariosGerenciados) {
		this.qtdFuncionariosGerenciados = qtdFuncionariosGerenciados;
	}
	
	public boolean verificaSenha(String senha) {
		if(this.senha == senha) {
			System.out.println("Acesso permitido!");
			return true;
		} else {
			System.out.println("Acesso negado!");
			return false;
		}
	}
}
