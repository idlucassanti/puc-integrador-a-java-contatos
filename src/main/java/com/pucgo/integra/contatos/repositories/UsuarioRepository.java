package com.pucgo.integra.contatos.repositories;

import org.springframework.data.repository.CrudRepository;
import com.pucgo.integra.contatos.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
    public Usuario findByNome(String nome);
}
