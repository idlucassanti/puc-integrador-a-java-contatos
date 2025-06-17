package com.pucgo.integra.contatos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pucgo.integra.contatos.models.Usuario;
import com.pucgo.integra.contatos.sevices.UsuarioService;

import jakarta.websocket.server.PathParam;

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
    public List<Usuario> getUsuarios() 
    {
        return usuarioService.getAll();
    }

    @GetMapping("/usuarios/{nome}")
    public ResponseEntity<Usuario> getUsuarioByName(@PathVariable String nome) 
    {
        var response = usuarioService.getByName(nome);

        if(response != null) {
            // return ResponseEntity.ok(response);
            return ResponseEntity.ok().body(response);
        } 

        return ResponseEntity.notFound().build();
    }
}
