/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vyashm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Date;
import javax.swing.Timer;
import java.awt.*;

import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.layout.Border;

import javax.swing.*;
/**
 *
 * @author HOME
 */
public class vyasMIDI extends javax.swing.JFrame implements ActionListener {
Timer msg_timer;
Connection con;
String pass="password";
String uname="admin";
int sec=1;
int count;
    /**
     * Creates new form vyasMIDI
     */
    public vyasMIDI() {
        initComponents();
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://mysql8.db4free.net:3307/vyas?useSSL=false",uname,pass);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        msg_timer=new Timer(sec,this);
        msg.setVisible(false);
        msg_timer.start();
        
    }

    public void actionPerformed(ActionEvent evt) {
       
        if(sec%10==0)
        {
    try {
        //Thread.sleep(10000);
        
        
        String sql="select count(s_no) from new_student";
        PreparedStatement st=con.prepareStatement(sql);
        ResultSet rs=st.executeQuery();
        if(rs.next())
        {
            count=rs.getInt(1);
                   
        }
	//...Update the progress bar...
        if(count!=0)
        {
            msg.setText(count+" new registration request received!");
            msg.setVisible(true);
        }
        else
        {
            msg.setVisible(false);
        }
        sec++;
        } catch (Exception ex) {
        System.out.println(ex);
        Logger.getLogger(updateRoom.class.getName()).log(Level.SEVERE, null, ex);
    }
        }
        else
            sec++;
        //timer.setRepeats(true);
         }    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        roomsButton = new javax.swing.JButton();
        studentButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        msg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(204, 204, 204));
        desktopPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(102, 102, 102), null, null));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Vyas Hostel Managment Software");
        jLabel1.setName(""); // NOI18N
        desktopPane.add(jLabel1);
        jLabel1.setBounds(130, 20, 320, 40);

        roomsButton.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        roomsButton.setText("Room Details");
        roomsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roomsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roomsButtonMouseExited(evt);
            }
        });
        roomsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomsButtonActionPerformed(evt);
            }
        });
        desktopPane.add(roomsButton);
        roomsButton.setBounds(70, 90, 130, 40);

        studentButton.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        studentButton.setText("Student Details");
        studentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                studentButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                studentButtonMouseExited(evt);
            }
        });
        studentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentButtonActionPerformed(evt);
            }
        });
        desktopPane.add(studentButton);
        studentButton.setBounds(320, 90, 150, 40);

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButton1.setText("Account Details");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        desktopPane.add(jButton1);
        jButton1.setBounds(190, 180, 180, 40);

        msg.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        msg.setForeground(new java.awt.Color(0, 204, 0));
        msg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msg.setText("jLable2");
        msg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                msgMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                msgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                msgMouseExited(evt);
            }
        });
        desktopPane.add(msg);
        msg.setBounds(120, 270, 310, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void roomsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomsButtonActionPerformed
        roomMIDI frm=new roomMIDI();
        frm.setVisible(true);
        
    }//GEN-LAST:event_roomsButtonActionPerformed

    private void studentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentButtonActionPerformed
        studentMIDI frm=new studentMIDI();
        frm.setVisible(true);
    }//GEN-LAST:event_studentButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        accMDI frm=new accMDI();
        frm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void msgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_msgMouseClicked
        // TODO add your handling code here:
        newStudent frm=new newStudent();
        frm.setVisible(true);
    }//GEN-LAST:event_msgMouseClicked

    private void msgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_msgMouseEntered
        // TODO add your handling code here:
        msg.setForeground(Color.CYAN);
    }//GEN-LAST:event_msgMouseEntered

    private void msgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_msgMouseExited
        // TODO add your handling code here:
         msg.setForeground(Color.GREEN);
    }//GEN-LAST:event_msgMouseExited

    private void roomsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomsButtonMouseEntered
        // TODO add your handling code here:
       roomsButton.setForeground(Color.red);
       roomsButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, Color.lightGray, Color.lightGray, Color.white, Color.white));
       //setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(102, 102, 102), null, null));
    }//GEN-LAST:event_roomsButtonMouseEntered

    private void roomsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomsButtonMouseExited
        // TODO add your handling code here:
        roomsButton.setForeground(Color.BLACK);
        roomsButton.setBorder(javax.swing.BorderFactory.createBevelBorder(-1, null, null, null, null));
    }//GEN-LAST:event_roomsButtonMouseExited

    private void studentButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentButtonMouseEntered
        // TODO add your handling code here:
        studentButton.setForeground(Color.red);
        studentButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, Color.lightGray, Color.lightGray, Color.white, Color.white));
       
    }//GEN-LAST:event_studentButtonMouseEntered

    private void studentButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentButtonMouseExited
        // TODO add your handling code here:
        studentButton.setForeground(Color.BLACK);
        studentButton.setBorder(javax.swing.BorderFactory.createBevelBorder(-1, null, null, null, null));
   
    }//GEN-LAST:event_studentButtonMouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setForeground(Color.red);
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, Color.lightGray, Color.lightGray, Color.white, Color.white));

    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
         jButton1.setForeground(Color.BLACK);
         jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(-1, null, null, null, null));
    }//GEN-LAST:event_jButton1MouseExited

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
            java.util.logging.Logger.getLogger(vyasMIDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vyasMIDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vyasMIDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vyasMIDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vyasMIDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel msg;
    private javax.swing.JButton roomsButton;
    private javax.swing.JButton studentButton;
    // End of variables declaration//GEN-END:variables

}