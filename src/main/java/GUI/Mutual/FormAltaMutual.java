package GUI.Mutual;

import GUI.Complementaria.FormAltaComplementaria;
import com.mycompany.mutuales.InfoComplementaria;
import com.mycompany.mutuales.Mutual;
import com.mycompany.mutuales.Utilidades;
import enumeradores.TipoMutual;
import interfaz.UpdateListener;
import interfaz.iCargaImagenes;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;

public class FormAltaMutual extends javax.swing.JFrame {

    private FormAltaComplementaria formularioComplementaria;
    private Mutual mutual;
    private UpdateListener update;

    private InfoComplementaria infoReclamo;
    private InfoComplementaria infoPrestamo;

    private boolean habilitoFormularioReclamo = true;
    private boolean habilitoFormularioPrestamo = true;

    private boolean seGuardoReclamo = false;
    private boolean seGuardoPrestamo = false;

    private boolean formReclamoIsOpen = false;
    private boolean formPrestamoIsOpen = false;

    public FormAltaMutual() {
        initComponents();
        cargarImagenes();
        configuracionComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel3 = new javax.swing.JPanel();
        AltaButton = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        nombrMutualjTextField = new javax.swing.JTextField();
        datosPrestamos = new javax.swing.JLabel();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        datosReclamos = new javax.swing.JLabel();
        checKPrestamoJlabel = new javax.swing.JLabel();
        checKReclamolabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(252, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(252, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AltaButton.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        AltaButton.setForeground(new java.awt.Color(102, 102, 102));
        AltaButton.setText("CREAR MUTUAL");
        AltaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AltaButtonMouseClicked(evt);
            }
        });
        jPanel3.add(AltaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 150, 40));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("INGRESE DATOS DE LA MUTUAL");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));
        jPanel3.add(nombrMutualjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 110, -1));

        datosPrestamos.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        datosPrestamos.setForeground(new java.awt.Color(102, 102, 102));
        datosPrestamos.setText("Datos Prestamo");
        datosPrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datosPrestamosMouseClicked(evt);
            }
        });
        jPanel3.add(datosPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 540, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Nombre Mutual");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Informacion Oligatoria:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        datosReclamos.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        datosReclamos.setForeground(new java.awt.Color(102, 102, 102));
        datosReclamos.setText("Datos Reclamo");
        datosReclamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datosReclamosMouseClicked(evt);
            }
        });
        jPanel3.add(datosReclamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        checKPrestamoJlabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\dgc06\\Documents\\nuevo repo\\mutuales\\images\\check.png")); // NOI18N
        jPanel3.add(checKPrestamoJlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        checKReclamolabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\dgc06\\Documents\\nuevo repo\\mutuales\\images\\check.png")); // NOI18N
        jPanel3.add(checKReclamolabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 380));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void addListener(UpdateListener update) {
        this.update = update;
    }
    private void AltaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AltaButtonMouseClicked

        if (AltaButton.isEnabled()) {

            try {
                String inputText = nombrMutualjTextField.getText().trim();

                if (inputText.isEmpty()) {
                    Utilidades.mensajeAdvertencia("Por favor, complete el nombre de la mutual");
                    return;
                }

                mutual = new Mutual(inputText);

                if (Utilidades.existeMutualEnBaseDeDatos(mutual.getNombre())) {
                    Utilidades.mensajeError("Ya existe una mutual cargada en el sistema.");
                    return;
                }

                this.mutual.insertarEnBaseDeDatos();
                int id_mutual = Utilidades.obtenerIdMutual(mutual.getNombre());

                if ((infoReclamo != null) && (infoPrestamo != null)) {

                    infoReclamo.setIdMutual(id_mutual);
                    infoReclamo.insertarEnBaseDeDatos();

                    infoPrestamo.setIdMutual(id_mutual);
                    infoPrestamo.insertarEnBaseDeDatos();

                    this.dispose();
                    update.updateTableData();
                    Utilidades.mensajeExito("Mutual dada de alta.");

                } else {
                    // Manejar la situación cuando getInfoComplementaria() devuelve null
                    datosPrestamos.setEnabled(true);
                    datosReclamos.setEnabled(true);
                    Utilidades.mensajeAdvertencia("Complementaria nula.");
                }

            } catch (NullPointerException ex) {
                manejarExcepcion("Se produjo una NullPointerException.");
            } catch (SQLException ex) {
                manejarExcepcion("Error al acceder a la base de datos.");
            }
        } else {

            if (seGuardoReclamo) {
                Utilidades.mensajeAdvertencia("Debe completar el formulario de Prestamo.");
            } else {
                if (seGuardoReclamo) {
                    Utilidades.mensajeAdvertencia("Debe completar el formulario de Reclamo.");
                } else {
                    Utilidades.mensajeAdvertencia("Debe completar los formulario.");
                }
            }
        }
    }//GEN-LAST:event_AltaButtonMouseClicked

    private void manejarExcepcion(String mensaje) {
        datosPrestamos.setEnabled(true);
        datosReclamos.setEnabled(true);
        Utilidades.mensajeAdvertencia(mensaje);
    }

    private void datosPrestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datosPrestamosMouseClicked

        if (!formPrestamoIsOpen) {

            try {
                abrirFormulario(TipoMutual.A);
                formPrestamoIsOpen = true;
            } catch (SQLException ex) {
                Logger.getLogger(FormAltaMutual.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_datosPrestamosMouseClicked

    private void datosReclamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datosReclamosMouseClicked
        if (!formReclamoIsOpen) {

            try {
                abrirFormulario(TipoMutual.R);
                formReclamoIsOpen = true;

            } catch (SQLException ex) {
                Logger.getLogger(FormAltaMutual.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_datosReclamosMouseClicked

    private void abrirFormulario(TipoMutual tipoMutual) throws SQLException {

        deshabilitarFormularios(tipoMutual);

        if (tipoMutual == TipoMutual.R) {

            if (infoReclamo == null) {

                this.infoReclamo = new InfoComplementaria(tipoMutual);

                this.formularioComplementaria = new FormAltaComplementaria(
                        infoReclamo,
                        this
                );

            } else {
                this.formularioComplementaria = new FormAltaComplementaria(
                        infoReclamo,
                        this
                );
                formularioComplementaria.mostrarValores(infoReclamo);
            }
            this.formularioComplementaria.setVisible(true);

        } else {

            if (infoPrestamo == null) {

                // Crea el formulario complementario con el tipoMutual correspondiente
                this.infoPrestamo = new InfoComplementaria(tipoMutual);
                this.formularioComplementaria = new FormAltaComplementaria(
                        infoPrestamo,
                        this
                );
            } else {
                this.formularioComplementaria = new FormAltaComplementaria(
                        infoPrestamo,
                        this
                );
                formularioComplementaria.mostrarValores(infoPrestamo);
            }
            this.formularioComplementaria.setVisible(true);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JLabel AltaButton;
    javax.swing.JLabel checKPrestamoJlabel;
    javax.swing.JLabel checKReclamolabel;
    javax.swing.JLabel datosPrestamos;
    javax.swing.JLabel datosReclamos;
    javax.swing.JTextField nombrMutualjTextField;
    // End of variables declaration//GEN-END:variables

    private void cargarImagenes() {
        String dirActual = System.getProperty("user.dir");

        AltaButton.setIcon(new javax.swing.ImageIcon(dirActual + iCargaImagenes.url_imagen_rigth));
        datosPrestamos.setIcon(new javax.swing.ImageIcon(dirActual + iCargaImagenes.url_imagen_agregar));
        datosReclamos.setIcon(new javax.swing.ImageIcon(dirActual + iCargaImagenes.url_imagen_agregar));

        try {
            BufferedImage iconImage = ImageIO.read(new File(dirActual + "\\images\\icono.png"));
            // Establecer la imagen como ícono de la aplicación
            this.setIconImage(iconImage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void habilitarComponentes(TipoMutual tipoMutual) {
        if (tipoMutual == TipoMutual.A) {
            habilitarFormulariosPrestamos();
        } else {
            habilitarFormulariosReclamo();
        }

        if (seGuardoPrestamo && seGuardoReclamo) {
            if ((infoPrestamo != null) && (infoReclamo != null)) {
                habilitarGuardar();
            }
        }

    }

    public void setSeGuardoPrestamo(boolean seGuardoPrestamo) {
        this.seGuardoPrestamo = seGuardoPrestamo;
    }

    public void setSeGuardoReclamo(boolean seGuardoReclamo) {
        this.seGuardoReclamo = seGuardoReclamo;
    }

    public void habilitarFormulariosPrestamos() {
        formPrestamoIsOpen = false;
        datosPrestamos.setEnabled(true);
        if (seGuardoPrestamo) {
            checKPrestamoJlabel.setVisible(true);
        }
    }

    public void habilitarFormulariosReclamo() {
        formReclamoIsOpen = false;
        datosReclamos.setEnabled(true);
        if (seGuardoReclamo) {
            checKReclamolabel.setVisible(true);
        }

    }

    public void actualizarInformacion(InfoComplementaria info) {

        if (info.getTipoMutual() == TipoMutual.A) {
            this.infoPrestamo = info;
        } else {
            this.infoReclamo = info;
        }
    }

    public void habilitarGuardar() {
        AltaButton.setEnabled(true);
    }

    private void deshabilitarFormularios(TipoMutual tipoMutual) {
        if (tipoMutual == TipoMutual.R) {
            datosReclamos.setEnabled(false);
        } else {
            datosPrestamos.setEnabled(false);
        }
//        habilitoFormularioPrestamo = false;
//        habilitoFormularioReclamo = false;
        AltaButton.setEnabled(false);
    }

    private void configuracionComponents() {
        AltaButton.setEnabled(false);
        checKPrestamoJlabel.setVisible(false);
        checKReclamolabel.setVisible(false);
    }
}
