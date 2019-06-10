package calc;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.sql.Connection;
public class CreateTest extends javax.swing.JFrame {


    String key;
    int code;
    String user;
    int n=1;
    Socket socket;
    public CreateTest() {
        initComponents();
    }
     public CreateTest(String key,int code,String user) throws IOException {
         this.key=key;
         this.code=code;
         this.user=user;
         socket = new Socket("localhost", 5405);
        initComponents();
    }
    Connection connection;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ques = new javax.swing.JTextArea();
        A = new javax.swing.JTextField();
        B = new javax.swing.JTextField();
        C = new javax.swing.JTextField();
        D = new javax.swing.JTextField();
        CA = new javax.swing.JTextField();
        SUBMIT = new javax.swing.JButton();
        qno = new javax.swing.JTextField();
        backtohome = new javax.swing.JButton();
        opClabel = new javax.swing.JLabel();
        opAlabel = new javax.swing.JLabel();
        opBlabel = new javax.swing.JLabel();
        opDlabel = new javax.swing.JLabel();
        opCAlabel = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ques.setColumns(20);
        ques.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        ques.setRows(5);
        ques.setText("\n");
        getContentPane().add(ques, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 910, 120));

        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });
        getContentPane().add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 181, 481, 42));

        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });
        getContentPane().add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 232, 481, 33));

        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });
        getContentPane().add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 274, 481, 39));

        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });
        getContentPane().add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 321, 481, 43));

        CA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAActionPerformed(evt);
            }
        });
        getContentPane().add(CA, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 103, 49));

        SUBMIT.setBackground(new java.awt.Color(102, 255, 102));
        SUBMIT.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SUBMIT.setText("SUBMIT");
        SUBMIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUBMITActionPerformed(evt);
            }
        });
        getContentPane().add(SUBMIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 180, 46));

        qno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qnoActionPerformed(evt);
            }
        });
        getContentPane().add(qno, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 24, 47, 43));

        backtohome.setBackground(new java.awt.Color(255, 51, 51));
        backtohome.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backtohome.setText("BACK TO HOME PAGE");
        backtohome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtohomeActionPerformed(evt);
            }
        });
        getContentPane().add(backtohome, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 570, 370, 60));

        opClabel.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        opClabel.setText("  C");
        getContentPane().add(opClabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 270, 20, 30));

        opAlabel.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        opAlabel.setText(" A");
        getContentPane().add(opAlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 187, 30, 30));

        opBlabel.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        opBlabel.setText(" B");
        getContentPane().add(opBlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 30, 30));

        opDlabel.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        opDlabel.setText("  D");
        getContentPane().add(opDlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 327, 30, 30));

        opCAlabel.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        opCAlabel.setText("CORRECT ANSWER");
        getContentPane().add(opCAlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 130, 40));

        label1.setBackground(new java.awt.Color(255, 204, 204));
        label1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calc/Q.jpg"))); // NOI18N
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -100, 1380, 1160));
        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SUBMITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUBMITActionPerformed

  try {
            sendMessage(socket);
            ques.setText("");
            A.setText("");
            B.setText("");
            C.setText("");
            D.setText("");
            CA.setText("");
            qno.setText("");
        } catch (IOException e)
        {        }
    }//GEN-LAST:event_SUBMITActionPerformed
    
    public void sendMessage 
            (Socket socket)
            throws IOException {
        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(socket.getOutputStream());
           String []str=new String[9]; 
           str[0]=key;
           str[1] = qno.getText();
            str[2] = ques.getText();
            str[3] = A.getText();
            str[4] = B.getText();
            str[5] = C.getText();
            str[6]= D.getText();
            str[7]=CA.getText();
            str[8]=String.valueOf(code);
                // System.out.println("hi");
            objectOutputStream.writeUTF(str[0]);
            objectOutputStream.writeUTF(str[1]);
            objectOutputStream.writeUTF(str[2]);
            objectOutputStream.writeUTF(str[3]);
            objectOutputStream.writeUTF(str[4]);
            objectOutputStream.writeUTF(str[5]);
            objectOutputStream.writeUTF(str[6]);
            objectOutputStream.writeUTF(str[7]);
            objectOutputStream.writeUTF(str[8]);
            objectOutputStream.flush();  
        }
    private void CAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAActionPerformed

    private void qnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qnoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_qnoActionPerformed

    private void backtohomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtohomeActionPerformed
        // TODO add your handling code here:  
        dispose();
        new teacherwelcomepage(user).setVisible(true);         
    }//GEN-LAST:event_backtohomeActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A;
    private javax.swing.JTextField B;
    private javax.swing.JTextField C;
    private javax.swing.JTextField CA;
    private javax.swing.JTextField D;
    private javax.swing.JButton SUBMIT;
    private javax.swing.JButton backtohome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel opAlabel;
    private javax.swing.JLabel opBlabel;
    private javax.swing.JLabel opCAlabel;
    private javax.swing.JLabel opClabel;
    private javax.swing.JLabel opDlabel;
    private javax.swing.JTextField qno;
    private javax.swing.JTextArea ques;
    // End of variables declaration//GEN-END:variables
}