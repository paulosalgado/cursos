package br.com.caelum.estoque.modelo.usuario;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class InfoFault {
	
	private String mensagem;
	private Date dataErro;
	
	InfoFault() {
		
	}
	
	public InfoFault(String mensagem, Date dataErro) {
		this.mensagem = mensagem;
		this.dataErro = dataErro;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public Date getDataErro() {
		return dataErro;
	}
	
	public void setDataErro(Date dataErro) {
		this.dataErro = dataErro;
	}
	
}
