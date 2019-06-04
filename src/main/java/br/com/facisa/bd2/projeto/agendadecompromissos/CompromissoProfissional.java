package br.com.facisa.bd2.projeto.agendadecompromissos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "compromissoProfissional")
public class CompromissoProfissional{
private int id;
	
	private String dataCompromisso;

	private String horaCompromisso;

	private String Descriçao;

	private String local;
	
	private String qtdTempo;
	
	private String Periodicidade;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "compromisso_id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDataCompromisso() {
		return dataCompromisso;
	}

	public void setDataCompromisso(String dataCompromisso) {
		this.dataCompromisso = dataCompromisso;
	}

	public String getHoraCompromisso() {
		return horaCompromisso;
	}

	public void setHoraCompromisso(String horaCompromisso) {
		this.horaCompromisso = horaCompromisso;
	}

	public String getDescriçao() {
		return Descriçao;
	}

	public void setDescriçao(String descriçao) {
		Descriçao = descriçao;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getQtdTempo() {
		return qtdTempo;
	}

	public void setQtdTempo(String qtdTempo) {
		this.qtdTempo = qtdTempo;
	}

	public String getPeriodicidade() {
		return Periodicidade;
	}

	public void setPeriodicidade(String periodicidade) {
		Periodicidade = periodicidade;
	}

}