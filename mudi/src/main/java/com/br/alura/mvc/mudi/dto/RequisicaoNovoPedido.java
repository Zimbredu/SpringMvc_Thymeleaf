package com.br.alura.mvc.mudi.dto;

import javax.validation.constraints.NotBlank;

import com.br.alura.mvc.mudi.model.Pedido;

public class RequisicaoNovoPedido {
	
	@NotBlank //Anotação Java do Using Bean Validation
	private String nomeProduto;
	
	@NotBlank //Anotação Java do Using Bean Validation
	private String urlProduto;
	
	@NotBlank //Anotação Java do Using Bean Validation
	private String urlImagem;
	
	private String descricoa;
	
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getUrlProduto() {
		return urlProduto;
	}
	public void setUrlProduto(String urlProduto) {
		this.urlProduto = urlProduto;
	}
	public String getUrlImagem() {
		return urlImagem;
	}
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	public String getDescricoa() {
		return descricoa;
	}
	public void setDescricoa(String descricoa) {
		this.descricoa = descricoa;
	}
	
	public Pedido toPedido() {
		Pedido pedido = new Pedido();
		pedido.setDescricao(descricoa);
		pedido.setNomeProduto(nomeProduto);
		pedido.setUrlImagem(urlImagem);
		pedido.setUrlProduto(urlProduto);
		
		return pedido;
	}
	
	
	

}
