package br.com.restaurante.service.implemetation;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.restaurante.model.Aluno;
import br.com.restaurante.repository.AlunoRepository;
import br.com.restaurante.service.InterfaceService;

@Service
public class AlunoService implements InterfaceService<Aluno> {

	@Autowired
	public AlunoRepository repository;

	@Override
	@Transactional
	public Aluno create(Aluno aluno) {
		repository.save(aluno);
		return aluno;
	}

	@Override
	public Aluno findById(Long matricula) {
		Optional<Aluno> _aluno = repository.findById(matricula);
		return _aluno.orElse(null);
	}

	@Override
	public List<Aluno> findAll() {
		return repository.findAll();
	}

	@Override
	@Transactional
	public boolean update(Aluno aluno) {
		if (repository.existsById(aluno.getMatricula())) {
			repository.save(aluno);
			return true;
		}
		return false;
	}

	@Override
	@Transactional
	public boolean delete(Long matricula) {
		if (repository.existsById(matricula)) {
			repository.deleteById(matricula);
			return true;
		}
		return false;
	}

	public List<Aluno> findByTurma(String codigoTurma) {
		// TEM QUE IMPLEMENTAR
		return null;
	}
}
