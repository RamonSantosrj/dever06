package interfaces;

import java.util.List;

import entities.Aluno;

public interface IAlunoRepository {

	public void create(Aluno aluno) throws Exception;
	
	public void update(Aluno aluno) throws Exception;
	
	public void delete(Aluno aluno) throws Exception;
	
	public List<Aluno> findAll() throws Exception;
	
	public Aluno findById(Integer id) throws Exception;
	
}
