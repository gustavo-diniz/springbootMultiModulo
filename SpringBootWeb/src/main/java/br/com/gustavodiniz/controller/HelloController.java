package br.com.gustavodiniz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.gustavodiniz.model.PessoaModel;
import br.com.gustavodiniz.repository.PessoaRepository;
import br.com.gustavodiniz.vo.Pessoa;

@RestController
public class HelloController {

	@Autowired
	private PessoaRepository pessoaRepository;

	@RequestMapping(value = "/pessoa", method = RequestMethod.GET, headers = "Accept=application/json")
	public Pessoa consultaPessoa() {

		Pessoa p = new Pessoa();

		PessoaModel model = pessoaRepository.findByNome("gustavo");
		p.setNome(model.getNome());
		p.setIdade(p.getIdade());
		p.setEmail(model.getEmail());
		
		return p;
	}

}
