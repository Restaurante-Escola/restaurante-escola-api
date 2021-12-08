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
	
	private Aluno aluno = new Aluno(345749287L, "João Pedro", "João", 15, "Solteiro", LocalDate.now(), "213512353", "42352362313", "13982675622", "13982675622", "13982675622", "Casimiro", "Médio", "Segundo", "Liceu", "1 ano", "2030", "G", "45", "UNIMED", "gonzaga", "amanda", "0800329824", "3423423", "88273023", "4234234", false, false, false, false, "nenhum", false, false, false, false, false, false, false, false, "nenhum", "nenhum");
	
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