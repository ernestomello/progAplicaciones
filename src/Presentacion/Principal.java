/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

/**
 *
 * @author juan
 */
public class Principal extends javax.swing.JFrame {


    @Override
    public void setVisible(boolean b) {
        super.setVisible(b); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setExtendedState(int state) {
        super.setExtendedState(state); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setVisible(true);
        
        //Mandando fruta
      /*
        jMenu1.add(jMenuItem3);
         jMenu1.add(jMenuItem4);
           jMenu1.add(jMenuItem5);
             jMenu1.add(jMenuItem6);
               jMenu1.add(jMenuItem7);
        
        jMenu2.add(jMenuItem11);
         jMenu2.add(jMenuItem10);
          jMenu2.add(jMenuItem9);
           jMenu2.add(jMenuItem8);
            jMenu2.add(jMenuItem13);
            
        jMenu4.add(jMenuItem12);
         jMenu4.add(jMenuItem15);
          jMenu4.add(jMenuItem14);
          
        jMenu5.add(jMenuItem16);  
         jMenu5.add(jMenuItem17);
                           
         jMenuBar1.add(jMenu1);
         jMenuBar1.add(jMenu2);
         jMenuBar1.add(jMenu4);
         jMenuBar1.add(jMenu5);
         
           this.setJMenuBar(jMenuBar1);   
           
           jMenuBar1.repaint();
           repaint();
           setVisible(true);
           jMenuBar1.setVisible(true); */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jFrame1 = new javax.swing.JFrame();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jm_altaPerfil = new javax.swing.JMenuItem();
        jm_consultaProponente = new javax.swing.JMenuItem();
        jm_consultaColaborador = new javax.swing.JMenuItem();
        jm_seguirUsuario = new javax.swing.JMenuItem();
        jm_dejarSeguir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jm_altaPropuesta = new javax.swing.JMenuItem();
        jm_altaCategoria = new javax.swing.JMenuItem();
        jm_consultaPropuesta = new javax.swing.JMenuItem();
        jm_consultaPropuestaEstado = new javax.swing.JMenuItem();
        jm_modificarPropuesta = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jm_colaborar = new javax.swing.JMenuItem();
        jm_cancelarColaboracion = new javax.swing.JMenuItem();
        jm_consultaColaboracion = new javax.swing.JMenuItem();
        jm_cargarDatos = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jm_configuracionGeneral = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Usuario");
        jMenu1.add(jSeparator1);

        jm_altaPerfil.setText("Alta de Perfil");
        jm_altaPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_altaPerfilActionPerformed(evt);
            }
        });
        jMenu1.add(jm_altaPerfil);

        jm_consultaProponente.setText("Consulta Proponente");
        jm_consultaProponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_consultaProponenteActionPerformed(evt);
            }
        });
        jMenu1.add(jm_consultaProponente);

        jm_consultaColaborador.setText("Consulta de colaborador");
        jm_consultaColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_consultaColaboradorActionPerformed(evt);
            }
        });
        jMenu1.add(jm_consultaColaborador);

        jm_seguirUsuario.setText("Seguir Usuario");
        jm_seguirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_seguirUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jm_seguirUsuario);

        jm_dejarSeguir.setText("Dejar de seguir");
        jm_dejarSeguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_dejarSeguirActionPerformed(evt);
            }
        });
        jMenu1.add(jm_dejarSeguir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Propuesta");

        jm_altaPropuesta.setText("Alta de Propuesta");
        jm_altaPropuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_altaPropuestaActionPerformed(evt);
            }
        });
        jMenu2.add(jm_altaPropuesta);

        jm_altaCategoria.setText("Alta de Categoria");
        jm_altaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_altaCategoriaActionPerformed(evt);
            }
        });
        jMenu2.add(jm_altaCategoria);

        jm_consultaPropuesta.setText("Consulta de Propuesta");
        jm_consultaPropuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_consultaPropuestaActionPerformed(evt);
            }
        });
        jMenu2.add(jm_consultaPropuesta);

        jm_consultaPropuestaEstado.setText("Consulta de Propuesta por estado");
        jm_consultaPropuestaEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_consultaPropuestaEstadoActionPerformed(evt);
            }
        });
        jMenu2.add(jm_consultaPropuestaEstado);

        jm_modificarPropuesta.setText("Modificar Propuesta");
        jm_modificarPropuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_modificarPropuestaActionPerformed(evt);
            }
        });
        jMenu2.add(jm_modificarPropuesta);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Colaboracion");

        jm_colaborar.setText("Colaborar ");
        jm_colaborar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_colaborarActionPerformed(evt);
            }
        });
        jMenu4.add(jm_colaborar);

        jm_cancelarColaboracion.setText("Cancelar Colaboracion");
        jm_cancelarColaboracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_cancelarColaboracionActionPerformed(evt);
            }
        });
        jMenu4.add(jm_cancelarColaboracion);

        jm_consultaColaboracion.setText("Consulta de colaboracion");
        jm_consultaColaboracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_consultaColaboracionActionPerformed(evt);
            }
        });
        jMenu4.add(jm_consultaColaboracion);

        jMenuBar1.add(jMenu4);

        jm_cargarDatos.setText("Configuracion");

        jMenuItem16.setText("Cargar datos de prueba");
        jm_cargarDatos.add(jMenuItem16);

        jm_configuracionGeneral.setText("Configuracion general");
        jm_cargarDatos.add(jm_configuracionGeneral);

        jMenuBar1.add(jm_cargarDatos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 646, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jm_seguirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_seguirUsuarioActionPerformed
        // TODO add your handling code here:
        Seguir_Usuario su= new Seguir_Usuario();
        //jDesktopPane1.add(su);
         this.getContentPane().add(su);
        su.show();
        
    }//GEN-LAST:event_jm_seguirUsuarioActionPerformed

    private void jm_altaPropuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_altaPropuestaActionPerformed
        // TODO add your handling code here:
        Alta_de_Propuesta adp= new Alta_de_Propuesta();
        //jDesktopPane1.add(adp);
         this.getContentPane().add(adp);
        adp.show();
    }//GEN-LAST:event_jm_altaPropuestaActionPerformed

    private void jm_altaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_altaCategoriaActionPerformed
        // TODO add your handling code here:
        Alta_de_categoria adc=new Alta_de_categoria();
       // jDesktopPane1.add(adc);
        this.getContentPane().add(adc);
        adc.show();
    }//GEN-LAST:event_jm_altaCategoriaActionPerformed

    private void jm_altaPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_altaPerfilActionPerformed
        Alta_perfil altaP= new Alta_perfil();
        
        altaP.show();

        // TODO add your handling code here:
    }//GEN-LAST:event_jm_altaPerfilActionPerformed

    private void jm_dejarSeguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_dejarSeguirActionPerformed
        // TODO add your handling code here:
        Dejar_de_Seguir_Usuario dd= new Dejar_de_Seguir_Usuario();
      //  jDesktopPane1.add(dd);
       this.getContentPane().add(dd);
        dd.show();
    }//GEN-LAST:event_jm_dejarSeguirActionPerformed

    private void jm_consultaColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_consultaColaboradorActionPerformed
        // TODO add your handling code here:
        Consulta_de_Perfil_de_Colaborador cc=new Consulta_de_Perfil_de_Colaborador();
       // jDesktopPane1.add(cc);
       this.getContentPane().add(cc);
        cc.show();
    }//GEN-LAST:event_jm_consultaColaboradorActionPerformed

    private void jm_consultaProponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_consultaProponenteActionPerformed
        // TODO add your handling code here:
        Consulta_de_Perfil_de_Proponente cp= new Consulta_de_Perfil_de_Proponente();
        //jDesktopPane1.add(cp);
         this.getContentPane().add(cp);
        cp.show();
    }//GEN-LAST:event_jm_consultaProponenteActionPerformed

    private void jm_consultaPropuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_consultaPropuestaActionPerformed
        // TODO add your handling code here:
        Consulta_de_Propuesta cdp= new Consulta_de_Propuesta();
      //  jDesktopPane1.add(cdp);
       this.getContentPane().add(cdp);
        cdp.show();
    }//GEN-LAST:event_jm_consultaPropuestaActionPerformed

    private void jm_consultaPropuestaEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_consultaPropuestaEstadoActionPerformed
        // TODO add your handling code here:
        Consulta_de_Propuesta_por_Estado cdppe= new Consulta_de_Propuesta_por_Estado();
       // jDesktopPane1.add(cdppe);
        this.getContentPane().add(cdppe);
        cdppe.show();
    }//GEN-LAST:event_jm_consultaPropuestaEstadoActionPerformed

    private void jm_modificarPropuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_modificarPropuestaActionPerformed
        // TODO add your handling code here:
        Modificar_datos_de_Propuesta mddp= new Modificar_datos_de_Propuesta();
       // jDesktopPane1.add(mddp);
        this.getContentPane().add(mddp);
        mddp.show();
               
    }//GEN-LAST:event_jm_modificarPropuestaActionPerformed

    private void jm_colaborarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_colaborarActionPerformed
        // TODO add your handling code here:
        Registrar_Colaboracion_a_Propuesta rcap= new Registrar_Colaboracion_a_Propuesta();
       // jDesktopPane1.add(rcap);
        this.getContentPane().add(rcap);
        rcap.show();
    }//GEN-LAST:event_jm_colaborarActionPerformed

    private void jm_cancelarColaboracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_cancelarColaboracionActionPerformed
        // TODO add your handling code here:
        Cancelar_colaboracion_a_Propuesta ccap= new Cancelar_colaboracion_a_Propuesta();
       // jDesktopPane1.add(ccap);
        this.getContentPane().add(ccap);
        ccap.show();
    }//GEN-LAST:event_jm_cancelarColaboracionActionPerformed

    private void jm_consultaColaboracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_consultaColaboracionActionPerformed
        // TODO add your handling code here:
        Consulta_de_Colaboracion_a_Propuesta cdcap= new Consulta_de_Colaboracion_a_Propuesta();
       // jDesktopPane1.add(cdcap);
        this.getContentPane().add(cdcap);
        cdcap.show();
    }//GEN-LAST:event_jm_consultaColaboracionActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem jm_altaCategoria;
    private javax.swing.JMenuItem jm_altaPerfil;
    private javax.swing.JMenuItem jm_altaPropuesta;
    private javax.swing.JMenuItem jm_cancelarColaboracion;
    private javax.swing.JMenu jm_cargarDatos;
    private javax.swing.JMenuItem jm_colaborar;
    private javax.swing.JMenuItem jm_configuracionGeneral;
    private javax.swing.JMenuItem jm_consultaColaboracion;
    private javax.swing.JMenuItem jm_consultaColaborador;
    private javax.swing.JMenuItem jm_consultaProponente;
    private javax.swing.JMenuItem jm_consultaPropuesta;
    private javax.swing.JMenuItem jm_consultaPropuestaEstado;
    private javax.swing.JMenuItem jm_dejarSeguir;
    private javax.swing.JMenuItem jm_modificarPropuesta;
    private javax.swing.JMenuItem jm_seguirUsuario;
    // End of variables declaration//GEN-END:variables
}
