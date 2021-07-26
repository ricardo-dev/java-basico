package com.example.app.conta;

public class Conta {
	
	private int numero;
	private Cliente cliente;
	private double saldo;
	private double limite;
	
	// metodo / atributo da classe
	private static int qtdContas = 0;
	
	public Conta() {
		Conta.qtdContas += 1;
	}
	
	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if(this.saldo < valor) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}
	
	public boolean transfere(Conta destino, double valor) {
		if(this.sacar(valor)) {
			destino.deposito(valor);
			System.out.println("Transferencia autorizada!");
			return true;
		} else {
			System.out.println("Transferencia n�o autorizada!");
			return false;
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public static int getContas() {
		return Conta.qtdContas;
	}
}