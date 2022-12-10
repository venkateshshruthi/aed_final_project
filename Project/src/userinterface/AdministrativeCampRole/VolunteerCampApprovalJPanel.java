/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeCampRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.SendMailUsingAuthentication;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.mail.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Shruthi Venkatesh
 */
public class VolunteerCampApprovalJPanel extends javax.swing.JPanel {

    private Enterprise enterprise;
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private static String emailMsgTxt = "";
    private static String emailSubjectTxt = "";
    private static String emailFromAddress = "";
// Add List of Email address to who email needs to be sent to
    private static String[] emailList = new String[1];

    /**
     * Creates new form VolunteerAprovalJPanel
     */
    public VolunteerCampApprovalJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        valueLabel.setText(enterprise.getName());
        populateRequestTable();
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request.toString().equals("Volunteer")) {
                Object[] row = new Object[8];
                row[0] = request;
                row[1] = request.getVolunteerName();
                row[2] = request.getUsername();
                row[3] = request.getDob();
                row[4] = request.getSsn();
                row[5] = request.getMailid();
                row[6] = request.getRole();
                row[7] = request.getStatus();

                //String result = ((VolunteerApprovalStatus) request).getTestResult();
                // row[3] = result == null ? "Waiting" : result;
                model.addRow(row);
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
        workRequestJTable = new javax.swing.JTable();
        refreshJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 255));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Type", "Name", "Username", "Date of Birth", "SSN", "Email ID", "Role", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        refreshJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Green/Button-Refresh-icon.png"))); // NOI18N
        refreshJButton.setText("REFRESH");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        processJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Yellow/user_ok.png"))); // NOI18N
        processJButton.setText("APPROVE");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        valueLabel.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(255, 255, 255));
        valueLabel.setText("<value>");

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel.setText("Enterprise Name:");

        backJButton.setBackground(new java.awt.Color(255, 51, 51));
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Yellow/prev-48.png"))); // NOI18N
        backJButton.setText("BACK");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Blue/rss.png"))); // NOI18N
        jLabel7.setText("VOLUNTEER CAMP ROLE APPROVAL");
        jLabel7.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(refreshJButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(backJButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(processJButton))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(jLabel7)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(refreshJButton))
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backJButton)
                    .addComponent(processJButton))
                .addContainerGap(123, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed

    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please make a selection");
            return;
        }
        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        Employee employee = null;
        Role role = null;
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            //System.out.println(request.getRole().equals(org.getOrganType().VolunteerCamp.toString()));
            //System.out.println(request.getRole());
            //System.out.println(request.getRole().equals("VolunteerCampRole"));
            if (request.getRole().equals("VolunteerCampRole")) {
                org.getEmployeeDirectory().createEmployee(request.getVolunteerName());
                for (Employee e : org.getEmployeeDirectory().getEmployeeList()) {
                    if (request.getVolunteerName() == e.getName()) {
                        employee = e;
                    }
                    for (Role r : org.getSupportedRole()) {
                        //System.out.println(r);
                        if (request.getRole().equals("VolunteerCampRole")) {
                            role = r;
                        }
                    }
                }
                org.getUserAccountDirectory().createUserAccount(request.getUsername(), request.getPassword(), employee, role);
                break;
            } else if (request.getRole().equals("VolunteerEventRole")) {
                if (org.toString().equals("Event Organization")) {
                    org.getEmployeeDirectory().createEmployee(request.getVolunteerName());
                    for (Employee e : org.getEmployeeDirectory().getEmployeeList()) {
                        if (request.getVolunteerName() == e.getName()) {
                            employee = e;
                        }

                        for (Role r : org.getSupportedRole()) {
                            if (r.toString().equals("VolunteerEventRole")) {
                                role = r;
                            }
                        }
                    }
                    org.getUserAccountDirectory().createUserAccount(request.getUsername(), request.getPassword(), employee, role);
                }
            }
        }
        request.setStatus("Completed");
        populateRequestTable();
        if (request.getStatus().equals("Completed")) {
           
            // System.out.println("Mail Begins");
            String ab = request.getVolunteerName();
            emailMsgTxt = "Hi " + ab.toUpperCase() + ", " + "\n" + "\n" + "Your User Account has been Created. You may login into the system now!" + "\n" + "\n" + "Regards," + "\n" + "NGO Admin";
            emailSubjectTxt = "Volunteer Request Approved";
            emailFromAddress = SendMailUsingAuthentication.SMTP_AUTH_USER;

            // Add List of Email address to who email needs to be sent to
            StringBuffer sb = new StringBuffer(request.getMailid());
            StringTokenizer st = new StringTokenizer(request.getMailid());
            int i = 0;
            while (st.hasMoreTokens()) {
                emailList[i] = st.nextToken(",");
                // System.err.println(emailList[i]);
                i++;
            }
            String emailReceipeint[] = new String[i];
            for (int j = 0; j < i; j++) {
                emailReceipeint[j] = emailList[j];
                //System.out.println("Actually emails are " + j);
            }

            SendMailUsingAuthentication smtpMailSender = new SendMailUsingAuthentication();
            try {
                smtpMailSender.postMail(emailReceipeint, emailSubjectTxt, emailMsgTxt, emailFromAddress);
                 JOptionPane.showMessageDialog(null, "Request Approved and mail has been sent to Volunteer. Volunteer can request for Health Camp now!");
            } catch (MessagingException ex) {
            //    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Exception");
            }
          //  System.out.println("Sucessfully Sent mail to All Users");

        }
    }//GEN-LAST:event_processJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
