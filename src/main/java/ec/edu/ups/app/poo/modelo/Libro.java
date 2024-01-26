/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.app.poo.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author dell
 */
public class Libro implements Prestable {
    
    private String titulo;
	private String autor;
	private int año;
        private String genero;
	private String disponible;
        private String nomBiblioteca;
        private int codigo;
	public Libro() {
		
	}
//Constructor con sus atributos
	public Libro(int codigo,String titulo, String autor, int año,String genero, String disponible, String nomBiblioteca) {
                this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.año = año;
                this.genero = genero;
		this.disponible = disponible;
                this.nomBiblioteca = nomBiblioteca;
                
	}
//Creacion de los getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public String getDisponible() {
		return disponible;
	}
	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}

        public void setGenero(String genero) {
        this.genero = genero;
        }

        public String getGenero() {
        return genero;
        }

    public String getNombiblioteca() {
        return nomBiblioteca;
    }

    public void setNombiblioteca(String nomBiblioteca) {
        this.nomBiblioteca = nomBiblioteca;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
        
    
    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        return Objects.equals(this.titulo, other.titulo);
    }

    @Override
    public String toString() {
        return "Libro{" + "codigo=" + codigo + "titulo=" + titulo + ", autor=" + autor + ", a\u00f1o=" + año + ", genero=" + genero + ", disponible=" + disponible + ", nomBiblioteca=" + nomBiblioteca + '}';
    }

    
   

   
        

    
    @Override
    public void prestar() {
        setDisponible("NO");
         }

    @Override
    public void devolver() {
        setDisponible("SI");
        }
        
    
}
