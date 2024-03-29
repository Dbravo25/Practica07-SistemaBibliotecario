/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.app.poo.vista.prestamo;

import ec.edu.ups.app.poo.controlador.ClienteControlador;
import ec.edu.ups.app.poo.controlador.LibroControlador;
import ec.edu.ups.app.poo.controlador.PrestamoControlador;
import ec.edu.ups.app.poo.modelo.Cliente;
import ec.edu.ups.app.poo.modelo.Libro;
import ec.edu.ups.app.poo.modelo.Prestamo;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dell
 */
public class VentanaEliminarPrestamo extends javax.swing.JInternalFrame {
    private PrestamoControlador prestamoControlador;
    private ClienteControlador clientecontrolador;
    private LibroControlador libroControlador;
    private DefaultTableModel tabla;
    /**
     * Creates new form VentanaEliminarPrestamo
     */
    public VentanaEliminarPrestamo(PrestamoControlador prestamoControlador,ClienteControlador clientecontrolador,LibroControlador libroControlador) {
        initComponents();
        this.prestamoControlador=prestamoControlador;
        this.clientecontrolador = clientecontrolador;
        this.libroControlador =  libroControlador;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        btBuscarPrestamo2 = new javax.swing.JButton();
        numCodigoPrestamo3 = new javax.swing.JLabel();
        txtNumPrestamo = new javax.swing.JTextField();
        lbLibrosPrestados2 = new javax.swing.JLabel();
        lbIdentificacionPrestamo3 = new javax.swing.JLabel();
        txtIdentificacionC = new javax.swing.JTextField();
        lbFechaDevolucion3 = new javax.swing.JLabel();
        txtFechaDevolucion3 = new javax.swing.JTextField();
        fechaPrestamo = new javax.swing.JLabel();
        txtFechaPrestamo2 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbLibro2 = new javax.swing.JTable();
        lbNombreCliente3 = new javax.swing.JLabel();
        txtNombreCliente3 = new javax.swing.JTextField();
        lbCorreoCliente3 = new javax.swing.JLabel();
        txtCorreo3 = new javax.swing.JTextField();
        btEliminar = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Eliminar Prestamo");

        jPanel7.setBackground(new java.awt.Color(171, 123, 123));

        btBuscarPrestamo2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btBuscarPrestamo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda-2.png"))); // NOI18N
        btBuscarPrestamo2.setText("Buscar");
        btBuscarPrestamo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarPrestamo2ActionPerformed(evt);
            }
        });

        numCodigoPrestamo3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        numCodigoPrestamo3.setText("Número de Prestamo");

        lbLibrosPrestados2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbLibrosPrestados2.setText("Libros");

        lbIdentificacionPrestamo3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbIdentificacionPrestamo3.setText("Identificación Cliente");

        txtIdentificacionC.setEditable(false);
        txtIdentificacionC.setBackground(new java.awt.Color(70, 73, 75));
        txtIdentificacionC.setForeground(new java.awt.Color(255, 255, 255));

        lbFechaDevolucion3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbFechaDevolucion3.setText("Fecha Devolución");

        txtFechaDevolucion3.setEditable(false);
        txtFechaDevolucion3.setBackground(new java.awt.Color(70, 73, 75));
        txtFechaDevolucion3.setForeground(new java.awt.Color(255, 255, 255));

        fechaPrestamo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fechaPrestamo.setText("Fecha Prestamo");

        txtFechaPrestamo2.setEditable(false);
        txtFechaPrestamo2.setBackground(new java.awt.Color(70, 73, 75));
        txtFechaPrestamo2.setForeground(new java.awt.Color(255, 255, 255));
        txtFechaPrestamo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaPrestamo2ActionPerformed(evt);
            }
        });

        tbLibro2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Autor", "Año", "Género", "Disponible"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tbLibro2);

        lbNombreCliente3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbNombreCliente3.setText("Nombre");

        txtNombreCliente3.setEditable(false);
        txtNombreCliente3.setBackground(new java.awt.Color(70, 73, 75));
        txtNombreCliente3.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreCliente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCliente3ActionPerformed(evt);
            }
        });

        lbCorreoCliente3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbCorreoCliente3.setText("Correo");

        txtCorreo3.setEditable(false);
        txtCorreo3.setBackground(new java.awt.Color(70, 73, 75));
        txtCorreo3.setForeground(new java.awt.Color(255, 255, 255));

        btEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        btLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/escoba.png"))); // NOI18N
        btLimpiar.setText("Limpiar");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(btEliminar)
                        .addGap(73, 73, 73)
                        .addComponent(btLimpiar))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lbLibrosPrestados2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCorreoCliente3)
                            .addComponent(lbNombreCliente3))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreCliente3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreo3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(fechaPrestamo)
                                    .addGap(75, 75, 75)
                                    .addComponent(txtFechaPrestamo2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(lbFechaDevolucion3)
                                    .addGap(63, 63, 63)
                                    .addComponent(txtFechaDevolucion3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numCodigoPrestamo3)
                                    .addComponent(lbIdentificacionPrestamo3))
                                .addGap(85, 85, 85)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIdentificacionC, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(txtNumPrestamo))))
                        .addGap(18, 18, 18)
                        .addComponent(btBuscarPrestamo2)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numCodigoPrestamo3)
                    .addComponent(txtNumPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarPrestamo2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtIdentificacionC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbIdentificacionPrestamo3))
                .addGap(33, 33, 33)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombreCliente3)
                    .addComponent(txtNombreCliente3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCorreoCliente3)
                    .addComponent(txtCorreo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaPrestamo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaPrestamo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaDevolucion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFechaDevolucion3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lbLibrosPrestados2))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btEliminar)
                    .addComponent(btLimpiar))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarPrestamo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarPrestamo2ActionPerformed
        // TODO add your handling code here:
        int numPrestamo = Integer.parseInt(txtNumPrestamo.getText());
        Prestamo prestamo = prestamoControlador.read(numPrestamo);
        if(prestamo!= null){
             SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
             
           String fehchaP= fecha.format(prestamo.getFechaPrestamo());
           String fechaD = fecha.format(prestamo.getFechaDevolucion());
            txtFechaPrestamo2.setText(fehchaP);
            txtFechaDevolucion3.setText(fechaD);
            System.out.println(prestamo.getIdentificacion());
            Cliente cliente = clientecontrolador.read(prestamo.getIdentificacion());
            txtIdentificacionC.setText(cliente.getIdentificacion());
            txtNombreCliente3.setText(cliente.getNombre());
            txtCorreo3.setText(cliente.getCorreo());
            cargarDatos();

        }else{
            JOptionPane.showMessageDialog(this, "No existe el prestamo con tal numero");
        }
        }
    private void cargarDatos() {
        Prestamo prestamo = prestamoControlador.read(Integer.parseInt(txtNumPrestamo.getText()));
        List<Libro> libros = prestamoControlador.listLibros(String.valueOf(prestamo.getNumeroPrestamo()));
        tabla = (DefaultTableModel) tbLibro2.getModel();
        tabla.setNumRows(0);
        for (Libro libro : libros) {
            Object[] rowData = {libro.getTitulo(), libro.getAutor(), libro.getAño(), libro.getGenero(), libro.getDisponible()};
            tabla.addRow(rowData);
        }

    }//GEN-LAST:event_btBuscarPrestamo2ActionPerformed

    private void txtFechaPrestamo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaPrestamo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaPrestamo2ActionPerformed

    private void txtNombreCliente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCliente3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCliente3ActionPerformed

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        // TODO add your handling code here:
       limpiar();
    }    
   private void limpiar(){
       
    txtNumPrestamo.setText("");
        txtIdentificacionC.setText("");
        txtNombreCliente3.setText(""); 
        txtCorreo3.setText("");
        txtFechaPrestamo2.setText("");
        txtFechaDevolucion3.setText("");
        tabla.setNumRows(0);
        
        
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar");
        
            if(resp==JOptionPane.YES_OPTION){
                Prestamo prestamo = prestamoControlador.read(Integer.parseInt(txtNumPrestamo.getText()));
                List<Libro> libros = prestamo.getLibros();
                for (Libro libro : libros) {
                        libro.devolver();
                        libroControlador.update(libro.getCodigo(), libro.getTitulo(), libro.getAutor(), libro.getAño(), libro.getGenero(), "SI", libro.getNombiblioteca());
                }
                prestamoControlador.delete(Integer.parseInt(txtNumPrestamo.getText()));
                
                JOptionPane.showMessageDialog(this, "Se ha eliminado correctamente");
                limpiar();
        }
        
    }//GEN-LAST:event_btEliminarActionPerformed

    public void cambiarIdioma(Locale locale) {
        ResourceBundle mensajes = ResourceBundle.getBundle("mensajes.mensajes", locale);
        ResourceBundle titulos = ResourceBundle.getBundle("titulos.titulos", locale); 
        ResourceBundle tablas = ResourceBundle.getBundle("tablas.tablas", locale); 
        String titulo = tablas.getString("tablaTitulo");
        String autor = tablas.getString("tablaAutor");
        String ano = tablas.getString("tablaAno");
        String genero = tablas.getString("tablaGenero");   
        String disponible = tablas.getString("tablaDisponible");               
        DefaultTableModel tabla2 = (DefaultTableModel) tbLibro2.getModel();
        tabla2.setColumnIdentifiers(new String [] {titulo, autor,ano,genero,disponible});
            this.setTitle(titulos.getString("EliminarP"));
        numCodigoPrestamo3.setText(mensajes.getString("#Prestamo"));
        lbIdentificacionPrestamo3.setText(mensajes.getString("idCliente"));
        lbNombreCliente3.setText(mensajes.getString("nombre"));
        lbCorreoCliente3.setText(mensajes.getString("correoCliente"));
        lbLibrosPrestados2.setText(mensajes.getString("librosTxt"));
        fechaPrestamo.setText(mensajes.getString("fechaPrestamo"));
        lbFechaDevolucion3.setText(mensajes.getString("fechaDevolucion"));
        btBuscarPrestamo2.setText(mensajes.getString("botonBuscar"));
        btEliminar.setText(mensajes.getString("eliminarBiblioteca"));    
        btLimpiar.setText(mensajes.getString("botonLimpiar"));        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarPrestamo2;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JLabel fechaPrestamo;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbCorreoCliente3;
    private javax.swing.JLabel lbFechaDevolucion3;
    private javax.swing.JLabel lbIdentificacionPrestamo3;
    private javax.swing.JLabel lbLibrosPrestados2;
    private javax.swing.JLabel lbNombreCliente3;
    private javax.swing.JLabel numCodigoPrestamo3;
    private javax.swing.JTable tbLibro2;
    private javax.swing.JTextField txtCorreo3;
    private javax.swing.JTextField txtFechaDevolucion3;
    private javax.swing.JTextField txtFechaPrestamo2;
    private javax.swing.JTextField txtIdentificacionC;
    private javax.swing.JTextField txtNombreCliente3;
    private javax.swing.JTextField txtNumPrestamo;
    // End of variables declaration//GEN-END:variables
}
