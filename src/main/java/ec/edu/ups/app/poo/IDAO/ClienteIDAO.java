/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.app.poo.IDAO;

import ec.edu.ups.app.poo.modelo.Cliente;
import java.util.List;

/**
 *
 * @author dell
 */
public interface ClienteIDAO  {
      void create(Cliente cliente);
    Cliente read(String identificacion);
    void update(String identificacion, Cliente cliente);
    void delete(String identificacion);
    List<Cliente> list();
    
}
