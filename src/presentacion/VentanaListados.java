/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;
import negocio.GestorPacientes;
/**
 *
 * @author aludba
 */
public class VentanaListados extends javax.swing.JFrame {

    /**
     * Creates new form VentanaListados
     */
    
    public VentanaListados(GestorPacientes g) {
        gestor=g;
        initComponents();
        txtArea.setText(gestor.ordenarPor(0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        cmbMetodoOrdenar = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblOrdenadosPor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 100));
        setSize(new java.awt.Dimension(300, 700));

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        btnCancelar.setText("Cancelar");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        cmbMetodoOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ordenar por:", "Nombre", "Edad", "Altura", "Peso" }));
        cmbMetodoOrdenar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMetodoOrdenarItemStateChanged(evt);
            }
        });
        cmbMetodoOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMetodoOrdenarActionPerformed(evt);
            }
        });

        jLabel1.setText("Selecione método de odenamiento");

        jLabel2.setText("Ahora estan ordenados por: ");

        lblOrdenadosPor.setText("Orden natural");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(131, 131, 131))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbMetodoOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblOrdenadosPor, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbMetodoOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblOrdenadosPor, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalir))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();

    }//GEN-LAST:event_btnSalirActionPerformed

    private void cmbMetodoOrdenarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMetodoOrdenarItemStateChanged
        // TODO add your handling code here:
        
            
        
    }//GEN-LAST:event_cmbMetodoOrdenarItemStateChanged

    private void cmbMetodoOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMetodoOrdenarActionPerformed
        // TODO add your handling code here:
        int op=cmbMetodoOrdenar.getSelectedIndex();
        
        switch (op) {
            case 1:
                txtArea.setText(gestor.ordenarPor(1).toString());
                lblOrdenadosPor.setText(cmbMetodoOrdenar.getSelectedItem().toString());
                break;
            case 2:
                txtArea.setText(gestor.ordenarPor(2).toString());
                lblOrdenadosPor.setText(cmbMetodoOrdenar.getSelectedItem().toString());

                break;
            case 3:
                txtArea.setText(gestor.ordenarPor(3).toString());
                lblOrdenadosPor.setText(cmbMetodoOrdenar.getSelectedItem().toString());

                break;
            case 4:
                txtArea.setText(gestor.ordenarPor(4).toString());
                lblOrdenadosPor.setText(cmbMetodoOrdenar.getSelectedItem().toString());

                break;
            default:
                lblOrdenadosPor.setText("Orden natural");
                break;
        }
    }//GEN-LAST:event_cmbMetodoOrdenarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private GestorPacientes gestor;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbMetodoOrdenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOrdenadosPor;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
