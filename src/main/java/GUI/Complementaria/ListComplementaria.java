package GUI.Complementaria;

import GUI.Buttons.Modificar.ModificarButtonEditor_Complementaria;
import GUI.Buttons.Modificar.ModificarButtonRender;
import interfaz.UpdateListener;
import com.mycompany.mutuales.DataBase;
import interfaz.IConsultaSql;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

import javax.swing.table.DefaultTableModel;

public class ListComplementaria extends javax.swing.JFrame implements UpdateListener {

    DefaultTableModel modelActivo;

    /**
     * Creates new form ListMutuales
     */
    public ListComplementaria() throws SQLException {
        initComponents();
        cargarImagenes();
        generarCabecera();
        cargarComplementaria();
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
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        jTableActivos = new javax.swing.JTable();

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("Sistema de Mutuales");

        jScrollPane3.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setForeground(new java.awt.Color(0, 153, 204));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("Informacion de Prestamos y Reclamos ");

        jTableActivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nombre", "Estado", "button"
            }
        ));
        jTableActivos.setAlignmentY(1.5F);
        jScrollPane1.setViewportView(jTableActivos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
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

    private void cargarButton() {
        jTableActivos.getColumnModel().getColumn(6).setCellRenderer(new ModificarButtonRender() {});

        ModificarButtonEditor_Complementaria btButtonEditorModificar = new ModificarButtonEditor_Complementaria();
        btButtonEditorModificar.addlistener(this);

        //set buttons modificar
        jTableActivos.getColumnModel().getColumn(6).setCellEditor(btButtonEditorModificar);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JPanel jPanel1;
    javax.swing.JTable jTableActivos;
    // End of variables declaration//GEN-END:variables

    private void cargarComplementaria() throws SQLException {
        ResultSet complementaria = DataBase.getInstance(true).consulta(IConsultaSql.consulta_complementaria_Listado);
        while (complementaria.next()) {
            Object[] row = {
//                complementaria.getObject(1),
                complementaria.getObject(1),
                complementaria.getObject(2),
                complementaria.getObject(3),
                complementaria.getObject(4),
                complementaria.getObject(5),
                complementaria.getObject(6)};
            modelActivo.addRow(row);
        }

        jTableActivos.setModel(modelActivo);
    }

    private void generarCabecera() {
        modelActivo = new DefaultTableModel();
//        modelActivo.addColumn("Id Jurada");
        modelActivo.addColumn("Mutual");
        modelActivo.addColumn("Tipo");
        modelActivo.addColumn("Origen");
        modelActivo.addColumn("Destino");
        modelActivo.addColumn("Concepto1");
        modelActivo.addColumn("Concepto2");
        modelActivo.addColumn("");
    }

    @Override
    public void updateTableData() {
        generarCabecera();
        try {
            cargarComplementaria();

        } catch (SQLException ex) {
            Logger.getLogger(ListComplementaria.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        cargarButton();
    }

    private void cargarImagenes() {
        String dirActual = System.getProperty("user.dir");
//        AgregarMutualjLabel.setIcon(new javax.swing.ImageIcon(dirActual + url_imagen_agregar));
        try {
            BufferedImage iconImage = ImageIO.read(new File(dirActual+"\\images\\icono.png"));
            
            // Establecer la imagen como ícono de la aplicación
            this.setIconImage(iconImage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
