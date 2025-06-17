package com.pucgo.integra.contatos.sevices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pucgo.integra.contatos.models.Usuario;
import com.pucgo.integra.contatos.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario add(Usuario usuario)
    {
        //usuario.setSenha(null);
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> getAll()
    {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    public Usuario getByName(String nome)
    {
        return usuarioRepository.findByNome(nome);
    }
}
