/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.app.poo.DAO;

import ec.edu.ups.app.poo.IDAO.LibroIDAO;
import ec.edu.ups.app.poo.modelo.Cliente;
import ec.edu.ups.app.poo.modelo.Libro;
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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dell
 */
public class LibroDAO implements LibroIDAO{
    
   // private List<Libro> libros;
    
    public LibroDAO(){
       // libros = new ArrayList<>();
    }

    @Override
    public void create(Libro libro) {
        guardarEnArchivo(libro);
    }

    @Override
    public Libro read(String titulo) {
        try {
            /*for(Libro libro : libros){
            if(libro.getTitulo().equalsIgnoreCase(titulo)){
            return libro;
            }
            }
            return null;*/
            return leer(titulo);
        } catch (IOException ex) {
            Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
      }

    @Override
    public void update(int codigo, Libro libro) {
        /*for(int i = 0; i<libros.size(); i++){
           Libro libroUno = libros.get(i);
           if (libroUno.getCodigo()==codigo){
               libros.set(i, libro);
               
           }
        }*/
        actualizard(codigo, libro);
        actualizardos(codigo, libro);
       
    }

    @Override
    public void delete(int codigo, String nombre) {
        try {
            /* for(int i = 0; i<libros.size(); i++){
            Libro libroUno = libros.get(i);
            if (libroUno.getCodigo() == codigo){
            libros.remove(i);
            
            }
            }*/
            eliminar(codigo);
            eliminarDos(nombre, codigo);
        } catch (IOException ex) {
            Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }

    @Override
    public List<Libro> list() {
        try {
            return listar();
        } catch (IOException ex) {
            Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public Libro read(int codigo) {
        try {
            /*for(Libro libro : libros){
            if(libro.getCodigo() == codigo){
            return libro;
            }
            }
            return null;*/
            return leer(codigo);
        } catch (IOException ex) {
            Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
      }
    
    
    //CODIGO
    
    
       String ruta = "C:/Users/dell/Documents/SistemaBibliotecario/Libro.txt";
    public void guardarEnArchivo(Libro  libro) {
        try {
            FileWriter archivoEscritura = new FileWriter(ruta, true);
            BufferedWriter escritura = new BufferedWriter(archivoEscritura);
            String linea = String.format("%d;%s;%s;%d;%s;%s;%s\n",  libro.getCodigo(),
                    libro.getTitulo(), libro.getAutor(), libro.getAño(),libro.getGenero(), libro.getDisponible(), libro.getNombiblioteca());
            escritura.append(linea);
            escritura.close();
            archivoEscritura.close();
        } catch (FileNotFoundException el) {
            System.out.println("Ruta de archivo no encontrada");
        } catch (IOException e2) {
            System.out.println("Error de escritura");
        } catch (Exception e) {
            System.out.println("Error General");
        }
    }
    
     public Libro leer(int codigo) throws IOException {
    try (BufferedReader lectura = new BufferedReader(new FileReader(ruta))) {
        String linea;
        while ((linea = lectura.readLine()) != null) {
            // Separar la línea en partes usando la coma como delimitador
            String[] partes = linea.split(";");
            
            // Verificar si la primera parte (código) es igual al código buscado
            
            if (partes.length >= 7 && Integer.parseInt(partes[0]) == codigo) {
                
                // Crear un objeto Biblioteca con los datos de la línea
                Libro libro = new Libro(Integer.parseInt(partes[0]), partes[1],partes[2], Integer.parseInt(partes[3]),partes[4],partes[5],partes[6]);
                
                return libro;
            }
        }
    }
         
        return null; // Código no encontrado
    }
     
     public Libro leer(String titulo) throws IOException {
    try (BufferedReader lectura = new BufferedReader(new FileReader(ruta))) {
        String linea;
        while ((linea = lectura.readLine()) != null) {
            // Separar la línea en partes usando la coma como delimitador
            String[] partes = linea.split(";");
            
            // Verificar si la primera parte (código) es igual al código buscado
            
            if (partes.length >= 7 && partes[1].equalsIgnoreCase(titulo) ){
                
                // Crear un objeto Biblioteca con los datos de la línea
                Libro libro = new Libro(Integer.parseInt(partes[0]), partes[1],partes[2], Integer.parseInt(partes[3]),partes[4],partes[5],partes[6]);
                
                return libro;
            }
        }
    }
         
        return null; // Código no encontrado
    }
     
     
    public boolean actualizard(int codigo, Libro libro){
        
        try (BufferedReader lector = new BufferedReader(new FileReader(ruta));
             BufferedWriter escritor = new BufferedWriter(new FileWriter(ruta + ".temp"))) {

            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split(";");

 
                if (Integer.parseInt(partes[0])==codigo) {
                    partes[1] = libro.getTitulo();
                    partes[2] = libro.getAutor();
                    partes[3] = String.valueOf(libro.getAño());
                    partes[4] = libro.getGenero();
                    partes[5]= libro.getDisponible();
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
    
    public boolean eliminar(int codigo) throws FileNotFoundException, IOException{
     try {
 
        File archivo = new File(ruta);
 
        if (!archivo.isFile()) {
            
            return false;
        }
 
        
        File tempFile = new File(archivo.getAbsolutePath() + ".tmp");
 
        BufferedReader lectura = new BufferedReader(new FileReader(ruta));
        PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
 
        String linea = null;
 
        while ((linea = lectura.readLine()) != null) {
             String[] partes = linea.split(";");

            if ( Integer.parseInt(partes[0]) !=  codigo) {
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
    public List<Libro> listar() throws FileNotFoundException, IOException{
    
    List<Libro> libros = new ArrayList<>();
    try (BufferedReader lectura = new BufferedReader(new FileReader(ruta))) {
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
     public boolean actualizardos(int codigo, Libro libro){
     String nombre = libro.getNombiblioteca();
        String ruta2 = "C:/Users/dell/Documents/SistemaBibliotecario/Bibliotecas" + "\\" + nombre + ".txt";
        try (BufferedReader lector = new BufferedReader(new FileReader(ruta2));
             BufferedWriter escritor = new BufferedWriter(new FileWriter(ruta2 + ".temp"))) {

            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split(";");

 
                if (Integer.parseInt(partes[0])==codigo) {
                    partes[1] = libro.getTitulo();
                    partes[2] = libro.getAutor();
                    partes[3] = String.valueOf(libro.getAño());
                    partes[4] = libro.getGenero();
                    partes[5]= libro.getDisponible();
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
     
      public boolean eliminarDos(String nombre, int codigo) throws FileNotFoundException, IOException{
          
    String ruta2 = "C:/Users/dell/Documents/SistemaBibliotecario/Bibliotecas" + "\\" + nombre + ".txt";
     try {
 
        File archivo = new File(ruta2);
 
        if (!archivo.isFile()) {
            
            return false;
        }
 
        
        File tempFile = new File(archivo.getAbsolutePath() + ".tmp");
 
        BufferedReader lectura = new BufferedReader(new FileReader(ruta2));
        PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
 
        String linea = null;
 
        while ((linea = lectura.readLine()) != null) {
             String[] partes = linea.split(";");

            if ( Integer.parseInt(partes[0]) !=  codigo) {
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
    
}
