package com.pucgo.integra.contatos.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.pucgo.integra.contatos.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
    List<Usuario> findByNameContainingIgnoreCase(String name);
}
