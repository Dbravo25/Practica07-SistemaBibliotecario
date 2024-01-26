/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.app.poo.controlador;

import ec.edu.ups.app.poo.IDAO.ClienteIDAO;
import ec.edu.ups.app.poo.IDAO.LibroIDAO;
import ec.edu.ups.app.poo.IDAO.PrestamoIDAO;
import ec.edu.ups.app.poo.modelo.Cliente;
import ec.edu.ups.app.poo.modelo.Libro;
import ec.edu.ups.app.poo.modelo.Prestamo;
import java.util.Date;
import java.util.List;

/**
 *
 * @author dell
 */
public class PrestamoControlador {
    private PrestamoIDAO prestamoDAO;
    private Prestamo prestamo;
    private Cliente cliente;
    private ClienteIDAO clienteDAO;
    private LibroIDAO libroDAO;
    private Libro libro;

    public PrestamoControlador(PrestamoIDAO prestamoDAO,ClienteIDAO clienteDAO,LibroIDAO libroDAO ) {
        this.prestamoDAO = prestamoDAO;
        this.clienteDAO = clienteDAO;
        this.libroDAO=libroDAO;
    }
    
    
    public void create( int numPrestamo, Date fechaPrestamo, Date fechaDevolucion, String identificacion){
        prestamo = new Prestamo(numPrestamo, fechaPrestamo, fechaDevolucion, identificacion);
        prestamoDAO.create(prestamo);
    }
    public Prestamo read(int numPrestamo){
        prestamo = prestamoDAO.read(numPrestamo);
        return prestamo;
        
    }
    public void update(int numPrestamo, Date fechaPrestamo, Date fechaDevolucion, String identificacion){
        prestamo = new Prestamo(numPrestamo, fechaPrestamo, fechaDevolucion, identificacion);
        prestamoDAO.update(numPrestamo, prestamo);
    }
    public void delete(int numPrestamo){
        prestamoDAO.delete(numPrestamo);
        
    }
    public List<Prestamo> list(){
        return prestamoDAO.list();
    }
    public boolean agregarCliente(String identificacion){
        cliente = clienteDAO.read(identificacion);
        if(cliente!= null){
        prestamo.setCliente(cliente);
        return true;
        }else{
        return false;
        }
    }
    public boolean agregarLibros(String numero,String titulo){
        libro = libroDAO.read(titulo);
        if (libro!= null){
        libro.prestar();
        prestamo.agregarLibro(libro);
        prestamoDAO.agregarBook(numero, libro);
        return true;
        }else{
            return false;
        }
    }
    public boolean devolverLibro(String titulo, String numero){
        libro = libroDAO.read(titulo);
        if(libro!= null){
        libro.devolver();
            actualizarLibro(numero, libro.getTitulo(), libro);
        return true;
        }else{
            return false;
        }
    }
     public List<Libro> listLibros(String numero){
         return prestamoDAO.listLibros(numero);
         
     }
       public void actualizarLibro(String numero, String titulo, Libro libro){
         prestamoDAO.actualizar(numero, titulo, libro);
     }
    
    
    
}
