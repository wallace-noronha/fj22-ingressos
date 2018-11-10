package br.com.caelum.ingresso.validacao;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

<<<<<<< HEAD
import org.junit.Assert;
=======
>>>>>>> b7034e0136a6d51477ade70c6e4966a88296e645
import org.junit.Before;
import org.junit.Test;

import br.com.caelum.ingresso.model.Filme;
import br.com.caelum.ingresso.model.Sala;
import br.com.caelum.ingresso.model.Sessao;
<<<<<<< HEAD
=======
import junit.framework.Assert;
>>>>>>> b7034e0136a6d51477ade70c6e4966a88296e645

public class GerenciadorDeSessaoTest {

	private Filme rogueOne;
	private Sala sala3D;
	private Sessao sessaoDasDez;
	private Sessao sessaoDasTreze;
	private Sessao sessaoDasDezoito;
	
<<<<<<< HEAD
	@Before
	public void preparaSessoes(){
		this.rogueOne = new Filme("Rougue One",Duration.ofMinutes(120),"SCI-FI",BigDecimal.ONE);
		this.sala3D = new Sala("Sala 3D",BigDecimal.TEN);
=======
	
	@Before
	public void preparaSessoes() {
		this.rogueOne = new Filme("rogueOne", Duration.ofMinutes(120), "SCI-FI",BigDecimal.ONE);
		this.sala3D = new Sala("Sala 3D", BigDecimal.TEN);
>>>>>>> b7034e0136a6d51477ade70c6e4966a88296e645
		
		this.sessaoDasDez = new Sessao(LocalTime.parse("10:00:00"), rogueOne, sala3D);
		this.sessaoDasTreze = new Sessao(LocalTime.parse("13:00:00"), rogueOne, sala3D);
		this.sessaoDasDezoito = new Sessao(LocalTime.parse("18:00:00"), rogueOne, sala3D);
	}
	
	@Test
<<<<<<< HEAD
	public void garanteQueNaoDevePermitirSessaoNoMesmoHorario(){
=======
	public void garanteQueNaoDevePermitirSessaoNoMesmoHorario() {
		
>>>>>>> b7034e0136a6d51477ade70c6e4966a88296e645
		List<Sessao> sessoes = Arrays.asList(sessaoDasDez);
		GerenciadorDeSessao gerenciador = new GerenciadorDeSessao(sessoes);
		Assert.assertFalse(gerenciador.cabe(sessaoDasDez));
	}
	
	@Test
<<<<<<< HEAD
	public void garanteQueNaoDevePermitirSessoesTerminandoDentroDoHorarioDeUmaSessaoJaExistente(){
=======
	public void garanteQueNaoDevePermitirSessoesTerminandoDentroDoHorarioDeUmaSessaoJaExistente() {
>>>>>>> b7034e0136a6d51477ade70c6e4966a88296e645
		List<Sessao> sessoes = Arrays.asList(sessaoDasDez);
		Sessao sessao = new Sessao(sessaoDasDez.getHorario().minusHours(1),rogueOne,sala3D);
		GerenciadorDeSessao gerenciador = new GerenciadorDeSessao(sessoes);
		Assert.assertFalse(gerenciador.cabe(sessao));
	}
	
	@Test
<<<<<<< HEAD
	public void garanteQueNaoDevePermitirSessoesIniciandoDentroDoHorarioDeUmaSessaoJaExistente(){
		List<Sessao> sessoesDaSala = Arrays.asList(sessaoDasDez);
		GerenciadorDeSessao gerenciador = new GerenciadorDeSessao(sessoesDaSala);
		Sessao sessao = new Sessao(sessaoDasDez.getHorario().plusHours(1),rogueOne,sala3D);
		Assert.assertFalse(gerenciador.cabe(sessao));
	}

	@Test
	public void garanteQueNaoDevePermitirUmaInsercaoEntreDoisFilmes(){
=======
	public void garanteQueNaoDevePermitirSessoesIniciandoDentroDoHorarioDeUmaSessaoJaExistente() {
		List<Sessao> sessoesDaSala = Arrays.asList(sessaoDasDez);
		GerenciadorDeSessao gerenciador = new GerenciadorDeSessao(sessoesDaSala);
		Sessao sessao = new Sessao(sessaoDasDez.getHorario().plusHours(1), rogueOne, sala3D);
		Assert.assertFalse(gerenciador.cabe(sessao));
	}
	
	@Test
	public void garanteQueDevePermitirUmaInsercaoEntreDoisFilmes() {
>>>>>>> b7034e0136a6d51477ade70c6e4966a88296e645
		List<Sessao> sessoes = Arrays.asList(sessaoDasDez, sessaoDasDezoito);
		GerenciadorDeSessao gerenciador = new GerenciadorDeSessao(sessoes);
		Assert.assertTrue(gerenciador.cabe(sessaoDasTreze));
	}
<<<<<<< HEAD
=======
	
>>>>>>> b7034e0136a6d51477ade70c6e4966a88296e645
}
