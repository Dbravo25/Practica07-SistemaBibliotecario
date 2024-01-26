/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.app.poo.controlador;

import ec.edu.ups.app.poo.IDAO.BibliotecaIDAO;
import ec.edu.ups.app.poo.IDAO.LibroIDAO;
import ec.edu.ups.app.poo.modelo.Biblioteca;
import ec.edu.ups.app.poo.modelo.Libro;
import java.util.List;

/**
 *
 * @author dell
 */
public class BibliotecaControlador {
    private BibliotecaIDAO bibliotecaDAO;
    private Biblioteca biblioteca;
    private LibroIDAO libroDAO;
    private Libro libro;

    public BibliotecaControlador(BibliotecaIDAO bibliotecaDAO) {
        this.bibliotecaDAO = bibliotecaDAO;
   
    }
    public void create(int codigo, String nombre, String direccion, String telefono){
        biblioteca = new Biblioteca(codigo, nombre, direccion, telefono);
        bibliotecaDAO.create(biblioteca);
        
    }
    public Biblioteca read(int codigo){
        biblioteca = bibliotecaDAO.read(codigo);
        return biblioteca;
    }
    public Biblioteca read(String nombre){
        biblioteca = bibliotecaDAO.read(nombre);
        return biblioteca;
    }
     public void update(int codigo, String nombre, String direccion, String telefono){
        biblioteca = new Biblioteca(codigo, nombre, direccion, telefono);
        bibliotecaDAO.update(codigo, biblioteca);
          
        
     }
     public void delete(int codigo){
        biblioteca = bibliotecaDAO.read(codigo);
        bibliotecaDAO.delete(biblioteca.getCodigo(), biblioteca.getNombre()); 
            
        
     }
     public List<Biblioteca> list(){
         return bibliotecaDAO.list();
     }
     
     public void agregarLibro(String nombre, Libro libro){
         bibliotecaDAO.agregarBook(nombre, libro);
         
     }
     public List<Libro> listLibros(String nombre){
         return bibliotecaDAO.listLibros(nombre);
         
     }
   

    
    
}
