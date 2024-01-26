/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.app.poo.DAO;

import ec.edu.ups.app.poo.IDAO.BibliotecaIDAO;
import ec.edu.ups.app.poo.modelo.Biblioteca;
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
public class BibliotecaDAO implements BibliotecaIDAO{
    

    private List<Biblioteca> bibliotecas;
    

    public BibliotecaDAO() {
    	//bibliotecas = new ArrayList<>();
    }

    @Override
    public void create(Biblioteca biblioteca) {
       // bibliotecas.add(biblioteca);
        guardarEnArchivo(biblioteca);
    }

    @Override
    public Biblioteca read(int codigo) {
        try {
            /*for (Biblioteca biblioteca : bibliotecas){
            if(biblioteca.getCodigo()== codigo){
            return biblioteca;
            }
            }
            return null;*/
            return leer(codigo);
        } catch (IOException ex) {
            System.out.println("Error de lectura!");
        }
        return null;
    }

    @Override
    public void update(int codigo, Biblioteca biblioteca) {
       /* for(int i = 0; i<bibliotecas.size();i++){
            Biblioteca bibliotecauno = bibliotecas.get(i);
            if(bibliotecauno.getCodigo() == codigo){
               bibliotecauno.setNombre(biblioteca.getNombre());
                bibliotecauno.setDireccion(biblioteca.getDireccion());
                bibliotecauno.setTelefono(biblioteca.getTelefono());
               bibliotecas.set(i, bibliotecauno);
               
            }
            
        }*/
        actualizard(codigo, biblioteca);
        
    }

    @Override
    public void delete(int codigo, String nombre) {
        try {
            /* for(int i = 0; i<bibliotecas.size();i++){
            Biblioteca bibliotecauno = bibliotecas.get(i);
            if(bibliotecauno.getCodigo() == codigo){
            bibliotecas.remove(i);
            
            }
            
            }  */
            eliminar(codigo, nombre);
            
        } catch (IOException ex) {
            
        }
    }

    @Override
    public List<Biblioteca> list() {
        try {
            return listar();
        } catch (IOException ex) {
            Logger.getLogger(BibliotecaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public Biblioteca read(String nombre) {
        try {
            /*for(Biblioteca biblioteca : bibliotecas){
            if(biblioteca.getNombre().equalsIgnoreCase(nombre)){
            return biblioteca;
            }
            }
            return null;*/
            return leer(nombre);
        } catch (IOException ex) {
            Logger.getLogger(BibliotecaDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return null;
    }
    
    @Override
    public void agregarBook(String nombre, Libro libro) {
        try {
            agregarLibro(nombre, libro);
        } catch (IOException ex) {
            Logger.getLogger(BibliotecaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    @Override
    public List<Libro> listLibros(String nombre) {
        try {      
    
    
               return listarLibros(nombre);
        } catch (IOException ex) {
            Logger.getLogger(BibliotecaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
     
    String ruta = "C:/Users/dell/Documents/SistemaBibliotecario/Biblioteca.txt";

   

    public void guardarEnArchivo(Biblioteca biblioteca) {
        try {
            FileWriter archivoEscritura = new FileWriter(ruta, true);
            BufferedWriter escritura = new BufferedWriter(archivoEscritura);
            String linea = String.format("%d;%s;%s;%s\n", biblioteca.getCodigo(), biblioteca.getNombre(),
                    biblioteca.getDireccion(),biblioteca.getTelefono());
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
    
     public Biblioteca leer(int codigo) throws IOException {
    try (BufferedReader lectura = new BufferedReader(new FileReader(ruta))) {
        String linea;
        while ((linea = lectura.readLine()) != null) {
            // Separar la línea en partes usando la coma como delimitador
            String[] partes = linea.split(";");
            
            // Verificar si la primera parte (código) es igual al código buscado
            if (partes.length >= 4 && !partes[0].isEmpty() && Integer.parseInt(partes[0]) == codigo) {
                // Crear un objeto Biblioteca con los datos de la línea
                Biblioteca bibliotecaUno = new Biblioteca(Integer.parseInt(partes[0]), partes[1], partes[2],partes[3]);
                return bibliotecaUno;
            }
        }
    }

        return null; // Código no encontrado
    }
    public boolean actualizard(int codigo, Biblioteca biblioteca){
        
        try (BufferedReader lector = new BufferedReader(new FileReader(ruta));
             BufferedWriter escritor = new BufferedWriter(new FileWriter(ruta + ".temp"))) {

            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split(";");

 
                if (Integer.parseInt(partes[0]) == codigo) {
                    partes[1] = biblioteca.getNombre(); // Actualizar el campo necesario
                    partes[2] = biblioteca.getDireccion();
                    partes[3] = biblioteca.getTelefono();
                    
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
            System.out.println("Registro actualizado con éxito.");
            return true;
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("No se pudo renombrar el archivo temporal: " + ex.getMessage());
            return false;
        }
        
    }
    
    public boolean eliminar(int codigo, String nombre) throws FileNotFoundException, IOException{
     try {
        String ruta2 = "C:/Users/dell/Documents/SistemaBibliotecario/Bibliotecas" + "\\" + nombre + ".txt";
        File archivoD = new File(ruta2);
        File archivo = new File(ruta);
 
        if (!archivo.isFile()) {
            
            return false;
        }else{
            archivoD.delete();
        }
        File tempFile = new File(archivo.getAbsolutePath() + ".tmp");
 
        BufferedReader lectura = new BufferedReader(new FileReader(ruta));
        PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
 
        String linea = null;
 
        while ((linea = lectura.readLine()) != null) {
             String[] partes = linea.split(";");

            if (Integer.parseInt(partes[0]) != codigo) {
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
    public List<Biblioteca> listar() throws FileNotFoundException, IOException{
    
     bibliotecas = new ArrayList<>();
    try (BufferedReader lectura = new BufferedReader(new FileReader(ruta))) {
        String linea;
        while ((linea = lectura.readLine()) != null) {
            // Separar la línea en partes usando la coma como delimitador
            String[] partes = linea.split(";");
             Biblioteca biblioteca = new Biblioteca(Integer.parseInt(partes[0]), partes[1], partes[2], partes[3]);
             bibliotecas.add(biblioteca);
            }
        return bibliotecas;
        }   
   
    }
    
        public boolean agregarLibro(String  nombre, Libro libro) throws IOException{
            
            String ruta2 = "C:/Users/dell/Documents/SistemaBibliotecario/Bibliotecas" + "\\" + nombre + ".txt";
            
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
        
       /* try (BufferedReader lector = new BufferedReader(new FileReader(ruta2));
             BufferedWriter escritor = new BufferedWriter(new FileWriter(ruta2 + ".temp"))) {

            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split(";");

 
                if (partes.length>=4 && partes[1].equals(nombre)) {
                    
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
            System.out.println("Registro actualizado con éxito.");
            return true;
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("No se pudo renombrar el archivo temporal: " + ex.getMessage());
            return false;
        }*/
       
        
    }
      
    public Biblioteca leer(String nombre) throws IOException {
    try (BufferedReader lectura = new BufferedReader(new FileReader(ruta))) {
        String linea;
        while ((linea = lectura.readLine()) != null) {
            // Separar la línea en partes usando la coma como delimitador
            String[] partes = linea.split(";");
            
            // Verificar si la primera parte (código) es igual al código buscado
            if (partes[1].equalsIgnoreCase(nombre)) {
                // Crear un objeto Biblioteca con los datos de la línea
                Biblioteca bibliotecaUno = new Biblioteca(Integer.parseInt(partes[0]), partes[1], partes[2],partes[3]);
                return bibliotecaUno;
            }
        }
    }
        System.out.println("No existe biblioteca");
        return null; // Código no encontrado
    }
    
  public List<Libro> listarLibros(String nombre) throws FileNotFoundException, IOException{
    String ruta2 = "C:/Users/dell/Documents/SistemaBibliotecario/Bibliotecas" + "\\" + nombre + ".txt";
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

    
     
     
     
}

    
    
    
    
