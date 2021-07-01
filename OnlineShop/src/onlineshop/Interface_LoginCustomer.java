/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshop;

import java.awt.Component;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.event.*;

/**
 *
 * @author cherriegracilaamanda
 */
public class Interface_LoginCustomer extends JFrame{
    Connection conn;
    Object currentWindow = this;
    public Interface_LoginCustomer() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_titlePass = new javax.swing.JTextField();
        txt_titleEmail = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        jpass_pass = new javax.swing.JPasswordField();
        bt_create = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lbl_title = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bt_admin = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        bt_signIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_titlePass.setEditable(false);
        txt_titlePass.setFont(new java.awt.Font("Orator Std", 0, 16)); // NOI18N
        txt_titlePass.setForeground(new java.awt.Color(51, 51, 51));
        txt_titlePass.setText(" P A S S W O R D");
        txt_titlePass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_titlePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 180, 40));

        txt_titleEmail.setEditable(false);
        txt_titleEmail.setFont(new java.awt.Font("Orator Std", 0, 16)); // NOI18N
        txt_titleEmail.setForeground(new java.awt.Color(51, 51, 51));
        txt_titleEmail.setText(" E M A I L");
        txt_titleEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_titleEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 110, 40));

        txt_email.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 230, 50));

        jpass_pass.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jpass_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 230, 50));

        bt_create.setText("CREATE NEW ACCOUNT");
        bt_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_createActionPerformed(evt);
            }
        });
        jPanel1.add(bt_create, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, -1, -1));

        jPanel3.setBackground(new java.awt.Color(234, 134, 133));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, -30, 250, 80));

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_title.setEditable(false);
        lbl_title.setBackground(new java.awt.Color(255, 204, 204));
        lbl_title.setFont(new java.awt.Font("Constantia", 0, 48)); // NOI18N
        lbl_title.setText("WELCOME ");
        lbl_title.setToolTipText("");
        lbl_title.setBorder(null);
        jPanel5.add(lbl_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 290, 60));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 300, 120));

        jPanel4.setBackground(new java.awt.Color(203, 114, 149));
        jPanel4.setForeground(new java.awt.Color(184, 181, 229));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, -100, 180, 200));

        jPanel2.setBackground(new java.awt.Color(250, 177, 160));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 140));

        jPanel8.setBackground(new java.awt.Color(93, 158, 236));

        jLabel1.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel1.setText("About Us");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        bt_admin.setText("I am an admin");
        bt_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_adminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bt_admin)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(bt_admin)
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 180, 110));

        jPanel9.setBackground(new java.awt.Color(105, 192, 211));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 120, 160));

        jPanel6.setBackground(new java.awt.Color(196, 212, 238));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 450, 170, 200));

        jPanel7.setBackground(new java.awt.Color(186, 229, 238));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 180, 200));

        bt_signIn.setText("SIGN IN");
        bt_signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_signInActionPerformed(evt);
            }
        });
        jPanel1.add(bt_signIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 411, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 613, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
	
    private void btn_signinActionPerformed(java.awt.event.ActionEvent evt) {                                           
        Pattern pMail = Pattern.compile("^[a-zA-Z0-9._]+@[a-zA-Z0-9.]+\\.[a-zA-Z]{2,6}$");
        Matcher mMail = pMail.matcher(txt_email.getText());
        
        boolean isEmailValid = mMail.matches();
        
        txt_email.setText(Boolean.toString(isEmailValid));
        
         if(isEmailValid) {
             
             JOptionPane.showMessageDialog(null,"Sign in success.");

      	 } else {
           txt_email.setText(null);
           JOptionPane.showMessageDialog(null,"Please enter your email correctly.");

     	 }
    }
	    

    private void bt_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_createActionPerformed
        Interface_Register ir = new Interface_Register();
        ir.setVisible(true);
        ir.pack();
        ir.setLocationRelativeTo(null);
        ir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_bt_createActionPerformed

    private void bt_signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_signInActionPerformed
        String query = "SELECT * FROM CUSTOMER WHERE EMAIL =? AND PASSWORD =?";
        
        String email = txt_email.getText();
        String pass = String.valueOf(jpass_pass.getPassword());
        String fullName = "";
        try{
            conn = new ConnectionSQL().getConSQL();
            PreparedStatement ps;
            ps = conn.prepareStatement(query);
            ResultSet rs;
            
            ps.setString(1, email);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "SUCCESS");
                fullName = rs.getString("FNAME")+" "+rs.getString("LNAME");
                Olshop ol = new Olshop();
                ol.login(fullName);
                ol.setVisible(true);
                ol.setSize(780,650);
                ol.setLocationRelativeTo(null);
                ol.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Wrong Email or Wrong Password");
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_bt_signInActionPerformed

    private void bt_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_adminActionPerformed
        Interface_LoginAdmin ila = new Interface_LoginAdmin();
        ila.setVisible(true);
        ila.pack();
        ila.setLocationRelativeTo(null);
        ila.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_bt_adminActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
	OurTeam ot = new OurTeam();
	ot.addWindowListener(new WindowAdapter() {
	public void windowClosing(WindowEvent ev) {
		((Component) currentWindow).setEnabled(true);
            }
	});
	((Component) currentWindow).setEnabled(false);
	ot.setLocationRelativeTo(null);
	ot.setResizable(false);
	ot.setVisible(true);
        ot.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(Interface_LoginCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface_LoginCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface_LoginCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface_LoginCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface_LoginCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_admin;
    private javax.swing.JButton bt_create;
    private javax.swing.JButton bt_signIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jpass_pass;
    private javax.swing.JTextField lbl_title;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_titleEmail;
    private javax.swing.JTextField txt_titlePass;
    // End of variables declaration//GEN-END:variables
}
