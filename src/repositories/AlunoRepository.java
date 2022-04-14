package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entities.Aluno;
import factories.ConnectionFactory;
import interfaces.IAlunoRepository;

public class AlunoRepository implements IAlunoRepository {

	@Override
	public void create(Aluno aluno) throws Exception {

		Connection connection = ConnectionFactory.getConnection();

		PreparedStatement statement = connection
				.prepareStatement("insert into Aluno(nome,matricula,cpf) value (?,?,?)");

		statement.setString(1, aluno.getNome());
		statement.setString(2, aluno.getMatricula());
		statement.setString(3, aluno.getCpf());
		statement.execute();

		connection.close();
	}

	@Override
	public void update(Aluno aluno) throws Exception {
		
		Connection connection = ConnectionFactory.getConnection();
		
		PreparedStatement statement = connection.prepareStatement("update aluno set nome=?,matricula=?, cpf=? where idAluno = ?");
		
		statement.setString(1, aluno.getNome());
		statement.setString(2, aluno.getMatricula());
		statement.setString(3, aluno.getCpf());
		statement.setInt(4, aluno.getId());
		statement.execute();
		
		connection.close();

	}

	@Override
	public void delete(Aluno aluno) throws Exception {
		Connection connection = ConnectionFactory.getConnection();
		
		PreparedStatement statement = connection.prepareStatement("delete from aluno where idAluno = ?");
		statement.setInt(1, aluno.getId());
		statement.execute();
		
		connection.close();

	}

	@Override
	public List<Aluno> findAll() throws Exception {
		List<Aluno> listaAluno = new ArrayList<Aluno>();
		
		Connection connection = ConnectionFactory.getConnection();
		
		PreparedStatement statement = connection.prepareStatement("select * from aluno");
		
		ResultSet resultSet =  statement.executeQuery();
		
		while (resultSet.next()) {
			
			Aluno aluno = new Aluno();
			aluno.setId(resultSet.getInt("idAluno"));
			aluno.setNome(resultSet.getString("nome"));
			aluno.setMatricula(resultSet.getString("matricula"));
			aluno.setCpf(resultSet.getString("cpf"));
			listaAluno.add(aluno);
		}
		
		connection.close();

		return listaAluno;
	}

	@Override
	public Aluno findById(Integer id) throws Exception {
		Connection connection = ConnectionFactory.getConnection();
		
		PreparedStatement statement = connection.prepareStatement("select * from aluno where idAluno=?");
		
		statement.setInt(1, id);
		
		ResultSet resultSet = statement.executeQuery();
		
		
		Aluno aluno = null;
		
		if(resultSet.next()){

			aluno = new Aluno();
			aluno.setId(resultSet.getInt("idAluno"));
			aluno.setNome(resultSet.getString("nome"));
			aluno.setMatricula(resultSet.getString("matricula"));
			aluno.setCpf(resultSet.getString("cpf"));
		}
		
		connection.close();
		return aluno;
	}

}
