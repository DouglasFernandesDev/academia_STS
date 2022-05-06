package me.dio.academia.digital.entity;

<<<<<<< HEAD
=======
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

>>>>>>> 7595f9b (projeto funcionando e reparado)
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

<<<<<<< HEAD
import javax.persistence.*;
import java.time.LocalDateTime;

=======
>>>>>>> 7595f9b (projeto funcionando e reparado)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_matriculas")
public class Matricula {

<<<<<<< HEAD
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "aluno_id")
  private Aluno aluno;

  private LocalDateTime dataDaMatricula = LocalDateTime.now();
=======
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "aluno_id")
  private Aluno aluno;

	
  private LocalDateTime dataDaMatricula = LocalDateTime.now();


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public Aluno getAluno() {
	return aluno;
}


public void setAluno(Aluno aluno) {
	this.aluno = aluno;
}


public LocalDateTime getDataDaMatricula() {
	return dataDaMatricula;
}


public void setDataDaMatricula(LocalDateTime dataDaMatricula) {
	this.dataDaMatricula = dataDaMatricula;
}


public Long getAlunoId() {
	return null;
}


public Matricula save(Matricula matricula) {
	return null;
}


>>>>>>> 7595f9b (projeto funcionando e reparado)
}
