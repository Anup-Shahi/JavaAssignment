/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import DB.dbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author anup
 */
public class Question4 extends javax.swing.JFrame {
    String subject;
    String token;
    String id1, id2, id3, id4;
    String query;
    String Question, opt1, opt2, opt3, opt4, cor, cor3, ans3, ans4;
    int marks1, finalmarks;
            

    /**
     * Creates new form Question4
     */
     public Question4(String subject,String token,String id1,String id2,String id3,String ans3,int marks1) {
        initComponents();
        this.subject=subject;
        this.token=token;
        this.id1=id1;
        this.id2=id2;
        this.id3=id3;
        this.ans3=ans3;
        this.marks1=marks1;
        marks();
        getAllQuestion();
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
        btnNext = new javax.swing.JButton();
        lblQuestion4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbAnswer = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Question 4");

        btnNext.setText("Next Questions");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        lblQuestion4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Answer :");

        cmbAnswer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Your Score:");

        lblScore.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addComponent(lblScore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNext)
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQuestion4)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(cmbAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblQuestion4)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(jLabel2)
                    .addComponent(lblScore))
                .addGap(56, 56, 56))
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

    
    public String getAllQuestion(){
        
        try {
            query = "SELECT * FROM question WHERE subject='"+subject+"'AND questionId!='"+id1+"'AND questionId!='"+id2+"'AND questionId!='"+id3+"' ORDER BY RAND() LIMIT 1";
            //stmt.setInt(1, user.getUserId());
//            System.out.println(query);
//            exit(0);
            dbConnection dc=new dbConnection();
            PreparedStatement stmt = dc.conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                id4=(rs.getString("questionId"));
                Question=(rs.getString("question"));
                opt1=(rs.getString("ans1"));
                opt2=(rs.getString("ans2"));
                opt3=(rs.getString("ans3"));
                opt4=(rs.getString("ans4"));
                cor=(rs.getString("correct"));

                String[] ans1 = {opt1, opt2, opt3, opt4};
             
                cmbAnswer.removeAllItems();
                DefaultComboBoxModel answercmb = new DefaultComboBoxModel(ans1);
                cmbAnswer.setModel(answercmb);
            }
            
            
        } catch (SQLException ex) {
            
        }
        lblQuestion4.setText(Question);
        return Question;
    }
  
    
    public void marks(){
         try {
            query = "SELECT * FROM question WHERE questionId='"+id3+"'";
            //stmt.setInt(1, user.getUserId());
            dbConnection dc=new dbConnection();
            PreparedStatement stmt = dc.conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                cor3=(rs.getString("correct"));             
            }

        } catch (SQLException ex) {
            
        }
         
        if(cor3.equals(ans3)){
            finalmarks=1+marks1;
        }
        else{
            finalmarks=0+marks1;
        }
        String fm=Integer.toString(finalmarks);
        lblScore.setText(fm);
    }
    
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
           ans4=(String) cmbAnswer.getSelectedItem();

        
        Question5 al= new Question5(subject,token,id1,id2,id3,id4,ans4,finalmarks);
        al.setVisible(true);
        this.dispose();
        al.setResizable(false);
    }//GEN-LAST:event_btnNextActionPerformed

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
            java.util.logging.Logger.getLogger(Question4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Question4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Question4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Question4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String subject=null;
                String token=null;
                String id1=null;
                String id2=null;
                String id3=null;
                String ans3=null;
                int marks=0;
                new Question4(subject,token,id1,id2,id3,ans3,marks).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JComboBox<String> cmbAnswer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblQuestion4;
    private javax.swing.JLabel lblScore;
    // End of variables declaration//GEN-END:variables
}