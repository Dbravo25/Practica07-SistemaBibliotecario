/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.app.poo.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dell
 */
public class Biblioteca {
    private int codigo;
    private List<Libro> libros;
    private String nombre;
    private String direccion;
    private String telefono;
   
	//Constructor vacio
	public Biblioteca() {
	this.libros = new ArrayList<>();
	}
	//Constructor con los atributos
	public Biblioteca(int codigo, String nombre, String direccion, String telefono) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.direccion = direccion;
            this.telefono = telefono;
            this.libros = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTelefono() {
        return telefono;
    }
    public void agregarLibros(Libro libro){
        libros.add(libro);
    }
    public List<Libro> getLibros() {
        return libros;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "codigo=" + codigo + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + "Libros" + libros+ '}';
    }
    
    
}
