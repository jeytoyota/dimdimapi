package com.fiap.dimDimApi.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "TB_BOLETO_DIMDIM")
public class Boleto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idBoleto;
	
	private String dtVencimento;
	
	private BigDecimal valor;
	
	private String cnpj;
	
	private String cdBarras;
	
	@ManyToOne
	@JsonIgnoreProperties("boleto")
	private Cliente cliente;

	public long getIdBoleto() {
		return idBoleto;
	}

	public void setIdBoleto(long idBoleto) {
		this.idBoleto = idBoleto;
	}

	public String getDtVencimento() {
		return dtVencimento;
	}

	public void setDtVencimento(String dtVencimento) {
		this.dtVencimento = dtVencimento;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCdBarras() {
		return cdBarras;
	}

	public void setCdBarras(String cdBarras) {
		this.cdBarras = cdBarras;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
