package br.com.caelum.ingresso.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Sessao {

	@Id
	@GeneratedValue
	private Integer id;
<<<<<<< HEAD
	
=======
>>>>>>> b7034e0136a6d51477ade70c6e4966a88296e645
	private LocalTime horario;
	
	@ManyToOne
	private Sala sala;
	
	@ManyToOne
	private Filme filme;
<<<<<<< HEAD
	 
	private BigDecimal preco;
	
	
	/**
	 * Deprecated hibernate only
	 */
	public Sessao(){
		
	}
	
	public Sessao(LocalTime horario, Filme filme, Sala sala){
		this.horario = horario;
		this.filme = filme;
		this.sala = sala;
		this.preco = sala.getPreco().add(filme.getPreco());
	}
	
	public LocalTime getHorarioTermino(){
		return this.horario.plusMinutes(filme.getDuracao().toMinutes());
	}

	
	
	//Getters and setters
	
	public BigDecimal getPreco() {
		return preco.setScale(2, RoundingMode.HALF_UP);
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	
=======
	
	private BigDecimal preco;
	
	/**
	 * @deprecated hibernate only
	 */
	public Sessao() {
	}

	public Sessao(LocalTime horario, Filme filme, Sala sala) {
		this.horario = horario;
		this.sala = sala;
		this.filme = filme;
		this.preco = sala.getPreco().add(filme.getPreco());
	}
	
	public LocalTime getHorarioTermino() {
		return this.horario.plusMinutes(filme.getDuracao().toMinutes());
	}

	//Getters and Setters
>>>>>>> b7034e0136a6d51477ade70c6e4966a88296e645
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}
<<<<<<< HEAD
=======

	public BigDecimal getPreco() {
		return preco.setScale(2, RoundingMode.HALF_UP);
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
>>>>>>> b7034e0136a6d51477ade70c6e4966a88296e645
	
}
