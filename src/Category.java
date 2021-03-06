
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gopik
 */
public class Category extends javax.swing.JFrame {

    /**
     * Creates new form Category
     */
    public Category() {
        initComponents();
        table_update();
    }
    
    public Connection getConnection(){
        Connection con;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login-database","root","");
            return con;         
        }catch(SQLException e){
            return null;
        }
    }
    
    private void table_update()
        {
            int c;
            try {
            Connection conn = getConnection();
            PreparedStatement ps = conn.prepareStatement("select * from category");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData Rss = rs.getMetaData();
            c = Rss.getColumnCount();
            DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
            Df.setRowCount(0);
            while(rs.next())
            {
                Vector v2 = new Vector();
                for(int a=0; a<c; a++) 
                {
                    v2.add(rs.getString("ID"));
                    v2.add(rs.getString("category"));
                }
                Df.addRow(v2);
            }
            jID.setText("");
            jName.setText("");
            jID.requestFocus();
    
        }     
        catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    Connection conn;
    PreparedStatement ps;     
    
    public ArrayList<Prods> ListProducts(String Category)
    {
        DefaultTableModel Df = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        String category_name = (String) Df.getValueAt(selectedIndex,1);
        ArrayList<Prods> productList = new ArrayList<Prods>();
        ResultSet rs;
        
        try{
            conn = getConnection();
            ps = conn.prepareStatement("select * from product where category=?");
            ps.setString(1,category_name);
            rs = ps.executeQuery();
            
            Prods p;
            
            while(rs.next())
            {
                p = new Prods(rs.getInt("id"),rs.getString("name"), rs.getInt("quantity"),
                        rs.getInt("price"),
                        rs.getString("description"), 
                        rs.getString("category"));
                productList.add(p);
            }
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return productList;
    }

    @Override
    public boolean contains(int x, int y) {
        return super.contains(x, y); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(Point p) {
        return super.contains(p); //To change body of generated methods, choose Tools | Templates.
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jID = new javax.swing.JTextField();
        jName = new javax.swing.JTextField();
        jInsert = new javax.swing.JButton();
        jUpdate = new javax.swing.JButton();
        jDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jShowProducts = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAME");

        jInsert.setBackground(new java.awt.Color(255, 255, 255));
        jInsert.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jInsert.setText("Insert New Category");
        jInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInsertActionPerformed(evt);
            }
        });

        jUpdate.setBackground(new java.awt.Color(255, 255, 255));
        jUpdate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jUpdate.setText("Update Selected Category");
        jUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateActionPerformed(evt);
            }
        });

        jDelete.setBackground(new java.awt.Color(255, 255, 255));
        jDelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jDelete.setText("Delete Selected Category");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jShowProducts.setBackground(new java.awt.Color(255, 255, 255));
        jShowProducts.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jShowProducts.setText("Show Full Product List ");
        jShowProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jShowProductsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jShowProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUpdate)
                    .addComponent(jInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jName))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(70, 70, 70)
                            .addComponent(jID, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addComponent(jInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jShowProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInsertActionPerformed
        // TODO add your handling code here:
        String id = jID.getText();
        String category_name = jName.getText();
        
        try {
            conn = getConnection();
            ps = conn.prepareStatement("insert into category(ID,category)values(?,?)");
            ps.setString(1, id);
            ps.setString(2, category_name);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Record Added");
            table_update();
            
            jID.setText("");
            jName.setText("");
            jID.requestFocus();
        }
        
        catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error"+ex);
        }

    }//GEN-LAST:event_jInsertActionPerformed

    private void jShowProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jShowProductsActionPerformed
        // TODO add your handling code here:
        DefaultTableModel Df = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        String category_name = (String) Df.getValueAt(selectedIndex,1);
        ShowProducts form = new ShowProducts();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        DefaultTableModel Df1 = (DefaultTableModel) ShowProducts.jTable2.getModel();
        Object[] rowData = new Object[6];
        for(int i = 0; i < ListProducts(category_name).size(); i++){
            
            rowData[0] = ListProducts(category_name).get(i).getId();
            rowData[1] = ListProducts(category_name).get(i).getName();
            rowData[2] = ListProducts(category_name).get(i).getPrice();
            rowData[3] = ListProducts(category_name).get(i).getQuantity();
            rowData[4] = ListProducts(category_name).get(i).getDesc();
            rowData[5] = ListProducts(category_name).get(i).getCategory();
            
            Df1.addRow(rowData);}
    }//GEN-LAST:event_jShowProductsActionPerformed

    private void jUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateActionPerformed
                                  
        // TODO add your handling code here:
        DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        try {
            int id = Integer.parseInt(Df.getValueAt(selectedIndex,0).toString());
            String category_name = jName.getText();
            conn = getConnection();
            ps = conn.prepareStatement("update category set category=? where id=?");
            ps.setString(1, category_name);
            ps.setInt(2, id);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Record Updated");
            table_update();
            
            jID.setText("");
            jName.setText("");
            jID.requestFocus();    
        }
        catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error"+ex);
        }
    }//GEN-LAST:event_jUpdateActionPerformed

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        try {
            int id = Integer.parseInt(Df.getValueAt(selectedIndex,0).toString());
            
            int dialogResult=JOptionPane.showConfirmDialog(null,"DO YOU WANT TO DELETE THE RECORD","WARNING",JOptionPane.YES_NO_OPTION);
        
            if(dialogResult==JOptionPane.YES_OPTION)
            {
            conn = getConnection();
            ps = conn.prepareStatement("delete from category where id=?");
            ps.setInt(1, id);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"Record deleted");
            table_update();
            jID.setText("");
            jName.setText("");            
            jID.requestFocus();
            }     
        }catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Error"+ex);
            
        }
    }//GEN-LAST:event_jDeleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
        int selected = jTable1.getSelectedRow();

        jID.setText(Df.getValueAt(selected,0).toString());
        jName.setText(Df.getValueAt(selected,1).toString());
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jDelete;
    private javax.swing.JTextField jID;
    private javax.swing.JButton jInsert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jShowProducts;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jUpdate;
    // End of variables declaration//GEN-END:variables
}
