package com.example.app.conta;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("\n#############");
		testeConta();
		
		System.out.println("\n#############");
		testeDuasContas();
		
		System.out.println("\n#############");
		testeGerente();

	}
	
	public static void testeConta() {
		Conta c1 = new Conta();
		Cliente cc1 = new Cliente();
		cc1.setNome("Ricardo Santos");
		cc1.setCpf("xxx.xxx.xxx-xx");
		
		c1.setNumero(1234432);
		c1.setCliente(cc1);
		c1.setSaldo(850.00);
		c1.setLimite(850.00);
		
		String teste = "*";
		
		print("Nome: "+c1.getCliente().getNome()+ " Saldo: R$ "+c1.getSaldo());
		
		if(c1.sacar(400)) {
			print("Saque autorizado!");
		} else {
			print("Saque não autorizado!");
		}
		
		print("Nome: "+c1.getCliente().getNome()+ " Saldo: R$ "+c1.getSaldo());
		
		c1.deposito(100);
		
		print("Nome: "+c1.getCliente().getNome()+ " Saldo: R$ "+c1.getSaldo());

	}
	
	public static void testeDuasContas() {
		Conta c1 = new Conta();
		c1.setCliente(new Cliente("Rick", "yyy.yyy.yyy-yy"));
		c1.setNumero(1234432);
		c1.setSaldo(850.00);
		c1.setLimite(850.00);
		
		print("Total de contas: "+ Conta.getContas());
		
		Conta c2 = new Conta();
		c2.setCliente( new Cliente("Kety", "zzz.zzz.zzz-zz"));
		c2.setNumero(12344321);
		c2.setSaldo(950.00);
		c2.setLimite(950.00);
		
		// acesso static
		print("Total de contas: "+ Conta.getContas());
		
		print("Nome: "+c1.getCliente().getNome()+ " Saldo: R$ "+c1.getSaldo());
		print("Nome: "+c2.getCliente().getNome()+ " Saldo: R$ "+c2.getSaldo());
		
		c1.transfere(c2, 500);
		
		print("Nome: "+c1.getCliente().getNome()+ " Saldo: R$ "+c1.getSaldo());
		print("Nome: "+c2.getCliente().getNome()+ " Saldo: R$ "+c2.getSaldo());
	}
	
	/*
	public static void testaFuncionario() {
		Funcionario f1 = new Funcionario();
		f1.setNome("Aquiles");
		f1.setCpf("yyy.yyy.yyy-yy");
		f1.setSalario(3000.00);
		Funcionario f2 = new Funcionario("Ricardo", "xxx.xxx.xxx-xx", 3500.00);	
		
		print("Funcionario: "+f1.getNome()+" Salario R$"+f1.getSalario()+ " Bonifica��o: R$"+f1.getBonificacao());
		print("Funcionario: "+f2.getNome()+" Salario R$"+f2.getSalario()+ " Bonifica��o: R$"+f2.getBonificacao());
		printFuncionario(f1);
	}
	*/
	
	public static void testeGerente() {
		Gerente g1 = new Gerente();
		g1.setNome("Anne");
		g1.setCpf("xxx.yyy.zzz-ab");
		g1.setSalario(4900.00);
		g1.setSenha("54321");
		g1.setQtdFuncionariosGerenciados(12);
		Gerente g2 = new Gerente("Kety", "zzz.zzz.zzz-zz", 5000.00, "123456", 15);
		
		print("Gerente: "+g1.getNome()+ " Salario: R$"+g1.getSalario()+" Gerenciados: "+g1.getQtdFuncionariosGerenciados()+ " Bonifica��o: R$"+g1.getBonificacao());
		print("Gerente: "+g2.getNome()+ " Salario: R$"+g2.getSalario()+" Gerenciados: "+g2.getQtdFuncionariosGerenciados()+ " Bonifica��o: R$"+g2.getBonificacao());
		testePolimorfismo(g1);
		testeInterface(g1);
		testeInterface(g2);
	}
	
	public static void testeInterface(Autenticavel a) {
		a.login("123456");	
	}
	
	public static void testePolimorfismo(Funcionario f) {
		print("Print - Funcionario: "+f.getNome()+" Salario R$"+f.getSalario()+ " Bonifica��o: R$"+f.getBonificacao());
	}
	
	public static void print(String s) {
		try {
			System.out.println(s);
		} catch(NullPointerException e) {
			System.out.println(e);
		}
	}
}
