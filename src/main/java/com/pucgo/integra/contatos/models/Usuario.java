package com.pucgo.integra.contatos.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer usuarioId;
	
	@Column(name = "name", length = 255, nullable = false)
	private String nome;
	
	@Column(name = "email", length = 255, nullable = false, unique = true)
	private String email;
	
	@Column(name = "password", nullable = false)
	private String senha;

	// @Column(name = "created_at", nullable = true)
	// private LocalDate dataCriacao;

	public Integer getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	// public LocalDate getDataCriacao() {
	// 	return dataCriacao;
	// }

	// public void setDataCriacao(LocalDate dataCriacao) {
	// 	this.dataCriacao = dataCriacao;
	// }
}
