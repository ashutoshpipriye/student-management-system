
import java.awt.HeadlessException;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ashu
 */
public class StudentData extends javax.swing.JFrame {

    /**
     * Creates new form StudentData
     */
    public StudentData() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        sid = new javax.swing.JTextField();
        sname = new javax.swing.JTextField();
        smobno = new javax.swing.JTextField();
        sgender = new javax.swing.JTextField();
        sfname = new javax.swing.JTextField();
        sfoccupation = new javax.swing.JTextField();
        sdob = new javax.swing.JTextField();
        sage = new javax.swing.JTextField();
        scaste = new javax.swing.JTextField();
        scity = new javax.swing.JTextField();
        sstate = new javax.swing.JTextField();
        squlification = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel2.setLayout(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1290, 900));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 120, 26, 28);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 170, 59, 28);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("Mobile No.");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 220, 130, 28);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setText("Gender");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 270, 77, 28);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 255));
        jLabel7.setText("Father's Name");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 320, 160, 28);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 255));
        jLabel8.setText("Occupation");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 370, 160, 28);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 255, 255));
        jLabel9.setText("DOB");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 420, 52, 28);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 255, 255));
        jLabel10.setText("Age");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(50, 470, 40, 28);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 255, 255));
        jLabel11.setText("Caste");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(50, 520, 57, 28);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 255, 255));
        jLabel12.setText("City");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(50, 570, 44, 28);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 255, 255));
        jLabel13.setText("State");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(50, 620, 110, 28);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 255, 255));
        jLabel14.setText("Qualification");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(50, 670, 160, 28);

        sid.setBackground(new java.awt.Color(153, 153, 255));
        sid.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        sid.setForeground(new java.awt.Color(255, 255, 255));
        sid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(sid);
        sid.setBounds(280, 120, 280, 30);

        sname.setBackground(new java.awt.Color(153, 153, 255));
        sname.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        sname.setForeground(new java.awt.Color(255, 255, 255));
        sname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(sname);
        sname.setBounds(280, 170, 280, 30);

        smobno.setBackground(new java.awt.Color(153, 153, 255));
        smobno.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        smobno.setForeground(new java.awt.Color(255, 255, 255));
        smobno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(smobno);
        smobno.setBounds(280, 220, 280, 30);

        sgender.setBackground(new java.awt.Color(153, 153, 255));
        sgender.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        sgender.setForeground(new java.awt.Color(255, 255, 255));
        sgender.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(sgender);
        sgender.setBounds(280, 270, 280, 30);

        sfname.setBackground(new java.awt.Color(153, 153, 255));
        sfname.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        sfname.setForeground(new java.awt.Color(255, 255, 255));
        sfname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(sfname);
        sfname.setBounds(280, 320, 280, 30);

        sfoccupation.setBackground(new java.awt.Color(153, 153, 255));
        sfoccupation.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        sfoccupation.setForeground(new java.awt.Color(255, 255, 255));
        sfoccupation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(sfoccupation);
        sfoccupation.setBounds(280, 370, 280, 30);

        sdob.setBackground(new java.awt.Color(153, 153, 255));
        sdob.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        sdob.setForeground(new java.awt.Color(255, 255, 255));
        sdob.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(sdob);
        sdob.setBounds(280, 420, 280, 30);

        sage.setBackground(new java.awt.Color(153, 153, 255));
        sage.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        sage.setForeground(new java.awt.Color(255, 255, 255));
        sage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(sage);
        sage.setBounds(280, 470, 280, 30);

        scaste.setBackground(new java.awt.Color(153, 153, 255));
        scaste.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        scaste.setForeground(new java.awt.Color(255, 255, 255));
        scaste.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(scaste);
        scaste.setBounds(280, 520, 280, 30);

        scity.setBackground(new java.awt.Color(153, 153, 255));
        scity.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        scity.setForeground(new java.awt.Color(255, 255, 255));
        scity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(scity);
        scity.setBounds(280, 570, 280, 30);

        sstate.setBackground(new java.awt.Color(153, 153, 255));
        sstate.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        sstate.setForeground(new java.awt.Color(255, 255, 255));
        sstate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(sstate);
        sstate.setBounds(280, 620, 280, 30);

        squlification.setBackground(new java.awt.Color(153, 153, 255));
        squlification.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        squlification.setForeground(new java.awt.Color(255, 255, 255));
        squlification.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(squlification);
        squlification.setBounds(280, 670, 280, 30);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Student registration");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(50, 20, 350, 40);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Student Info");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(830, 20, 220, 40);

        area.setBackground(new java.awt.Color(204, 255, 255));
        area.setColumns(20);
        area.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(670, 80, 530, 650);

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(90, 750, 120, 40);

        jButton2.setBackground(new java.awt.Color(102, 102, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Exit");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(330, 750, 120, 40);

        jButton3.setBackground(new java.awt.Color(102, 102, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("View");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(740, 750, 120, 40);

        jButton4.setBackground(new java.awt.Color(102, 102, 255));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Print");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(990, 750, 120, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/darkblurbg.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1290, 820);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","")) {
                String sql = "INSERT into studentinfo ( ID	, Name, MobileNo, Gender, FatherName, Occupation, DOB, Age, Caste, City, State, Qualification) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, sid.getText());
                pst.setString(2, sname.getText());
                pst.setString(3, smobno.getText());
                pst.setString(4, sgender.getText());
                pst.setString(5, sfname.getText());
                pst.setString(6, sfoccupation.getText());
                pst.setString(7, sdob.getText());
                pst.setString(8, sage.getText());
                pst.setString(9, scaste.getText());
                pst.setString(10, scity.getText());
                pst.setString(11, sstate.getText());
                pst.setString(12, squlification.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data Submitted Sucessfully.....");
                //setVisible(false);
                //Main ma = new Main();
                //ma.setVisible(true);
                /** area.setText("****************************************\n");
                area.setText(area.getText()+"                        STUDENT DATA                    \n");
                area.setText(area.getText()+"***************************************\n");

                area.setText(area.getText()+"\n\n\n\n\n");

                area.setText(area.getText()+"ID          :  "+sid.getText()+"\n\n");
                area.setText(area.getText()+"Name :  "+sname.getText()+"\n\n");
                area.setText(area.getText()+"Mobile No.   :  "+smobno.getText()+"\n\n");
                area.setText(area.getText()+"Gender        :  "+sgender.getText()+"\n\n");
                area.setText(area.getText()+"Father Name          :  "+sfname.getText()+"\n\n");
                area.setText(area.getText()+"Occupation  :  "+sfoccupation.getText()+"\n\n");
                area.setText(area.getText()+"DOB          :  "+sdob.getText()+"\n\n");
                area.setText(area.getText()+"Age          :  "+sage.getText()+"\n\n");
                area.setText(area.getText()+"Caste         :  "+scaste.getText()+"\n\n");
                area.setText(area.getText()+"City          :  "+scity.getText()+"\n\n");
                area.setText(area.getText()+"State          :  "+sstate.getText()+"\n\n");
                area.setText(area.getText()+"Qulification          :  "+squlification.getText()+"\n\n");*/

            }
        }
        catch(        HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JDialog.setDefaultLookAndFeelDecorated(true);
        int response = JOptionPane.showConfirmDialog(null,"Do you want to EXIT?",   "Confirm" ,
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(response == JOptionPane.YES_NO_OPTION){
            setVisible(false);
            Student a = new Student();
            a.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            area.setText("******************************************\n");
            area.setText(area.getText()+"                          STUDENT DATA                    \n");
            area.setText(area.getText()+"******************************************\n");

            area.setText(area.getText()+"\n");

            area.setText(area.getText()+"ID      :  "+sid.getText()+"\n");
            area.setText(area.getText()+"Name        :  "+sname.getText()+"\n");
            area.setText(area.getText()+"Mobile No.      :  "+smobno.getText()+"\n");
            area.setText(area.getText()+"Gender      :  "+sgender.getText()+"\n");
            area.setText(area.getText()+"Father Name     :  "+sfname.getText()+"\n");
            area.setText(area.getText()+"Occupation      :  "+sfoccupation.getText()+"\n");
            area.setText(area.getText()+"DOB     :  "+sdob.getText()+"\n");
            area.setText(area.getText()+"Age     :  "+sage.getText()+"\n");
            area.setText(area.getText()+"Caste       :  "+scaste.getText()+"\n");
            area.setText(area.getText()+"City        :  "+scity.getText()+"\n");
            area.setText(area.getText()+"State       :  "+sstate.getText()+"\n");
            area.setText(area.getText()+"Qulification        :  "+squlification.getText()+"\n");
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
            area.print();
        }catch(PrinterException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField sage;
    private javax.swing.JTextField scaste;
    private javax.swing.JTextField scity;
    private javax.swing.JTextField sdob;
    private javax.swing.JTextField sfname;
    private javax.swing.JTextField sfoccupation;
    private javax.swing.JTextField sgender;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField smobno;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField squlification;
    private javax.swing.JTextField sstate;
    // End of variables declaration//GEN-END:variables
}