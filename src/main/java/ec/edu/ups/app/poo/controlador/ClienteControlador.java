/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.app.poo.controlador;

import ec.edu.ups.app.poo.IDAO.ClienteIDAO;
import ec.edu.ups.app.poo.modelo.Cliente;
import java.util.List;

/**
 *
 * @author dell
 */
public class ClienteControlador {
    private ClienteIDAO clienteDAO;
    private Cliente cliente;

    public ClienteControlador(ClienteIDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }
    public void create(String nombre, String identificacion, String correo){
        cliente = new Cliente(nombre, identificacion, correo);
        clienteDAO.create(cliente);
    }
    public Cliente read(String identificacion){
        cliente = clienteDAO.read(identificacion);
        return cliente;
    }
    public void update(String nombre, String identificacion, String correo){
        cliente = new Cliente(nombre, identificacion, correo);
        clienteDAO.update(identificacion, cliente);
           
       
       
        
    }
    public void delete(String identificacion){
        clienteDAO.delete(identificacion);
  
    }
    public List<Cliente> list(){
        return clienteDAO.list();
    }
    
    
    
}
