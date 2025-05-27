
package calculator;

public class Calculator1 extends javax.swing.JFrame {
  Double NumEnter1;
  Double NumEnter2;
    Double Result;
    String Op;
    
    public Calculator1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
     private void EnterNumbers(String q)
     {
         String Nums=jtxtdisplay.getText() +  q;
        jtxtdisplay.setText(Nums)  ;    
     }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jButton4 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jtxtdisplay = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jbtnbackspace = new javax.swing.JButton();
        hj = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jButton22 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jButton5.setText("jButton5");

        jButton6.setText("jButton6");

        jButton7.setText("jButton1");

        jButton8.setText("jButton1");

        jButton10.setText("jButton1");

        jButton28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton28.setText("9");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jButton4.setBackground(new java.awt.Color(240, 240, 240));
        jButton4.setText("jButton4");

        jButton24.setBackground(new java.awt.Color(240, 240, 240));
        jButton24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton24.setText("=");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton27.setBackground(new java.awt.Color(240, 240, 240));
        jButton27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton27.setText("/");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton41.setText("jButton30");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.setText("jButton31");

        jButton40.setText("jButton31");

        jButton44.setText("Mod");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Standard_Calculator");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 128, 128));
        setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        setMinimumSize(new java.awt.Dimension(330, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtdisplay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtdisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtdisplay.setText("0");
        jtxtdisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtdisplayActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtdisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 230, 40));

        jButton1.setBackground(new java.awt.Color(200, 200, 200));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("-");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 50, 40));

        jButton2.setBackground(new java.awt.Color(200, 200, 200));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("+");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 50, 40));

        jButton3.setBackground(new java.awt.Color(200, 200, 200));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("6");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 50, 40));

        jbtn7.setBackground(new java.awt.Color(200, 200, 200));
        jbtn7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtn7.setText("7");
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 50, 40));

        jButton11.setBackground(new java.awt.Color(200, 200, 200));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton11.setText("=");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 50, 90));

        jButton12.setBackground(new java.awt.Color(200, 200, 200));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton12.setText("4");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 50, 40));

        jButton13.setBackground(new java.awt.Color(200, 200, 200));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton13.setText("2");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 50, 40));

        jButton14.setBackground(new java.awt.Color(200, 200, 200));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton14.setText("3");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 50, 40));

        jButton15.setBackground(new java.awt.Color(200, 200, 200));
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton15.setText("5");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 50, 40));

        jButton16.setBackground(new java.awt.Color(200, 200, 200));
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton16.setText("CE");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 50, 40));

        jButton17.setBackground(new java.awt.Color(200, 200, 200));
        jButton17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton17.setText("1");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 50, 40));

        jButton18.setBackground(new java.awt.Color(200, 200, 200));
        jButton18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton18.setText(".");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 50, 40));

        jButton19.setBackground(new java.awt.Color(200, 200, 200));
        jButton19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton19.setText("±");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 50, 40));

        jButton20.setBackground(new java.awt.Color(200, 200, 200));
        jButton20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton20.setText("/");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 50, 40));

        jButton21.setBackground(new java.awt.Color(200, 200, 200));
        jButton21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton21.setText("0");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 50, 40));

        jButton25.setBackground(new java.awt.Color(200, 200, 200));
        jButton25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton25.setText("8");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 50, 40));

        jButton26.setBackground(new java.awt.Color(200, 200, 200));
        jButton26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton26.setText("*");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 50, 40));

        jbtnbackspace.setBackground(new java.awt.Color(200, 200, 200));
        jbtnbackspace.setFont(new java.awt.Font("Wingdings", 1, 14)); // NOI18N
        jbtnbackspace.setText("");
        jbtnbackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnbackspaceActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnbackspace, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 50, 40));

        hj.setBackground(new java.awt.Color(200, 200, 200));
        hj.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hj.setText("C");
        hj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hjActionPerformed(evt);
            }
        });
        getContentPane().add(hj, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 50, 40));
        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jButton22.setBackground(new java.awt.Color(200, 200, 200));
        jButton22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton22.setText("9");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 50, 40));

        jButton9.setBackground(new java.awt.Color(200, 200, 200));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setText("(");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 50, 40));

        jButton23.setBackground(new java.awt.Color(200, 200, 200));
        jButton23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton23.setText(")");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 50, 40));

        jButton29.setBackground(new java.awt.Color(200, 200, 200));
        jButton29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton29.setText("√");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 50, 40));

        jButton30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton30.setText("π");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                π(evt);
            }
        });
        getContentPane().add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 60, 50));

        jButton31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton31.setText("C");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 60, 50));

        jButton32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton32.setText("Tan");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 60, 50));

        jButton33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton33.setText("Tanh");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 60, 50));

        jButton34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton34.setText("Sinh");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sinh(evt);
            }
        });
        getContentPane().add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 60, 50));

        jButton35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton35.setText("Mod");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mod(evt);
            }
        });
        getContentPane().add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 60, 50));

        jButton36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton36.setText("Sin");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sin(evt);
            }
        });
        getContentPane().add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 60, 50));

        jButton37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton37.setText("cos");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 60, 50));

        jButton38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton38.setText("Cosh");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 60, 50));

        jButton39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton39.setText("x^2");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 60, 50));

        jButton43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton43.setText("%");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton43, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 60, 50));

        jButton45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton45.setText("x^y");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton45, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 60, 50));

        jButton46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton46.setText("x^3");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton46, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 60, 50));

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Standard ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Scientific");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         NumEnter1= Double.parseDouble(jtxtdisplay.getText());
     jtxtdisplay.setText("");
     Op="-";
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
     NumEnter1= Double.parseDouble(jtxtdisplay.getText());
     jtxtdisplay.setText("");
     Op="/";
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
 EnterNumbers("2");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        NumEnter2=Double.parseDouble(jtxtdisplay.getText());
        if(Op=="+")
        {
            Result=NumEnter1 + NumEnter2;
              jtxtdisplay.setText(String.valueOf(Result));
        }
        else  if(Op=="*")
        {
            Result=NumEnter1 * NumEnter2;
              jtxtdisplay.setText(String.valueOf(Result));
        }
        else if(Op=="-"){ 
             Result=NumEnter1 - NumEnter2;
              jtxtdisplay.setText(String.valueOf(Result));
        }
        else { 
             Result=NumEnter1 / NumEnter2;
              jtxtdisplay.setText(String.valueOf(Result));
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
          this.setResizable(true);
       this.setSize(280, 510);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       this.setResizable(true);
       this.setSize(100, 500);
    }//GEN-LAST:event_formWindowActivated

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
         this.setResizable(true);
       this.setSize(560, 500);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
            NumEnter1= Double.parseDouble(jtxtdisplay.getText());
     jtxtdisplay.setText("");
     Op="*";
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jtxtdisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtdisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtdisplayActionPerformed

    private void hjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hjActionPerformed
        jtxtdisplay.setText("");
    }//GEN-LAST:event_hjActionPerformed

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
         EnterNumbers("7");
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
          EnterNumbers("8");
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
       EnterNumbers("9");
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
       EnterNumbers("4");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        EnterNumbers("5");
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         EnterNumbers("6");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
     EnterNumbers("1");
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
      EnterNumbers("3");
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
       EnterNumbers("0");
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        NumEnter1= Double.parseDouble(jtxtdisplay.getText());
     jtxtdisplay.setText("");
     Op="+";
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
     double Op=Double.parseDouble((String.valueOf(jtxtdisplay.getText())));
     Op=Op *(-1);
     jtxtdisplay.setText(String.valueOf(Op));
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jbtnbackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnbackspaceActionPerformed
     String backs=null;
     if(jtxtdisplay.getText().length()> 0){
         StringBuilder sb= new  StringBuilder (jtxtdisplay.getText());
         sb.deleteCharAt(jtxtdisplay.getText().length()-1);
         backs=sb.toString();
         jtxtdisplay.setText(backs);
     }
    }//GEN-LAST:event_jbtnbackspaceActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
       if(!jtxtdisplay.getText().contains(".")){
           jtxtdisplay.setText(jtxtdisplay.getText()+jButton18.getText());
       }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
             jtxtdisplay.setText("");
             String Fn,Sn;
             Fn =String.valueOf(NumEnter1);
             Sn =String.valueOf(NumEnter2);
              Fn ="";
              Sn ="";
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       EnterNumbers("(");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
   EnterNumbers(")");
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
 double Op=Double.parseDouble((String.valueOf(jtxtdisplay.getText())));
     Op=Math.sqrt(Op);
     jtxtdisplay.setText(String.valueOf(Op));
    }//GEN-LAST:event_jButton29ActionPerformed

    private void π(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_π
    double Op;
        Op=(3.1415926535897932384626433832795);
     jtxtdisplay.setText(String.valueOf(Op));
    }//GEN-LAST:event_π

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
          double Op=Double.parseDouble((String.valueOf(jtxtdisplay.getText())));
     Op=Math.tan(Op);
     jtxtdisplay.setText(String.valueOf(Op));
    }//GEN-LAST:event_jButton32ActionPerformed

    private void Sinh(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sinh
        double Op=Double.parseDouble((String.valueOf(jtxtdisplay.getText())));
     Op=Math.sinh(Op);
     jtxtdisplay.setText(String.valueOf(Op));
    }//GEN-LAST:event_Sinh

    private void Sin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sin
     try {
        double number = Double.parseDouble(jtxtdisplay.getText());
        double result = Math.sin(Math.toRadians(number)); // sin needs radians
        jtxtdisplay.setText(String.valueOf(result));
    } catch (NumberFormatException ex) {
 jtxtdisplay.setText("Error"); // Handle invalid input
    }
    }//GEN-LAST:event_Sin

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
       double Op=Double.parseDouble(String.valueOf(jtxtdisplay.getText()));
       Op=(Op*Op);
       jtxtdisplay.setText(String.valueOf(Op));
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
    NumEnter1= Double.parseDouble(jtxtdisplay.getText());
     jtxtdisplay.setText("");
    Op="%";      
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
    double x= Double.parseDouble(jtxtdisplay.getText());
    double y = Double.parseDouble(jtxtdisplay.getText());
    jtxtdisplay.setText(String.valueOf(Math.pow(x,y)));
    
    }//GEN-LAST:event_jButton45ActionPerformed

    private void Mod(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mod
        {   NumEnter1= Double.parseDouble(jtxtdisplay.getText());
     jtxtdisplay.setText("");
     Op="Mod";}
    }//GEN-LAST:event_Mod

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
  double Op=Double.parseDouble((String.valueOf(jtxtdisplay.getText())));
     Op=Math.cos(Op);
     jtxtdisplay.setText(String.valueOf(Op));       
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
       double Op=Double.parseDouble((String.valueOf(jtxtdisplay.getText())));
     Op=Math.cosh(Op);
     jtxtdisplay.setText(String.valueOf(Op));
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
      double Op=Double.parseDouble((String.valueOf(jtxtdisplay.getText())));
     Op=Math.tanh(Op);
     jtxtdisplay.setText(String.valueOf(Op));
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
       jtxtdisplay.setText("");
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
 double Op=Double.parseDouble(String.valueOf(jtxtdisplay.getText()));
       Op=(Op*Op*Op);
       jtxtdisplay.setText(String.valueOf(Op));       
    }//GEN-LAST:event_jButton46ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Calculator1().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hj;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtnbackspace;
    private javax.swing.JTextField jtxtdisplay;
    // End of variables declaration//GEN-END:variables

    private static class jtxt {

        public jtxt() {
        }
    }
}
