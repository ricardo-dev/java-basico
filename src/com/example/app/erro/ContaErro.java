package com.example.app.erro;

/**
 * 
 * @author ricardo
 *
 */
public class ContaErro {
	
	public void sacar(double valor) {
		if(valor <= 0.00) {
			throw new MeuErroHandleException("Saldo insuficiente");
		}
		System.out.println("Saque realizado com sucesso!");
	}
	
	public void deposito() {
		
	}
}
