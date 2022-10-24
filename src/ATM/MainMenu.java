package ATM;


public class MainMenu extends javax.swing.JFrame {

   
    public MainMenu() {
        initComponents();
    }
    int MyAccNum;
     public MainMenu(int AccountNum) {
        initComponents();
        MyAccNum = AccountNum;
        AccNumlbl.setText("" + MyAccNum);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ExitBtn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        WithdrawBtn = new javax.swing.JButton();
        DepositBTN = new javax.swing.JButton();
        BalanceBtn = new javax.swing.JButton();
        FastCashBtn = new javax.swing.JButton();
        ChangePinBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        AccNumlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Bank");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Wybierz transakcję do realizacji");

        ExitBtn.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        ExitBtn.setText("X");
        ExitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(218, 218, 218))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(317, 317, 317)
                        .addComponent(ExitBtn)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ExitBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("Numer konta:");

        WithdrawBtn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        WithdrawBtn.setForeground(new java.awt.Color(0, 204, 204));
        WithdrawBtn.setText("Wypłata");
        WithdrawBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WithdrawBtnMouseClicked(evt);
            }
        });
        WithdrawBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawBtnActionPerformed(evt);
            }
        });

        DepositBTN.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        DepositBTN.setForeground(new java.awt.Color(0, 204, 204));
        DepositBTN.setText("Wpłata");
        DepositBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepositBTNMouseClicked(evt);
            }
        });
        DepositBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositBTNActionPerformed(evt);
            }
        });

        BalanceBtn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        BalanceBtn.setForeground(new java.awt.Color(0, 204, 204));
        BalanceBtn.setText("Stan konta");
        BalanceBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BalanceBtnMouseClicked(evt);
            }
        });
        BalanceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BalanceBtnActionPerformed(evt);
            }
        });

        FastCashBtn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        FastCashBtn.setForeground(new java.awt.Color(0, 204, 204));
        FastCashBtn.setText("Szybka wypłata");
        FastCashBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FastCashBtnMouseClicked(evt);
            }
        });
        FastCashBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FastCashBtnActionPerformed(evt);
            }
        });

        ChangePinBtn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ChangePinBtn.setForeground(new java.awt.Color(0, 204, 204));
        ChangePinBtn.setText("Zmiana PIN");
        ChangePinBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangePinBtnMouseClicked(evt);
            }
        });
        ChangePinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePinBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Wyloguj się");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        AccNumlbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AccNumlbl.setText("jLabel5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(340, 340, 340))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(AccNumlbl)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(DepositBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BalanceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(WithdrawBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(FastCashBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(ChangePinBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(AccNumlbl))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WithdrawBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BalanceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DepositBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FastCashBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChangePinBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jLabel4)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void WithdrawBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WithdrawBtnActionPerformed

    private void DepositBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepositBTNActionPerformed

    private void BalanceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BalanceBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BalanceBtnActionPerformed

    private void FastCashBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FastCashBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FastCashBtnActionPerformed

    private void ChangePinBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePinBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChangePinBtnActionPerformed

    private void BalanceBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BalanceBtnMouseClicked
        new Balance(MyAccNum).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BalanceBtnMouseClicked

    private void DepositBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositBTNMouseClicked
        new Deposit(MyAccNum).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DepositBTNMouseClicked

    private void WithdrawBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WithdrawBtnMouseClicked
        new Withdraw(MyAccNum).setVisible(true);
        this.dispose();                  
    }//GEN-LAST:event_WithdrawBtnMouseClicked

    private void ChangePinBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePinBtnMouseClicked
        new ChangePin(MyAccNum).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ChangePinBtnMouseClicked

    private void ExitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBtnMouseClicked
        System.exit(1);
    }//GEN-LAST:event_ExitBtnMouseClicked

    private void FastCashBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FastCashBtnMouseClicked
        new FastCash(MyAccNum).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_FastCashBtnMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccNumlbl;
    private javax.swing.JButton BalanceBtn;
    private javax.swing.JButton ChangePinBtn;
    private javax.swing.JButton DepositBTN;
    private javax.swing.JLabel ExitBtn;
    private javax.swing.JButton FastCashBtn;
    private javax.swing.JButton WithdrawBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
