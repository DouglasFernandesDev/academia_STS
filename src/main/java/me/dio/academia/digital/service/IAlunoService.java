package me.dio.academia.digital.service;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.entity.form.AlunoUpdateForm;

<<<<<<< HEAD
import java.time.LocalDate;
=======
>>>>>>> 7595f9b (projeto funcionando e reparado)
import java.util.List;

public interface IAlunoService {
  /**
   * Cria um Aluno e salva no banco de dados.
<<<<<<< HEAD
   * @param form formulário referente aos dados para criação de um Aluno no banco de dados.
   * @return Aluno recém-criado.
=======
   * @param form - formulário referente aos dados para criação de um Aluno no banco de dados.
   * @return - Aluno recém-criado.
>>>>>>> 7595f9b (projeto funcionando e reparado)
   */
  Aluno create(AlunoForm form);

  /**
   * Retorna um Aluno que está no banco de dados de acordo com seu Id.
<<<<<<< HEAD
   * @param id id do Aluno que será exibido.
   * @return Aluno de acordo com o Id fornecido.
=======
   * @param id - id do Aluno que será exibido.
   * @return - Aluno de acordo com o Id fornecido.
>>>>>>> 7595f9b (projeto funcionando e reparado)
   */
  Aluno get(Long id);

  /**
<<<<<<< HEAD
   * Retorna os Alunos que estão no banco de dados.
   * @return Uma lista os Alunos que estão salvas no DB.
=======
   * Retorna todos os Alunos que estão no banco de dados.
   * @return - Uma lista os Alunos que estão salvas no DB.
>>>>>>> 7595f9b (projeto funcionando e reparado)
   */
  List<Aluno> getAll(String dataDeNascimento);

  /**
   * Atualiza o Aluno.
<<<<<<< HEAD
   * @param id id do Aluno que será atualizado.
   * @param formUpdate formulário referente aos dados necessários para atualização do Aluno
   * no banco de dados.
   * @return Aluno recém-atualizado.
=======
   * @param id - id do Aluno que será atualizado.
   * @param formUpdate - formulário referente aos dados necessários para atualização do Aluno
   * no banco de dados.
   * @return - Aluno recém-atualizado.
>>>>>>> 7595f9b (projeto funcionando e reparado)
   */
  Aluno update(Long id, AlunoUpdateForm formUpdate);

  /**
   * Deleta um Aluno específico.
<<<<<<< HEAD
   * @param id id do Aluno que será removido.
   */
  void delete(Long id);

  /**
   *
   * @param id id do aluno que será recuperada a lista de avaliações
   * @return uma lista com todas as avaliações do aluno de acordo com o Id
   */
  List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);


}
=======
   * @param id - id do Aluno que será removido.
   */
  void delete(Long id);
  
  List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);
}
>>>>>>> 7595f9b (projeto funcionando e reparado)
