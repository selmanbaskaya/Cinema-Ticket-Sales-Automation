package cinema_ticket_sales_automation;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import cinema_ticket_sales_automation.database_code;
import javax.swing.JOptionPane;

public class add_movie_screen extends javax.swing.JFrame {

    public add_movie_screen() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_turn = new javax.swing.JButton();
        lbl_time = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_mName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_mTime = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_mCode = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cb_mHall = new javax.swing.JComboBox<>();
        btn_add_movie = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        tf_mName1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 136, 17));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Design By Selman Başkaya @Copyright 2019");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(334, 334, 334))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_turn.setBackground(new java.awt.Color(255, 136, 17));
        btn_turn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_turn.setForeground(new java.awt.Color(255, 255, 255));
        btn_turn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema_ticket_sales_automation/Photos/turn.png"))); // NOI18N
        btn_turn.setText("Turn Back");
        btn_turn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_turnActionPerformed(evt);
            }
        });

        lbl_time.setForeground(new java.awt.Color(255, 255, 255));
        lbl_time.setText("jLabel2");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("/");

        lbl_date.setForeground(new java.awt.Color(255, 255, 255));
        lbl_date.setText("jLabel3");

        jPanel6.setBackground(new java.awt.Color(255, 136, 17));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 759, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ADD MOVIE");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Movie Name");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Screen Time");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Movie Code");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Movie Hall - Sessions");

        cb_mHall.setBackground(new java.awt.Color(255, 136, 17));
        cb_mHall.setForeground(new java.awt.Color(255, 255, 255));
        cb_mHall.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hall - 1 / 13.00", "Hall - 1 / 16.00", "Hall - 1 / 19.00", "Hall - 2 / 13.00", "Hall - 2 / 16.00", "Hall - 2 / 19.00", "Hall - 3 / 13.00", "Hall - 3 / 16.00", "Hall - 3 / 19.00", "Hall - 4 / 13.00", "Hall - 4 / 16.00", "Hall - 4 / 19.00", "Hall - 5 / 13.00", "Hall - 5 / 16.00", "Hall - 5 / 19.00", "Deneme", " " }));

        btn_add_movie.setBackground(new java.awt.Color(255, 136, 17));
        btn_add_movie.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_add_movie.setForeground(new java.awt.Color(255, 255, 255));
        btn_add_movie.setText("Add Movie");
        btn_add_movie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_movieActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Movie Id");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_turn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_date))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 123, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lbl_time)
                .addGap(44, 44, 44))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(425, 425, 425)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tf_mName)
                                    .addComponent(tf_mTime)
                                    .addComponent(tf_mCode, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_mName1, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(28, 28, 28)
                                .addComponent(cb_mHall, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_add_movie, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_turn)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_time)
                                .addComponent(jLabel2)
                                .addComponent(lbl_date))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(tf_mName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_mName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_mTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_mCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cb_mHall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btn_add_movie)
                .addGap(117, 117, 117)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_turnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_turnActionPerformed
        new selection_screen().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_turnActionPerformed

    private void btn_add_movieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_movieActionPerformed
        String movie_name, movie_code, movie_hall, sql;
        int movie_id, movie_time;
        
        movie_id = Integer.valueOf(tf_mName1.getText());
        movie_name = tf_mName.getText();
        movie_code = tf_mCode.getText();
        movie_hall = String.valueOf(cb_mHall.getSelectedItem());
        movie_time = Integer.valueOf(tf_mTime.getText());
        
        database_code addmovie = new database_code();
        
        if (tf_mName.getText().trim().isEmpty() || tf_mCode.getText().trim().isEmpty() || String.valueOf(cb_mHall.getSelectedItem()).trim().isEmpty() || String.valueOf(tf_mTime.getText()).trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Bilgileri Doldururken Boş Bırakmayınız!!");
        }
        else{
            System.out.println("if geçildi");
            addmovie.add(movie_id, movie_name, movie_time, movie_code, movie_hall);
        }
        
        

    }//GEN-LAST:event_btn_add_movieActionPerformed

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
            java.util.logging.Logger.getLogger(add_movie_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_movie_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_movie_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_movie_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_movie_screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_movie;
    private javax.swing.JButton btn_turn;
    private javax.swing.JComboBox<String> cb_mHall;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_time;
    private javax.swing.JTextField tf_mCode;
    private javax.swing.JTextField tf_mName;
    private javax.swing.JTextField tf_mName1;
    private javax.swing.JTextField tf_mTime;
    // End of variables declaration//GEN-END:variables
}
