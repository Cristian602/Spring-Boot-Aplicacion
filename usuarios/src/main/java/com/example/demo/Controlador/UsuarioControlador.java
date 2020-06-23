package com.example.demo.Controlador;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.Modelo.Usuario;
import com.example.demo.Repositorio.UsuarioRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@RestController
@RequestMapping ("/api/usuario")
@CrossOrigin (origins="*",methods= {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class UsuarioControlador {
	@Autowired
	UsuarioRepositorio usuarioRepo;
	
	@GetMapping
	public Iterable<Usuario> getAll() {
		return usuarioRepo.findAll();
	}
	
	@GetMapping ("/{id}")
	public Usuario getById(@PathVariable(value="id") Integer id) {
		return usuarioRepo.findById(id).orElseGet(() -> {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Usuario no encontrado");
			});
	}
	
	@PostMapping
	public Usuario guardar(@RequestBody Usuario usuario) {
		return usuarioRepo.save(usuario);
	}
	
	@PutMapping
	public Usuario update(@RequestBody Usuario usuario) {
		return usuarioRepo.save(usuario);
	}
	
	@DeleteMapping ("/{id}")
	public void borrar(@PathVariable(value="id") Integer id) {
		if (usuarioRepo.findById(id).isPresent()) {
			usuarioRepo.delete(usuarioRepo.findById(id).get());
		} else {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Usuario no encontrado");
		}
	}
	
}