package com.example.demo.Repositorio;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Modelo.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario,Integer>{

}
