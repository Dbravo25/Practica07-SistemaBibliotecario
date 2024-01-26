/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.app.poo.IDAO;

import ec.edu.ups.app.poo.modelo.Libro;
import ec.edu.ups.app.poo.modelo.Prestamo;
import java.util.List;

/**
 *
 * @author dell
 */
public interface PrestamoIDAO {
    void create(Prestamo prestamo);
    Prestamo read(int numPrestamo);
    void update(int numPrestamo, Prestamo prestamo);
    void delete(int numPrestamo);
    List<Prestamo> list();
    void agregarBook(String numero, Libro libro);
    List<Libro> listLibros(String numero);
    void actualizar(String numero, String titulo, Libro libro);
    
}
