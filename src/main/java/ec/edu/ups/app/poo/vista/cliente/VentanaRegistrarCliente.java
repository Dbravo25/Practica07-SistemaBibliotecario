/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.app.poo.vista.cliente;

import ec.edu.ups.app.poo.controlador.ClienteControlador;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class VentanaRegistrarCliente extends javax.swing.JInternalFrame {
    private ClienteControlador clienteControlador;
    /**
     * Creates new form VentanaCrearCliente
     */
    public VentanaRegistrarCliente(ClienteControlador clienteControlador) {
        initComponents();
        this.clienteControlador = clienteControlador;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbNombreCliente = new javax.swing.JLabel();
        lbIdentificiacionCliente = new javax.swing.JLabel();
        lbCorreoCliente = new javax.swing.JLabel();
        btGuardarCliente = new javax.swing.JButton();
        txtIdentificacionCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtCorreoCliente = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registrar Cliente");

        jPanel1.setBackground(new java.awt.Color(195, 172, 133));
        jPanel1.setToolTipText("");

        lbNombreCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbNombreCliente.setText("Nombre");

        lbIdentificiacionCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbIdentificiacionCliente.setText("Identificación");

        lbCorreoCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbCorreoCliente.setText("Correo");

        btGuardarCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btGuardarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btGuardarCliente.setText(" Guardar");
        btGuardarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarClienteActionPerformed(evt);
            }
        });

        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbIdentificiacionCliente)
                    .addComponent(lbNombreCliente)
                    .addComponent(lbCorreoCliente))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCorreoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(txtIdentificacionCliente)
                    .addComponent(txtNombreCliente))
                .addGap(166, 166, 166))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(btGuardarCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdentificiacionCliente)
                    .addComponent(txtIdentificacionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombreCliente)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCorreoCliente)
                    .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addComponent(btGuardarCliente)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void btGuardarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarClienteActionPerformed
        // TODO add your handling code here:
        String identificacion = txtIdentificacionCliente.getText();
        String nombre = txtNombreCliente.getText();
        String correo = txtCorreoCliente.getText();
        
        if(clienteControlador.read(identificacion)== null){
        clienteControlador.create(nombre, identificacion, correo);
        JOptionPane.showMessageDialog(this, "Se guardo existosamente!");
        txtIdentificacionCliente.setText("");
        txtNombreCliente.setText("");
        txtCorreoCliente.setText("");
        }else{
            JOptionPane.showMessageDialog(this, "El cliente ya existe!");
        }
        
    }//GEN-LAST:event_btGuardarClienteActionPerformed

    public void cambiarIdioma(Locale locale) {
        ResourceBundle mensajes = ResourceBundle.getBundle("mensajes.mensajes", locale);
        ResourceBundle titulos = ResourceBundle.getBundle("titulos.titulos", locale); 
            this.setTitle(titulos.getString("RegistrarC"));
        lbIdentificiacionCliente.setText(mensajes.getString("idCliente"));
        lbNombreCliente.setText(mensajes.getString("nombre"));
        lbCorreoCliente.setText(mensajes.getString("correoCliente"));
        btGuardarCliente.setText(mensajes.getString("botonGuardar"));        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGuardarCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCorreoCliente;
    private javax.swing.JLabel lbIdentificiacionCliente;
    private javax.swing.JLabel lbNombreCliente;
    private javax.swing.JTextField txtCorreoCliente;
    private javax.swing.JTextField txtIdentificacionCliente;
    private javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables
}
