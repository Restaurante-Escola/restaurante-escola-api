package br.com.restaurante;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.restaurante.model.Aluno;
import br.com.restaurante.service.implementation.AlunoService;

@RunWith(SpringRunner.class)
@SpringBootTest 
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) //informamos ao spring que é pra usar o banco de dados do aplication properties usado (por padrão, ele sempre utiliza algum banco em memoria)
class RestauranteApplicationTests {
	
	@Autowired
	private AlunoService service;
	
	private Aluno aluno = new Aluno(666L, "Aluno Teste", "Teste", 1, "Teste", LocalDate.now(), "Teste", "Teste", "Teste", "Teste", "Teste", "Teste", "Teste", "Teste", "Teste", "Teste", "Teste", "Teste", "Teste", "Teste", "Teste", "Teste", "Teste", "Teste", "Teste", "Teste", false, false, false, false, "Teste", false, false, false, false, false, false, false, false, "Teste", "Teste");
	
	@Test
	public void crud() {
		create();
		read();
		update();
		delete();
	}
	
	public void create() {
		Assert.assertNotNull(service.create(aluno));
	}
	
	public void read() {
		Assert.assertNotNull( service.findById(666L));
	}
	
	public void update() {
		aluno.setNome("Teste Aluno");
		Assert.assertTrue(service.update(aluno));
	}
	
	public void delete() {
		Assert.assertTrue(service.delete(666L));
	}
}