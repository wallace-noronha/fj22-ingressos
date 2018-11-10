package br.com.caelum.ingresso.model.form;

import java.time.LocalTime;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import br.com.caelum.ingresso.dao.FilmeDao;
import br.com.caelum.ingresso.dao.SalaDao;
import br.com.caelum.ingresso.model.Filme;
import br.com.caelum.ingresso.model.Sala;
import br.com.caelum.ingresso.model.Sessao;

public class SessaoForm {

	private Integer id;
	
	@NotNull
	private Integer salaId;
	
<<<<<<< HEAD
	@NotNull
	@DateTimeFormat(pattern="HH:mm")
=======
	@DateTimeFormat(pattern="HH:mm")
	@NotNull
>>>>>>> b7034e0136a6d51477ade70c6e4966a88296e645
	private LocalTime horario;
	
	@NotNull
	private Integer filmeId;
	
<<<<<<< HEAD

	public Sessao toSessao(SalaDao salaDao, FilmeDao filmeDao){
		Filme filme = filmeDao.findOne(filmeId);
		Sala sala = salaDao.findOne(salaId);
		Sessao sessao = new Sessao(this.horario,filme,sala);
		return sessao;
	}
	
	
=======
	public Sessao toSessao(SalaDao salaDao, FilmeDao filmeDao) {
		Filme filme = filmeDao.findOne(filmeId);
		Sala sala = salaDao.findOne(salaId);
		
		Sessao sessao = new Sessao(this.horario,filme,sala);
		
		return sessao;
	}

>>>>>>> b7034e0136a6d51477ade70c6e4966a88296e645
	public Integer getId() {
		return id;
	}

<<<<<<< HEAD


=======
>>>>>>> b7034e0136a6d51477ade70c6e4966a88296e645
	public void setId(Integer id) {
		this.id = id;
	}

<<<<<<< HEAD


=======
>>>>>>> b7034e0136a6d51477ade70c6e4966a88296e645
	public Integer getSalaId() {
		return salaId;
	}

<<<<<<< HEAD


=======
>>>>>>> b7034e0136a6d51477ade70c6e4966a88296e645
	public void setSalaId(Integer salaId) {
		this.salaId = salaId;
	}

<<<<<<< HEAD


=======
>>>>>>> b7034e0136a6d51477ade70c6e4966a88296e645
	public LocalTime getHorario() {
		return horario;
	}

<<<<<<< HEAD


=======
>>>>>>> b7034e0136a6d51477ade70c6e4966a88296e645
	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}

<<<<<<< HEAD


=======
>>>>>>> b7034e0136a6d51477ade70c6e4966a88296e645
	public Integer getFilmeId() {
		return filmeId;
	}

<<<<<<< HEAD


	public void setFilmeId(Integer filmeId) {
		this.filmeId = filmeId;
	}



=======
	public void setFilmeId(Integer filmeId) {
		this.filmeId = filmeId;
	}
	
>>>>>>> b7034e0136a6d51477ade70c6e4966a88296e645
	
	
	
}
