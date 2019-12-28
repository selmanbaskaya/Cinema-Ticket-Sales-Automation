package cinema_ticket_sales_automation;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class login_screen extends javax.swing.JFrame {

    public login_screen() {
        initComponents();
        setIcon();
        show_Date();
        showTime();
        this.lbl_not_show.setVisible(false);
    }
    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
    
    void show_Date() {
        Date date_now = new Date();
        SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd");
        lbl_date.setText(sdt.format(date_now));
    }
    void showTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                Date date_now2 = new Date();
                SimpleDateFormat sdt2 = new SimpleDateFormat("hh-mm-ss a");
                lbl_time.setText(sdt2.format(date_now2));
            }
        }).start();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_time = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_username = new javax.swing.JTextField();
        pf_password = new javax.swing.JPasswordField();
        username_message = new javax.swing.JLabel();
        password_message = new javax.swing.JLabel();
        lbl_eye = new javax.swing.JLabel();
        lbl_not_show = new javax.swing.JLabel();
        cb_password_show = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_time.setForeground(new java.awt.Color(255, 255, 255));
        lbl_time.setText("jLabel1");
        jPanel1.add(lbl_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("/");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, -1, -1));

        lbl_date.setForeground(new java.awt.Color(255, 255, 255));
        lbl_date.setText("jLabel3");
        jPanel1.add(lbl_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGIN FORM");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 51, 159, 31));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 190, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 236, -1, -1));

        tf_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_usernameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_usernameKeyReleased(evt);
            }
        });
        jPanel1.add(tf_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 186, 119, -1));

        pf_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pf_passwordKeyReleased(evt);
            }
        });
        jPanel1.add(pf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 236, 119, 24));

        username_message.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(username_message, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 214, 119, 16));

        password_message.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(password_message, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 266, 119, 15));

        lbl_eye.setForeground(new java.awt.Color(255, 255, 255));
        lbl_eye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema_ticket_sales_automation/Photos/show_eye.png"))); // NOI18N
        lbl_eye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_eyeMousePressed(evt);
            }
        });
        jPanel1.add(lbl_eye, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 40, 60));

        lbl_not_show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema_ticket_sales_automation/Photos/not_show_eye.png"))); // NOI18N
        lbl_not_show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_not_showMousePressed(evt);
            }
        });
        jPanel1.add(lbl_not_show, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 40, 60));

        cb_password_show.setForeground(new java.awt.Color(255, 255, 255));
        cb_password_show.setText("Show Password");
        cb_password_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_password_showActionPerformed(evt);
            }
        });
        jPanel1.add(cb_password_show, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 136, 17));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema_ticket_sales_automation/Photos/signin.png"))); // NOI18N
        jButton1.setText("Sign in");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, -1, 40));

        jPanel5.setBackground(new java.awt.Color(255, 136, 17));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 94, 794, -1));

        jPanel2.setBackground(new java.awt.Color(255, 136, 17));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Design By Selman Başkaya @Copyright 2019");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(370, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(322, 322, 322))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 1000, 30));

        jButton2.setBackground(new java.awt.Color(255, 136, 17));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema_ticket_sales_automation/Photos/turn.png"))); // NOI18N
        jButton2.setText("Turn Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

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
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //database_code d = new database_code();
        //d.adminadd();
        if (tf_username.getText().trim().isEmpty() && pf_password.getText().trim().isEmpty()) {
            username_message.setText("Username is Empty");
            password_message.setText("Password is Empty");
        }
        else if (tf_username.getText().trim().isEmpty()) {
            username_message.setText("Username is Empty");
        }
        else if (pf_password.getText().trim().isEmpty()) {
            password_message.setText("Password is Empty");
        }
        else {
            ArrayList admin = new ArrayList();
            database_code lists = new database_code();
            admin = lists.view_admin();
            Object[] dizi = new Object[300];
            int column = 0;
            String[] username = new String[50];
            String[] password = new String[50];
            int indices = 0;
            for (int i = 0; i < admin.size(); i+=3) {
                column = 0;
                for (int j = i; j < i+3; j++) {
                    dizi[column] = admin.get(j);
                    column++;

                }
                username[indices] = String.valueOf(dizi[1]);
                password[indices] = String.valueOf(dizi[2]);
                indices++;
            }
            String usernamee, passwordd;
            usernamee = String.valueOf(tf_username.getText());
            passwordd = String.valueOf(pf_password.getText());
            
            set_get_admin tryy = new set_get_admin();
            tryy.setUsername(usernamee);
            tryy.setPassword(passwordd);
            tryy.setPassword(passwordd, "other");
            tryy.setUsername(usernamee, "other");
            if (tryy.getUsername().equalsIgnoreCase(username[0]) && tryy.get2Password().equalsIgnoreCase(password[0])) {
                new selection_screen().setVisible(true);
                this.setVisible(false);
            }
            else {
                JOptionPane.showMessageDialog(null, "Username or Password is not Correct!", "Warning", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tf_usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_usernameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_usernameKeyPressed

    private void tf_usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_usernameKeyReleased
        username_message.setText("");
    }//GEN-LAST:event_tf_usernameKeyReleased

    private void pf_passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pf_passwordKeyReleased
        password_message.setText("");
    }//GEN-LAST:event_pf_passwordKeyReleased

    private void cb_password_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_password_showActionPerformed
        if (cb_password_show.isSelected()) {
            pf_password.setEchoChar((char) 0);
        }
        else {
            pf_password.setEchoChar('*');
        }
    }//GEN-LAST:event_cb_password_showActionPerformed

    private void lbl_eyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_eyeMousePressed
        lbl_not_show.setVisible(true);
        lbl_eye.setVisible(false);
        pf_password.setEchoChar((char)0);
    }//GEN-LAST:event_lbl_eyeMousePressed

    private void lbl_not_showMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_not_showMousePressed
        lbl_not_show.setVisible(false);
        lbl_eye.setVisible(true);
        pf_password.setEchoChar('*');
    }//GEN-LAST:event_lbl_not_showMousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new login_selection_screen().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed
    
      
    
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
            java.util.logging.Logger.getLogger(login_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cb_password_show;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_eye;
    private javax.swing.JLabel lbl_not_show;
    private javax.swing.JLabel lbl_time;
    private javax.swing.JLabel password_message;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JTextField tf_username;
    private javax.swing.JLabel username_message;
    // End of variables declaration//GEN-END:variables
}
