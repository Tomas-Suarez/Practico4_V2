
package JFrame;

import practico4_v2.Datos;

public class Menu_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Principal
     */
    public Menu_Principal() {
        Datos.sample();
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        JBAlumno = new javax.swing.JMenu();
        JMalumno = new javax.swing.JMenuItem();
        JBmaterias = new javax.swing.JMenu();
        JMmaterias = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        JMinscripcion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 646, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );

        JBAlumno.setText("Alumno");

        JMalumno.setText("Agregar Alumno");
        JMalumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMalumnoActionPerformed(evt);
            }
        });
        JBAlumno.add(JMalumno);

        jMenuBar1.add(JBAlumno);

        JBmaterias.setText("Materia");

        JMmaterias.setText("Agregar Materia");
        JMmaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMmateriasActionPerformed(evt);
            }
        });
        JBmaterias.add(JMmaterias);

        jMenuBar1.add(JBmaterias);

        jMenu1.setText("Registro");

        JMinscripcion.setText("Incripcion");
        JMinscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMinscripcionActionPerformed(evt);
            }
        });
        jMenu1.add(JMinscripcion);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMinscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMinscripcionActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        Formulario_Inscripcion Finscripcion = new Formulario_Inscripcion();
        Finscripcion.setVisible(true);
        Escritorio.add(Finscripcion);
        Escritorio.moveToFront(Finscripcion);
    }//GEN-LAST:event_JMinscripcionActionPerformed

    private void JMalumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMalumnoActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        Formulario_Alumnos Falumnos = new Formulario_Alumnos();
        Falumnos.setVisible(true);
        Escritorio.add(Falumnos);
        Escritorio.moveToFront(Falumnos);
    }//GEN-LAST:event_JMalumnoActionPerformed

    private void JMmateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMmateriasActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        Formulario_Materias Fmaterias = new Formulario_Materias();
        Fmaterias.setVisible(true);
        Escritorio.add(Fmaterias);
        Escritorio.moveToFront(Fmaterias);
    }//GEN-LAST:event_JMmateriasActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu JBAlumno;
    private javax.swing.JMenu JBmaterias;
    private javax.swing.JMenuItem JMalumno;
    private javax.swing.JMenuItem JMinscripcion;
    private javax.swing.JMenuItem JMmaterias;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
