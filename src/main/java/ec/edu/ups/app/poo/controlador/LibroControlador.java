/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.app.poo.controlador;

import ec.edu.ups.app.poo.IDAO.LibroIDAO;
import ec.edu.ups.app.poo.modelo.Libro;
import java.util.List;

/**
 *
 * @author dell
 */
public class LibroControlador {
    private LibroIDAO libroDAO;
    private Libro libro;
    
    public LibroControlador(LibroIDAO libroDAO){
        this.libroDAO = libroDAO;
    }
    
    public void create(int codigo, String titulo, String autor, int año,String genero, String disponible, String nomBiblioteca){
        libro = new Libro(codigo, titulo, autor, año, genero, disponible, nomBiblioteca);
        libroDAO.create(libro);
    }
    public Libro read(String titulo){
        libro = libroDAO.read(titulo);
        return libro;
        
    }
    public Libro read(int codigo){
        libro = libroDAO.read(codigo);
        return libro;
    }
    public void update(int codigo, String titulo, String autor, int año,String genero, String disponible, String nomBiblioteca){
        libro = new Libro(codigo, titulo, autor, año, genero, disponible, nomBiblioteca);
        libroDAO.update(codigo, libro);
          
        
    }
    public void delete(int codigo, String nombre){
        libroDAO.delete(codigo, nombre);
            
        
    }
    public List<Libro> list(){
        return libroDAO.list();
        
    }
}
