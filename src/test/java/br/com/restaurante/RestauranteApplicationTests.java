package br.com.restaurante;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.assertj.core.error.ShouldBeGreater;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.matchers.GreaterThan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.restaurante.model.Aluno;
import br.com.restaurante.model.Turma;
import br.com.restaurante.model.Advertencia;
import br.com.restaurante.service.implementation.AlunoService;
import br.com.restaurante.service.implementation.TurmaService;
import br.com.restaurante.service.implementation.AdvertenciaService;

@RunWith(SpringRunner.class)
@SpringBootTest 
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) //informamos ao spring que é pra usar o banco de dados do aplication properties usado (por padrão, ele sempre utiliza algum banco em memoria)
class RestauranteApplicationTests {
	
	@Autowired
	private AlunoService service;
	@Autowired
	private TurmaService TurmaService;
	@Autowired
	private AdvertenciaService AdvertenciaService;
	
	private Aluno aluno = new Aluno(345749287L, "João Pedro", "João", 15, "Solteiro", 
			LocalDate.now(), "213512353", "42352362313", "13982675622", "13982675622", 
			"13982675622", "Casimiro", "Médio", "Segundo", "Liceu", "1 ano", "2030", "G", 
			"45", "UNIMED", "gonzaga", "amanda", "0800329824", "3423423", "88273023", 
			"4234234", false, false, false, false, "nenhum", false, false, false, false, 
			false, false, false, false, "nenhum", "nenhum");
	
	private Turma turma = new Turma(444, LocalDate.now(),LocalDate.of(2023,11,16));
	
	private Advertencia advertencia = new Advertencia(aluno,"bateu no amiguinho",LocalDate.now());
	
	
	public void crud() {
		create();
		read();
		update();
		delete();
	}
	
	@Test
	public void crudClass() {
		createClass();
		readClass();
		updateClass();
		deleteClass();
		}

	public void create() {
		Aluno alunoCriado = service.create(aluno);
		Assert.assertNotNull(alunoCriado);
	}

	public void read() {
		Aluno alunoBuscado = service.findById(345749287L);
		Assert.assertNotNull(alunoBuscado);
	}

	public void update() {
		aluno.setNome("Teste Aluno");
		boolean update = service.update(aluno);
		Assert.assertTrue(update);
	}

	public void delete() {
		boolean delete = service.delete(345749287L);
		Assert.assertTrue(delete);
	}
	

	public void createClass() {
		int numeroTurma = turma.getNumero();
		Turma turmaExistente = TurmaService.findByCodigoTurma(numeroTurma);
		Assert.assertNull(turmaExistente);
		assertTrue(turma.getFimTurma().isAfter(turma.getInicioTurma()));
		Turma turmaCriada = TurmaService.create(turma);
		Assert.assertNotNull(turmaCriada);
	}
	
	
	public void readClass() {
		Turma turmaBuscada = TurmaService.findByCodigoTurma(turma.getNumero());
		Assert.assertNotNull(turmaBuscada);
	}
	
	
	public void updateClass() {
		turma.setFimTurma(LocalDate.of(2024,10,16));
		assertTrue(turma.getFimTurma().isAfter(turma.getInicioTurma()));
		boolean turmaUpdated = TurmaService.update(turma);
		Assert.assertNotNull(turmaUpdated);
	}
	
	
	public void deleteClass() {
		readClass();
		boolean turmaDeleted = TurmaService.delete(turma.getNumero());
		Assert.assertTrue(turmaDeleted);
	}
	
	public void createAdvertencia() {
		Advertencia AdvertenciaCriada = AdvertenciaService.create(advertencia);
		Assert.assertNotNull(AdvertenciaCriada);
	}
}