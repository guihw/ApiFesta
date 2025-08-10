package com.cesu.apiFesta.service;

import com.cesu.apiFesta.dto.PessoaDTO;
import com.cesu.apiFesta.model.PessoaModel;
import com.cesu.apiFesta.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;

    public PessoaModel salvar(PessoaDTO pessoaDTO){
        PessoaModel novaPessoa = new PessoaModel();
        novaPessoa.setNome(pessoaDTO.nome());
        novaPessoa.setIdade(pessoaDTO.idade());
        novaPessoa.setCpf(pessoaDTO.cpf());

        return pessoaRepository.save(novaPessoa);
    }

    public List<PessoaModel> findAll(){
        return pessoaRepository.findAll();
    }
}
