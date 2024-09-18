/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kincseslada;

import javax.swing.JOptionPane;

/**
 *
 * @author PfifferAttila(SZF_20
 */
public class KincsesLadaGUI extends javax.swing.JFrame {

    /**
     * Creates new form KincsesLadaGUI
     */
    public KincsesLadaGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        lblAranyKep = new javax.swing.JLabel();
        lblKincsesLada = new javax.swing.JLabel();
        lblBronzKep = new javax.swing.JLabel();
        lblAranyAllitas = new javax.swing.JLabel();
        lblEzustAllitas = new javax.swing.JLabel();
        lblBronzAllitas = new javax.swing.JLabel();
        btnArany = new javax.swing.JButton();
        btnEzust = new javax.swing.JButton();
        btnBronz = new javax.swing.JButton();
        lblEzustKep = new javax.swing.JLabel();
        lblLeiras = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        lblAranyKep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAranyKep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kincseslada/aranylada.png"))); // NOI18N

        lblKincsesLada.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        lblKincsesLada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKincsesLada.setText("Kincsesláda");

        lblBronzKep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBronzKep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kincseslada/bronzlada.png"))); // NOI18N

        lblAranyAllitas.setFont(new java.awt.Font("Viner Hand ITC", 0, 12)); // NOI18N
        lblAranyAllitas.setText("\"Én rejtem a kincset\"");

        lblEzustAllitas.setFont(new java.awt.Font("Viner Hand ITC", 0, 12)); // NOI18N
        lblEzustAllitas.setText("\"Nem én rejtem a kincset\"");

        lblBronzAllitas.setFont(new java.awt.Font("Viner Hand ITC", 0, 12)); // NOI18N
        lblBronzAllitas.setText("\"Az arany láda hazudik\"");

        btnArany.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        btnArany.setText("Kiválaszt");
        btnArany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAranyActionPerformed(evt);
            }
        });

        btnEzust.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        btnEzust.setText("Kiválaszt");
        btnEzust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEzustActionPerformed(evt);
            }
        });

        btnBronz.setFont(new java.awt.Font("Viner Hand ITC", 0, 14)); // NOI18N
        btnBronz.setText("Kiválaszt");
        btnBronz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBronzActionPerformed(evt);
            }
        });

        lblEzustKep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEzustKep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kincseslada/ezustlada.png"))); // NOI18N

        lblLeiras.setFont(new java.awt.Font("Viner Hand ITC", 0, 12)); // NOI18N
        lblLeiras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLeiras.setText("Van 3 láda, és az egyik egy kincset rejt, és mindháromban van egy felirat, és azt tudjuk hogy a 3 felirat közül az egyik igaz.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAranyKep, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblAranyAllitas)
                        .addComponent(btnArany, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEzustKep)
                    .addComponent(lblEzustAllitas)
                    .addComponent(btnEzust, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBronzAllitas)
                    .addComponent(lblBronzKep)
                    .addComponent(btnBronz, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLeiras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblKincsesLada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAranyKep, lblBronzKep, lblEzustKep});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblKincsesLada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLeiras)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAranyKep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBronzKep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAranyAllitas)
                            .addComponent(lblBronzAllitas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBronz, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEzustKep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEzustAllitas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnArany, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEzust, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAranyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAranyActionPerformed
        JOptionPane.showMessageDialog(null, "Nem az aranyládába van a kincs. A külső illúziókeltő tud lenni...", "Az aranyládát választottad", 1);
    }//GEN-LAST:event_btnAranyActionPerformed

    private void btnEzustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEzustActionPerformed
        JOptionPane.showMessageDialog(null, "Nem az ezüstládába van a kincs. Mivel egyik láda sem vádolta meg az állítását, éppen ezért igazat mondott!", "Az ezüstládát választottad", 1);
    }//GEN-LAST:event_btnEzustActionPerformed

    private void btnBronzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBronzActionPerformed
        JOptionPane.showMessageDialog(null, "A bronzládába van a kincs! Hiszen ha a láda igazat mond, akkor sejteni lehet, hogy a bronzláda rejti a kincset.", "Az bronzládát választottad", 2);
    }//GEN-LAST:event_btnBronzActionPerformed

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
            java.util.logging.Logger.getLogger(KincsesLadaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KincsesLadaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KincsesLadaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KincsesLadaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KincsesLadaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArany;
    private javax.swing.JButton btnBronz;
    private javax.swing.JButton btnEzust;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAranyAllitas;
    private javax.swing.JLabel lblAranyKep;
    private javax.swing.JLabel lblBronzAllitas;
    private javax.swing.JLabel lblBronzKep;
    private javax.swing.JLabel lblEzustAllitas;
    private javax.swing.JLabel lblEzustKep;
    private javax.swing.JLabel lblKincsesLada;
    private javax.swing.JLabel lblLeiras;
    // End of variables declaration//GEN-END:variables
}
