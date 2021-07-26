package com.example.app.conta;

/* 1 - e uma entidade e nao classe
 * 2 - apenas assinaturas - todos os metodos sao abstratos
 * 3 - somente publicos e abstratos
 * 4 - nao ha instancia e nem construtor
 * 5 - quem herda é obrigado a implementar
 */
public interface Autenticavel {
	public boolean login(String senha);
}
