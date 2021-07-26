package com.example.app.conta;

/*
 * 1 - nao tem instancias
 * 2 - deve ter pelo menos 1 metodo abstrato
 * 3 - apenas para ser herdada, super classe 
 * 4 - classes finais nao podem ser herdada
 * 5 - quem herda possui as mesmas hierarquias e padrões
 */
public abstract class Funcionario {
	
	protected String nome;
	protected String cpf;
	protected double salario;
	
	// somente em classes abstratas
	// metodos nao pode ser implementado
	// deve ser implementado na classe filho
	public abstract double getBonus();
	
	public double getBonificacao() {
		return this.salario * 0.10;
	}
	
	public double getPromocao() {
		return this.salario * 0.05;
	}
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}

