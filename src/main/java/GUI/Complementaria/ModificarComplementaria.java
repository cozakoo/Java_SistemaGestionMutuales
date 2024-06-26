package GUI.Complementaria;

import interfaz.UpdateListener;
import com.mycompany.mutuales.InfoComplementaria;
import com.mycompany.mutuales.Utilidades;
import enumeradores.TipoMutual;
import interfaz.iCargaImagenes;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class ModificarComplementaria extends javax.swing.JFrame {

    private UpdateListener update;
    private InfoComplementaria complementaria;

    public ModificarComplementaria(InfoComplementaria complementaria, UpdateListener update) {
        try {

            this.complementaria = complementaria;
            this.update = update;
            initComponents();
            cargarImagenes();

            cargarDatos();

        } catch (SQLException ex) {
            Logger.getLogger(ModificarComplementaria.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        tipoMutualJlabel = new javax.swing.JLabel();
        ModificarButton = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        Concepto1jTextField2 = new javax.swing.JTextField();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
        Concepto2jTextField3 = new javax.swing.JTextField();
        DestinojTextField1 = new javax.swing.JTextField();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel9 = new javax.swing.JLabel();
        OrigenjTextField = new javax.swing.JTextField();
        javax.swing.JLabel jLabel10 = new javax.swing.JLabel();
        nombreMutualjlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(252, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(252, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tipoMutualJlabel.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tipoMutualJlabel.setForeground(new java.awt.Color(102, 102, 102));
        jPanel3.add(tipoMutualJlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        ModificarButton.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        ModificarButton.setForeground(new java.awt.Color(102, 102, 102));
        ModificarButton.setText("Modificar");
        ModificarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificarButtonMouseClicked(evt);
            }
        });
        jPanel3.add(ModificarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 130, 40));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Modificación de complementaria");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Destino");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Mutual:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Concepto 1");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));
        jPanel3.add(Concepto1jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 110, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Concepto 2");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));
        jPanel3.add(Concepto2jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 110, -1));
        jPanel3.add(DestinojTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 110, -1));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 540, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Origen");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, 20));
        jPanel3.add(OrigenjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 110, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("TIPO:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        nombreMutualjlabel.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        nombreMutualjlabel.setForeground(new java.awt.Color(102, 102, 102));
        nombreMutualjlabel.setText("nombre");
        jPanel3.add(nombreMutualjlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 250, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 470));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ModificarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarButtonMouseClicked

        if (Utilidades.validarCampos(
                OrigenjTextField,
                DestinojTextField1,
                Concepto1jTextField2,
                Concepto2jTextField3)) {

            if (Utilidades.esNumero(Concepto1jTextField2.getText())
                    && Utilidades.esNumero(Concepto2jTextField3.getText())) {

                String origen = Utilidades.agregarExtensionTxt(OrigenjTextField.getText());
                String destino = Utilidades.agregarExtensionTxt(DestinojTextField1.getText());

                int concepto1 = Utilidades.validarYConvertirAEntero(Concepto1jTextField2.getText());
                int concepto2 = Utilidades.validarYConvertirAEntero(Concepto2jTextField3.getText());

                if (Utilidades.mensajeConfirmar("¿Desea confirmar la modificación?", "Confirmar modificación")) {
                    try {
                        complementaria.modificarEnBaseDeDatos(
                                origen,
                                destino,
                                concepto1,
                                concepto2
                        );
                        this.dispose();
                        Utilidades.mensajeExito("Complementaria modificada con exito!");
                    } catch (SQLException ex) {
                        Logger.getLogger(ModificarComplementaria.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } else {
                Utilidades.mensajeAdvertencia("Concepto1 y Concepto2 tienen que ser numericos.");
            }

        } else {
            Utilidades.mensajeAdvertencia("Debe de completar los campos.");
        }
        update.updateTableData();
    }//GEN-LAST:event_ModificarButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTextField Concepto1jTextField2;
    javax.swing.JTextField Concepto2jTextField3;
    javax.swing.JTextField DestinojTextField1;
    javax.swing.JLabel ModificarButton;
    javax.swing.JTextField OrigenjTextField;
    javax.swing.JLabel nombreMutualjlabel;
    javax.swing.JLabel tipoMutualJlabel;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos() throws SQLException {

        OrigenjTextField.setText(String.valueOf(complementaria.getOrigen()));

        if (complementaria.getTipoMutual() == TipoMutual.A) {
            tipoMutualJlabel.setText("Prestamo");
        } else {
            tipoMutualJlabel.setText("Reclamo");
        }
        nombreMutualjlabel.setText(
                Utilidades.obtenerNombreMutual(this.complementaria.getIdMutual()));

        DestinojTextField1.setText(String.valueOf(complementaria.getDestino()));
        Concepto1jTextField2.setText(String.valueOf(complementaria.getConcep1()));
        Concepto2jTextField3.setText(String.valueOf(complementaria.getConcep2()));
    }

    private void cargarImagenes() {
        String dirActual = System.getProperty("user.dir");
        ModificarButton.setIcon(new javax.swing.ImageIcon(dirActual + iCargaImagenes.url_imagen_rigth));
        try {
            BufferedImage iconImage = ImageIO.read(new File(dirActual + "\\images\\icono.png"));

            // Establecer la imagen como ícono de la aplicación
            this.setIconImage(iconImage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
