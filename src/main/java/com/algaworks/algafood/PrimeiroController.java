package com.algaworks.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.service.AtivacaoClienteService;

@Controller
public class PrimeiroController {

	private AtivacaoClienteService ativacaoClienteService;

	public PrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
	}

	@GetMapping(path = "/hello")
	@ResponseBody
	public String hello() {

		Cliente c1 = new Cliente("Eduardo", "eduardo@teste.com", "11 1111-1111");
		ativacaoClienteService.ativar(c1);

		return "Ola!";
	}
}
