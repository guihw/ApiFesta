package com.cesu.apiFesta.controller;

import com.cesu.apiFesta.dto.AuthenticationDTO;
import com.cesu.apiFesta.dto.PessoaDTO;
import com.cesu.apiFesta.model.PessoaModel;
import com.cesu.apiFesta.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/pessoas")
public class Endpoints {
    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public List<PessoaModel> findAll(){
        return pessoaService.findAll();
    }

    @PostMapping
    public ResponseEntity<PessoaModel> criarPessoa(@RequestBody PessoaDTO pessoaDTO, @RequestBody AuthenticationDTO authenticationDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaService.salvar(pessoaDTO, authenticationDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirPessoa(@PathVariable Long id){
        pessoaService.excluir(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<PessoaModel> atualizarPessoa(@PathVariable Long id, @RequestBody PessoaDTO atualizarPessoa){
        PessoaModel pessoaAtualizada = pessoaService.atualizar(id, atualizarPessoa);
        return ResponseEntity.ok(pessoaAtualizada);
    }
}
