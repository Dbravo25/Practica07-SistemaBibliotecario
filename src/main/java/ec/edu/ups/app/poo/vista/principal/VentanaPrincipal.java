/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package ec.edu.ups.app.poo.vista.principal;

import ec.edu.ups.app.poo.DAO.BibliotecaDAO;
import ec.edu.ups.app.poo.DAO.ClienteDAO;
import ec.edu.ups.app.poo.DAO.LibroDAO;
import ec.edu.ups.app.poo.DAO.PrestamoDAO;
import ec.edu.ups.app.poo.IDAO.BibliotecaIDAO;
import ec.edu.ups.app.poo.IDAO.ClienteIDAO;
import ec.edu.ups.app.poo.IDAO.LibroIDAO;
import ec.edu.ups.app.poo.IDAO.PrestamoIDAO;
import ec.edu.ups.app.poo.vista.biblioteca.VentanaBuscarBiblioteca;
import ec.edu.ups.app.poo.vista.cliente.VentanaBuscarCliente;
import ec.edu.ups.app.poo.vista.libro.VentanaBuscarLibro;
import ec.edu.ups.app.poo.vista.prestamo.VentanaBuscarPrestamo;
import ec.edu.ups.app.poo.vista.libro.VentanaCrearLibro;
import ec.edu.ups.app.poo.vista.prestamo.VentanaCrearPrestamo;
import ec.edu.ups.app.poo.vista.biblioteca.VentanaEditarBiblioteca;
import ec.edu.ups.app.poo.vista.cliente.VentanaEditarCliente;
import ec.edu.ups.app.poo.vista.libro.VentanaEditarLibro;
import ec.edu.ups.app.poo.vista.prestamo.VentanaEditarPrestamo;
import ec.edu.ups.app.poo.vista.biblioteca.VentanaEliminarBiblioteca;
import ec.edu.ups.app.poo.vista.cliente.VentanaEliminarCliente;
import ec.edu.ups.app.poo.vista.libro.VentanaEliminarLibro;
import ec.edu.ups.app.poo.vista.prestamo.VentanaEliminarPrestamo;
import ec.edu.ups.app.poo.vista.prestamo.VentanaListaPrestamos;
import ec.edu.ups.app.poo.vista.biblioteca.VentanaListarBiblioteca;
import ec.edu.ups.app.poo.vista.cliente.VentanaListarClientes;
import ec.edu.ups.app.poo.vista.libro.VentanaListarLibro;
import ec.edu.ups.app.poo.vista.cliente.VentanaRegistrarCliente;
import ec.edu.ups.app.poo.controlador.BibliotecaControlador;
import ec.edu.ups.app.poo.controlador.ClienteControlador;
import ec.edu.ups.app.poo.controlador.LibroControlador;
import ec.edu.ups.app.poo.controlador.PrestamoControlador;
import ec.edu.ups.app.poo.vista.biblioteca.VentanaCrearBiblioteca;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.ImageIcon;

/**
 *
 * @author dell
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    private Locale locale;
    //Intanciar el CRUD de Biblioteca
    private VentanaCrearBiblioteca ve;
    private VentanaBuscarBiblioteca buscarVe;
    private VentanaEditarBiblioteca editarVe;
    private VentanaEliminarBiblioteca eliminarVe;
    private VentanaListarBiblioteca listarVe;

    ///Instanciar controlador Biblioteca dao 
    private BibliotecaIDAO bibliotecaDAO;
    private BibliotecaControlador bibliotecaControlador;

    //Instanciar el CRUD de Libro
    private VentanaCrearLibro crearLibro;
    private VentanaBuscarLibro buscarLibro;
    private VentanaEditarLibro editarLibro;
    private VentanaEliminarLibro eliminarLibro;
    private VentanaListarLibro listarLibro;
    ///Instanciar controlador LIBRO
    private LibroIDAO libroDAO;
    private LibroControlador libroControlador;

    //Instanciar el CRUD de Cliente 
    private VentanaRegistrarCliente registrarCliente;
    private VentanaEditarCliente editarCliente;
    private VentanaBuscarCliente buscarCliente;
    private VentanaEliminarCliente eliminarCliente;
    private VentanaListarClientes listarCliente;

    /// Instanciar el CRUD de Cliente
    private ClienteIDAO clienteDAO;
    private ClienteControlador clienteControlador;
    //Instanciar el CRUD Prestamo
    private VentanaCrearPrestamo crearPrestamo;
    private VentanaBuscarPrestamo buscarPrestamo;
    private VentanaEditarPrestamo editarPrestamo;
    private VentanaEliminarPrestamo eliminarPrestamo;
    private VentanaListaPrestamos listarPrestamos;

    //Instanciar el CRUD de Prestamo
    private PrestamoIDAO prestamoDAO;
    private PrestamoControlador prestamoControlador;

    public VentanaPrincipal() {
        initComponents();

        setIconImage(new ImageIcon(getClass().getResource("/1.png")).getImage());
        bibliotecaDAO = new BibliotecaDAO();
        bibliotecaControlador = new BibliotecaControlador(bibliotecaDAO);
        libroDAO = new LibroDAO();
        libroControlador = new LibroControlador(libroDAO);
        clienteDAO = new ClienteDAO();
        clienteControlador = new ClienteControlador(clienteDAO);
        prestamoDAO = new PrestamoDAO();
        prestamoControlador = new PrestamoControlador(prestamoDAO, clienteDAO, libroDAO);
        locale = Locale.getDefault();

    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage("/1.png");
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        imagenP = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        bibliotecaMenu = new javax.swing.JMenu();
        crearBibliotecaMenu = new javax.swing.JMenuItem();
        buscarBibliotecaMenuItem = new javax.swing.JMenuItem();
        editarBibliotecaMenuItem = new javax.swing.JMenuItem();
        eliminarBibliotecaMenuItem = new javax.swing.JMenuItem();
        listarBibliotecaMenuItem = new javax.swing.JMenuItem();
        libroMenu = new javax.swing.JMenu();
        crearLibrocutMenuItem = new javax.swing.JMenuItem();
        buscarLibrocopyMenuItem = new javax.swing.JMenuItem();
        editarLibrojMenuItem1 = new javax.swing.JMenuItem();
        eliminarLibropasteMenuItem = new javax.swing.JMenuItem();
        listarLibrodeleteMenuItem = new javax.swing.JMenuItem();
        clienteMenu = new javax.swing.JMenu();
        registrarClientecontentMenuItem = new javax.swing.JMenuItem();
        buscarClienteMenuItem = new javax.swing.JMenuItem();
        editarClienteOpcion = new javax.swing.JMenuItem();
        eliminarClientejMenuItem1 = new javax.swing.JMenuItem();
        listarjMenuItem2 = new javax.swing.JMenuItem();
        prestamoMenu1 = new javax.swing.JMenu();
        crearPrestamoMenuItem1 = new javax.swing.JMenuItem();
        buscarjMenuItem1 = new javax.swing.JMenuItem();
        editarPrestamojMenuItem2 = new javax.swing.JMenuItem();
        eliminarPrestamojMenuItem3 = new javax.swing.JMenuItem();
        listarPrestamojMenuItem1 = new javax.swing.JMenuItem();
        opcionesjMenu1 = new javax.swing.JMenu();
        jMenuItemEspañol = new javax.swing.JMenuItem();
        jMenuItemIngles = new javax.swing.JMenuItem();
        jMenuItemFrances = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemSalir = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(163, 127, 83));
        setIconImage(getIconImage());
        setLocation(new java.awt.Point(0, 0));

        desktopPane.setBackground(new java.awt.Color(200, 172, 142));

        jLabel1.setFont(new java.awt.Font("PT Serif Caption", 2, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Universidad Politecnica Salesiana");

        jLabel3.setFont(new java.awt.Font("PT Serif Caption", 0, 52)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sistema Bibliotecario ");

        jLabel4.setFont(new java.awt.Font("PT Serif Caption", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Virtual");

        imagenP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2.JPEG"))); // NOI18N

        desktopPane.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(imagenP, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel4))
            .addComponent(imagenP, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel4))
            .addComponent(imagenP, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        menuBar.setBackground(new java.awt.Color(188, 142, 94));
        menuBar.setForeground(new java.awt.Color(0, 0, 0));

        bibliotecaMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/libros.png"))); // NOI18N
        bibliotecaMenu.setMnemonic('f');
        bibliotecaMenu.setText("Biblioteca");

        crearBibliotecaMenu.setBackground(new java.awt.Color(195, 172, 133));
        crearBibliotecaMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mas.png"))); // NOI18N
        crearBibliotecaMenu.setText("Crear Biblioteca");
        crearBibliotecaMenu.setToolTipText("");
        crearBibliotecaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearBibliotecaMenuActionPerformed(evt);
            }
        });
        bibliotecaMenu.add(crearBibliotecaMenu);

        buscarBibliotecaMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda.png"))); // NOI18N
        buscarBibliotecaMenuItem.setText("Buscar Biblioteca");
        buscarBibliotecaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBibliotecaMenuItemActionPerformed(evt);
            }
        });
        bibliotecaMenu.add(buscarBibliotecaMenuItem);

        editarBibliotecaMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        editarBibliotecaMenuItem.setMnemonic('s');
        editarBibliotecaMenuItem.setText("Editar Biblioteca");
        editarBibliotecaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBibliotecaMenuItemActionPerformed(evt);
            }
        });
        bibliotecaMenu.add(editarBibliotecaMenuItem);

        eliminarBibliotecaMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        eliminarBibliotecaMenuItem.setMnemonic('a');
        eliminarBibliotecaMenuItem.setText("Eliminar Biblioteca");
        eliminarBibliotecaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBibliotecaMenuItemActionPerformed(evt);
            }
        });
        bibliotecaMenu.add(eliminarBibliotecaMenuItem);

        listarBibliotecaMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lista.png"))); // NOI18N
        listarBibliotecaMenuItem.setMnemonic('x');
        listarBibliotecaMenuItem.setText("Listar Biblioteca");
        listarBibliotecaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarBibliotecaMenuItemActionPerformed(evt);
            }
        });
        bibliotecaMenu.add(listarBibliotecaMenuItem);

        menuBar.add(bibliotecaMenu);

        libroMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/libro-alt.png"))); // NOI18N
        libroMenu.setMnemonic('e');
        libroMenu.setText("Libro");

        crearLibrocutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mas.png"))); // NOI18N
        crearLibrocutMenuItem.setMnemonic('t');
        crearLibrocutMenuItem.setText("Crear Libro");
        crearLibrocutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearLibrocutMenuItemActionPerformed(evt);
            }
        });
        libroMenu.add(crearLibrocutMenuItem);

        buscarLibrocopyMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda.png"))); // NOI18N
        buscarLibrocopyMenuItem.setMnemonic('y');
        buscarLibrocopyMenuItem.setText("Buscar Libro");
        buscarLibrocopyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarLibrocopyMenuItemActionPerformed(evt);
            }
        });
        libroMenu.add(buscarLibrocopyMenuItem);

        editarLibrojMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        editarLibrojMenuItem1.setText("Editar Libro");
        editarLibrojMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarLibrojMenuItem1ActionPerformed(evt);
            }
        });
        libroMenu.add(editarLibrojMenuItem1);

        eliminarLibropasteMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        eliminarLibropasteMenuItem.setMnemonic('p');
        eliminarLibropasteMenuItem.setText("Eliminar Libro");
        eliminarLibropasteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarLibropasteMenuItemActionPerformed(evt);
            }
        });
        libroMenu.add(eliminarLibropasteMenuItem);

        listarLibrodeleteMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lista.png"))); // NOI18N
        listarLibrodeleteMenuItem.setMnemonic('d');
        listarLibrodeleteMenuItem.setText("Listar Libro");
        listarLibrodeleteMenuItem.setToolTipText("");
        listarLibrodeleteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarLibrodeleteMenuItemActionPerformed(evt);
            }
        });
        libroMenu.add(listarLibrodeleteMenuItem);

        menuBar.add(libroMenu);

        clienteMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        clienteMenu.setMnemonic('h');
        clienteMenu.setText("Cliente");

        registrarClientecontentMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mas.png"))); // NOI18N
        registrarClientecontentMenuItem.setMnemonic('c');
        registrarClientecontentMenuItem.setText("Registrar Cliente");
        registrarClientecontentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarClientecontentMenuItemActionPerformed(evt);
            }
        });
        clienteMenu.add(registrarClientecontentMenuItem);

        buscarClienteMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda.png"))); // NOI18N
        buscarClienteMenuItem.setMnemonic('a');
        buscarClienteMenuItem.setText("Buscar Cliente");
        buscarClienteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarClienteMenuItemActionPerformed(evt);
            }
        });
        clienteMenu.add(buscarClienteMenuItem);

        editarClienteOpcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        editarClienteOpcion.setText("Editar Cliente");
        editarClienteOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarClienteOpcionActionPerformed(evt);
            }
        });
        clienteMenu.add(editarClienteOpcion);

        eliminarClientejMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        eliminarClientejMenuItem1.setText("Eliminar Cliente");
        eliminarClientejMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarClientejMenuItem1ActionPerformed(evt);
            }
        });
        clienteMenu.add(eliminarClientejMenuItem1);

        listarjMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lista.png"))); // NOI18N
        listarjMenuItem2.setText("Listar Cliente");
        listarjMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarjMenuItem2ActionPerformed(evt);
            }
        });
        clienteMenu.add(listarjMenuItem2);

        menuBar.add(clienteMenu);

        prestamoMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prestamo.png"))); // NOI18N
        prestamoMenu1.setText("Prestamo");

        crearPrestamoMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mas.png"))); // NOI18N
        crearPrestamoMenuItem1.setText("Crear Prestamo");
        crearPrestamoMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearPrestamoMenuItem1ActionPerformed(evt);
            }
        });
        prestamoMenu1.add(crearPrestamoMenuItem1);

        buscarjMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda.png"))); // NOI18N
        buscarjMenuItem1.setText("Buscar Prestamo");
        buscarjMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarjMenuItem1ActionPerformed(evt);
            }
        });
        prestamoMenu1.add(buscarjMenuItem1);

        editarPrestamojMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        editarPrestamojMenuItem2.setText("Editar Prestamo");
        editarPrestamojMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarPrestamojMenuItem2ActionPerformed(evt);
            }
        });
        prestamoMenu1.add(editarPrestamojMenuItem2);

        eliminarPrestamojMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        eliminarPrestamojMenuItem3.setText("Eliminar Prestamo");
        eliminarPrestamojMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPrestamojMenuItem3ActionPerformed(evt);
            }
        });
        prestamoMenu1.add(eliminarPrestamojMenuItem3);

        listarPrestamojMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lista.png"))); // NOI18N
        listarPrestamojMenuItem1.setText("Listar Prestamo");
        listarPrestamojMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarPrestamojMenuItem1ActionPerformed(evt);
            }
        });
        prestamoMenu1.add(listarPrestamojMenuItem1);

        menuBar.add(prestamoMenu1);

        opcionesjMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mundo.png"))); // NOI18N
        opcionesjMenu1.setText("Lenguaje");
        opcionesjMenu1.setToolTipText("");

        jMenuItemEspañol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/espana.png"))); // NOI18N
        jMenuItemEspañol.setText("Español");
        jMenuItemEspañol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEspañolActionPerformed(evt);
            }
        });
        opcionesjMenu1.add(jMenuItemEspañol);

        jMenuItemIngles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estados-unidos.png"))); // NOI18N
        jMenuItemIngles.setText("Ingles");
        jMenuItemIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInglesActionPerformed(evt);
            }
        });
        opcionesjMenu1.add(jMenuItemIngles);

        jMenuItemFrances.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/francia.png"))); // NOI18N
        jMenuItemFrances.setText("Frances");
        jMenuItemFrances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFrancesActionPerformed(evt);
            }
        });
        opcionesjMenu1.add(jMenuItemFrances);

        menuBar.add(opcionesjMenu1);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ajustes.png"))); // NOI18N
        jMenu1.setText("Opciones");

        jMenuItemSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSalir);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void crearPrestamoMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearPrestamoMenuItem1ActionPerformed
        // TODO add your handling code here:
        if (crearPrestamo == null) {
            crearPrestamo = new VentanaCrearPrestamo(prestamoControlador, bibliotecaControlador, clienteControlador,libroControlador);

        }
        if (!crearPrestamo.isVisible()) {
            crearPrestamo.setVisible(true);
            desktopPane.add(crearPrestamo);
        }
        try {
        crearPrestamo.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
      
        }
        crearPrestamo.cambiarIdioma(locale);
    }//GEN-LAST:event_crearPrestamoMenuItem1ActionPerformed

    private void buscarClienteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarClienteMenuItemActionPerformed
        // TODO add your handling code here:
        if (buscarCliente == null) {
            buscarCliente = new VentanaBuscarCliente(clienteControlador);

        }
        if (!buscarCliente.isVisible()) {
            buscarCliente.setVisible(true);
            desktopPane.add(buscarCliente);
        }try {
        buscarCliente.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        // Manejar la excepción si es necesario
        }
        buscarCliente.cambiarIdioma(locale);
        imagenP.setVisible(false);
    }//GEN-LAST:event_buscarClienteMenuItemActionPerformed

    private void crearBibliotecaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearBibliotecaMenuActionPerformed
        // TODO add your handling code here:
        if (ve == null) {
            ve = new VentanaCrearBiblioteca(bibliotecaControlador);
            imagenP.setVisible(false);
            jLabel1.setVisible(false);
            jLabel4.setVisible(false);
            jLabel3.setVisible(false);

        }
        if (!ve.isVisible()) {
            ve.setVisible(true);
            desktopPane.add(ve);
        }
        ve.cambiarIdioma(locale);
    }//GEN-LAST:event_crearBibliotecaMenuActionPerformed

    private void editarBibliotecaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBibliotecaMenuItemActionPerformed
        // TODO add your handling code here:
        if (editarVe == null) {
            editarVe = new VentanaEditarBiblioteca(bibliotecaControlador);

        }
        if (!editarVe.isVisible()) {
            editarVe.setVisible(true);
            desktopPane.add(editarVe);
        }
        try {
        editarVe.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
      
        }
        editarVe.cambiarIdioma(locale);
    }//GEN-LAST:event_editarBibliotecaMenuItemActionPerformed

    private void eliminarBibliotecaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBibliotecaMenuItemActionPerformed
        // TODO add your handling code here:
        if (eliminarVe == null) {
            eliminarVe = new VentanaEliminarBiblioteca(bibliotecaControlador);

        }
        if (!eliminarVe.isVisible()) {
            eliminarVe.setVisible(true);
            desktopPane.add(eliminarVe);
        }try {
        eliminarVe.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        // Manejar la excepción si es necesario
        }
        eliminarVe.cambiarIdioma(locale);

    }//GEN-LAST:event_eliminarBibliotecaMenuItemActionPerformed

    private void listarBibliotecaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarBibliotecaMenuItemActionPerformed
        // TODO add your handling code here:
        if (listarVe == null) {
            listarVe = new VentanaListarBiblioteca(bibliotecaControlador);

        }
        if (!listarVe.isVisible()) {
            listarVe.setVisible(true);
            listarVe.cargarDatos();
            desktopPane.add(listarVe);
        }
        try {
        listarVe.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        // Manejar la excepción si es necesario
        }
        listarVe.cambiarIdioma(locale);
    }//GEN-LAST:event_listarBibliotecaMenuItemActionPerformed

    private void crearLibrocutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearLibrocutMenuItemActionPerformed
        // TODO add your handling code here
        if (crearLibro == null) {
            crearLibro = new VentanaCrearLibro(libroControlador, bibliotecaControlador, bibliotecaDAO);

        }
        if (!crearLibro.isVisible()) {
            crearLibro.setVisible(true);
            desktopPane.add(crearLibro);
        }
        try {
        crearLibro.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
      
        }
        crearLibro.cambiarIdioma(locale);
    }//GEN-LAST:event_crearLibrocutMenuItemActionPerformed

    private void editarLibrojMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarLibrojMenuItem1ActionPerformed
        // TODO add your handling code here:
        if (editarLibro == null) {
            editarLibro = new VentanaEditarLibro(libroControlador);

        }
        if (!editarLibro.isVisible()) {
            editarLibro.setVisible(true);
            desktopPane.add(editarLibro);
        }
        try {
        editarLibro.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
      
        }
        editarLibro.cambiarIdioma(locale);
    }//GEN-LAST:event_editarLibrojMenuItem1ActionPerformed

    private void buscarLibrocopyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarLibrocopyMenuItemActionPerformed
        // TODO add your handling code here:
        if (buscarLibro == null) {
            buscarLibro = new VentanaBuscarLibro(libroControlador);

        }
        if (!buscarLibro.isVisible()) {
            buscarLibro.setVisible(true);
            desktopPane.add(buscarLibro);
        }
        try {
        buscarLibro.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
      
        }
        buscarLibro.cambiarIdioma(locale);
    }//GEN-LAST:event_buscarLibrocopyMenuItemActionPerformed

    private void eliminarLibropasteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarLibropasteMenuItemActionPerformed
        // TODO add your handling code here:
        if (eliminarLibro == null) {
            eliminarLibro = new VentanaEliminarLibro(libroControlador);

        }
        if (!eliminarLibro.isVisible()) {
            eliminarLibro.setVisible(true);
            desktopPane.add(eliminarLibro);
        }
        try {
        eliminarLibro.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
      
        }
        eliminarLibro.cambiarIdioma(locale);
    }//GEN-LAST:event_eliminarLibropasteMenuItemActionPerformed

    private void listarLibrodeleteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarLibrodeleteMenuItemActionPerformed
        // TODO add your handling code here:
        if (listarLibro == null) {
            listarLibro = new VentanaListarLibro(libroControlador);

        }
        if (!listarLibro.isVisible()) {
            listarLibro.cargarDatos();
            listarLibro.setVisible(true);
            desktopPane.add(listarLibro);
        }
        listarLibro.cambiarIdioma(locale);
    }//GEN-LAST:event_listarLibrodeleteMenuItemActionPerformed

    private void editarClienteOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarClienteOpcionActionPerformed
        // TODO add your handling code here:
        if (editarCliente == null) {
            editarCliente = new VentanaEditarCliente(clienteControlador);

        }
        if (!editarCliente.isVisible()) {
            editarCliente.setVisible(true);
            desktopPane.add(editarCliente);
        }try {
        editarCliente.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        // Manejar la excepción si es necesario
        }
        editarCliente.cambiarIdioma(locale);
    }//GEN-LAST:event_editarClienteOpcionActionPerformed

    private void registrarClientecontentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarClientecontentMenuItemActionPerformed
        // TODO add your handling code here:
        if (registrarCliente == null) {
            registrarCliente = new VentanaRegistrarCliente(clienteControlador);

        }
        if (!registrarCliente.isVisible()) {
            registrarCliente.setVisible(true);
            desktopPane.add(registrarCliente);
        }try {
        registrarCliente.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        // Manejar la excepción si es necesario
        }
        registrarCliente.cambiarIdioma(locale);
    }//GEN-LAST:event_registrarClientecontentMenuItemActionPerformed

    private void eliminarClientejMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarClientejMenuItem1ActionPerformed
        // TODO add your handling code here:
        if (eliminarCliente == null) {
            eliminarCliente = new VentanaEliminarCliente(clienteControlador);

        }
        if (!eliminarCliente.isVisible()) {
            eliminarCliente.setVisible(true);
            desktopPane.add(eliminarCliente);
        }try {
        eliminarCliente.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        // Manejar la excepción si es necesario
        }
        eliminarCliente.cambiarIdioma(locale);
    }//GEN-LAST:event_eliminarClientejMenuItem1ActionPerformed

    private void listarjMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarjMenuItem2ActionPerformed
        // TODO add your handling code here:
        if (listarCliente == null) {
            listarCliente = new VentanaListarClientes(clienteControlador);

        }
        if (!listarCliente.isVisible()) {
            listarCliente.cargarDatos();
            listarCliente.setVisible(true);
            desktopPane.add(listarCliente);
        }try {
        listarCliente.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        // Manejar la excepción si es necesario
        }
        listarCliente.cambiarIdioma(locale);
    }//GEN-LAST:event_listarjMenuItem2ActionPerformed

    private void buscarjMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarjMenuItem1ActionPerformed
        // TODO add your handling code here:
        if (buscarPrestamo == null) {
            buscarPrestamo = new VentanaBuscarPrestamo(prestamoControlador,clienteControlador);

        }
        if (!buscarPrestamo.isVisible()) {
            buscarPrestamo.setVisible(true);
            desktopPane.add(buscarPrestamo);
        }
         try {
        buscarPrestamo.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        // Manejar la excepción si es necesario
        }
        
        buscarPrestamo.cambiarIdioma(locale);
    }//GEN-LAST:event_buscarjMenuItem1ActionPerformed

    private void editarPrestamojMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarPrestamojMenuItem2ActionPerformed
        // TODO add your handling code here:
        if (editarPrestamo == null) {
            editarPrestamo = new VentanaEditarPrestamo(prestamoControlador, bibliotecaControlador, clienteControlador,libroControlador);

        }
        if (!editarPrestamo.isVisible()) {
            editarPrestamo.setVisible(true);
            desktopPane.add(editarPrestamo);
        } try {
        editarPrestamo.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        // Manejar la excepción si es necesario
        }
        
        editarPrestamo.cambiarIdioma(locale);
    }//GEN-LAST:event_editarPrestamojMenuItem2ActionPerformed

    private void eliminarPrestamojMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPrestamojMenuItem3ActionPerformed
        // TODO add your handling code here:
        if (eliminarPrestamo == null) {
            eliminarPrestamo = new VentanaEliminarPrestamo(prestamoControlador, clienteControlador,libroControlador);

        }
        if (!eliminarPrestamo.isVisible()) {
            eliminarPrestamo.setVisible(true);
            desktopPane.add(eliminarPrestamo);
        }
         try {
        eliminarPrestamo.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        // Manejar la excepción si es necesario
        }
        
        eliminarPrestamo.cambiarIdioma(locale);
    }//GEN-LAST:event_eliminarPrestamojMenuItem3ActionPerformed

    private void listarPrestamojMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarPrestamojMenuItem1ActionPerformed
        // TODO add your handling code here:
        if (listarPrestamos == null) {
            listarPrestamos = new VentanaListaPrestamos(prestamoControlador, clienteControlador);

        }
        if (!listarPrestamos.isVisible()) {
            listarPrestamos.setVisible(true);
            listarPrestamos.cargarDatos();
            desktopPane.add(listarPrestamos);
        }
        try {
        listarPrestamos.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        // Manejar la excepción si es necesario
        }
        listarPrestamos.cambiarIdioma(locale);
    }//GEN-LAST:event_listarPrestamojMenuItem1ActionPerformed

    private void jMenuItemInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInglesActionPerformed
        // TODO add your handling code here:
        locale = new Locale("en", "US");
        cambiar(locale);
    }//GEN-LAST:event_jMenuItemInglesActionPerformed

    private void jMenuItemEspañolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEspañolActionPerformed
        // TODO add your handling code here:
        locale = new Locale("es", "EC");
        cambiar(locale);
    }//GEN-LAST:event_jMenuItemEspañolActionPerformed

    private void jMenuItemFrancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFrancesActionPerformed
        // TODO add your handling code here:
        locale = new Locale("fr", "FR");
        cambiar(locale);
    }//GEN-LAST:event_jMenuItemFrancesActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void buscarBibliotecaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBibliotecaMenuItemActionPerformed
        // TODO add your handling code here:

        if (buscarVe == null) {
            buscarVe = new VentanaBuscarBiblioteca(bibliotecaControlador);
            buscarVe.setVisible(false);
        }
        if (!buscarVe.isVisible()) {
            buscarVe.setVisible(true);
            desktopPane.add(buscarVe);
        }
        try {
        buscarVe.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        // Manejar la excepción si es necesario
        }
        
        buscarVe.cambiarIdioma(locale);
    }//GEN-LAST:event_buscarBibliotecaMenuItemActionPerformed

    public void cambiar(Locale locale) {
        ResourceBundle mensajes = ResourceBundle.getBundle("mensajes.mensajes", locale);
        ResourceBundle titulos = ResourceBundle.getBundle("titulos.titulos", locale);

        bibliotecaMenu.setText(mensajes.getString("bibliotecaMenu"));
        libroMenu.setText(mensajes.getString("libroMenu"));
        clienteMenu.setText(mensajes.getString("clienteMenu"));
        prestamoMenu1.setText(mensajes.getString("prestamoMenu"));
        opcionesjMenu1.setText(mensajes.getString("opcionesMenu"));

        crearBibliotecaMenu.setText(mensajes.getString("crearBibliotecaMenu"));
        buscarBibliotecaMenuItem.setText(mensajes.getString("buscarBibliotecaMenu"));
        eliminarBibliotecaMenuItem.setText(mensajes.getString("eliminarBiblioteca"));
        editarBibliotecaMenuItem.setText(mensajes.getString("editarBiblioteca"));
        listarBibliotecaMenuItem.setText(mensajes.getString("listarBiblioteca"));

        crearLibrocutMenuItem.setText(mensajes.getString("crearBibliotecaMenu"));
        buscarLibrocopyMenuItem.setText(mensajes.getString("buscarBibliotecaMenu"));
        editarLibrojMenuItem1.setText(mensajes.getString("editarBiblioteca"));
        eliminarLibropasteMenuItem.setText(mensajes.getString("eliminarBiblioteca"));
        listarLibrodeleteMenuItem.setText(mensajes.getString("listarBiblioteca"));

        registrarClientecontentMenuItem.setText(mensajes.getString("crearBibliotecaMenu"));
        buscarClienteMenuItem.setText(mensajes.getString("buscarBibliotecaMenu"));
        editarClienteOpcion.setText(mensajes.getString("editarBiblioteca"));
        eliminarClientejMenuItem1.setText(mensajes.getString("eliminarBiblioteca"));
        listarjMenuItem2.setText(mensajes.getString("listarBiblioteca"));

        crearPrestamoMenuItem1.setText(mensajes.getString("crearBibliotecaMenu"));
        buscarjMenuItem1.setText(mensajes.getString("buscarBibliotecaMenu"));
        editarPrestamojMenuItem2.setText(mensajes.getString("editarBiblioteca"));
        eliminarPrestamojMenuItem3.setText(mensajes.getString("eliminarBiblioteca"));
        listarPrestamojMenuItem1.setText(mensajes.getString("listarBiblioteca"));

        if (ve != null) {
            ve.cambiarIdioma(locale);
        }
        if (buscarVe != null) {
            buscarVe.cambiarIdioma(locale);
        }
        if (eliminarVe != null) {
            eliminarVe.cambiarIdioma(locale);
        }
        if (editarVe != null) {
            editarVe.cambiarIdioma(locale);
        }
        if (listarVe != null) {
            listarVe.cambiarIdioma(locale);
        }

        if (crearLibro != null) {
            crearLibro.cambiarIdioma(locale);
        }
        if (editarLibro != null) {
            editarLibro.cambiarIdioma(locale);
        }
        if (buscarLibro != null) {
            buscarLibro.cambiarIdioma(locale);
        }
        if (eliminarLibro != null) {
            eliminarLibro.cambiarIdioma(locale);
        }
        if (listarLibro != null) {
            listarLibro.cambiarIdioma(locale);
        }

        if (registrarCliente != null) {
            registrarCliente.cambiarIdioma(locale);
        }
        if (editarCliente != null) {
            editarCliente.cambiarIdioma(locale);
        }
        if (buscarCliente != null) {
            buscarCliente.cambiarIdioma(locale);
        }
        if (eliminarCliente != null) {
            eliminarCliente.cambiarIdioma(locale);
        }
        if (listarCliente != null) {
            listarCliente.cambiarIdioma(locale);
        }

        if (crearPrestamo != null) {
            crearPrestamo.cambiarIdioma(locale);
        }
        if (editarPrestamo != null) {
            editarPrestamo.cambiarIdioma(locale);
        }
        if (buscarPrestamo != null) {
            buscarPrestamo.cambiarIdioma(locale);
        }
        if (eliminarPrestamo != null) {
            eliminarPrestamo.cambiarIdioma(locale);
        }
        if (listarPrestamos != null) {
            listarPrestamos.cambiarIdioma(locale);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu bibliotecaMenu;
    private javax.swing.JMenuItem buscarBibliotecaMenuItem;
    private javax.swing.JMenuItem buscarClienteMenuItem;
    private javax.swing.JMenuItem buscarLibrocopyMenuItem;
    private javax.swing.JMenuItem buscarjMenuItem1;
    private javax.swing.JMenu clienteMenu;
    private javax.swing.JMenuItem crearBibliotecaMenu;
    private javax.swing.JMenuItem crearLibrocutMenuItem;
    private javax.swing.JMenuItem crearPrestamoMenuItem1;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem editarBibliotecaMenuItem;
    private javax.swing.JMenuItem editarClienteOpcion;
    private javax.swing.JMenuItem editarLibrojMenuItem1;
    private javax.swing.JMenuItem editarPrestamojMenuItem2;
    private javax.swing.JMenuItem eliminarBibliotecaMenuItem;
    private javax.swing.JMenuItem eliminarClientejMenuItem1;
    private javax.swing.JMenuItem eliminarLibropasteMenuItem;
    private javax.swing.JMenuItem eliminarPrestamojMenuItem3;
    private javax.swing.JLabel imagenP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemEspañol;
    private javax.swing.JMenuItem jMenuItemFrances;
    private javax.swing.JMenuItem jMenuItemIngles;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenu libroMenu;
    private javax.swing.JMenuItem listarBibliotecaMenuItem;
    private javax.swing.JMenuItem listarLibrodeleteMenuItem;
    private javax.swing.JMenuItem listarPrestamojMenuItem1;
    private javax.swing.JMenuItem listarjMenuItem2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu opcionesjMenu1;
    private javax.swing.JMenu prestamoMenu1;
    private javax.swing.JMenuItem registrarClientecontentMenuItem;
    // End of variables declaration//GEN-END:variables

}
