/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vyashm;
import java.sql.*;
//import javax.swing.*;
import javax.swing.event.*;
import javax.swing.ListSelectionModel;
//import javax.swing.event.ListSelectionEvent;
import javax.swing.table.*;
//import javax.swing.table.TableModel;
/**
 *
 * @author HOME
 */
public class viewRoomDetails extends javax.swing.JFrame implements TableModelListener {
Connection con;
    DefaultTableModel dtm;
    int index;int cap_old,vac_old,count;
    int saved2,count2;
    /**
     * Creates new form viewRoomDetails
     */
    
    public viewRoomDetails() {
        
        initComponents();
        ListSelectionModel cellSelectionModel = jTable1.getSelectionModel();
    cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
    
    public viewRoomDetails(String building) {
        
        initComponents();
        ListSelectionModel cellSelectionModel = jTable1.getSelectionModel();
    cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        try
        {
           Class.forName("oracle.jdbc.driver.OracleDriver");
           String jdbcurl="jdbc:oracle:thin:system/tomato02@//localhost:1521/xe";
           con=DriverManager.getConnection(jdbcurl);
           if(building.equalsIgnoreCase("build1"))
           insertValuesB();
           else
                insertValuesG();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public void insertValues()
    {
        try{
            String sql="select * from rooms order by room_no";
           PreparedStatement pst=con.prepareStatement(sql);
           ResultSet rs=pst.executeQuery();
           dtm=(DefaultTableModel)jTable1.getModel();
           Object row[]=new Object[5];
           while(rs.next())
           {
               int room_no=rs.getInt(1);
               
               String r_type=rs.getString(2);
               int capacity=rs.getInt(3);
               int vacant=rs.getInt(4);
               float fee=rs.getFloat(5);
               
               row[0]=room_no;
               
               row[1]=r_type;
               row[2]=capacity;
               row[3]=vacant;
               row[4]=fee;
               
               dtm.addRow(row);
               
           }
           jTable1.getModel().addTableModelListener(this);
           //con.close();
           capvac();
        }
        
    catch(Exception e)
    {
        System.out.println(e);
    }
    }
    
    public void insertValuesB()
    {
        try{
            String sql="select * from rooms where build=? order by room_no";
           PreparedStatement pst=con.prepareStatement(sql);
           pst.setString(1, "build1");
           ResultSet rs=pst.executeQuery();
           dtm=(DefaultTableModel)jTable1.getModel();
           Object row[]=new Object[5];
           while(rs.next())
           {
               int room_no=rs.getInt(1);
               
               String r_type=rs.getString(2);
               int capacity=rs.getInt(3);
               int vacant=rs.getInt(4);
               float fee=rs.getFloat(5);
               
               row[0]=room_no;
               
               row[1]=r_type;
               row[2]=capacity;
               row[3]=vacant;
               row[4]=fee;
               
               dtm.addRow(row);
               
           }
           jTable1.getModel().addTableModelListener(this);
           //con.close();
           capvac();
           
        }
        
    catch(Exception e)
    {
        System.out.println(e);
    }
    }
    
    public void insertValuesG()
    {
        try{
            String sql="select * from rooms where build=? order by room_no";
           PreparedStatement pst=con.prepareStatement(sql);
           pst.setString(1, "build2");
           ResultSet rs=pst.executeQuery();
           dtm=(DefaultTableModel)jTable1.getModel();
           Object row[]=new Object[5];
           while(rs.next())
           {
               int room_no=rs.getInt(1);
               
               String r_type=rs.getString(2);
               int capacity=rs.getInt(3);
               int vacant=rs.getInt(4);
               float fee=rs.getFloat(5);
               
               row[0]=room_no;
               
               row[1]=r_type;
               row[2]=capacity;
               row[3]=vacant;
               row[4]=fee;
               
               dtm.addRow(row);
               
           }
           jTable1.getModel().addTableModelListener(this);
           //con.close();
           capvac();
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
            Integer roomno=(Integer)jTable1.getValueAt(i, 0);
            int room_no=roomno.intValue();
            try{
            String sql="select count(room_no) from student where room_no=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setInt(1,room_no);
            ResultSet rs=pst.executeQuery();
            while(rs.next())
            {
                count2=rs.getInt(1);
                System.out.println(count2);
                
            }
            pst=con.prepareStatement("select capacity from rooms where room_no=?");
            pst.setInt(1, room_no);
            rs=pst.executeQuery();
            while(rs.next())
            {
                saved2=rs.getInt(1);
                System.out.println(saved2);
            }
            
            pst=con.prepareStatement("update rooms set vacant=? where room_no=?");
            pst.setInt(1, saved2-count2);
            pst.setInt(2, room_no);
            pst.executeUpdate();
            }
            
            catch(Exception e)
            {
                System.out.println(e);
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room no.", "Room type", "Capacity", "Vacant", "Fee per student"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void tableChanged(TableModelEvent evt){
             int row=jTable1.getSelectedRow();
        int col=jTable1.getSelectedColumn();
        System.out.println(jTable1.getValueAt(row, col).toString());
        if(col==1)
        {
            try{
            String roomtype=(String)jTable1.getValueAt(row, col);
            Integer room=(Integer)jTable1.getValueAt(row, 0);
            int roomno=room.intValue();
            String sql="update rooms set r_type=? where room_no=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, roomtype);
            pst.setInt(2,roomno);
            pst.executeUpdate();
            
            sql="update student set r_type=? where room_no=?";
            pst=con.prepareStatement(sql);
            pst.setString(1, roomtype);
            pst.setInt(2,roomno);
            pst.executeUpdate();
            System.out.println("33");
                }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        else if(col==2)
            {
                try{
                    
            Integer cap=(Integer)jTable1.getValueAt(row, col);
            int capacity=cap.intValue();
            Integer room=(Integer)jTable1.getValueAt(row, 0);
            int roomno=room.intValue();
            
            
            PreparedStatement pst2=con.prepareStatement("select count(room_no) from student where room_no=?");
            pst2.setInt(1,roomno);
            ResultSet rs=pst2.executeQuery();
            while(rs.next())
            {
                count=rs.getInt(1);
                System.out.println(count);
            }
            
            String sql="update rooms set capacity=? where room_no=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setInt(1, capacity);
            pst.setInt(2,roomno);
            pst.executeUpdate();
            sql="update rooms set vacant=? where room_no=?";
            pst=con.prepareStatement(sql);
            pst.setInt(1, capacity-count);
            pst.setInt(2,roomno);
            pst.executeUpdate();
            System.out.println("22");
                }
            catch(Exception e)
            {
                System.out.println("1");
                System.out.println(e);
            }
             }
        else if(col==4)
        {
            try{
            float fee=(float)jTable1.getValueAt(row, col);
            Integer room=(Integer)jTable1.getValueAt(row, 0);
            int roomno=room.intValue();
            String sql="update rooms set fee=? where room_no=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setFloat(1, fee);
            pst.setInt(2,roomno);
            pst.executeUpdate();
            System.out.println("33");
                }
            catch(Exception e)
            {
                System.out.println(e);
            }
            
        }
        
             
         }
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
            java.util.logging.Logger.getLogger(viewRoomDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewRoomDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewRoomDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewRoomDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewRoomDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
