/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package major;

/**
 *
 * @author Ruchi
 */
public class TelevisionResultformConsumer extends javax.swing.JFrame {
String brand1,brand2;
    /**
     * Creates new form MobileResultform
     */
    public TelevisionResultformConsumer(String s1,String s2,float ServiceAndSupportPolarity1,float QuestPolarity1,float FeaturesPolarity1,float MentionPolarity1,
        float ServiceAndSupportPolarity2,float QuestPolarity2,float FeaturesPolarity2,float MentionPolarity2,int deals1,int deals2) {
        brand1=s1;
        brand2=s2;
        initComponents();
        
        BName1.setText(brand1);
        BName2.setText(brand2);
        
        String SSString1 = String.format("%.04f",ServiceAndSupportPolarity1);
        SSPol1.setText(SSString1);
        String QuestString1 = String.format("%.04f",QuestPolarity1);
        IPol1.setText(QuestString1);
        String OFString1 = String.format("%.04f",FeaturesPolarity1);
        FPol1.setText(OFString1);
        String MString1 = String.format("%.04f",MentionPolarity1);
        MPol1.setText(MString1);
        
        String SSString2 = String.format("%.04f",ServiceAndSupportPolarity2);
        SSPol2.setText(SSString2);
        String QuestString2 = String.format("%.04f",QuestPolarity2);
        IPol2.setText(QuestString2);
        String OFString2 = String.format("%.04f",FeaturesPolarity2);
        FPol2.setText(OFString2);
        String MString2 = String.format("%.04f",MentionPolarity2);
        MPol2.setText(MString2);
        Deals1.setText(""+deals1);
       
     Deals1.setText(""+deals1);
       
     Deals2.setText(""+deals2);
        jTextArea1.append("SUMMARY OF THE RESULTS: \n \n");
        
        if(FeaturesPolarity1>FeaturesPolarity2)
            jTextArea1.append("\n#Overall Features of " + brand1 + " is appreciated more over \n  " + brand2);
        else
            jTextArea1.append("\n#Overall Features of " + brand2 + " is appreciated more over \n  " + brand1);
        
        if(MentionPolarity1>MentionPolarity2)
            jTextArea1.append("\n# " + brand1 + " is appreciated more over " + brand2 + "\n  with greater Electric Word of Mouth Rating");
        else
            jTextArea1.append("\n# " + brand2 + " is appreciated more over " + brand1 + "\n  with greater Electric Word of Mouth Rating");;
            
           
        if(ServiceAndSupportPolarity1>ServiceAndSupportPolarity2)
            jTextArea1.append("\n#After purchase Services and Support of " + brand1 + "\n  is appreciated more over " + brand2);
        else
            jTextArea1.append("\n#After purchase Services and Support of " + brand2 + "\n  is appreciated more over " + brand1);
        
         if(QuestPolarity1>QuestPolarity2)
            jTextArea1.append("\n# " + brand1 + " raises more doubts and inquiry over " + brand2);
        else
            jTextArea1.append("\n# " + brand2 + " raises more doubts and inquiry over " + brand1);
        
         
         float netPolarity1=FeaturesPolarity1+MentionPolarity1+ServiceAndSupportPolarity1+QuestPolarity1+deals1;
         netPolarity1/=5;
         
         float netPolarity2=FeaturesPolarity2+MentionPolarity2+ServiceAndSupportPolarity2+QuestPolarity2+deals2;
         netPolarity2/=5;
         
         if(netPolarity1>netPolarity2)
            RecommendedBrand.setText(""+brand1) ;
         else
             RecommendedBrand.setText(""+brand2) ;
           
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BName1 = new javax.swing.JTextField();
        BName2 = new javax.swing.JTextField();
        OtherFeatures1 = new javax.swing.JLabel();
        Mention1 = new javax.swing.JLabel();
        ServiceAndSupport1 = new javax.swing.JLabel();
        Inquiry1 = new javax.swing.JLabel();
        FPol1 = new javax.swing.JTextField();
        MPol1 = new javax.swing.JTextField();
        SSPol1 = new javax.swing.JTextField();
        IPol1 = new javax.swing.JTextField();
        OtherFeatures2 = new javax.swing.JLabel();
        Mention2 = new javax.swing.JLabel();
        ServiceAndSupport2 = new javax.swing.JLabel();
        Inquiry2 = new javax.swing.JLabel();
        FPol2 = new javax.swing.JTextField();
        MPol2 = new javax.swing.JTextField();
        SSPol2 = new javax.swing.JTextField();
        IPol2 = new javax.swing.JTextField();
        Recommendation = new javax.swing.JLabel();
        RecommendedBrand = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Deals2 = new javax.swing.JTextField();
        Deals1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BName1.setEditable(false);
        BName1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BName1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BName1ActionPerformed(evt);
            }
        });

        BName2.setEditable(false);
        BName2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BName2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BName2ActionPerformed(evt);
            }
        });

        OtherFeatures1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        OtherFeatures1.setText(" Features");

        Mention1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Mention1.setText("Mention");

        ServiceAndSupport1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ServiceAndSupport1.setText("Service And Support");

        Inquiry1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Inquiry1.setText("Inquiry Or Question");

        FPol1.setEditable(false);

        MPol1.setEditable(false);

        SSPol1.setEditable(false);

        IPol1.setEditable(false);

        OtherFeatures2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        OtherFeatures2.setText(" Features");

        Mention2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Mention2.setText("Mention");

        ServiceAndSupport2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ServiceAndSupport2.setText("Service And Support");

        Inquiry2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Inquiry2.setText("Inquiry Or Question");

        FPol2.setEditable(false);

        MPol2.setEditable(false);

        SSPol2.setEditable(false);

        IPol2.setEditable(false);

        Recommendation.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Recommendation.setText("Recommendation");

        RecommendedBrand.setEditable(false);
        RecommendedBrand.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Deals");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Deals");

        Deals2.setEditable(false);
        Deals2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Deals2ActionPerformed(evt);
            }
        });

        Deals1.setEditable(false);
        Deals1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Deals1ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\as\\Documents\\NetBeansProjects\\Major\\images\\bird_blue_48.png")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Vijaya", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("Tweewomt");

        jLabel3.setText("vs");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ServiceAndSupport1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(SSPol1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Mention1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MPol1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(OtherFeatures1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FPol1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Inquiry1)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Deals1)
                            .addComponent(IPol1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)))
                    .addComponent(BName1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OtherFeatures2)
                            .addComponent(Mention2)
                            .addComponent(ServiceAndSupport2)
                            .addComponent(Inquiry2)
                            .addComponent(jLabel2))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Deals2)
                            .addComponent(FPol2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(MPol2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(SSPol2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(IPol2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3)
                        .addGap(58, 58, 58)
                        .addComponent(BName2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(136, 136, 136))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Recommendation)
                .addGap(83, 83, 83)
                .addComponent(RecommendedBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(292, 292, 292))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(OtherFeatures1)
                                    .addComponent(FPol1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Mention1)
                                    .addComponent(MPol1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ServiceAndSupport1)
                                    .addComponent(SSPol1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Inquiry1)
                                    .addComponent(IPol1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(OtherFeatures2)
                                    .addComponent(FPol2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Mention2)
                                    .addComponent(MPol2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ServiceAndSupport2)
                                    .addComponent(SSPol2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Inquiry2)
                                    .addComponent(IPol2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(Deals2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(Deals1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Recommendation)
                    .addComponent(RecommendedBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BName1ActionPerformed

    private void BName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BName2ActionPerformed

    private void Deals1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Deals1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Deals1ActionPerformed

    private void Deals2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Deals2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Deals2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelevisionResultformConsumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelevisionResultformConsumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelevisionResultformConsumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelevisionResultformConsumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new MobileResultformConsumer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BName1;
    private javax.swing.JTextField BName2;
    private javax.swing.JTextField Deals1;
    private javax.swing.JTextField Deals2;
    private javax.swing.JTextField FPol1;
    private javax.swing.JTextField FPol2;
    private javax.swing.JTextField IPol1;
    private javax.swing.JTextField IPol2;
    private javax.swing.JLabel Inquiry1;
    private javax.swing.JLabel Inquiry2;
    private javax.swing.JTextField MPol1;
    private javax.swing.JTextField MPol2;
    private javax.swing.JLabel Mention1;
    private javax.swing.JLabel Mention2;
    private javax.swing.JLabel OtherFeatures1;
    private javax.swing.JLabel OtherFeatures2;
    private javax.swing.JLabel Recommendation;
    private javax.swing.JTextField RecommendedBrand;
    private javax.swing.JTextField SSPol1;
    private javax.swing.JTextField SSPol2;
    private javax.swing.JLabel ServiceAndSupport1;
    private javax.swing.JLabel ServiceAndSupport2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}