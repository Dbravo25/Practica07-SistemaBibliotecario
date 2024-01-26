/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.app.poo.DAO;

import ec.edu.ups.app.poo.IDAO.ClienteIDAO;
import ec.edu.ups.app.poo.modelo.Cliente;
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
public class ClienteDAO implements ClienteIDAO{
    List<Cliente> clientes;

    public ClienteDAO() {
        clientes = new ArrayList<>();
        
    }
    

    @Override
    public void create(Cliente cliente) {
        guardarEnArchivo(cliente);
       }

    @Override
    public Cliente read(String identificacion) {
        try {
            /*for(Cliente cliente : clientes){
            if(cliente.getIdentificacion().equalsIgnoreCase(identificacion)){
            return cliente;
            }
            }
            return null;*/
            
            return leer(identificacion);
        } catch (IOException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return null;
     }

    @Override
    public void update(String identificacion, Cliente cliente) {
        /*for(int i = 0; i<clientes.size(); i++){
            Cliente clienteUno = clientes.get(i);
            if (clienteUno.getIdentificacion().equalsIgnoreCase(identificacion)){
                clientes.set(i, cliente);
                
            }
        }*/
        actualizard(identificacion, cliente);
        
       
    }
    

    @Override
    public void delete(String identificacion) {
        try {
            /* for(int i = 0; i<clientes.size(); i++){
            Cliente clienteUno = clientes.get(i);
            if (clienteUno.getIdentificacion().equalsIgnoreCase(identificacion)){
            clientes.remove(i);
            
            }
            }*/
            eliminar(identificacion);
        } catch (IOException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Cliente> list() {
        try {
            return listar();
        } catch (IOException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    String ruta = "C:/Users/dell/Documents/SistemaBibliotecario/Cliente.txt";
    public void guardarEnArchivo(Cliente  cliente) {
        try {
            FileWriter archivoEscritura = new FileWriter(ruta, true);
            BufferedWriter escritura = new BufferedWriter(archivoEscritura);
            String linea = String.format("%s;%s;%s\n",  cliente.getNombre(),
                    cliente.getIdentificacion(),cliente.getCorreo());
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
    
     public Cliente leer(String identificacion) throws IOException {
    try (BufferedReader lectura = new BufferedReader(new FileReader(ruta))) {
        String linea;
        while ((linea = lectura.readLine()) != null) {
            // Separar la línea en partes usando la coma como delimitador
            String[] partes = linea.split(";");
            
            // Verificar si la primera parte (código) es igual al código buscado
            
            if (partes.length >= 3 && partes[1].equalsIgnoreCase(identificacion)) {
                
                // Crear un objeto Biblioteca con los datos de la línea
                Cliente cliente = new Cliente(partes[0], partes[1],partes[2]);
                
                return cliente;
            }
        }
    }
         
        return null; // Código no encontrado
    }
    public boolean actualizard(String identificacion, Cliente cliente){
        
        try (BufferedReader lector = new BufferedReader(new FileReader(ruta));
             BufferedWriter escritor = new BufferedWriter(new FileWriter(ruta + ".temp"))) {

            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split(";");

 
                if (partes[1].equalsIgnoreCase(identificacion)) {
                    partes[0] = cliente.getNombre();
                    partes[2] = cliente.getCorreo();
                    
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
    
    public boolean eliminar(String identificacion) throws FileNotFoundException, IOException{
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

            if (!partes[1].equalsIgnoreCase(identificacion)) {
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
    public List<Cliente> listar() throws FileNotFoundException, IOException{
    
    List<Cliente> clientes = new ArrayList<>();
    try (BufferedReader lectura = new BufferedReader(new FileReader(ruta))) {
        String linea;
        while ((linea = lectura.readLine()) != null) {
            // Separar la línea en partes usando la coma como delimitador
            String[] partes = linea.split(";");
            Cliente cliente = new Cliente(partes[0], partes[1], partes[2]);
             clientes.add(cliente);
            }
        return clientes;
        }   
   
}
    
}
