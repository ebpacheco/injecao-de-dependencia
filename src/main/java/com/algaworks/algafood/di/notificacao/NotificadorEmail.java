package com.algaworks.algafood.di.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

//@Profile("prod")
//@Primary
//@Qualifier("email")
@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmail implements Notificador {

	@Autowired
	private NotificadorProperties notificadorProperties;

	public NotificadorEmail() {
		System.out.println("Notificador prod");
	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.println("Host:" + notificadorProperties.getHostServidor());
		System.out.println("Porta: " + notificadorProperties.getPortaServidor());
		System.out.printf("Notificando %s atraves do e-mail %s, %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}

}