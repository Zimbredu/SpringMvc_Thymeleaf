package com.br.alura.mvc.mudi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.br.alura.mvc.mudi.dto.RequisicaoNovoPedido;
import com.br.alura.mvc.mudi.model.Pedido;
import com.br.alura.mvc.mudi.repository.PedidoRepository;

@Controller
@RequestMapping("pedido")
public class PedidoController {
	
	@Autowired
	private PedidoRepository pedidoRepository;//Injeção de Dependência realizada pelo Spring Boot.
	
	@GetMapping("formulario")
	//@RequestMapping(method= RequestMethod.GET, value="formulario")
	public String formulario(RequisicaoNovoPedido requisicao) {
		
		return "pedido/formulario";
	}
	
	@PostMapping("novo")
	//@RequestMapping(method= RequestMethod.POST, value="novo")
	public String novo(@Valid RequisicaoNovoPedido requisicao, BindingResult result) {
		
		if(result.hasErrors()) {
			return "pedido/formulario";
		}
		
		Pedido pedido = requisicao.toPedido();
		pedidoRepository.save(pedido);		
		return "pedido/formulario";
	}
}
