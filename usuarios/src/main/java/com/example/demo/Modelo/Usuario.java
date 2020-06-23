package com.example.demo.Modelo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="usuario")

public class Usuario {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name="usuario_id")
	private int id;
	@Column (name="usuario_nombre")
	private String nombre;
	@Column (name="usuario_apellido")
	private String apellido;
	@Column (name="usuario_correo")
	private String correo;
	@Column (name="usuario_password")
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
