package br.com.restaurante.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.restaurante.controller.dto.AlunoDto;
import br.com.restaurante.controller.form.AtualizacaoAlunoForm;
import br.com.restaurante.model.Aluno;
import br.com.restaurante.service.implemetation.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
	private AlunoService service;
	
	@GetMapping //traz uma lista de alunos, se tiver o codigo da turma, traz apenas os alunos daquela turma
	public ResponseEntity<AlunoDto> lista(@RequestParam(required = false) String codigoTurma) { 
		if (codigoTurma == null) {
			List<Aluno> alunos = service.findAll();
			return AlunoDto.converter(alunos); // O Spring faz a conversão do objeto para JSON automaticamente, com o uso da biblioteca Jackson.
		} else {
			List<Aluno> alunos = service.findByTurma(codigoTurma);
			 return AlunoDto.converter(alunos); 
		}
	}
	
	@GetMapping("/{matricula}")
	public ResponseEntity<?> lista(@PathVariable Long matricula) { 
		if (service.findById(matricula) != null) {
			Aluno aluno = service.findById(matricula);
			return AlunoDto.converter(aluno); 
		} 
		return ResponseEntity.notFound().build();
	}
	
	//O spring verifica se a role do usuario é MODERADOR, se nao for, ele nem entra no remover
	@DeleteMapping("/{matricula}")
	@Transactional 
	public ResponseEntity<?> remover(@PathVariable Long matricula) {
		if (service.findById(matricula) != null) {
			service.delete(matricula);
			return ResponseEntity.ok().build(); //vai retornar 200 sem nada no body
		}
		return ResponseEntity.notFound().build();
	}
	
	@PutMapping("/{matricula}")
	@Transactional //avisa pro spring que é pra commitar a transacao, Métodos anotados com @Transactional serão executados dentro de um contexto transacional, Ao finalizar o método, o Spring efetuará o commit automático da transação, caso nenhuma exception tenha sido lançada.
	public ResponseEntity<AlunoDto> atualizar(@PathVariable Long matricula, @RequestBody /*@Valid*/ AtualizacaoAlunoForm form) { //preciso colocar no pom a dependencia de validacao
		if (service.findById(matricula) != null) {
			Aluno aluno = form.atualizar(matricula, service);
			AlunoDto dto = new AlunoDto(aluno);
			return ResponseEntity.ok(dto); //o ok retorna 200 com o dto no body da response
		}
		return ResponseEntity.notFound().build();
	}
}
