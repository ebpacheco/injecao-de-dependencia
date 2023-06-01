package com.algaworks.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@Component
public class AtivacaoClienteService {

//	@Qualifier("email")
//	@TipoDoNotificador(NivelUrgencia.URGENTE)
//	@Autowired
//	private Notificador notificador;

	@Autowired
	private ApplicationEventPublisher eventPublisher; // The publisher

//	@PostConstruct
//	public void init() {
//		System.out.println("INIT");
//	}
//
//	@PreDestroy
//	public void destroy() {
//		System.out.println("DESTROY");
//	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
//		notificador.notificar(cliente, "Seu cadastro no sistema esta ativo!");
	}
}
