package me.dio.academia.digital.controller;

<<<<<<< HEAD
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.service.impl.AvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
=======
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.service.impl.AvaliacaoFisicaServiceImpl;
>>>>>>> 7595f9b (projeto funcionando e reparado)

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

<<<<<<< HEAD
  @Autowired
  private AvaliacaoFisicaServiceImpl service;

  @PostMapping
  public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form) {
    return service.create(form);
  }

  @GetMapping
  public List<AvaliacaoFisica> getAll(){
    return service.getAll();
  }

}
=======

@Autowired
private AvaliacaoFisicaServiceImpl service;

@GetMapping
public List<AvaliacaoFisica> getAll() {
	  return service.getAll();
}

@PostMapping
public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form) {
	return service.create(form);
}


}
>>>>>>> 7595f9b (projeto funcionando e reparado)
