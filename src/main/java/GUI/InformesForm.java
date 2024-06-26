package GUI;

import com.mycompany.mutuales.DataBase;

import com.mycompany.mutuales.Txt;
import com.mycompany.mutuales.Utilidades;

import interfaz.IConsultaSql;

import java.awt.print.PrinterException;

import static interfaz.iCargaImagenes.url_imagen_filtro;
import static interfaz.iCargaImagenes.url_imagen_print;
import java.awt.image.BufferedImage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class InformesForm extends javax.swing.JFrame {

    private DefaultTableModel modelActivo;
    private ResultSet consulta;

    /**
     * Creates new form ListMutuales
     */
    public InformesForm() throws SQLException {
        initComponents();
        cargarImagenes();
        cabeceraModel();
        cargarComponentes();
        cargarInformes();
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
        javax.swing.JScrollPane jScrollPane2 = new javax.swing.JScrollPane();
        jTableIInforme = new javax.swing.JTable();
        AnioLiqjComboBox1 = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        MesesLiqjComboBox = new javax.swing.JComboBox<>();
        FiltrarjLabel = new javax.swing.JLabel();
        ImprimirjLabel = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("Sistema de Mutuales");

        jScrollPane3.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setForeground(new java.awt.Color(0, 153, 204));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("INFORMES PRESTAMOS Y RECLAMOS");

        jTableIInforme.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTableIInforme.setForeground(new java.awt.Color(51, 51, 51));
        jTableIInforme.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nombre", "Estado", "Title 4", "button"
            }
        ));
        jTableIInforme.setAlignmentY(1.5F);
        jScrollPane2.setViewportView(jTableIInforme);

        AnioLiqjComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mayo", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Mes de liquidacion");

        MesesLiqjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mayo", "Item 2", "Item 3", "Item 4" }));

        FiltrarjLabel.setText("Filtrar");
        FiltrarjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FiltrarjLabelMouseClicked(evt);
            }
        });

        ImprimirjLabel.setText("Imprimir");
        ImprimirjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImprimirjLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(MesesLiqjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(AnioLiqjComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(FiltrarjLabel)
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(254, 254, 254))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(ImprimirjLabel)
                        .addGap(373, 373, 373))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AnioLiqjComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FiltrarjLabel))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MesesLiqjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImprimirjLabel)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FiltrarjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FiltrarjLabelMouseClicked
        try {
            String condicion = generarCondicional(MesesLiqjComboBox.getSelectedItem().toString(), AnioLiqjComboBox1.getSelectedItem().toString());
            generarCampos();
            // TODO add your handling code here:
            System.out.print(IConsultaSql.consulta_infome_Listado + " " + condicion);
            consulta = DataBase.getInstance(true).consulta(IConsultaSql.consulta_infome_Listado + " " + condicion + " ORDER BY codigo, tipo");

            while (consulta.next()) {
                Object[] row = {consulta.getObject(1), consulta.getObject(2),
                    consulta.getObject(3), consulta.getObject(4),
                    consulta.getObject(5), consulta.getObject(6)};
                modelActivo.addRow(row);
            }
            jTableIInforme.setModel(modelActivo);

            // Después de cargar los datos, configurar el ancho de las columnas
            configurarVentana();
        } catch (SQLException ex) {
            Logger.getLogger(InformesForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FiltrarjLabelMouseClicked

    public void utilJTablePrint(JTable jTable, String header, String footer, boolean showPrintDialog) {
        boolean fitWidth = true;
        boolean interactive = true;
        // We define the print mode (Definimos el modo de impresión)
        JTable.PrintMode mode = fitWidth ? JTable.PrintMode.FIT_WIDTH : JTable.PrintMode.NORMAL;
        try {
            // Print the table (Imprimo la tabla)             
            boolean complete = jTable.print(mode,
                    new MessageFormat(header),
                    new MessageFormat(footer),
                    showPrintDialog,
                    null,
                    interactive);
            if (complete) {
                Utilidades.mensajeExito("Impresion completa!");
            } else {
                Utilidades.mensajeError("Impresion cancelada");
            }
        } catch (PrinterException pe) {
            Utilidades.mensajeError("Fallo de impresión");
        }
    }

    private void ImprimirjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImprimirjLabelMouseClicked
        utilJTablePrint(jTableIInforme,
                this.MesesLiqjComboBox.getSelectedItem().toString()
                + " "
                + this.AnioLiqjComboBox1.getSelectedItem().toString(),
                "",
                true);

//            
//        try {
//            Txt tex = new Txt("informe.txt");
//            exportarDatosATxt(tex);
//            Impresora impresora = new Impresora();
//            impresora.imprimirArchivo(tex);
//        } catch (IOException ex) {
//            Logger.getLogger(InformesForm.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    

    }//GEN-LAST:event_ImprimirjLabelMouseClicked

    private void exportarDatosATxt(Txt txt) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(txt.getNombreArchivo()))) {
            txt.escribirEncabezados(writer, jTableIInforme);
            txt.escribirDatos(writer, jTableIInforme);
        }
        System.out.println("Exportación exitosa ");
    }

    /**
     * @param args the command line arguments
     */
    private void cabeceraModel() {
        generarCampos();
        configurarVentana();
    }

    private void generarCampos() {
        modelActivo = new DefaultTableModel();
        modelActivo.addColumn("codigo");
        modelActivo.addColumn("concepto");

        modelActivo.addColumn("mutual");
        modelActivo.addColumn("archivo");

        modelActivo.addColumn("tipo");

    }

    private void configurarVentana() {
        // Configuración del ancho de las columnas
        TableColumn columnaCodigo = jTableIInforme.getColumnModel().getColumn(0);
        TableColumn columnaConcepto = jTableIInforme.getColumnModel().getColumn(1);
        TableColumn columnaMutual = jTableIInforme.getColumnModel().getColumn(2);
        TableColumn columnaArchivo = jTableIInforme.getColumnModel().getColumn(3);
        TableColumn columnaTipo = jTableIInforme.getColumnModel().getColumn(4);

        columnaCodigo.setPreferredWidth(0);
        columnaConcepto.setPreferredWidth(0);
        columnaMutual.setPreferredWidth(250);
        columnaArchivo.setPreferredWidth(0);
        columnaTipo.setPreferredWidth(0);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JComboBox<String> AnioLiqjComboBox1;
    javax.swing.JLabel FiltrarjLabel;
    javax.swing.JLabel ImprimirjLabel;
    javax.swing.JComboBox<String> MesesLiqjComboBox;
    javax.swing.JPanel jPanel1;
    javax.swing.JTable jTableIInforme;
    // End of variables declaration//GEN-END:variables

    private void cargarImagenes() {
        String dirActual = System.getProperty("user.dir");
        ImprimirjLabel.setIcon(new javax.swing.ImageIcon(dirActual + url_imagen_print));
        FiltrarjLabel.setIcon(new javax.swing.ImageIcon(dirActual + url_imagen_filtro));
        try {
            BufferedImage iconImage = ImageIO.read(new File(dirActual + "\\images\\icono.png"));

            // Establecer la imagen como ícono de la aplicación
            this.setIconImage(iconImage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void cargarComponentes() {
        Calendar calendario = Calendar.getInstance();
        int cantAñosAnteriores = 5;
        int anioActual = calendario.get(Calendar.YEAR);

        String[] nombresMeses = new String[12];
        int mesActual = 1;  // Empieza desde enero (mes 1)

        for (int i = 0; i < 12; i++) {
            nombresMeses[i] = Utilidades.obtenerNombreMes(mesActual);
            mesActual++;
        }
        
        String[] anios = new String[cantAñosAnteriores];
        anios[0] = Integer.toString(anioActual);
        for (int i = 1; i < cantAñosAnteriores; i++) {
            anioActual = anioActual - 1;
            anios[i] = Integer.toString(anioActual);
            // Retroceder un mes para el próximo ciclo del bucle

        }

        // Crear el JComboBox y agregar los nombres de los meses
        ComboBoxModel<String> nuevoModelo = new DefaultComboBoxModel<>(nombresMeses);
        ComboBoxModel<String> nuevoModeloAnios = new DefaultComboBoxModel<>(anios);
        MesesLiqjComboBox.setModel(nuevoModelo);
        AnioLiqjComboBox1.setModel(nuevoModeloAnios);
    }

    private void cargarInformes() {
        jTableIInforme.setModel(modelActivo);
    }

    private String generarCondicional(String mes, String anio) {
        return "WHERE fecha = '" + mes + " " + anio + "'";
    }

}
