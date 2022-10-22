package ATM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class FastCash extends javax.swing.JFrame {

    public FastCash() {
        initComponents();
    }

    int MyAccNum;
    public FastCash(int AccNum) {
        initComponents();
        MyAccNum = AccNum;
        GetBalance();
    }

    Connection Con = null;
    PreparedStatement pst = null, pst1 = null;
    ResultSet Rs = null, Rs1 = null;
    Statement St = null, St1 = null;
    int OldBalance;
    
    private void GetBalance() {
        String Query = "select * from accounttbl where AccNum='"+MyAccNum +"'";
            try {
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "");
                St1 = Con.createStatement();
                Rs1 =St1.executeQuery(Query);
                if(Rs1.next()) {
                    OldBalance = Rs1.getInt(9);
                    BalLbl.setText("" + OldBalance);
                } else {
                    
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        FastCash50Btn = new javax.swing.JButton();
        FastCash100Btn = new javax.swing.JButton();
        FastCash200Btn = new javax.swing.JButton();
        FastCash300Btn = new javax.swing.JButton();
        FastCash500Btn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FastCash400Btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        BalLbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel2.setText("X");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        FastCash50Btn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        FastCash50Btn.setForeground(new java.awt.Color(0, 204, 204));
        FastCash50Btn.setText("50");
        FastCash50Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FastCash50BtnMouseClicked(evt);
            }
        });
        FastCash50Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FastCash50BtnActionPerformed(evt);
            }
        });

        FastCash100Btn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        FastCash100Btn.setForeground(new java.awt.Color(0, 204, 204));
        FastCash100Btn.setText("100");
        FastCash100Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FastCash100BtnMouseClicked(evt);
            }
        });
        FastCash100Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FastCash100BtnActionPerformed(evt);
            }
        });

        FastCash200Btn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        FastCash200Btn.setForeground(new java.awt.Color(0, 204, 204));
        FastCash200Btn.setText("200");
        FastCash200Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FastCash200BtnMouseClicked(evt);
            }
        });
        FastCash200Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FastCash200BtnActionPerformed(evt);
            }
        });

        FastCash300Btn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        FastCash300Btn.setForeground(new java.awt.Color(0, 204, 204));
        FastCash300Btn.setText("300");
        FastCash300Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FastCash300BtnMouseClicked(evt);
            }
        });
        FastCash300Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FastCash300BtnActionPerformed(evt);
            }
        });

        FastCash500Btn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        FastCash500Btn.setForeground(new java.awt.Color(0, 204, 204));
        FastCash500Btn.setText("500");
        FastCash500Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FastCash500BtnMouseClicked(evt);
            }
        });
        FastCash500Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FastCash500BtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Szybka wypłata");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel3.setText("X");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(110, 110, 110)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        FastCash400Btn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        FastCash400Btn.setForeground(new java.awt.Color(0, 204, 204));
        FastCash400Btn.setText("400");
        FastCash400Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FastCash400BtnMouseClicked(evt);
            }
        });
        FastCash400Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FastCash400BtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("Wyloguj");

        BalLbl.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        BalLbl.setForeground(new java.awt.Color(0, 204, 204));
        BalLbl.setText("Saldo");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("Twoje saldo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FastCash50Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FastCash100Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(FastCash200Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(FastCash300Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FastCash400Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(FastCash500Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(98, 98, 98))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(BalLbl)
                .addGap(205, 205, 205))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FastCash50Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FastCash300Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FastCash100Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FastCash400Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FastCash200Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FastCash500Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FastCash50BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FastCash50BtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FastCash50BtnActionPerformed

    private void FastCash100BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FastCash100BtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FastCash100BtnActionPerformed

    private void FastCash200BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FastCash200BtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FastCash200BtnActionPerformed

    private void FastCash300BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FastCash300BtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FastCash300BtnActionPerformed

    private void FastCash500BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FastCash500BtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FastCash500BtnActionPerformed

    private void FastCash400BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FastCash400BtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FastCash400BtnActionPerformed

    private void FastCash50BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FastCash50BtnMouseClicked
        if(OldBalance < 50) {
            JOptionPane.showMessageDialog(this, "Nie masz wystarczajaco srodkow");
        } else {
            try {
                String Query = "Update AccountTbl set Balance=? where AccNum=?";
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "");
                PreparedStatement ps = Con.prepareStatement(Query);
                ps.setInt(1, OldBalance - 50);
                ps.setInt(2, MyAccNum);
                if(ps.executeUpdate() == 1) {
                    JOptionPane.showMessageDialog(this, "Stan konta zaktualizowany");
                } else {
                    JOptionPane.showMessageDialog(this, "Brakuje informacji");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_FastCash50BtnMouseClicked

    private void FastCash100BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FastCash100BtnMouseClicked
        if(OldBalance < 100) {
            JOptionPane.showMessageDialog(this, "Nie masz wystarczajaco srodkow");
        } else {
            try {
                String Query = "Update AccountTbl set Balance=? where AccNum=?";
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "");
                PreparedStatement ps = Con.prepareStatement(Query);
                ps.setInt(1, OldBalance - 100);
                ps.setInt(2, MyAccNum);
                if(ps.executeUpdate() == 1) {
                    JOptionPane.showMessageDialog(this, "Stan konta zaktualizowany");
                } else {
                    JOptionPane.showMessageDialog(this, "Brakuje informacji");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_FastCash100BtnMouseClicked

    private void FastCash200BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FastCash200BtnMouseClicked
        if(OldBalance < 200) {
            JOptionPane.showMessageDialog(this, "Nie masz wystarczajaco srodkow");
        } else {
            try {
                String Query = "Update AccountTbl set Balance=? where AccNum=?";
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "");
                PreparedStatement ps = Con.prepareStatement(Query);
                ps.setInt(1, OldBalance - 200);
                ps.setInt(2, MyAccNum);
                if(ps.executeUpdate() == 1) {
                    JOptionPane.showMessageDialog(this, "Stan konta zaktualizowany");
                } else {
                    JOptionPane.showMessageDialog(this, "Brakuje informacji");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_FastCash200BtnMouseClicked

    private void FastCash300BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FastCash300BtnMouseClicked
        if(OldBalance < 300) {
            JOptionPane.showMessageDialog(this, "Nie masz wystarczajaco srodkow");
        } else {
            try {
                String Query = "Update AccountTbl set Balance=? where AccNum=?";
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "");
                PreparedStatement ps = Con.prepareStatement(Query);
                ps.setInt(1, OldBalance - 300);
                ps.setInt(2, MyAccNum);
                if(ps.executeUpdate() == 1) {
                    JOptionPane.showMessageDialog(this, "Stan konta zaktualizowany");
                } else {
                    JOptionPane.showMessageDialog(this, "Brakuje informacji");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_FastCash300BtnMouseClicked

    private void FastCash400BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FastCash400BtnMouseClicked
        if(OldBalance < 400) {
            JOptionPane.showMessageDialog(this, "Nie masz wystarczajaco srodkow");
        } else {
            try {
                String Query = "Update AccountTbl set Balance=? where AccNum=?";
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "");
                PreparedStatement ps = Con.prepareStatement(Query);
                ps.setInt(1, OldBalance - 400);
                ps.setInt(2, MyAccNum);
                if(ps.executeUpdate() == 1) {
                    JOptionPane.showMessageDialog(this, "Stan konta zaktualizowany");
                } else {
                    JOptionPane.showMessageDialog(this, "Brakuje informacji");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_FastCash400BtnMouseClicked

    private void FastCash500BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FastCash500BtnMouseClicked
        if(OldBalance < 500) {
            JOptionPane.showMessageDialog(this, "Nie masz wystarczajaco srodkow");
        } else {
            try {
                String Query = "Update AccountTbl set Balance=? where AccNum=?";
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "");
                PreparedStatement ps = Con.prepareStatement(Query);
                ps.setInt(1, OldBalance - 500);
                ps.setInt(2, MyAccNum);
                if(ps.executeUpdate() == 1) {
                    JOptionPane.showMessageDialog(this, "Stan konta zaktualizowany");
                } else {
                    JOptionPane.showMessageDialog(this, "Brakuje informacji");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_FastCash500BtnMouseClicked

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
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FastCash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BalLbl;
    private javax.swing.JButton FastCash100Btn;
    private javax.swing.JButton FastCash200Btn;
    private javax.swing.JButton FastCash300Btn;
    private javax.swing.JButton FastCash400Btn;
    private javax.swing.JButton FastCash500Btn;
    private javax.swing.JButton FastCash50Btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
