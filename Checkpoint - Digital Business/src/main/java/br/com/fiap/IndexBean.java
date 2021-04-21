package br.com.fiap;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class IndexBean {

	//MÉTODO QUE CORRESPONDE MOSTRAR NA TELA QUE ESTA EXECUTANDO UM COMANDO
	public void executarComando() {
		System.out.println("executando um comando");
	}
}
