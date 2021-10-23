import java.awt.*;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
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

        jPassword2 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMinimize = new javax.swing.JLabel();
        jClose = new javax.swing.JLabel();
        jRegisterButton = new javax.swing.JButton();
        jUsernameLabel = new javax.swing.JLabel();
        jUsernameLabel1 = new javax.swing.JLabel();
        jUsernameLabel2 = new javax.swing.JLabel();
        jUsernameLabel3 = new javax.swing.JLabel();
        jUsernameLabel4 = new javax.swing.JLabel();
        jUsernameLabel5 = new javax.swing.JLabel();
        jUsernameLabel6 = new javax.swing.JLabel();
        jFullName = new javax.swing.JTextField();
        jLastName = new javax.swing.JTextField();
        jUsername = new javax.swing.JTextField();
        jContact = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jAddress = new javax.swing.JTextArea();
        jConfirm_Password = new javax.swing.JPasswordField();
        jAlready = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();

        jPassword2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPassword2.setForeground(new java.awt.Color(204, 204, 204));
        jPassword2.setText("password");
        jPassword2.setToolTipText("");
        jPassword2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPassword2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPassword2FocusLost(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));

        jLabel1.setBackground(new java.awt.Color(102, 0, 102));
        jLabel1.setFont(new java.awt.Font("Bebas Kai", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTER");
        jLabel1.setToolTipText("");
        jLabel1.setAutoscrolls(true);
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jMinimize.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jMinimize.setForeground(new java.awt.Color(255, 255, 255));
        jMinimize.setText("_");
        jMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMinimizeMouseExited(evt);
            }
        });

        jClose.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jClose.setForeground(new java.awt.Color(255, 255, 255));
        jClose.setText("x");
        jClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCloseMouseExited(evt);
            }
        });

        jRegisterButton.setBackground(new java.awt.Color(255, 255, 255));
        jRegisterButton.setFont(new java.awt.Font("Bebas Kai", 0, 14)); // NOI18N
        jRegisterButton.setForeground(new java.awt.Color(51, 0, 51));
        jRegisterButton.setText("Register");
        jRegisterButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jRegisterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRegisterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jRegisterButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jRegisterButtonMouseExited(evt);
            }
        });
        jRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegisterButtonActionPerformed(evt);
            }
        });

        jUsernameLabel.setFont(new java.awt.Font("BatangChe", 1, 18)); // NOI18N
        jUsernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        jUsernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jUsernameLabel.setText("FirstName :");
        jUsernameLabel.setToolTipText("");

        jUsernameLabel1.setFont(new java.awt.Font("BatangChe", 1, 18)); // NOI18N
        jUsernameLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jUsernameLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jUsernameLabel1.setText("Username :  ");
        jUsernameLabel1.setToolTipText("");

        jUsernameLabel2.setFont(new java.awt.Font("BatangChe", 1, 18)); // NOI18N
        jUsernameLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jUsernameLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jUsernameLabel2.setText("Password :  ");
        jUsernameLabel2.setToolTipText("");

        jUsernameLabel3.setFont(new java.awt.Font("BatangChe", 1, 18)); // NOI18N
        jUsernameLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jUsernameLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jUsernameLabel3.setText("Confirm Password :  ");
        jUsernameLabel3.setToolTipText("");

        jUsernameLabel4.setFont(new java.awt.Font("BatangChe", 1, 18)); // NOI18N
        jUsernameLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jUsernameLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jUsernameLabel4.setText("Address :");
        jUsernameLabel4.setToolTipText("");

        jUsernameLabel5.setFont(new java.awt.Font("BatangChe", 1, 18)); // NOI18N
        jUsernameLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jUsernameLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jUsernameLabel5.setText("LastName :  ");
        jUsernameLabel5.setToolTipText("");

        jUsernameLabel6.setFont(new java.awt.Font("BatangChe", 1, 18)); // NOI18N
        jUsernameLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jUsernameLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jUsernameLabel6.setText("Contact :  ");
        jUsernameLabel6.setToolTipText("");

        jFullName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jFullName.setForeground(new java.awt.Color(204, 204, 204));
        jFullName.setText("fullname");
        jFullName.setToolTipText("");
        jFullName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jFullName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFullNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFullNameFocusLost(evt);
            }
        });

        jLastName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLastName.setForeground(new java.awt.Color(204, 204, 204));
        jLastName.setText("lastname");
        jLastName.setToolTipText("");
        jLastName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jLastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLastNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jLastNameFocusLost(evt);
            }
        });

        jUsername.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jUsername.setForeground(new java.awt.Color(204, 204, 204));
        jUsername.setText("username");
        jUsername.setToolTipText("");
        jUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jUsernameFocusLost(evt);
            }
        });

        jContact.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jContact.setForeground(new java.awt.Color(204, 204, 204));
        jContact.setText("contact");
        jContact.setToolTipText("");
        jContact.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jContact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jContactFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jContactFocusLost(evt);
            }
        });

        jAddress.setColumns(20);
        jAddress.setRows(5);
        jScrollPane1.setViewportView(jAddress);

        jConfirm_Password.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jConfirm_Password.setForeground(new java.awt.Color(204, 204, 204));
        jConfirm_Password.setText("password");
        jConfirm_Password.setToolTipText("");
        jConfirm_Password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jConfirm_PasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jConfirm_PasswordFocusLost(evt);
            }
        });

        jAlready.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jAlready.setForeground(new java.awt.Color(255, 255, 255));
        jAlready.setText("Already have and account? Log In");
        jAlready.setToolTipText("");
        jAlready.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jAlready.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAlreadyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jAlreadyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jAlreadyMouseExited(evt);
            }
        });

        jPassword.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPassword.setForeground(new java.awt.Color(204, 204, 204));
        jPassword.setText("password");
        jPassword.setToolTipText("");
        jPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jUsernameLabel4)
                                            .addComponent(jUsernameLabel6))
                                        .addGap(7, 7, 7))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jUsernameLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                        .addGap(3, 3, 3))
                                    .addComponent(jContact)
                                    .addComponent(jConfirm_Password)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(93, 93, 93)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jUsernameLabel5)
                                            .addComponent(jUsernameLabel1)
                                            .addComponent(jUsernameLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jUsernameLabel)
                                        .addGap(24, 24, 24)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFullName)
                                    .addComponent(jLastName)
                                    .addComponent(jUsername)
                                    .addComponent(jPassword))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)))
                .addComponent(jClose, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jAlready, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jClose)
                        .addGap(72, 72, 72))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jUsernameLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jUsernameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jUsernameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jUsernameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jConfirm_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jUsernameLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jContact, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jUsernameLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jAlready)
                .addContainerGap(26, Short.MAX_VALUE))
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

    private void jMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMinimizeMouseClicked
        // TODO add your handling code here:
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jMinimizeMouseClicked

    private void jMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMinimizeMouseEntered
        // TODO add your handling code here:
        jMinimize.setForeground(new java.awt.Color(0, 0, 255));
    }//GEN-LAST:event_jMinimizeMouseEntered

    private void jMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMinimizeMouseExited
        // TODO add your handling code here:
        jMinimize.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jMinimizeMouseExited

    private void jCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jCloseMouseClicked

    private void jCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCloseMouseEntered
        // TODO add your handling code here:
        jClose.setForeground(new java.awt.Color(0, 0, 255));
    }//GEN-LAST:event_jCloseMouseEntered

    private void jCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCloseMouseExited
        // TODO add your handling code here:
        jClose.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jCloseMouseExited

    private void jRegisterButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRegisterButtonMouseEntered
        // TODO add your handling code here:
        jRegisterButton.setBackground(new java.awt.Color(52, 204, 255));
    }//GEN-LAST:event_jRegisterButtonMouseEntered

    private void jRegisterButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRegisterButtonMouseExited
        // TODO add your handling code here:
        jRegisterButton.setForeground(new java.awt.Color(0, 0, 0));
        jRegisterButton.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jRegisterButtonMouseExited
    public boolean verifyFields(){
        String full_name = jFullName.getText();
        String last_name = jLastName.getText();
        String username = jUsername.getText();
        String password = String.valueOf(jPassword.getPassword());
        String confirm_password = String.valueOf(jConfirm_Password.getPassword());
        String contact = jContact.getText();
        String address = jAddress.getText();
        
        // check empty fields
        if(full_name.trim().equals("") || last_name.trim().equals("") || username.trim().equals("") || contact.trim().equals("")
           || password.trim().equals("") || confirm_password.trim().equals("") || address.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty","Empty Fields",2);
            return false;
        }
        
        // check if the two password are equals or not
        else if(!password.equals(confirm_password))
        {
           JOptionPane.showMessageDialog(null, "Password Doesn't Match","Confirm Password",2); 
           return false;
        }
        
        // if everything is ok
        else{
            return true;
        }
    }
    
    public boolean checkUsername(String username){
        
        PreparedStatement st;
        ResultSet rs;
        boolean username_exist = false;
        
        String query = "SELECT * FROM `loginpage` WHERE `username` = ?";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login-database","root",""); 
            st = con.prepareStatement(query);
            st.setString(1, username);
            rs = st.executeQuery();
        
            if(rs.next())
            {
                username_exist = true;
                JOptionPane.showMessageDialog(null, "This Username is Already Taken, Choose Another One", "Username Failed", 2);
            }
            
        } catch (HeadlessException | ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return username_exist;
    }
    
    private void jRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegisterButtonActionPerformed
        // TODO add your handling code here:
        String full_name = jFullName.getText();
        String last_name = jLastName.getText();
        String username = jUsername.getText();
        String password = String.valueOf(jPassword.getPassword());
        String confirm_password = String.valueOf(jConfirm_Password.getPassword());
        String contact = jContact.getText();
        String address = jAddress.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login-database","root",""); 
       
// check if the data are empty
         if(verifyFields())
         {
// check if the username already exists
             if(!checkUsername(username))
             {
                PreparedStatement ps;
                ResultSet rs;
                String registerUserQuery = "INSERT INTO `loginpage`(`full_name`, `last_name`, `username`, `password`, `confirm_password`, `contact`, `address`) VALUES(?,?,?,?,?,?,?)";
                try{
                    ps = con.prepareStatement(registerUserQuery);
                    ps.setString(1, full_name);
                    ps.setString(2, last_name);
                    ps.setString(3, username);
                    ps.setString(4, password);
                    ps.setString(5, confirm_password);
                    ps.setString(6, contact);
                    ps.setString(7, address);                    
                    if(ps.executeUpdate() != 0){
                        JOptionPane.showMessageDialog(null, "Your Account Has Been Created");
                    }else{
                        JOptionPane.showMessageDialog(null, "Error: Check Your Information");
                    }
                
                }
                catch (HeadlessException | SQLException e){
                     JOptionPane.showMessageDialog(null, e);
                }
             }
         }
          con.close();
            
        }
        catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jRegisterButtonActionPerformed

    private void jFullNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFullNameFocusGained
        // TODO add your handling code here:
        if(jFullName.getText().trim().toLowerCase().equals("fullname"))
        {
            jFullName.setText("");
            jFullName.setForeground(Color.black);
        }
    }//GEN-LAST:event_jFullNameFocusGained

    private void jFullNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFullNameFocusLost
        // TODO add your handling code here:
        if(jFullName.getText().trim().equals("") ||
            jFullName.getText().trim().toLowerCase().equals("fullname"))
        {
            jFullName.setText("fullname");
            jFullName.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jFullNameFocusLost

    private void jLastNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLastNameFocusGained
        // TODO add your handling code here:
        if(jLastName.getText().trim().toLowerCase().equals("lastname"))
        {
            jLastName.setText("");
            jLastName.setForeground(Color.black);
        }
    }//GEN-LAST:event_jLastNameFocusGained

    private void jLastNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLastNameFocusLost
        // TODO add your handling code here:
        if(jLastName.getText().trim().equals("") ||
            jLastName.getText().trim().toLowerCase().equals("lastname"))
        {
            jLastName.setText("lastname");
            jLastName.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jLastNameFocusLost

    private void jUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jUsernameFocusGained
        // TODO add your handling code here:
        if(jUsername.getText().trim().toLowerCase().equals("username"))
        {
            jUsername.setText("");
            jUsername.setForeground(Color.black);
        }
    }//GEN-LAST:event_jUsernameFocusGained

    private void jUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jUsernameFocusLost
        // TODO add your handling code here:
        if(jUsername.getText().trim().equals("") ||
            jUsername.getText().trim().toLowerCase().equals("username"))
        {
            jUsername.setText("username");
            jUsername.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jUsernameFocusLost

    private void jContactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jContactFocusGained
        // TODO add your handling code here:
        if(jContact.getText().trim().toLowerCase().equals("contact"))
        {
            jContact.setText("");
            jContact.setForeground(Color.black);
        }
    }//GEN-LAST:event_jContactFocusGained

    private void jContactFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jContactFocusLost
        // TODO add your handling code here:
        if(jContact.getText().trim().equals("") ||
            jContact.getText().trim().toLowerCase().equals("contact"))
        {
            jContact.setText("contact");
            jContact.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jContactFocusLost

    private void jConfirm_PasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jConfirm_PasswordFocusGained
        // TODO add your handling code here:
        String pass = String.valueOf(jConfirm_Password.getPassword());
        if(pass.trim().toLowerCase().equals("password"))
        {
            jConfirm_Password.setText("");
            jConfirm_Password.setForeground(Color.black);
        }
    }//GEN-LAST:event_jConfirm_PasswordFocusGained

    private void jConfirm_PasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jConfirm_PasswordFocusLost
        // TODO add your handling code here:
        String pass = String.valueOf(jConfirm_Password.getPassword());
        if(pass.trim().equals("") ||
            pass.trim().toLowerCase().equals("password"))
        {
            jConfirm_Password.setText("password");
            jConfirm_Password.setForeground(new Color(153,153,153));

        }
    }//GEN-LAST:event_jConfirm_PasswordFocusLost

    private void jAlreadyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAlreadyMouseClicked
        // TODO add your handling code here:
        Login form = new Login();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_jAlreadyMouseClicked

    private void jAlreadyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAlreadyMouseEntered
        // TODO add your handling code here:
        jAlready.setForeground(new Color(52, 204, 255));
    }//GEN-LAST:event_jAlreadyMouseEntered

    private void jAlreadyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAlreadyMouseExited
        // TODO add your handling code here:
        jAlready.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_jAlreadyMouseExited

    private void jPassword2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPassword2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jPassword2FocusGained

    private void jPassword2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPassword2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jPassword2FocusLost

    private void jPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFocusGained
        // TODO add your handling code here:
        String pass = String.valueOf(jPassword.getPassword());
        if(pass.trim().toLowerCase().equals("password"))
        {
            jPassword.setText("");
            jPassword.setForeground(Color.black);
        }
    }//GEN-LAST:event_jPasswordFocusGained

    private void jPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFocusLost
        // TODO add your handling code here:
        String pass = String.valueOf(jPassword.getPassword());
        if(pass.trim().equals("") ||
            pass.trim().toLowerCase().equals("password"))
        {
            jPassword.setText("password");
            jPassword.setForeground(new Color(153,153,153));

        }
    }//GEN-LAST:event_jPasswordFocusLost

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea jAddress;
    private javax.swing.JLabel jAlready;
    private javax.swing.JLabel jClose;
    private javax.swing.JPasswordField jConfirm_Password;
    private javax.swing.JTextField jContact;
    private javax.swing.JTextField jFullName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jLastName;
    private javax.swing.JLabel jMinimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JPasswordField jPassword2;
    private javax.swing.JButton jRegisterButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jUsername;
    private javax.swing.JLabel jUsernameLabel;
    private javax.swing.JLabel jUsernameLabel1;
    private javax.swing.JLabel jUsernameLabel2;
    private javax.swing.JLabel jUsernameLabel3;
    private javax.swing.JLabel jUsernameLabel4;
    private javax.swing.JLabel jUsernameLabel5;
    private javax.swing.JLabel jUsernameLabel6;
    // End of variables declaration//GEN-END:variables
}
