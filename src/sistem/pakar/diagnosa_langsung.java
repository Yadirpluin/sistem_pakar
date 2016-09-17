/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.pakar;

import sistem.pakar.kelas_tanmbahan.koneksi;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;



/**
 *
 * @author Ncef
 */
public class diagnosa_langsung extends javax.swing.JDialog {
String a="tidak";
String b="tidak";
String c="tidak";
String d="tidak";
String e="tidak";
String f="tidak";
String g="tidak";
String h="tidak";
String j="tidak";
String i="tidak";
String k="tidak";
String l="tidak";
   
    public diagnosa_langsung(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setResizable(false);
        
    }
     public JTextField jtext1(){
        return jTextField2;
    }
    public JTextField jtext(){
        return jTextField3;
    }
    public JLabel jlabel1(){
        return jLabel1;
    }
    public JLabel jlabel2(){
        return jLabel2;
    }
    public JLabel jlabel3(){
        return jLabel3;
    }
    public JLabel jlabel4(){
        return jLabel4;
    }
    public JLabel jlabel5(){
        return jLabel5;
    }
    public JLabel jlabel6(){
        return jLabel6;
    }
    public JLabel jlabel7(){
        return jLabel7;
    }
     public JLabel jlabel11(){
        return jLabel11;
    }
      public JLabel jlabel12(){
        return jLabel12;
    }
       public JLabel jlabel13(){
        return jLabel13;
    }
        public JLabel jlabel14(){
        return jLabel14;
    }
         public JLabel jlabel15(){
        return jLabel15;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(615, 425));

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, -1, -1));

        jRadioButton1.setText("ya");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jRadioButton2.setText("tidak");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jRadioButton3.setText("ya");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jRadioButton4.setText("tidak");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jRadioButton5.setText("ya");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jRadioButton6.setText("tidak");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jRadioButton7.setText("ya");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jRadioButton8.setText("tidak");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jRadioButton9.setText("ya");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jRadioButton10.setText("tidak");
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jRadioButton11.setText("ya");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jRadioButton12.setText("tidak");
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("jLabel7");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jRadioButton13.setText("ya");
        jRadioButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jRadioButton14.setText("tidak");
        jRadioButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel11.setText("jLabel11");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jRadioButton15.setText("ya");
        jRadioButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jRadioButton16.setText("tidak");
        jRadioButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton16ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel12.setText("jLabel12");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel13.setText("jLabel13");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jRadioButton17.setText("ya");
        jRadioButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton17ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jRadioButton18.setText("tidak");
        jRadioButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton18ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jRadioButton19.setText("tidak");
        jRadioButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton19ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jRadioButton20.setText("ya");
        jRadioButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton20ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel14.setText("jLabel14");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jRadioButton21.setText("tidak");
        jRadioButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton21ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jRadioButton22.setText("ya");
        jRadioButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton22ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jRadioButton23.setText("ya");
        jRadioButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton23ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jRadioButton24.setText("tidak");
        jRadioButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton24ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        jLabel15.setText("jLabel15");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jButton1.setText("Hasil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(51, 255, 255));

        jLabel8.setText("ID Tanaman");

        jLabel9.setText("Nama Tanaman");

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(51, 255, 255));

        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel8)
                                .addGap(27, 27, 27)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 113, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if(jTextField3.getText().equals("ST001")){ 
        a="ya";
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(true);
        b="tidak";
        jRadioButton5.setSelected(false);
        jRadioButton7.setSelected(false);
        jRadioButton6.setSelected(true);
        c="tidak";
        jRadioButton8.setSelected(true);
        d="tidak";
        jRadioButton3.setEnabled(false);
        jRadioButton5.setEnabled(false);
        jRadioButton7.setEnabled(false);
        }else if(jTextField3.getText().equals("MU003")){
            a="ya";
        jRadioButton4.setSelected(false);
        jRadioButton3.setEnabled(true);
        jRadioButton2.setSelected(false);
        }
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        if(jTextField3.getText().equals("ST001")){ 
             a="tidak";
        jRadioButton1.setSelected(false);
        jRadioButton4.setSelected(false);
        jRadioButton6.setSelected(false);
        jRadioButton8.setSelected(false);
        jRadioButton3.setEnabled(true);
        jRadioButton5.setEnabled(true);
        jRadioButton7.setEnabled(true);
        }else if(jTextField3.getText().equals("MU003")){
        a="tidak";
        jRadioButton1.setSelected(false);
        jRadioButton4.setEnabled(false);
        jRadioButton3.setEnabled(false);
        b="tidak";
        }
        
       
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        if(jTextField3.getText().equals("ST001")){ 
             b="ya";
        jRadioButton4.setSelected(false);
        jRadioButton5.setSelected(false);
        jRadioButton5.setEnabled(false);
        jRadioButton7.setEnabled(false);
        jRadioButton6.setSelected(true);
        jRadioButton8.setSelected(true);
        c="tidak";
        d="tidak";
        }else if(jTextField3.getText().equals("MU003")){
            b="ya";
        jRadioButton4.setSelected(false);
        jRadioButton4.setEnabled(true);
        }
       
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        if(jTextField3.getText().equals("ST001")){
        b="tidak";
        jRadioButton3.setSelected(false);
        jRadioButton6.setSelected(false);
        jRadioButton8.setSelected(false);
        jRadioButton5.setEnabled(true);
        jRadioButton7.setEnabled(true);
        }
        
        
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        if(jTextField3.getText().equals("ST001")){ 
            c="ya";
        jRadioButton6.setSelected(false);
        jRadioButton4.setSelected(true);
        jRadioButton3.setSelected(false);
        jRadioButton7.setSelected(false);
        jRadioButton3.setEnabled(false);
        jRadioButton8.setSelected(true);
        jRadioButton7.setEnabled(false);
        d="tidak";
        b="tidak";
        }else if(jTextField3.getText().equals("MU003")){
        c="ya";
        jRadioButton6.setSelected(false);
        }
        
        
        
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
       if(jTextField3.getText().equals("ST001")){ 
       c="tidak";
       jRadioButton5.setSelected(false);
       jRadioButton4.setSelected(true);
       jRadioButton8.setSelected(false);
       jRadioButton7.setSelected(false);
       jRadioButton2.setSelected(true);
       jRadioButton3.setEnabled(true);
       jRadioButton7.setEnabled(true);
       }else if(jTextField3.getText().equals("MU003")){
        c="tidak";
        jRadioButton5.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        if(jTextField3.getText().equals("ST001")){ 
         d="ya";
       jRadioButton8.setSelected(false);
       jRadioButton2.setSelected(true);
       jRadioButton4.setSelected(true);
       jRadioButton6.setSelected(true);
       jRadioButton3.setEnabled(false);
       jRadioButton5.setEnabled(false);
       b="tidak";
       c="tidak";
       }else if(jTextField3.getText().equals("MU003")){
        d="ya";
        jRadioButton8.setSelected(false);
        }
       
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
       if(jTextField3.getText().equals("ST001")){ 
       d="tidak";
       jRadioButton7.setSelected(false);
       //jRadioButton4.setSelected(false);
      // jRadioButton6.setSelected(false);
       jRadioButton3.setEnabled(true);
       jRadioButton5.setEnabled(true);
       }else if(jTextField3.getText().equals("MU003")){
        d="tidak";
        jRadioButton7.setSelected(false);
        }
       
        
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
       e="ya";
       jRadioButton10.setSelected(false);
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
    e="tidak";
       jRadioButton9.setSelected(false);
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try {
        koneksi con=new koneksi();
        Hasil h=new Hasil(null,true);
        String[] d1=new String[1000];
        String[] d2=new String[1000];
        String[] d3=new String[1000];
        con.setkoneksi();
        if(jTextField3.getText().equals("ST001")){ 
        con.rs=con.st.executeQuery("select p.nm_penyakit,p.penjelasan,p.obat from diagnosa_tanaman d inner join penyakit p on d.Kd_penyakit=p.Kd_penyakit where \n" +
"d.JwarnaDH='"+a+"' and d.JwarnaDK='"+b+"' and d.JwarnaDBK='"+c+"' and d.ID_Tanaman='"+jTextField3.getText()+"'");
        if(con.rs.next()){
            d1[0]=con.rs.getString(1);
            d2[0]=con.rs.getString(2);
            d3[0]=con.rs.getString(3);
        }
        con.rs=con.st.executeQuery("select p.nm_penyakit,p.penjelasan,p.obat from diagnosa_tanaman d inner join penyakit p on d.Kd_penyakit=p.Kd_penyakit where \n" +
"d.j4='"+d+"' and d.j5='"+e+"' and d.ID_Tanaman='"+jTextField3.getText()+"'");
          if(con.rs.next()){
            d1[1]=con.rs.getString(1);
            d2[1]=con.rs.getString(2);
            d3[1]=con.rs.getString(3);
          }  
     con.rs=con.st.executeQuery("select p.nm_penyakit,p.penjelasan,p.obat from diagnosa_tanaman d inner join penyakit p on d.Kd_penyakit=p.Kd_penyakit where \n" +
"d.j5='"+e+"' and d.j6='"+f+"'and d.j7='"+g+"' and d.ID_Tanaman='"+jTextField3.getText()+"'");
     if(con.rs.next()){
            d1[2]=con.rs.getString(1);
            d2[2]=con.rs.getString(2);
            d3[2]=con.rs.getString(3);
     }
     con.rs=con.st.executeQuery("select p.nm_penyakit,p.penjelasan,p.obat from diagnosa_tanaman d inner join penyakit p on d.Kd_penyakit=p.Kd_penyakit where \n" +
"d.j8='"+h+"' and d.ID_Tanaman='"+jTextField3.getText()+"'");
     if(con.rs.next()){
            d1[3]=con.rs.getString(1);
            d2[3]=con.rs.getString(2);
            d3[3]=con.rs.getString(3);
     }
     con.rs=con.st.executeQuery("select p.nm_penyakit,p.penjelasan,p.obat from diagnosa_tanaman d inner join penyakit p on d.Kd_penyakit=p.Kd_penyakit where \n" +
"d.j9='"+i+"' and d.ID_Tanaman='"+jTextField3.getText()+"'");
     if(con.rs.next()){
            d1[3]=con.rs.getString(1);
            d2[3]=con.rs.getString(2);
            d3[3]=con.rs.getString(3);
     }
     con.rs=con.st.executeQuery("select p.nm_penyakit,p.penjelasan,p.obat from diagnosa_tanaman d inner join penyakit p on d.Kd_penyakit=p.Kd_penyakit \n" +
"where \n" +
"d.j10='"+j+"' and d.j11='"+k+"' and d.j12='"+l+"' and d.ID_Tanaman='"+jTextField3.getText()+"'");
     if(con.rs.next()){
            d1[4]=con.rs.getString(1);
            d2[4]=con.rs.getString(2);
            d3[4]=con.rs.getString(3);
     }
    String hasi="Hasil diagnosa :\n- ";
    String hasi1="Penjelasan :\n- ";
    String hasi2="Cara Pengendalian :\n- ";
     for(int i=0;i<5;i++){
        if((d1[i]!=null) && (d2[i]!=null) && (d3[i]!=null)){
            hasi=hasi+d1[i]+"\n- ";
            hasi1=hasi1+d2[i]+"\n- ";
            hasi2=hasi2+d3[i]+"\n- ";
        }
       }
               h.gettxt().setText(jTextField3.getText());
               h.gettxt1().setText(jTextField2.getText());
               h.gettext().setText(hasi);
               h.gettext1().setText(hasi1);
               h.gettext2().setText(hasi2);
        con.st.execute("insert into Hasil values('"+jTextField3.getText()+"','"+jTextField2.getText()+"','"+hasi+"','"+hasi1+"','"+hasi2+"')");
        
        
    }else if(jTextField3.getText().equals("MU003")){
        if(a=="ya" && b=="ya"){
            con.rs=con.st.executeQuery("select p.nm_penyakit,p.penjelasan,p.obat from diagnosa_tanaman d inner join penyakit p on d.Kd_penyakit=p.Kd_penyakit\n" +
"where d.JwarnaDH='"+a+"' and d.JwarnaDK='"+b+"' and d.ID_Tanaman='"+jTextField3.getText()+"'");
            if(con.rs.next()){
            d1[0]=con.rs.getString(1);
            d2[0]=con.rs.getString(2);
            d3[0]=con.rs.getString(3);
        }}else{
            con.rs=con.st.executeQuery("select p.nm_penyakit,p.penjelasan,p.obat from diagnosa_tanaman d inner join penyakit p on d.Kd_penyakit=p.Kd_penyakit\n" +
"where d.JwarnaDH='"+a+"' and d.JwarnaDK='"+b+"' and d.ID_Tanaman='"+jTextField3.getText()+"'");
                    if(con.rs.next()){
            d1[0]=con.rs.getString(1);
            d2[0]=con.rs.getString(2);
            d3[0]=con.rs.getString(3);
        }
         }
        con.rs=con.st.executeQuery("select p.nm_penyakit,p.penjelasan,p.obat from diagnosa_tanaman d inner join penyakit p on d.Kd_penyakit=p.Kd_penyakit\n" +
"where d.JwarnaDBK='"+c+"' and d.j4='"+d+"' and d.ID_Tanaman='"+jTextField3.getText()+"'");
        if(con.rs.next()){
            d1[1]=con.rs.getString(1);
            d2[1]=con.rs.getString(2);
            d3[1]=con.rs.getString(3);
        }
        con.rs=con.st.executeQuery("select p.nm_penyakit,p.penjelasan,p.obat from diagnosa_tanaman d inner join penyakit p on d.Kd_penyakit=p.Kd_penyakit\n" +
"where d.j5='"+e+"' and d.ID_Tanaman='"+jTextField3.getText()+"'");
        if(con.rs.next()){
            d1[2]=con.rs.getString(1);
            d2[2]=con.rs.getString(2);
            d3[2]=con.rs.getString(3);
        }
        con.rs=con.st.executeQuery("select p.nm_penyakit,p.penjelasan,p.obat from diagnosa_tanaman d inner join penyakit p on d.Kd_penyakit=p.Kd_penyakit\n" +
"where d.j6='"+f+"' and d.ID_Tanaman='"+jTextField3.getText()+"'");
        if(con.rs.next()){
            d1[3]=con.rs.getString(1);
            d2[3]=con.rs.getString(2);
            d3[3]=con.rs.getString(3);
        }
        String hasi="Hasil diagnosa :\n- ";
    String hasi1="Penjelasan :\n- ";
    String hasi2="Cara Pengendalian :\n- ";
     for(int i=0;i<5;i++){
        if((d1[i]!=null) && (d2[i]!=null) && (d3[i]!=null)){
            hasi=hasi+d1[i]+"\n- ";
            hasi1=hasi1+d2[i]+"\n- ";
            hasi2=hasi2+d3[i]+"\n- ";
        }
       }
               h.gettxt().setText(jTextField3.getText());
               h.gettxt1().setText(jTextField2.getText());
               h.gettext().setText(hasi);
               h.gettext1().setText(hasi1);
               h.gettext2().setText(hasi2);
        con.st.execute("insert into Hasil values('"+jTextField3.getText()+"','"+jTextField2.getText()+"','"+hasi+"','"+hasi1+"','"+hasi2+"')");
        
    }
    h.setVisible(true);
      dispose();
        
      
    } catch (SQLException ex) {
        Logger.getLogger(diagnosa_langsung.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        if(jTextField3.getText().equals("ST001")){ 
        f="ya";
        jRadioButton12.setSelected(false);
        jRadioButton13.setEnabled(true);
        jRadioButton14.setSelected(false);
        }else if(jTextField3.getText().equals("MU003")){
        f="ya";
        }
        
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
 if(jTextField3.getText().equals("ST001")){ 
  f="tidak";
        jRadioButton11.setSelected(false);
        jRadioButton12.setSelected(true);
        jRadioButton13.setSelected(false);
        jRadioButton13.setEnabled(false);
        jRadioButton14.setSelected(true);
        g="tidak";
 }else if(jTextField3.getText().equals("MU003")){
  f="tidak";
 }
 
       
    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void jRadioButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton13ActionPerformed
        // TODO add your handling code here:
        g="ya";
        jRadioButton14.setSelected(false);
    }//GEN-LAST:event_jRadioButton13ActionPerformed

    private void jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton14ActionPerformed
        // TODO add your handling code here:
        g="tidak";
        jRadioButton13.setSelected(false);
    }//GEN-LAST:event_jRadioButton14ActionPerformed

    private void jRadioButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton17ActionPerformed
        h="ya";
        jRadioButton18.setSelected(false);
    }//GEN-LAST:event_jRadioButton17ActionPerformed

    private void jRadioButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton18ActionPerformed
       h="tidak";
        jRadioButton17.setSelected(false);
    }//GEN-LAST:event_jRadioButton18ActionPerformed

    private void jRadioButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton20ActionPerformed
        i="ya";
        jRadioButton19.setSelected(false);
    }//GEN-LAST:event_jRadioButton20ActionPerformed

    private void jRadioButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton19ActionPerformed
        i="tidak";
        jRadioButton20.setSelected(false);
    }//GEN-LAST:event_jRadioButton19ActionPerformed

    private void jRadioButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton15ActionPerformed
        j="ya";
        jRadioButton16.setSelected(false);
    }//GEN-LAST:event_jRadioButton15ActionPerformed

    private void jRadioButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton16ActionPerformed
        j="tidak";
        jRadioButton15.setSelected(false);
    }//GEN-LAST:event_jRadioButton16ActionPerformed

    private void jRadioButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton21ActionPerformed
         k="tidak";
        jRadioButton22.setSelected(false);
    }//GEN-LAST:event_jRadioButton21ActionPerformed

    private void jRadioButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton22ActionPerformed
        k="ya";
        jRadioButton21.setSelected(false);
    }//GEN-LAST:event_jRadioButton22ActionPerformed

    private void jRadioButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton23ActionPerformed
        l="ya";
        jRadioButton24.setSelected(false);
    }//GEN-LAST:event_jRadioButton23ActionPerformed

    private void jRadioButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton24ActionPerformed
        l="tidak";
        jRadioButton23.setSelected(false);
    }//GEN-LAST:event_jRadioButton24ActionPerformed

   
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
            java.util.logging.Logger.getLogger(diagnosa_langsung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(diagnosa_langsung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(diagnosa_langsung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(diagnosa_langsung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                diagnosa_langsung dialog = new diagnosa_langsung(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
public JRadioButton getRadio0(){
    return jRadioButton13;
}
public JRadioButton getRadio1(){
    return jRadioButton14;
}
public JRadioButton getRadio2(){
    return jRadioButton15;
}
public JRadioButton getRadio3(){
    return jRadioButton16;
}
public JRadioButton getRadio4(){
    return jRadioButton17;
}
public JRadioButton getRadio5(){
    return jRadioButton18;
}
public JRadioButton getRadio6(){
    return jRadioButton19;
}
public JRadioButton getRadio7(){
    return jRadioButton20;
}
public JRadioButton getRadio8(){
    return jRadioButton21;
}
public JRadioButton getRadio9(){
    return jRadioButton22;
}
public JRadioButton getRadio10(){
    return jRadioButton23;
}
public JRadioButton getRadio11(){
    return jRadioButton24;
}
public JRadioButton getRadio12(){
    return jRadioButton1;
}
public JRadioButton getRadio13(){
    return jRadioButton2;
}
public JRadioButton getRadio14(){
    return jRadioButton3;
}
public JRadioButton getRadio15(){
    return jRadioButton4;
}
}
