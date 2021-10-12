package br.com.safecity.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Field;

public class Endereco implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4579460249634766889L;

	@Field(name = "cep")
	@Indexed(unique = true)
	private String cep;

	@Field(name = "logradouro")
	private String logradouro;

	@Field(name = "complemento")
	private String complemento;

	@Field(name = "bairro")
	private String bairro;

	@Field(name = "localidade")
	private String localidade;

	@Field(name = "uf")
	private String uf;

	@Field(name = "ibge")
	private String ibge;

	@Field(name = "gia")
	private String gia;

	@Field(name = "ddd")
	private String ddd;

	@Field(name = "siafi")
	private String siafi;

	@Field(name = "latitude")
	private BigDecimal latitude;

	@Field(name = "longitude")
	private BigDecimal longitude;

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getIbge() {
		return ibge;
	}

	public void setIbge(String ibge) {
		this.ibge = ibge;
	}

	public String getGia() {
		return gia;
	}

	public void setGia(String gia) {
		this.gia = gia;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getSiafi() {
		return siafi;
	}

	public void setSiafi(String siafi) {
		this.siafi = siafi;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
