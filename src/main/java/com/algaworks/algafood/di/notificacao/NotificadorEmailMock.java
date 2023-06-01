package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.modelo.Cliente;

//@Profile("dev")
//@Primary
//@Qualifier("email")
//@TipoDoNotificador(NivelUrgencia.NORMAL)
//@Component
public class NotificadorEmailMock implements Notificador {

	public NotificadorEmailMock() {
		System.out.println("Notificador dev");
	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s atraves do e-mail %s, %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}

}