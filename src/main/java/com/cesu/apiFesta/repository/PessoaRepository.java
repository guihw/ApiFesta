package com.cesu.apiFesta.repository;

import com.cesu.apiFesta.model.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaModel, Long> {
    UserDetails findByLogin(String login);
}
