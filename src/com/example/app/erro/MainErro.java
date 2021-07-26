package com.example.app.erro;

public class MainErro {

	public static void main(String[] args) throws MeuErroHandleException {
		
		teste2();

	}
	
	public static void teste1() throws MeuErroHandleException {
		ContaErro ce = new ContaErro();
		ce.sacar(-1.00);
	}
	
	public static void teste2() {
		ContaErro ce = new ContaErro();
		try {
			ce.sacar(-1.00);
		} catch(MeuErroHandleException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Terminou!");
		}
	}
	
}
