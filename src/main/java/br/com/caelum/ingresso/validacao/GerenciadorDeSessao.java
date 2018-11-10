package br.com.caelum.ingresso.validacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import br.com.caelum.ingresso.model.Sessao;

public class GerenciadorDeSessao {
<<<<<<< HEAD

	private List<Sessao> sessoesDaSala;
	
	public GerenciadorDeSessao(List<Sessao> sessoesDaSala){
		this.sessoesDaSala = sessoesDaSala;
	}
	
	private boolean horarioIsConflitante(Sessao sessaoExistente, Sessao sessaoNova){
		LocalDate hoje = LocalDate.now();
		
		LocalDateTime horarioSessaoExistente = sessaoExistente.getHorario().atDate(hoje);
		LocalDateTime terminoSessaoExistente = sessaoExistente.getHorarioTermino().atDate(hoje);
=======
	
	private List<Sessao> sessoesDaSala;
	
	public GerenciadorDeSessao(List<Sessao> sessoesDaSala) {
		this.sessoesDaSala = sessoesDaSala;
	}
	
	private boolean horarioIsConflitante(Sessao sessaoExistente, Sessao sessaoNova) {
		LocalDate hoje = LocalDate.now();
		
		LocalDateTime horarioSessaoExistente = sessaoExistente.getHorario().atDate(hoje); 
		LocalDateTime terminoSessaoExistente =  sessaoExistente.getHorarioTermino().atDate(hoje);
>>>>>>> b7034e0136a6d51477ade70c6e4966a88296e645
		LocalDateTime horarioSessaoNova = sessaoNova.getHorario().atDate(hoje);
		LocalDateTime terminoSessaoNova = sessaoNova.getHorarioTermino().atDate(hoje);
		
		boolean terminaAntes = terminoSessaoNova.isBefore(horarioSessaoExistente);
		boolean comecaDepois = terminoSessaoExistente.isBefore(horarioSessaoNova);
		
<<<<<<< HEAD
		if(terminaAntes || comecaDepois){
=======
		if(terminaAntes || comecaDepois) {
>>>>>>> b7034e0136a6d51477ade70c6e4966a88296e645
			return false;
		}
		return true;
	}
	
<<<<<<< HEAD
	public boolean cabe(Sessao sessaoNova){
		return sessoesDaSala.stream().noneMatch(sessaoExistente -> horarioIsConflitante(sessaoExistente, sessaoNova));
	}
	
	
=======
	public boolean cabe(Sessao sessaoNova) {
		return sessoesDaSala.stream().noneMatch(sessaoExistente -> horarioIsConflitante(sessaoExistente, sessaoNova));
	}

>>>>>>> b7034e0136a6d51477ade70c6e4966a88296e645
}
