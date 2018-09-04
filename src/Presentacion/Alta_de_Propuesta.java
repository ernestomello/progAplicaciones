/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.ContPropuesta;
import Logica.ContUsuario;
import Logica.dtFecha;
import Logica.dtProponente;
import Logica.dtPropuesta;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nicolasgutierrez
 */
public class Alta_de_Propuesta extends javax.swing.JInternalFrame {

    /**
     * Creates new form Alta_de_Propuesta
     */
    private ContUsuario ICU = ContUsuario.getInstance();
    private ContPropuesta ICP = ContPropuesta.getInstance();
    String imagenRuta ="COSO";
    JFileChooser navegadorArchivos = new JFileChooser();
    
    public Alta_de_Propuesta() {
        initComponents();
        
        this.setSize(850, 600);
        
        String imagenRuta=null;
        JFileChooser navegadorArchivos=new JFileChooser();
        jLabel14.setText("Proponentes");
        jLabel15.setText("Categorias");
        jLabel1.setText("Proponente");
        jLabel2.setText("Tipo de Espectaculo");
        jLabel4.setText("Titulo");
        jLabel7.setText("Fecha realizacion");
        jLabel8.setText("Dia");
        jLabel9.setText("Mes");
        jLabel10.setText("Anio");
        jLabel5.setText("Descripcion");
        jLabel6.setText("Lugar");
        jLabel13.setText("Retornos posibles");
        cbporcentaje.setText("Porcentaje");
        cbentradas.setText("Entradas");
        jLabel16.setText("Monto requerido");
        jLabel11.setText("Costo entrada");
        jLabel12.setText("Imagen");
        btnexplorar.setText("Explorar");
        btndardealta.setText("Dar de Alta");
        btncancelar.setText("Cancelar");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txttipoespectaculo = new javax.swing.JTextField();
        txtproponente1 = new javax.swing.JTextField();
        txtdia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtlugar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txttitulo1 = new javax.swing.JTextField();
        txtmes = new javax.swing.JTextField();
        txtanio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtcostoentrada = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnexplorar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btndardealta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtbuscar = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtbuscar1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cbporcentaje = new javax.swing.JCheckBox();
        cbentradas = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdescripcion = new javax.swing.JTextArea();
        labelimage = new javax.swing.JLabel();
        txtmontorec = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btncancelar = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txttipoespectaculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttipoespectaculoActionPerformed(evt);
            }
        });

        txtproponente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproponente1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(txtproponente1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttipoespectaculo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtproponente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttipoespectaculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 53, -1, -1));

        txtdia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiaActionPerformed(evt);
            }
        });
        getContentPane().add(txtdia, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 148, 40, -1));

        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 126, -1, -1));

        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 182, -1, -1));

        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 296, -1, -1));

        txtlugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlugarActionPerformed(evt);
            }
        });
        getContentPane().add(txtlugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 333, 160, -1));

        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 126, -1, -1));

        txttitulo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttitulo1ActionPerformed(evt);
            }
        });
        getContentPane().add(txttitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 148, 160, -1));

        txtmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmesActionPerformed(evt);
            }
        });
        getContentPane().add(txtmes, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 177, 40, -1));

        txtanio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtanioActionPerformed(evt);
            }
        });
        getContentPane().add(txtanio, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 206, 40, -1));

        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 153, -1, -1));

        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 182, -1, -1));

        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 211, -1, -1));

        txtcostoentrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcostoentradaActionPerformed(evt);
            }
        });
        getContentPane().add(txtcostoentrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 260, 160, -1));

        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 238, -1, -1));

        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 303, -1, -1));

        btnexplorar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexplorarActionPerformed(evt);
            }
        });
        getContentPane().add(btnexplorar, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 298, -1, -1));

        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 371, -1, -1));

        btndardealta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndardealtaActionPerformed(evt);
            }
        });
        getContentPane().add(btndardealta, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 434, 110, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Nickname"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 84, 131, 382));

        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });
        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbuscarKeyPressed(evt);
            }
        });
        getContentPane().add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 40, 132, -1));

        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 18, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 84, 132, 382));

        txtbuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscar1ActionPerformed(evt);
            }
        });
        txtbuscar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbuscar1KeyPressed(evt);
            }
        });
        getContentPane().add(txtbuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 40, 132, -1));

        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 18, -1, -1));

        getContentPane().add(cbporcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 405, -1, -1));

        getContentPane().add(cbentradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 440, -1, -1));

        jScrollPane1.setViewportView(txtdescripcion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 206, -1, -1));
        getContentPane().add(labelimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 130, 100));

        txtmontorec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmontorecActionPerformed(evt);
            }
        });
        getContentPane().add(txtmontorec, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 510, 160, -1));

        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 480, -1, -1));

        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 470, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttipoespectaculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttipoespectaculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttipoespectaculoActionPerformed

    private void txtproponente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproponente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproponente1ActionPerformed

    private void txtdiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiaActionPerformed

    private void txtlugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlugarActionPerformed

    private void txttitulo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttitulo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttitulo1ActionPerformed

    private void txtmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmesActionPerformed

    private void txtanioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtanioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanioActionPerformed

    private void txtcostoentradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcostoentradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcostoentradaActionPerformed

    private void btnexplorarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexplorarActionPerformed
        // TODO add your handling code here:
        selecImagen();
    }//GEN-LAST:event_btnexplorarActionPerformed

    private void btndardealtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndardealtaActionPerformed
        // TODO add your handling code here:
        if(controlardatos()){
            Calendar cal=Calendar.getInstance();
            Date da=cal.getTime();
            dtFecha dtfpublicada=new dtFecha(Integer.toString(da.getDay()),Integer.toString(da.getMonth()),Integer.toString(da.getYear()));
            dtFecha dtfrealizar=new dtFecha(txtdia.getText(),txtmes.getText(),txtanio.getText());
            
             String re="";
        
            if(cbentradas.isSelected()&&!cbporcentaje.isSelected()){
                re=cbentradas.getText();
            }else if(cbentradas.isSelected()&&cbporcentaje.isSelected()){
                re=cbentradas.getText()+"/"+cbporcentaje.getText();
            }else if(!cbentradas.isSelected()&&cbporcentaje.isSelected()){
                re=cbporcentaje.getText();
            }
            
            
            dtPropuesta dtp=new dtPropuesta(txttitulo1.getText(),txtdescripcion.getText(),imagenRuta,txtlugar.getText(),"Ingresada",txttipoespectaculo.getText(),txtproponente1.getText(),dtfrealizar,dtfpublicada,Integer.parseInt(txtcostoentrada.getText()),Integer.parseInt(txtmontorec.getText()),0,re);
            ICP.datosPropuesta(dtp);
            
            JOptionPane.showMessageDialog(null, "Propuesta agregada con exito");
        }
        else{
            JOptionPane.showMessageDialog(null, "Controle los datos");
        }
            
    }//GEN-LAST:event_btndardealtaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row=jTable1.rowAtPoint(evt.getPoint());
        int col=jTable1.columnAtPoint(evt.getPoint());
        
        txtproponente1.setText((String)jTable1.getValueAt(row, col));
        

    }//GEN-LAST:event_jTable1MouseClicked

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void txtbuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyPressed
        // TODO add your handling code here:
        List<String> proponentes= ICU.listarProponentes(txtbuscar.getText());
        DefaultTableModel modelo=(DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
        for (int i=0;i<proponentes.size();i++) {
            String p=proponentes.get(i);
            Object[] dat={p};
            modelo.addRow(dat);
        }

    }//GEN-LAST:event_txtbuscarKeyPressed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        
        int row=jTable1.rowAtPoint(evt.getPoint());
        int col=jTable1.columnAtPoint(evt.getPoint());
        
        txttipoespectaculo.setText((String)jTable2.getValueAt(row, col));
    }//GEN-LAST:event_jTable2MouseClicked

    private void txtbuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscar1ActionPerformed

    private void txtbuscar1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscar1KeyPressed
        // TODO add your handling code here:
        
        List<String> categorias= ICP.listarCategorias(txtbuscar1.getText());
        DefaultTableModel modelo=(DefaultTableModel) jTable2.getModel();
        modelo.setRowCount(0);
        for(int i=0;i<categorias.size();i++){
            String c=categorias.get(i);
            Object[] dat={c};
            modelo.addRow(dat);
        }
    }//GEN-LAST:event_txtbuscar1KeyPressed

    private void txtmontorecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmontorecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmontorecActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo=(DefaultTableModel) jTable2.getModel();
        modelo.setRowCount(0);
        
        DefaultTableModel modelo2=(DefaultTableModel) jTable1.getModel();
        modelo2.setRowCount(0);
        
        this.limpiartodo(jPanel1);
        this.dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

    
    public boolean controlardatos(){
        int anio=Integer.parseInt(txtanio.getText());
        int mes=Integer.parseInt(txtmes.getText());
        int dia=Integer.parseInt(txtdia.getText());
        String re="";
        
        if(cbentradas.isSelected()&&!cbporcentaje.isSelected()){
            re=cbentradas.getText();
        }else if(cbentradas.isSelected()&&cbporcentaje.isSelected()){
            re=cbentradas.getText()+"/"+cbporcentaje.getText();
        }else if(!cbentradas.isSelected()&&cbporcentaje.isSelected()){
            re=cbporcentaje.getText();
        }
        
        if(this.txtproponente1.getText()=="" || this.txttipoespectaculo.getText()=="" || this.txttitulo1.getText()=="" || txtlugar.getText()=="" || txtcostoentrada.getText()=="")
            return false;
        if(anio<1940 || 2030>anio)
            return false;
        if(mes<1 || mes > 12)
            return false;
        if(dia <1 || dia > 31)
            return false;
        if(re=="")
            return false;
        else
            return true;
      
       
    }
    
       private void selecImagen(){
       FileNameExtensionFilter filtroImagen=new FileNameExtensionFilter("JPG, PNG & GIF","jpg","png","gif");
       navegadorArchivos.setFileFilter(filtroImagen);
       navegadorArchivos.showOpenDialog(this);
       File imagen = navegadorArchivos.getSelectedFile();
       String path = navegadorArchivos.getSelectedFile().getPath();
       labelimage.setIcon(new ImageIcon(path));
       ImageIcon icon = new ImageIcon(path);
       Image foto = icon.getImage();
       Image nuevaFoto = foto.getScaledInstance(labelimage.getWidth(), labelimage.getHeight(), Image.SCALE_DEFAULT);
       ImageIcon nuevoIcono = new ImageIcon(nuevaFoto);
       labelimage.setIcon(nuevoIcono);
       //BufferedImage img= nuevoIcono;
       salvarImagen(foto);}
       
       
          private void salvarImagen(Image imagen){
   BufferedImage img = (BufferedImage) imagen;
   File outputfile = new File("/home/juan/ProgAplicaciones2018/progAplicaciones/imagenesPropuesta"+txttitulo1.getText()+".png");
   imagenRuta="/home/juan/ProgAplicaciones2018/progAplicaciones/imagenesPropuesta"+txttitulo1.getText()+".png";
    try { 
        ImageIO.write(img, "png", outputfile);
    } catch (IOException ex) {
        Logger.getLogger(Alta_perfil.class.getName()).log(Level.SEVERE, null, ex);
    }
   }
          
       public void limpiartodo(JPanel panel){
        for(int i = 0; panel.getComponents().length > i; i++){
            if(panel.getComponents()[i] instanceof JTextField){
                ((JTextField)panel.getComponents()[i]).setText("");
            }   
        }
       }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btndardealta;
    private javax.swing.JButton btnexplorar;
    private javax.swing.JCheckBox cbentradas;
    private javax.swing.JCheckBox cbporcentaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel labelimage;
    private javax.swing.JTextField txtanio;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtbuscar1;
    private javax.swing.JTextField txtcostoentrada;
    private javax.swing.JTextArea txtdescripcion;
    private javax.swing.JTextField txtdia;
    private javax.swing.JTextField txtlugar;
    private javax.swing.JTextField txtmes;
    private javax.swing.JTextField txtmontorec;
    private javax.swing.JTextField txtproponente1;
    private javax.swing.JTextField txttipoespectaculo;
    private javax.swing.JTextField txttitulo1;
    // End of variables declaration//GEN-END:variables
}

