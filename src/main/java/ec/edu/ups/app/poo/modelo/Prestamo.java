/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.app.poo.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author dell
 */
public class Prestamo {

    private int numeroPrestamo;
    private List<Libro> listaLibro;
    private Cliente cliente;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private String identificacion;
    //Constructor vacio

    public Prestamo() {
        listaLibro = new ArrayList<>();
    }
    //Constructor con sus atributos

    public Prestamo(Cliente cliente, Date fechaPrestamo, Date fechaDevolucion, int numeroPrestamo) {

        listaLibro = new ArrayList<>();
        this.cliente = cliente;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.numeroPrestamo = numeroPrestamo;
    }
    public Prestamo(int numeroPrestamo, Date fechaPrestamo, Date fechaDevolucion,String identificacion ) {

        listaLibro = new ArrayList<>();
        
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.numeroPrestamo = numeroPrestamo;
        this.identificacion = identificacion;
    }
    //Constructor con otros atributos

    public Prestamo(int numeroPrestamo, Date fechaPrestamo, Date fechaDevolucion) {
        listaLibro = new ArrayList<>();
        this.numeroPrestamo = numeroPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    //Creacion de los getters y setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getNumeroPrestamo() {
        return numeroPrestamo;
    }

    public void setNumeroPrestamo(int numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
    }
    //Agrefamos el libro el libro que prestamos

    public void agregarLibro(Libro libro) {
        listaLibro.add(libro);

    }

    public List<Libro> getLibros() {
        return listaLibro;
    }
    //Calculamos los dias prestamo

    public int calcularDiasPrestamo(Date fechaPrestamo, Date fechaDevolucion) {
        int dias = (int) ((fechaDevolucion.getTime() - fechaPrestamo.getTime()) / (24 * 60 * 60 * 1000));

        return dias;
    }
    //Creación del metodo si es prestamo vigente 

    public void esPrestamoVigente(boolean estado) {
        if (estado == true) {
            System.out.println("No existe un prestamo vigente, puede continuar.\n");

        } else {
            System.out.println("El libro se encuentra en un prestamo vigente!");

        }
    }

    //Creacion del toString
    @Override
    public String toString() {
        return "Prestamo [libros=" + listaLibro + ", Cliente=" + cliente + ", fechaPrestamo=" + fechaPrestamo
                + ", fechaDevolucion=" + fechaDevolucion + "]";
    }
}


