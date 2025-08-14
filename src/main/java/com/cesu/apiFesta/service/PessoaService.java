package com.cesu.apiFesta.service;

import com.cesu.apiFesta.dto.PessoaDTO;
import com.cesu.apiFesta.exceptions.PessoaApiEmptyException;
import com.cesu.apiFesta.model.PessoaModel;
import com.cesu.apiFesta.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        List<PessoaModel> pessoas = pessoaRepository.findAll();
        if (pessoas.isEmpty()){
            throw new PessoaApiEmptyException();
        } else {
            return pessoas;
        }
    }

    public void excluir(Long id){
        pessoaRepository.deleteById(id);
    }

    public PessoaModel atualizar(Long id, PessoaDTO atualizarPessoa){
        Optional<PessoaModel> pessoaOpcional = pessoaRepository.findById(id).stream().findFirst();
        if (pessoaOpcional.isPresent()){
            PessoaModel pessoa = pessoaOpcional.get();

            pessoa.setNome(atualizarPessoa.nome());
            pessoa.setCpf(atualizarPessoa.cpf());
            pessoa.setIdade(atualizarPessoa.idade());
            return pessoaRepository.save(pessoa);
        } else {
            throw new RuntimeException("Pessoa não encontrada com ID: " + id);
        }
    }
}
