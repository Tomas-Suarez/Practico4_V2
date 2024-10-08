/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package JFrame;

import javax.swing.JOptionPane;
import practico4_v2.Materia;

/**
 *
 * @author Tomi
 */
public class Formulario_Materias extends javax.swing.JInternalFrame {

    /**
     * Creates new form Formulario_Materias
     */
    public Formulario_Materias() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbExit = new javax.swing.JButton();
        jbNew = new javax.swing.JButton();
        jbSave = new javax.swing.JButton();
        jtMaterias = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtAnio = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Formulario de Materias");

        jLabel2.setText("CODIGO DE MATERIA:");

        jLabel3.setText("NOMBRE DE LA MATERIA:");

        jLabel4.setText("AÑO AL QUE PERTENCE:");

        jbExit.setText("Salir");
        jbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExitActionPerformed(evt);
            }
        });

        jbNew.setText("Nuevo");
        jbNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNewActionPerformed(evt);
            }
        });

        jbSave.setText("Guardar");
        jbSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtNombre)
                            .addComponent(jtAnio))
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbExit)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(104, 104, 104))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbExit)
                    .addComponent(jbNew)
                    .addComponent(jbSave))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSaveActionPerformed
        try{
        int idMateria = Integer.parseInt(jtMaterias.getText().trim()); //Convierto un string a entero. El trim me borra los espacios
        String nombreLegajo = jtNombre.getText();
        String year = jtAnio.getText().trim(); //Convierto un string a entero. El trim me borra los espacios
        
        Materia materia = new Materia(idMateria, nombreLegajo, year);
        
        if(Colegio.materias.add(materia)){
            JOptionPane.showMessageDialog(this, "La materia fue cargada con exito!");
        }else{
            JOptionPane.showMessageDialog(this, "No es posible cargar la materia, ya se encuentra en el sistema!");
        }
       }catch(NumberFormatException e){
           JOptionPane.showMessageDialog(this, "Ingrese datos validos!");
       }
    }//GEN-LAST:event_jbSaveActionPerformed

    private void jbNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNewActionPerformed
        jtNombre.setText("");
        jtAnio.setText("");
        jtMaterias.setText("");
    }//GEN-LAST:event_jbNewActionPerformed

    private void jbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExitActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jbExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbExit;
    private javax.swing.JButton jbNew;
    private javax.swing.JButton jbSave;
    private javax.swing.JTextField jtAnio;
    private javax.swing.JTextField jtMaterias;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
