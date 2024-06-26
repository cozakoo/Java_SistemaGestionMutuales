package GUI.Mutual;

import GUI.Buttons.Alta.AltaButtonRender;
import GUI.Buttons.Baja.BajaButtonEditor_Mutual;
import GUI.Buttons.Baja.BajaButtonRender;
import GUI.Buttons.Alta.AltaButtonEditor_Mutual;
import GUI.Buttons.Modificar.ModificarButtonEditor_Mutual;
import GUI.Buttons.Modificar.ModificarButtonRender;
import interfaz.UpdateListener;
import com.mycompany.mutuales.DataBase;
import interfaz.IConsultaSql;
import static interfaz.iCargaImagenes.url_imagen_agregar;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

import javax.swing.table.DefaultTableModel;

public class ListMutuales extends javax.swing.JFrame implements UpdateListener {

    DefaultTableModel modelActivo;
    DefaultTableModel modelInactivo;

    /**
     * Creates new form ListMutuales
     */
    public ListMutuales() throws SQLException {
        initComponents();
        cargarImagenes();
        cabeceraModel();
        cargarMutuales();
        cargarButton();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JScrollPane jScrollPane3 = new javax.swing.JScrollPane();
        javax.swing.JEditorPane jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        AgregarMutualjLabel = new javax.swing.JLabel();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        jTableActivos = new javax.swing.JTable();
        javax.swing.JScrollPane jScrollPane2 = new javax.swing.JScrollPane();
        jTableInactivos = new javax.swing.JTable();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("Sistema de Mutuales");

        jScrollPane3.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setForeground(new java.awt.Color(0, 153, 204));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("Lista de Mutuales");

        AgregarMutualjLabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        AgregarMutualjLabel.setText("Agregar Mutual");
        AgregarMutualjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarMutualjLabelMouseClicked(evt);
            }
        });

        jTableActivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nombre", "Estado", "button"
            }
        ));
        jTableActivos.setAlignmentY(1.5F);
        jScrollPane1.setViewportView(jTableActivos);

        jTableInactivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nombre", "Estado", "button"
            }
        ));
        jTableInactivos.setAlignmentY(1.5F);
        jScrollPane2.setViewportView(jTableInactivos);

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Inactivo");

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 204, 0));
        jLabel6.setText("Activo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel5)
                        .addGap(686, 686, 686))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(181, 181, 181)
                        .addComponent(AgregarMutualjLabel)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1))
                        .addGap(16, 16, 16))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AgregarMutualjLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarMutualjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMutualjLabelMouseClicked
        // TODO add your handling code here:
        FormAltaMutual mutualAlta = new FormAltaMutual();
        mutualAlta.addListener(this);
        mutualAlta.setVisible(true);
        

    }//GEN-LAST:event_AgregarMutualjLabelMouseClicked

    private void cargarButton() {

        ModificarButtonEditor_Mutual btButtonEditorModificar = new ModificarButtonEditor_Mutual();
        btButtonEditorModificar.addlistener(this);

        jTableActivos.getColumnModel().getColumn(1).setCellRenderer(new ModificarButtonRender());
        BajaButtonEditor_Mutual btnEditorBaja = new BajaButtonEditor_Mutual();
        btnEditorBaja.addlistener(this);
        jTableActivos.getColumnModel().getColumn(1).setCellEditor(btButtonEditorModificar);
        jTableActivos.getColumnModel().getColumn(2).setCellEditor(btnEditorBaja);
        jTableActivos.getColumnModel().getColumn(2).setCellRenderer(new BajaButtonRender());

        jTableInactivos.getColumnModel().getColumn(1).setCellRenderer(new ModificarButtonRender());
        AltaButtonEditor_Mutual btnedEditorAlta = new AltaButtonEditor_Mutual();
        btnedEditorAlta.addlistener(this);
        jTableInactivos.getColumnModel().getColumn(1).setCellEditor(btButtonEditorModificar);
        jTableInactivos.getColumnModel().getColumn(2).setCellEditor(btnedEditorAlta);
        jTableInactivos.getColumnModel().getColumn(2).setCellRenderer(new AltaButtonRender());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JLabel AgregarMutualjLabel;
    javax.swing.JPanel jPanel1;
    javax.swing.JTable jTableActivos;
    javax.swing.JTable jTableInactivos;
    // End of variables declaration//GEN-END:variables

    private void cargarMutuales() throws SQLException {

        cargarMutualesActivas();
        cargarMutualeInactivas();
    }

    private void cabeceraModel() {
        generarCampos();
    }

    private void generarCampos() {
        modelActivo = new DefaultTableModel();
        modelActivo.addColumn("Nombre");

        modelActivo.addColumn("");
        modelActivo.addColumn("");

        modelInactivo = new DefaultTableModel();
        modelInactivo.addColumn("Nombre");

        modelInactivo.addColumn("");
        modelInactivo.addColumn("");
    }

    @Override
    public void updateTableData() {
        cabeceraModel();
        try {
            cargarMutuales();
        } catch (SQLException ex) {
            Logger.getLogger(ListMutuales.class.getName()).log(Level.SEVERE, null, ex);
        }
        cargarButton();
    }

    private void cargarMutualesActivas() throws SQLException {

        ResultSet mutuales = DataBase.getInstance(true).consulta(IConsultaSql.consulta_mutual_listado_activo);
        while (mutuales.next()) {
            Object[] row = {mutuales.getObject(1)};
            modelActivo.addRow(row);
        }
        jTableActivos.setModel(modelActivo);
    }

    private void cargarMutualeInactivas() throws SQLException {
        ResultSet mutuales = DataBase.getInstance(true).consulta(IConsultaSql.consulta_mutual_listado_inactivo);
        while (mutuales.next()) {
            Object[] row = {mutuales.getObject(1)};
            modelInactivo.addRow(row);
        }
        jTableInactivos.setModel(modelInactivo);
    }

    private void cargarImagenes() {
        String dirActual = System.getProperty("user.dir");
        AgregarMutualjLabel.setIcon(new javax.swing.ImageIcon(dirActual + url_imagen_agregar));
        try {
            BufferedImage iconImage = ImageIO.read(new File(dirActual + "\\images\\icono.png"));

            // Establecer la imagen como ícono de la aplicación
            this.setIconImage(iconImage);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
