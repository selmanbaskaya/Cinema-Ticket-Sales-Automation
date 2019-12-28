package cinema_ticket_sales_automation;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

public class selection_screen extends javax.swing.JFrame {

    public selection_screen() {
        initComponents();
        setIcon();
        show_Date();
        showTime();
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
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_time = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btn_add_movie = new javax.swing.JButton();
        btn_view_movie = new javax.swing.JButton();
        btn_update_movie = new javax.swing.JButton();
        btn_delete_movie = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel5.setBackground(new java.awt.Color(255, 136, 17));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 759, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELECT ACTION");

        lbl_date.setForeground(new java.awt.Color(255, 255, 255));
        lbl_date.setText("jLabel3");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("/");

        lbl_time.setForeground(new java.awt.Color(255, 255, 255));
        lbl_time.setText("jLabel1");

        jButton1.setBackground(new java.awt.Color(255, 136, 17));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema_ticket_sales_automation/Photos/turn.png"))); // NOI18N
        jButton1.setText("Turn Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_add_movie.setBackground(new java.awt.Color(255, 136, 17));
        btn_add_movie.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_add_movie.setForeground(new java.awt.Color(255, 255, 255));
        btn_add_movie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema_ticket_sales_automation/Photos/add.png"))); // NOI18N
        btn_add_movie.setText("Add Movie");
        btn_add_movie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_movieActionPerformed(evt);
            }
        });

        btn_view_movie.setBackground(new java.awt.Color(255, 136, 17));
        btn_view_movie.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_view_movie.setForeground(new java.awt.Color(255, 255, 255));
        btn_view_movie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema_ticket_sales_automation/Photos/list.png"))); // NOI18N
        btn_view_movie.setText("List Movie");
        btn_view_movie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_view_movieActionPerformed(evt);
            }
        });

        btn_update_movie.setBackground(new java.awt.Color(255, 136, 17));
        btn_update_movie.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_update_movie.setForeground(new java.awt.Color(255, 255, 255));
        btn_update_movie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema_ticket_sales_automation/Photos/up.png"))); // NOI18N
        btn_update_movie.setText("Update Movie");
        btn_update_movie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update_movieActionPerformed(evt);
            }
        });

        btn_delete_movie.setBackground(new java.awt.Color(255, 136, 17));
        btn_delete_movie.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_delete_movie.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete_movie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema_ticket_sales_automation/Photos/del.png"))); // NOI18N
        btn_delete_movie.setText("Delete Movie");
        btn_delete_movie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_movieActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 136, 17));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Design By Selman Başkaya @Copyright 2019");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(327, 327, 327))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_date)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(131, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lbl_time)
                .addGap(32, 32, 32))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_delete_movie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_update_movie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_view_movie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_add_movie, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_time)
                        .addComponent(lbl_date)
                        .addComponent(jLabel2))
                    .addComponent(jButton1))
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(btn_add_movie, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_view_movie, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_update_movie, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_delete_movie, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new login_screen().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_add_movieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_movieActionPerformed
        new add_movie_screen().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_add_movieActionPerformed

    private void btn_view_movieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_view_movieActionPerformed
        new view_movie_screen().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_view_movieActionPerformed

    private void btn_update_movieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update_movieActionPerformed
        new update_movie_screen().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_update_movieActionPerformed

    private void btn_delete_movieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_movieActionPerformed
        new delete_movie_screen().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_delete_movieActionPerformed

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
            java.util.logging.Logger.getLogger(selection_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(selection_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(selection_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(selection_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new selection_screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_movie;
    private javax.swing.JButton btn_delete_movie;
    private javax.swing.JButton btn_update_movie;
    private javax.swing.JButton btn_view_movie;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_time;
    // End of variables declaration//GEN-END:variables
}
