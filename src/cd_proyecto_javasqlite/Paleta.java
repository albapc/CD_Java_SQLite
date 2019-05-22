package cd_proyecto_javasqlite;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aperezcesar
 */
public class Paleta extends javax.swing.JFrame {

    /**
     * Creates new form Paleta
     */
    Consultas query = new Consultas();
    int referencia;

    /**
     * Ejecuta la GUI
     */
    public Paleta() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        BaseDatos = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        bSelectAll = new javax.swing.JButton();
        bInsert = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bSelect = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        bUpdate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jButton2.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROYECTO BASE DE DATOS");
        setResizable(false);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Referencia", "Nombre", "Nota", "Id_pais"
            }
        ));
        BaseDatos.setViewportView(jTable2);

        bSelectAll.setText("Select all");
        bSelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSelectAllActionPerformed(evt);
            }
        });

        bInsert.setText("Insert");
        bInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInsertActionPerformed(evt);
            }
        });

        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        jLabel1.setText("Muestra el contenido de la tabla");

        jLabel2.setText("Añade un registro a una tabla");

        jLabel3.setText("Borra un registro de una tabla");

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PROYECTO BASE DE DATOS");

        bSelect.setText("Select");
        bSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSelectActionPerformed(evt);
            }
        });

        jLabel4.setText("Buscar un registro de la tabla");

        bUpdate.setText("Update");
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });

        jLabel6.setText("Actualizar un registro de la tabla");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bSelectAll, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bUpdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bSelect, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(BaseDatos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSelectAll)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bInsert)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bDelete)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bSelect)
                            .addComponent(jLabel4)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bUpdate)
                    .addComponent(jLabel6))
                .addGap(19, 19, 19)
                .addComponent(BaseDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInsertActionPerformed

        //Si encuentra la misma referencia, salta la excepcion y no deja insertar nuevas filas
        int cont = coincidencias();
        if (cont > 0) {
            jTextArea1.setText("Ya existe un alumno con esa referencia");
        } else {
            query.insert(referencia, Metodos.pedirNombre(), Metodos.pedirNota(), Metodos.pedirIdPais());
            jTextArea1.setText("Se ha añadido 1 fila");
            actualizarTabla();
        }
    }//GEN-LAST:event_bInsertActionPerformed

    /**
     * Método que cuenta el número de filas que coinciden con la referencia
     * introducida por teclado para saber si ya existe esa referencia en la base
     * de datos o no. Devuelve la variable contador con el número de
     * coincidencias.
     *
     * @return cont
     */
    private int coincidencias() {
        //Variable para almacenar nº de coincidencias
        int cont = 0;
        try {
            referencia = Metodos.pedirReferencia();

            Conexion.s = Conexion.con.createStatement();
            Conexion.rs = Conexion.s.executeQuery("select count(*) from alumnos where referencia=" + referencia);
            if (Conexion.rs.next()) {
                cont = Conexion.rs.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return cont;
    }

    private void bSelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSelectAllActionPerformed
        actualizarTabla();
    }//GEN-LAST:event_bSelectAllActionPerformed

    /**
     * Muestra todos los datos recopilados de la tabla "alumnos": referencia,
     * nombre, nota e id_pais. Se invoca para actualizar los datos de esta una
     * vez se haya realizado una inserción, actualización, borrado, etc. de la
     * tabla.
     */
    private void actualizarTabla() {
        DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();

        if (dtm.getRowCount() > 1) {
            for (int i = 0; i < dtm.getRowCount(); i++) {
                dtm.removeRow(i);
            }
        }
        int contador = 0;
        for (int i = 0; i < query.select().size(); i++) {

            jTable2.setValueAt(((Alumno) (query.select().get(i))).getReferencia(), contador, 0);
            jTable2.setValueAt(((Alumno) (query.select().get(i))).getNombre(), contador, 1);
            jTable2.setValueAt(((Alumno) (query.select().get(i))).getNota(), contador, 2);
            jTable2.setValueAt(((Alumno) (query.select().get(i))).getId_pais(), contador, 3);

            if (dtm.getRowCount() < query.select().size()) {
                dtm.addRow(new Object[contador]);
            }
            contador++;
        }
    }

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        int cont = coincidencias();
        if (cont == 0) {
            jTextArea1.setText("No existe ningún alumno con esa referencia");
        } else {
            query.delete(referencia);
            jTextArea1.setText("Se ha(n) eliminado " + cont + " fila(s)");
            actualizarTabla();
        }
    }//GEN-LAST:event_bDeleteActionPerformed

    private void bSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSelectActionPerformed

        DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();

        if (dtm.getRowCount() > 1) {
            for (int i = 0; i < dtm.getRowCount(); i++) {
                dtm.removeRow(i);
            }
        }
        referencia = Metodos.pedirReferencia();
        int contador = 0;
        for (int i = 0; i < query.selectParameters(referencia).size(); i++) {

            jTable2.setValueAt(((Alumno) (query.selectParameters(referencia).get(i))).getReferencia(), contador, 0);
            jTable2.setValueAt(((Alumno) (query.selectParameters(referencia).get(i))).getNombre(), contador, 1);
            jTable2.setValueAt(((Alumno) (query.selectParameters(referencia).get(i))).getNota(), contador, 2);
            jTable2.setValueAt(((Alumno) (query.selectParameters(referencia).get(i))).getId_pais(), contador, 3);

            if (dtm.getRowCount() < query.selectParameters(referencia).size()) {
                dtm.addRow(new Object[contador]);
            }
            contador++;
        }

        //si no encontro resultados, el contador no se incrementa
        if (contador == 0) {
            jTextArea1.setText("No se encontraron resultados.");
        } else {
            jTextArea1.setText("Se encontraron un total de " + contador + " resultados");
        }
    }//GEN-LAST:event_bSelectActionPerformed

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed

        //Variable para almacenar nº de coincidencias resultante del metodo, para que no nos pida meter la referencia 2 veces
        int cont = coincidencias();

        //Si no encuentra la referencia, salta la excepcion y no deja actualizar la base de datos
        if (cont == 0) {
            jTextArea1.setText("No existe esa referencia");
        } else {
            query.update(Metodos.pedirNombre(), Metodos.pedirNota(), referencia, Metodos.pedirIdPais());
            jTextArea1.setText("Se ha(n) modificado " + cont + " fila(s)");
            actualizarTabla();
        }
    }//GEN-LAST:event_bUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(Paleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        Conexion.conectar();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane BaseDatos;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bInsert;
    private javax.swing.JButton bSelect;
    private javax.swing.JButton bSelectAll;
    private javax.swing.JButton bUpdate;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}