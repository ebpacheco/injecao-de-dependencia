package com.algaworks.algafood.di.notificacao;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

//@Primary
//@Qualifier("sms")
@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorSMS implements Notificador {
	public NotificadorSMS() {
		System.out.println("sms");
	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s atraves do telefone %s, %s\n", cliente.getNome(), cliente.getTelefone(),
				mensagem);
	}

}