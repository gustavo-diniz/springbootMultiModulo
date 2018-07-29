package br.com.gustavodiniz.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.gustavodiniz.model.PessoaModel;


public interface PessoaRepository extends MongoRepository<PessoaModel,Long> {
	
	PessoaModel findByNome(final String nome);
	
}
