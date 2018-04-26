/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio27;

import java.util.ArrayList;

/**
 *
 * @author Arturo
 */
public class Calculadora extends javax.swing.JFrame{

    static ArrayList cad=new ArrayList();
    float num1, num2, resultado;
    boolean sum, res, div, mult;

    /**
     * Creates new form Calculadora
     */
    public Calculadora(){
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }

    public void desabilitarBotones(){
        bDiv.setEnabled(false);
        bMulti.setEnabled(false);
        bResta.setEnabled(false);
        bSuma.setEnabled(false);
    }

    public void habilitarBotones(){
        bDiv.setEnabled(true);
        bMulti.setEnabled(true);
        bResta.setEnabled(true);
        bSuma.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        pantalla = new javax.swing.JTextField();
        bLimpiar = new javax.swing.JButton();
        bBorrar = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bResta = new javax.swing.JButton();
        bMulti = new javax.swing.JButton();
        bDiv = new javax.swing.JButton();
        bSuma = new javax.swing.JButton();
        bIgual = new javax.swing.JButton();
        bDec = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(153, 153, 153));

        pantalla.setEditable(false);

        bLimpiar.setBackground(new java.awt.Color(0, 0, 255));
        bLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        bLimpiar.setText("Limpiar");
        bLimpiar.setPreferredSize(new java.awt.Dimension(80, 40));
        bLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimpiarActionPerformed(evt);
            }
        });

        bBorrar.setBackground(new java.awt.Color(255, 0, 0));
        bBorrar.setForeground(new java.awt.Color(255, 255, 255));
        bBorrar.setText("Borrar");
        bBorrar.setPreferredSize(new java.awt.Dimension(80, 40));
        bBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(51, 51, 51));
        b7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b7.setForeground(new java.awt.Color(255, 255, 255));
        b7.setText("7");
        b7.setPreferredSize(new java.awt.Dimension(60, 60));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(51, 51, 51));
        b8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b8.setForeground(new java.awt.Color(255, 255, 255));
        b8.setText("8");
        b8.setPreferredSize(new java.awt.Dimension(60, 60));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(51, 51, 51));
        b9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b9.setForeground(new java.awt.Color(255, 255, 255));
        b9.setText("9");
        b9.setPreferredSize(new java.awt.Dimension(60, 60));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(51, 51, 51));
        b4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b4.setForeground(new java.awt.Color(255, 255, 255));
        b4.setText("4");
        b4.setPreferredSize(new java.awt.Dimension(60, 60));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(51, 51, 51));
        b5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b5.setForeground(new java.awt.Color(255, 255, 255));
        b5.setText("5");
        b5.setPreferredSize(new java.awt.Dimension(60, 60));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(51, 51, 51));
        b6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b6.setForeground(new java.awt.Color(255, 255, 255));
        b6.setText("6");
        b6.setPreferredSize(new java.awt.Dimension(60, 60));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(51, 51, 51));
        b3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b3.setForeground(new java.awt.Color(255, 255, 255));
        b3.setText("3");
        b3.setPreferredSize(new java.awt.Dimension(60, 60));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(51, 51, 51));
        b1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 255, 255));
        b1.setText("1");
        b1.setPreferredSize(new java.awt.Dimension(60, 60));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(51, 51, 51));
        b2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b2.setForeground(new java.awt.Color(255, 255, 255));
        b2.setText("2");
        b2.setPreferredSize(new java.awt.Dimension(60, 60));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b0.setBackground(new java.awt.Color(51, 51, 51));
        b0.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b0.setForeground(new java.awt.Color(255, 255, 255));
        b0.setText("0");
        b0.setPreferredSize(new java.awt.Dimension(60, 60));
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        bResta.setBackground(new java.awt.Color(51, 51, 51));
        bResta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bResta.setForeground(new java.awt.Color(255, 255, 255));
        bResta.setText("-");
        bResta.setPreferredSize(new java.awt.Dimension(130, 60));
        bResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRestaActionPerformed(evt);
            }
        });

        bMulti.setBackground(new java.awt.Color(51, 51, 51));
        bMulti.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bMulti.setForeground(new java.awt.Color(255, 255, 255));
        bMulti.setText("*");
        bMulti.setPreferredSize(new java.awt.Dimension(130, 60));
        bMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMultiActionPerformed(evt);
            }
        });

        bDiv.setBackground(new java.awt.Color(51, 51, 51));
        bDiv.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bDiv.setForeground(new java.awt.Color(255, 255, 255));
        bDiv.setText("/");
        bDiv.setPreferredSize(new java.awt.Dimension(130, 60));
        bDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDivActionPerformed(evt);
            }
        });

        bSuma.setBackground(new java.awt.Color(51, 51, 51));
        bSuma.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bSuma.setForeground(new java.awt.Color(255, 255, 255));
        bSuma.setText("+");
        bSuma.setPreferredSize(new java.awt.Dimension(130, 60));
        bSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSumaActionPerformed(evt);
            }
        });

        bIgual.setBackground(new java.awt.Color(51, 51, 51));
        bIgual.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bIgual.setForeground(new java.awt.Color(255, 255, 255));
        bIgual.setText("=");
        bIgual.setPreferredSize(new java.awt.Dimension(60, 60));
        bIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIgualActionPerformed(evt);
            }
        });

        bDec.setBackground(new java.awt.Color(51, 51, 51));
        bDec.setForeground(new java.awt.Color(255, 255, 255));
        bDec.setText(".");
        bDec.setPreferredSize(new java.awt.Dimension(60, 60));
        bDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pantalla)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(bLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bDiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bMulti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(panelLayout.createSequentialGroup()
                                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelLayout.createSequentialGroup()
                                            .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(bDec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(bIgual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(33, 33, 33)
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bSuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bResta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMulti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bResta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bIgual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bSuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bDec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIgualActionPerformed
        num2=Float.parseFloat(Metodos.arrayString());
        cad.clear();
        if(sum){
            resultado=num1+num2;
            cad.add(resultado);
        }else if(res){
            resultado=num1-num2;
            cad.add(resultado);
        }else if(mult){
            resultado=num1*num2;
            cad.add(resultado);
        }else if(div){
            resultado=num1/num2;
            cad.add(resultado);
        }
        pantalla.setText(Metodos.arrayString());
        this.habilitarBotones();
        sum=res=mult=div=false;
    }//GEN-LAST:event_bIgualActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        cad.add(b0.getText());
        pantalla.setText(Metodos.arrayString());
    }//GEN-LAST:event_b0ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        cad.add(b1.getText());
        pantalla.setText(Metodos.arrayString());
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        cad.add(b2.getText());
        pantalla.setText(Metodos.arrayString());
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        cad.add(b3.getText());
        pantalla.setText(Metodos.arrayString());
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        cad.add(b4.getText());
        pantalla.setText(Metodos.arrayString());
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        cad.add(b5.getText());
        pantalla.setText(Metodos.arrayString());
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        cad.add(b6.getText());
        pantalla.setText(Metodos.arrayString());
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        cad.add(b7.getText());
        pantalla.setText(Metodos.arrayString());
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        cad.add(b8.getText());
        pantalla.setText(Metodos.arrayString());
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        cad.add(b9.getText());
        pantalla.setText(Metodos.arrayString());
    }//GEN-LAST:event_b9ActionPerformed

    private void bDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDecActionPerformed
        cad.add(bDec.getText());
        bDec.setEnabled(false);
        pantalla.setText(Metodos.arrayString());
    }//GEN-LAST:event_bDecActionPerformed

    private void bSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSumaActionPerformed
        this.desabilitarBotones();
        num1=Float.parseFloat(Metodos.arrayString());
        cad.clear();
        pantalla.setText("+");
        sum=true;
        bDec.setEnabled(true);
    }//GEN-LAST:event_bSumaActionPerformed

    private void bRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRestaActionPerformed
        this.desabilitarBotones();
        if(cad.isEmpty()){
            cad.add("-");
            pantalla.setText(Metodos.arrayString());
            this.habilitarBotones();
        }else{
            num1=Float.parseFloat(Metodos.arrayString());
            cad.clear();
        }
        pantalla.setText("-");
        res=true;
        bDec.setEnabled(true);
    }//GEN-LAST:event_bRestaActionPerformed

    private void bMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMultiActionPerformed
        this.desabilitarBotones();
        num1=Float.parseFloat(Metodos.arrayString());
        cad.clear();
        pantalla.setText("*");
        mult=true;
        bDec.setEnabled(true);
    }//GEN-LAST:event_bMultiActionPerformed

    private void bDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDivActionPerformed
        this.desabilitarBotones();
        num1=Float.parseFloat(Metodos.arrayString());
        cad.clear();
        pantalla.setText("/");
        div=true;
        bDec.setEnabled(true);
    }//GEN-LAST:event_bDivActionPerformed

    private void bBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarActionPerformed
        if(cad.get(cad.size()-1)=="."){
            bDec.setEnabled(true);
            cad.remove(cad.size()-1);
        }else{
            cad.remove(cad.size()-1);
        }
        pantalla.setText(Metodos.arrayString());
    }//GEN-LAST:event_bBorrarActionPerformed

    private void bLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimpiarActionPerformed
        bDec.setEnabled(true);
        cad.clear();
        pantalla.setText(Metodos.arrayString());
        num1=0;
        num2=0;
        this.habilitarBotones();
    }//GEN-LAST:event_bLimpiarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try{
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch(ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(InstantiationException ex){
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(IllegalAccessException ex){
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(javax.swing.UnsupportedLookAndFeelException ex){
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bBorrar;
    private javax.swing.JButton bDec;
    private javax.swing.JButton bDiv;
    private javax.swing.JButton bIgual;
    private javax.swing.JButton bLimpiar;
    private javax.swing.JButton bMulti;
    private javax.swing.JButton bResta;
    private javax.swing.JButton bSuma;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField pantalla;
    // End of variables declaration//GEN-END:variables
}
