/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.app.poo.DAO;

import ec.edu.ups.app.poo.IDAO.PrestamoIDAO;
import ec.edu.ups.app.poo.modelo.Libro;
import ec.edu.ups.app.poo.modelo.Prestamo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dell
 */
public class PrestamoDAO implements PrestamoIDAO {
    //List<Prestamo> prestamos;

    public PrestamoDAO() {
       // prestamos = new ArrayList<>();
    }
    

    @Override
    public void create(Prestamo prestamo) {
        //prestamos.add(prestamo);
        guardarEnArchivo(prestamo);
        
       }

    @Override
    public Prestamo read(int numPrestamo) {
        try {
            /*for(Prestamo prestamo: prestamos){
            if(prestamo.getNumeroPrestamo() == numPrestamo){
            return prestamo;
            }
            }
            return null;*/
            return leer(numPrestamo);
        } catch (IOException ex) {
            Logger.getLogger(PrestamoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (ParseException ex) {
            Logger.getLogger(PrestamoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
     }

    @Override
    public void update(int numPrestamo, Prestamo prestamo) {
        /*for(int i =0; i<prestamos.size(); i++){
            Prestamo prestamoUno = prestamos.get(i);
            if(prestamoUno.getNumeroPrestamo() == numPrestamo){
                prestamoUno.setFechaDevolucion(prestamo.getFechaDevolucion());
                prestamos.set(i, prestamoUno);
            }
            
        }*/
        actualizard(numPrestamo, prestamo);
       }

    @Override
    public void delete(int numPrestamo) {
        try {
            /* for(int i =0; i<prestamos.size(); i++){
            Prestamo prestamoUno = prestamos.get(i);
            if(prestamoUno.getNumeroPrestamo() == numPrestamo){
            prestamos.remove(i);
            }
            
            }*/
            eliminar(numPrestamo);
        } catch (IOException ex) {
            Logger.getLogger(PrestamoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Prestamo> list() {
        try {
            //return prestamos;
            return listar();
        } catch (IOException ex) {
            Logger.getLogger(PrestamoDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro exio");
            return null;
        } catch (ParseException ex) {
            Logger.getLogger(PrestamoDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro parse");
            return null;
        }
    }
     @Override
    public void agregarBook(String numero, Libro libro) {
        try {
            agregarLibro(numero, libro);
        } catch (IOException ex) {
            Logger.getLogger(PrestamoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    @Override
    public List<Libro> listLibros(String numero) {
        try {
            return listarLibros(numero);
        } catch (IOException ex) {
            Logger.getLogger(PrestamoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return null;
      }
    
    
    String ruta = "C:/Users/dell/Documents/SistemaBibliotecario/Prestamo.txt";
    
    public void guardarEnArchivo(Prestamo  prestamo) {
        try {
            FileWriter archivoEscritura = new FileWriter(ruta, true);
            BufferedWriter escritura = new BufferedWriter(archivoEscritura);
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            
            String linea = String.format("%d;%s;%s;%s\n", prestamo.getNumeroPrestamo(), formatoFecha.format(prestamo.getFechaPrestamo()), formatoFecha.format(prestamo.getFechaDevolucion()), prestamo.getIdentificacion());
            escritura.append(linea);
            escritura.close();
            archivoEscritura.close();
        } catch (FileNotFoundException el) {
            System.out.println("Ruta de archivo no encontrada");
        } catch (IOException e2) {
            System.out.println("Error de escritura" + e2.getMessage());
        } catch (Exception e) {
            System.out.println("Error General Prestamo" + e.getMessage());
        }
    }
    
     public Prestamo leer(int numPrestamo) throws IOException, ParseException {
    try (BufferedReader lectura = new BufferedReader(new FileReader(ruta))) {
        String linea;
        while ((linea = lectura.readLine()) != null) {
            // Separar la línea en partes usando la coma como delimitador
            String[] partes = linea.split(";");
            
             if (partes.length >= 4 && Integer.parseInt(partes[0]) == numPrestamo) {
                  SimpleDateFormat fechaFormato = new SimpleDateFormat("dd/MM/yyyy");
                    Date fechaPrestamo = fechaFormato.parse(partes[1]);
                    Date fechaDevolucion =  fechaFormato.parse(partes[2]);

                    // Crear un objeto Prestamo con los datos de la línea
                    Prestamo prestamo = new Prestamo(Integer.parseInt(partes[0]), fechaPrestamo, fechaDevolucion, partes[3]);

                    return prestamo;
                }
            }
      
        
    }
        return null; // Código no encontrado
    }
    public boolean actualizard(int  numPrestamo, Prestamo prestamo){
        
        try (BufferedReader lector = new BufferedReader(new FileReader(ruta));
             BufferedWriter escritor = new BufferedWriter(new FileWriter(ruta + ".temp"))) {

            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split(";");

 
                if (Integer.parseInt(partes[0]) == numPrestamo) {
                    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
                   
                    partes[0] = String.valueOf(prestamo.getNumeroPrestamo());
                    partes[1] = String.valueOf( formatoFecha.format(prestamo.getFechaPrestamo()));
                    partes[2] = String.valueOf(formatoFecha.format(prestamo.getFechaDevolucion()));
                    partes[3] = prestamo.getIdentificacion();
                    
                    
                }

               
                String lineaActualizada = String.join(";", partes);

     
                escritor.write(lineaActualizada);
                escritor.newLine();
            }

        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error de lectura o escritura: " + ex.getMessage());
            return false;
        }

        
        Path archivoOriginal = Paths.get(ruta);
        Path archivoTemporal = Paths.get(ruta + ".temp");

        try {
            Files.move(archivoTemporal, archivoOriginal, StandardCopyOption.REPLACE_EXISTING);
            
            return true;
        } catch (IOException ex) {
            ex.printStackTrace();
           
            return false;
        }
        
    }
    
    public boolean eliminar(int numPrestamo) throws FileNotFoundException, IOException{
     try {
         String ruta2 = "C:/Users/dell/Documents/SistemaBibliotecario/Prestamos" + "\\" + String.valueOf(numPrestamo) + ".txt";
         File d = new File(ruta2);
        File archivo = new File(ruta);
 
        if (!archivo.isFile()) {
            
            return false;
        }else{
            d.delete();
        }
 
        
        File tempFile = new File(archivo.getAbsolutePath() + ".tmp");
 
        BufferedReader lectura = new BufferedReader(new FileReader(ruta));
        PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
 
        String linea = null;
 
        while ((linea = lectura.readLine()) != null) {
             String[] partes = linea.split(";");

            if (Integer.parseInt(partes[0]) != numPrestamo) {
                pw.println(linea);
                pw.flush();
                
            }
            
        }
        pw.close();
        lectura.close();
 

        if (!archivo.delete()) {
            return false;
        }
 
      
        if (!tempFile.renameTo(archivo)){
            return false;
        }
        else{
            return true;
        }
    } catch (FileNotFoundException ex) {
        ex.printStackTrace();
    } catch (IOException ex) {
        ex.printStackTrace();
        return false;
    }
     return false;
}
    public List<Prestamo> listar() throws FileNotFoundException, IOException, ParseException{
    
    List<Prestamo> prestamod = new ArrayList<>();
    try (BufferedReader lectura = new BufferedReader(new FileReader(ruta))) {
        String linea;
        while ((linea = lectura.readLine()) != null) {
            // Separar la línea en partes usando la coma como delimitador
            String[] partes = linea.split(";");
            SimpleDateFormat fechaFormato = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaPrestamo = fechaFormato.parse(partes[1]);
            Date fechaDevolucion = fechaFormato.parse(partes[2]);

                    // Crear un objeto Prestamo con los datos de la línea
                    Prestamo prestamo = new Prestamo(Integer.parseInt(partes[0]), fechaPrestamo, fechaDevolucion, partes[3]);
                    prestamod.add(prestamo);
            }
        return prestamod;
        }   
   
}
    public boolean agregarLibro(String  numero, Libro libro) throws IOException{
            
            String ruta2 = "C:/Users/dell/Documents/SistemaBibliotecario/Prestamos" + "\\" + numero + ".txt";
            
            File archivo = new File(ruta2);
             if (!archivo.exists()) {
                 archivo.createNewFile();
             }
             
             try {
            FileWriter archivoEscritura = new FileWriter(ruta2, true);
            BufferedWriter escritura = new BufferedWriter(archivoEscritura);
            String linea = String.format("%d;%s;%s;%d;%s;%s;%s\n",  libro.getCodigo(),
                    libro.getTitulo(), libro.getAutor(), libro.getAño(),libro.getGenero(), libro.getDisponible(), libro.getNombiblioteca());
            escritura.append(linea);
            escritura.close();
            archivoEscritura.close();
            return true;
        } catch (FileNotFoundException el) {
            System.out.println("Ruta de archivo no encontrada");
        } catch (IOException e2) {
            System.out.println("Error de escritura");
        } catch (Exception e) {
            System.out.println("Error General");
        }
             return false;
    }
    
     public List<Libro> listarLibros(String numero) throws FileNotFoundException, IOException{
    String ruta2 = "C:/Users/dell/Documents/SistemaBibliotecario/Prestamos" + "\\" + numero + ".txt";
    List<Libro> libros = new ArrayList<>();
    try (BufferedReader lectura = new BufferedReader(new FileReader(ruta2))) {
        String linea;
        while ((linea = lectura.readLine()) != null) {
            // Separar la línea en partes usando la coma como delimitador
            String[] partes = linea.split(";");
            Libro libro = new Libro(Integer.parseInt(partes[0]), partes[1],partes[2], Integer.parseInt(partes[3]),partes[4],partes[5],partes[6]);
             libros.add(libro);
            }
        return libros;
        }   
   
}
     public boolean actualizard(String numero, String titulo, Libro libro){
         String ruta2 = "C:/Users/dell/Documents/SistemaBibliotecario/Prestamos" + "\\" + numero + ".txt";
         System.out.println(ruta2);
        try (BufferedReader lector = new BufferedReader(new FileReader(ruta2));
             BufferedWriter escritor = new BufferedWriter(new FileWriter(ruta2 + ".temp"))) {
            
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split(";");

                System.out.println("No encuentro");
                if (partes[1].equalsIgnoreCase(titulo)) {
                    System.out.println("Ya encuentro");
                    
                    partes[1] = libro.getTitulo();
                    partes[2] = libro.getAutor();
                    partes[3] = String.valueOf(libro.getAño());
                    partes[4] = libro.getGenero();
                    partes[5]= "SI";
                    partes[6] = libro.getNombiblioteca();
                    
                    
                }

               
                String lineaActualizada = String.join(";", partes);

     
                escritor.write(lineaActualizada);
                escritor.newLine();
            }

        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Error de lectura o escritura: " + ex.getMessage());
            return false;
        }

        
        Path archivoOriginal = Paths.get(ruta2);
        Path archivoTemporal = Paths.get(ruta2 + ".temp");

        try {
            Files.move(archivoTemporal, archivoOriginal, StandardCopyOption.REPLACE_EXISTING);
            
            return true;
        } catch (IOException ex) {
            ex.printStackTrace();
           
            return false;
        }
        
    }

    @Override
    public void actualizar(String numero, String titulo, Libro libro) {
        actualizard(numero, titulo, libro);
        }

    

   
  
    
}
