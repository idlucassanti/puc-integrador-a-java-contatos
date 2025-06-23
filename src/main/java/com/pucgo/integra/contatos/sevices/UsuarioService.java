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

    public Usuario add(Usuario usuario) {
        try {
            return usuarioRepository.save(usuario);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar usuário", e);
        }
    }

    public List<Usuario> getAll(String name) {
        if (name == null || name.isEmpty()) {
            return (List<Usuario>) usuarioRepository.findAll();
        }

        return usuarioRepository.findByNameContainingIgnoreCase(name);
    }

    public boolean remove(Integer id) {
        try {
            Usuario usuario = usuarioRepository.findById(id).orElse(null);
            if (usuario != null) {
                usuarioRepository.delete(usuario);
                return true;
            }
            return false;
        } catch (Exception e) {
            throw new RuntimeException("Erro ao remover usuário", e);
        }
    }
}
