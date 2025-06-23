package com.pucgo.integra.contatos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pucgo.integra.contatos.models.Usuario;
import com.pucgo.integra.contatos.sevices.UsuarioService;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/usuarios")
    public Usuario addUsuario(@RequestBody Usuario usuario) 
    {
        return usuarioService.add(usuario);
    }

    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios(@RequestParam(required = false) String name) 
    {
        return usuarioService.getAll(name);
    }

    @DeleteMapping("/usuarios/{id}")
    public ResponseEntity<Boolean> deleteUsuarios(@PathVariable Integer id) 
    {
        var response = usuarioService.remove(id);

        if(response)
            return ResponseEntity.ok().build();
        
        return ResponseEntity.notFound().build();
    }
}
