/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Principal.VentanaDeInicio;
import VentanasAlumnos.ChatAlumno;
import VentanasAlumnos.DiasFaltasProfesores;
import VentanasAlumnos.VentanaRegistroFaltas;
import VentanasAlumnos.VentanasAsignaturas;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author 3medi
 */
public class VentanaAlumno extends javax.swing.JFrame {

    private VentanaDeInicio ventanaDeInicio;
    private VentanasAsignaturas ventanasAsignaturas;
    private DiasFaltasProfesores diasFaltasProfesores;
    private VentanaRegistroFaltas ventanaRegistroFaltas;
    private ChatAlumno alumno;
    private VentanaEnviarCorreos ventanaEnviarCorreos;

    /**
     * Creates new form VentanaAlumno
     *
     * @param ventanaDeInicio
     */
    public VentanaAlumno(VentanaDeInicio ventanaDeInicio) {
        //Constructor principal 
        initComponents();
        this.setVisible(true);
        this.ventanaDeInicio = ventanaDeInicio;
        this.setLocationRelativeTo(null);

        //Le asignamos a los lbels las imagenes
        ImageIcon imagen = new ImageIcon(getClass().getResource("../Imagenes/fondo-libros.png"));
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(Libros.getWidth(), Libros.getHeight(), Image.SCALE_DEFAULT));
        Libros.setIcon(icono);

        ImageIcon imagenMadrid = new ImageIcon(getClass().getResource("../Imagenes/madrid.png"));
        Icon iconoMadrid = new ImageIcon(imagenMadrid.getImage().getScaledInstance(Madrid.getWidth(), Madrid.getHeight(), Image.SCALE_DEFAULT));
        Madrid.setIcon(iconoMadrid);
        this.repaint();

    }

    private VentanaAlumno() {
        System.out.println("Para acceder a la aplicación tiene que iniciar desde el login.");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        sexo = new javax.swing.JLabel();
        NombreAlumno = new javax.swing.JLabel();
        codAlumno = new javax.swing.JLabel();
        Madrid = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        correoElectronico = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        botonVolver = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButtonAsignaturas = new javax.swing.JButton();
        jButtonFaltas = new javax.swing.JButton();
        Mensajeria = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Libros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 0, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        sexo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-estudiante-masculino-48.png"))); // NOI18N
        sexo.setText("jLabel7");

        NombreAlumno.setFont(new java.awt.Font("Bookman Old Style", 2, 18)); // NOI18N
        NombreAlumno.setText("Alumno");

        codAlumno.setFont(new java.awt.Font("Bookman Old Style", 2, 14)); // NOI18N
        codAlumno.setText("codigo");

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 2, 18)); // NOI18N
        jLabel2.setText("<html><p>Gestión de rendimiento</p> academico</html>");

        correoElectronico.setBackground(new java.awt.Color(255, 255, 255));
        correoElectronico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-inicio-de-sesión-de-gmail-40.png"))); // NOI18N
        correoElectronico.setToolTipText("Gestión de correo electronico");
        correoElectronico.setBorder(null);
        correoElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoElectronicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Madrid, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196)
                .addComponent(correoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codAlumno)
                    .addComponent(NombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Madrid, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(NombreAlumno)
                            .addGap(0, 0, 0)
                            .addComponent(codAlumno))
                        .addComponent(sexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(correoElectronico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );

        jPanel3.setBackground(new java.awt.Color(102, 0, 204));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        botonVolver.setBackground(new java.awt.Color(0, 0, 0));
        botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-volver-50.png"))); // NOI18N
        botonVolver.setToolTipText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        jPanel13.setPreferredSize(new java.awt.Dimension(100, 1));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Controles Alumno");

        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jButtonAsignaturas.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAsignaturas.setFont(new java.awt.Font("Bookman Old Style", 2, 24)); // NOI18N
        jButtonAsignaturas.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAsignaturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-nota-50.png"))); // NOI18N
        jButtonAsignaturas.setText("Asignaturas");
        jButtonAsignaturas.setToolTipText("Notas");
        jButtonAsignaturas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonAsignaturas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonAsignaturas.setIconTextGap(25);
        jButtonAsignaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAsignaturasActionPerformed(evt);
            }
        });

        jButtonFaltas.setBackground(new java.awt.Color(0, 0, 0));
        jButtonFaltas.setFont(new java.awt.Font("Bookman Old Style", 2, 24)); // NOI18N
        jButtonFaltas.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFaltas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-historial-de-retrasos-50.png"))); // NOI18N
        jButtonFaltas.setText("Faltas ");
        jButtonFaltas.setToolTipText("Faltas de los profesores y alumnos");
        jButtonFaltas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonFaltas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonFaltas.setIconTextGap(25);
        jButtonFaltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFaltasActionPerformed(evt);
            }
        });

        Mensajeria.setBackground(new java.awt.Color(0, 0, 0));
        Mensajeria.setFont(new java.awt.Font("Baskerville Old Face", 2, 24)); // NOI18N
        Mensajeria.setForeground(new java.awt.Color(255, 255, 255));
        Mensajeria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-crear-nueva-entrada-de-niño-50.png"))); // NOI18N
        Mensajeria.setText("Chat profesor");
        Mensajeria.setToolTipText("Ventana de chat entre el profesor y el alumno");
        Mensajeria.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Mensajeria.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Mensajeria.setIconTextGap(25);
        Mensajeria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MensajeriaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Consultas tablas");

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 2, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Chat interno");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonAsignaturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonFaltas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Mensajeria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jButtonAsignaturas)
                .addGap(30, 30, 30)
                .addComponent(jButtonFaltas)
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Mensajeria, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Libros, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Libros, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed

        //Salimos de la ventana, en el caso de que haya alguna ventana asociada a esta se cierra también
        int advertencia = JOptionPane.showConfirmDialog(null, "¿Está seguro de volver al login? Se perderán los datos");

        if (advertencia == JOptionPane.YES_OPTION) {
            dispose();
            if (ventanaEnviarCorreos != null) {
                System.out.println("Cerramos la gestión de correos.");
                ventanaEnviarCorreos.dispose();
            }
            if (ventanaRegistroFaltas != null) {
                System.out.println("Cerramos el registro de faltas.");
                ventanaRegistroFaltas.dispose();
            }
            if (ventanasAsignaturas != null) {
                System.out.println("Cerramos las asignaturas del alumno.");
                ventanasAsignaturas.dispose();
            }
            if (alumno != null) {
                System.out.println("Cerramos el chat del alumno");
                alumno.dispose();
            }
            if (diasFaltasProfesores != null) {
                System.out.println("Cerramos la información de las faltas de los profesores");
                diasFaltasProfesores.dispose();
            }
            ventanaDeInicio.setVisible(true);
        }
    }//GEN-LAST:event_botonVolverActionPerformed

    private void jButtonAsignaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAsignaturasActionPerformed
        // Desplegamos la ventana de asignaturas

        ventanasAsignaturas = new VentanasAsignaturas(Integer.parseInt(codAlumno.getText()), NombreAlumno.getText());

    }//GEN-LAST:event_jButtonAsignaturasActionPerformed

    private void jButtonFaltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFaltasActionPerformed

        //Damos la opción de entrar a las faltas de los alumnos o de los profesores 
        String[] options = {"Profesor", "Alumno"};
        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione la opción que desea", "Seleccion faltas", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (seleccion == 0) {
            System.out.println("Profesor");
            diasFaltasProfesores = new DiasFaltasProfesores(this);
        }
        if (seleccion == 1) {
            System.out.println("Alumno");
            ventanaRegistroFaltas = new VentanaRegistroFaltas(Integer.parseInt(codAlumno.getText()));
        }

    }//GEN-LAST:event_jButtonFaltasActionPerformed

    private void MensajeriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MensajeriaActionPerformed
        // damos pie al chat interno
        if (alumno == null) {
            alumno = new ChatAlumno(this);
        }else{
            JOptionPane.showMessageDialog(this, "Ya se inició el chat.");
        }
    }//GEN-LAST:event_MensajeriaActionPerformed

    private void correoElectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoElectronicoActionPerformed
        // desplegamos la ventana de correo electronico
        ventanaEnviarCorreos = new VentanaEnviarCorreos(1);
    }//GEN-LAST:event_correoElectronicoActionPerformed

    //gets and sets
    public JLabel getSexo() {
        return sexo;
    }

    public void setSexo(JLabel sexo) {
        this.sexo = sexo;
    }

    public JLabel getNombreAlumno() {
        return NombreAlumno;
    }

    public void setNombreAlumno(JLabel NombreAlumno) {
        this.NombreAlumno = NombreAlumno;
    }

    public JLabel getCodAlumno() {
        return codAlumno;
    }

    public void setCodAlumno(JLabel codAlumno) {
        this.codAlumno = codAlumno;
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaAlumno().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Libros;
    private javax.swing.JLabel Madrid;
    private javax.swing.JButton Mensajeria;
    private javax.swing.JLabel NombreAlumno;
    private javax.swing.JButton botonVolver;
    private javax.swing.JLabel codAlumno;
    private javax.swing.JButton correoElectronico;
    private javax.swing.JButton jButtonAsignaturas;
    private javax.swing.JButton jButtonFaltas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel sexo;
    // End of variables declaration//GEN-END:variables
}
