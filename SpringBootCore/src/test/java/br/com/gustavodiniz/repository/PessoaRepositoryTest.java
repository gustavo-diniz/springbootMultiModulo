package br.com.gustavodiniz.repository;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.gustavodiniz.model.PessoaModel;

@RunWith(SpringRunner.class)
@DataMongoTest
@EnableAutoConfiguration
@SpringBootTest(classes=PessoaRepository.class)
public class PessoaRepositoryTest {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Test
	public void findByNomeTest() {
		
		PessoaModel pessoa = pessoaRepository.findByNome("gustavo");
		assertTrue(pessoa.getNome().equals("gustavo"));
	}
	
}
