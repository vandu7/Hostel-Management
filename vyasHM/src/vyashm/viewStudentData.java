/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vyashm;
import java.awt.Color;
import java.awt.Component;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.event.*;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.TableModel;
/**
 *
 * @author HOME
 */
public class viewStudentData extends javax.swing.JFrame implements TableModelListener {
Connection con;
    DefaultTableModel dtm;
    int index;
    int r_no;
    int col,row;
     int count,saved;String rtype;
     float rmfee;
    Object oldValue,newValue;
    /**
     * Creates new form viewStudentData
     */
    public viewStudentData() {
        initComponents();
        try
        {
           Class.forName("oracle.jdbc.driver.OracleDriver");
           String jdbcurl="jdbc:oracle:thin:system/password//localhost:1521/xe";
           con=DriverManager.getConnection(jdbcurl);
           insertValues();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public viewStudentData(String gender) {
        initComponents();
        try
        {
           Class.forName("oracle.jdbc.driver.OracleDriver");
           String jdbcurl="jdbc:oracle:thin:system/tomato02@//localhost:1521/xe";
           con=DriverManager.getConnection(jdbcurl);
           if(gender.equalsIgnoreCase("male"))
           insertValuesB();
           else
                insertValuesG();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public void insertValuesB()
    {
        try{
            String sql="select * from student where gender=? and check_out is null order by s_no";
           PreparedStatement pst=con.prepareStatement(sql);
           pst.setString(1, "male");
           ResultSet rs=pst.executeQuery();
           dtm=(DefaultTableModel)jTable1.getModel();
           Object row[]=new Object[7];
           while(rs.next())
           {
               int s_no=rs.getInt(1);
               int room_no=rs.getInt(2);
               String name=rs.getString(3);
               String r_type=rs.getString(4);
               float feep=rs.getFloat(5);
               float feed=rs.getFloat(6);
               Date doa=rs.getDate(7);
               int day=doa.getDate();
               row[0]=s_no;
               row[1]=room_no;
               row[2]=name;
               row[3]=r_type;
               row[4]=feep;
               row[5]=feed;
               row[6]=doa;
               dtm.addRow(row);
               
           }
           jTable1.getModel().addTableModelListener(this);
           //con.close();
           
        }
        
    catch(Exception e)
    {
        System.out.println(e);
    }
    }
    
    public void insertValues()
    {
        try{
            String sql="select * from student where check_out is null order by s_no";
           PreparedStatement pst=con.prepareStatement(sql);
           ResultSet rs=pst.executeQuery();
           dtm=(DefaultTableModel)jTable1.getModel();
           Object row[]=new Object[7];
           while(rs.next())
           {
               int s_no=rs.getInt(1);
               int room_no=rs.getInt(2);
               String name=rs.getString(3);
               String r_type=rs.getString(4);
               float feep=rs.getFloat(5);
               float feed=rs.getFloat(6);
               Date doa=rs.getDate(7);
               int day=doa.getDate();
               row[0]=s_no;
               row[1]=room_no;
               row[2]=name;
               row[3]=r_type;
               row[4]=feep;
               row[5]=feed;
               row[6]=doa;
               dtm.addRow(row);
               
           }
           jTable1.getModel().addTableModelListener(this);
           //con.close();
           
        }
        
    catch(Exception e)
    {
        System.out.println(e);
    }
    }
    
    public void insertValuesG()
    {
        try{
            String sql="select * from student where gender=? and check_out is null order by s_no";
           PreparedStatement pst=con.prepareStatement(sql);
           pst.setString(1, "female");
           ResultSet rs=pst.executeQuery();
           dtm=(DefaultTableModel)jTable1.getModel();
           Object row[]=new Object[7];
           while(rs.next())
           {
               int s_no=rs.getInt(1);
               int room_no=rs.getInt(2);
               String name=rs.getString(3);
               String r_type=rs.getString(4);
               float feep=rs.getFloat(5);
               float feed=rs.getFloat(6);
               Date doa=rs.getDate(7);
               int day=doa.getDate();
               row[0]=s_no;
               row[1]=room_no;
               row[2]=name;
               row[3]=r_type;
               row[4]=feep;
               row[5]=feed;
               row[6]=doa;
               dtm.addRow(row);
               
           }
           jTable1.getModel().addTableModelListener(this);
           //con.close();
           
        }
        
    catch(Exception e)
    {
        System.out.println(e);
    }
    }
    public void capvac()
    {
       
        int row_count=jTable1.getRowCount();
        System.out.println(row_count);
        for(int i=0;i<row_count;i++)
        {
            Integer roomno=(Integer)jTable1.getValueAt(i, 1);
            int room_no=roomno.intValue();
            try{
            String sql="select count(room_no) from student where room_no=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setInt(1,room_no);
            ResultSet rs=pst.executeQuery();
            while(rs.next())
            {
                count=rs.getInt(1);
                System.out.println(count);
                
            }
            pst=con.prepareStatement("select capacity from rooms where room_no=?");
            pst.setInt(1, room_no);
            rs=pst.executeQuery();
            while(rs.next())
            {
                saved=rs.getInt(1);
                System.out.println(saved);
            }
            
            pst=con.prepareStatement("update rooms set vacant=? where room_no=?");
            pst.setInt(1, saved-count);
            pst.setInt(2, room_no);
            pst.executeUpdate();
            }
            
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
   

    public void tableChanged(TableModelEvent evt){
        row=jTable1.getSelectedRow();
         col=jTable1.getSelectedColumn();
         float check_due=(float)jTable1.getValueAt(row, 5);
        System.out.println(jTable1.getValueAt(row, col).toString());
        if(col==1)
        {
            if(check_due==0)
            {
            try{
                
                Integer roomno=(Integer)jTable1.getValueAt(row, col);
                int room_no=roomno.intValue();
                Integer sno=(Integer)jTable1.getValueAt(row, 0);
                int s_no=sno.intValue();
                String sql="update student set room_no=? where s_no=?";
                PreparedStatement pst=con.prepareStatement(sql);
                pst.setInt(1, room_no);
                pst.setInt(2, s_no);
                pst.executeUpdate();
                sql="select r_type from rooms where room_no=?";
                pst=con.prepareStatement(sql);
                pst.setInt(1,room_no);
                ResultSet rs=pst.executeQuery();
                if(rs.next())
                {
                    rtype=rs.getString(1);
                    
                }
                sql="update student set r_type=? where s_no=?";
                pst=con.prepareStatement(sql);
                pst.setString(1,rtype);
                pst.setInt(2, s_no);
                pst.executeQuery();
                pst=con.prepareStatement("select fee from rooms where room_no=?");
                pst.setInt(1,room_no);
                rs=pst.executeQuery();
                if(rs.next())
                {
                    rmfee=rs.getFloat(1);
                }
                pst=con.prepareStatement("update student set fee_due=? where s_no=?");
                pst.setFloat(1, rmfee);
                pst.setInt(2,s_no);
                pst.executeUpdate();
                pst=con.prepareStatement("update student set fee_paid=? where s_no=?");
                pst.setFloat(1, 0);
                pst.setInt(2,s_no);
                pst.executeUpdate();
                
               /* pst=con.prepareStatement("select fee from rooms where room_no=?");
                pst.setInt(1,room_no);
                rs=pst.executeQuery();
                if(rs.next())
                {
                    rmfee=rs.getFloat(1);
                }
                */
                capvac();
                
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            
        }
            else
            {
                JOptionPane.showMessageDialog(this,"Pay the due fees","Error",JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setBackground(jTable1.getForeground());
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S no.", "Room no.", "Student Name", "Room type", "Fee Paid", "Fee Due", "DOA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTable1PropertyChange

    
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
            java.util.logging.Logger.getLogger(viewStudentData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewStudentData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewStudentData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewStudentData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewStudentData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
