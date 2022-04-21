package com.br.alura.mvc.mudi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.br.alura.mvc.mudi.model.Pedido;
import com.br.alura.mvc.mudi.repository.PedidoRepository;

@Controller
public class HomeController {
	
	@Autowired
	private PedidoRepository pedidiRepository;

	@GetMapping("/home")
	public String home(Model model) {
		
//		Pedido pedido  = new Pedido();
//		pedido.setNomeProduto("Celular Xiaomi Redmi Note 8 Pro Versão Global 128gb / 6gb Ram/Tela 6.53'' - AZUL");
//		pedido.setUrlImagem("https://m.media-amazon.com/images/I/71cAhQSpFEL._AC_SL1500_.jpg");
//		pedido.setUrlProduto("https://www.amazon.com.br/Celular-Xiaomi-Redmi-Note-Pro/dp/B07YJQFYRZ/ref=sr_1_5?crid=T5HAB3CRZ4T8&keywords=celular+xiaomi+redmi+note+8&qid=1649731653&sprefix=celular+xiaomi+"
//				+ "Re%2Caps%2C517&sr=8-5&ufe=app_do%3Aamzn1.fos.25548f35-0de7-44b3-b28e-0f56f3f96147");	pedido.setDescricao("Descrição do produto.");
//				List<Pedido> pedidos = Arrays.asList(pedido);
		
		
		
		
		List<Pedido> pedidos = pedidiRepository.findAll();
		model.addAttribute("pedidos", pedidos);

		return "home";
	}

}
