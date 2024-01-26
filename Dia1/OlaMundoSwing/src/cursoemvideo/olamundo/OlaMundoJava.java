
package cursoemvideo.olamundo;

public class OlaMundoJava extends javax.swing.JFrame {
    
    public OlaMundoJava() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMensagem = new javax.swing.JLabel();
        btnClick = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMensagem.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblMensagem.setForeground(new java.awt.Color(153, 0, 255));
        lblMensagem.setText("SUA MENSAGEM APARECERÁ AQUI");

        btnClick.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnClick.setForeground(new java.awt.Color(0, 204, 51));
        btnClick.setText("CLIQUE AQUI");
        btnClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClickActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addComponent(lblMensagem)
                .addGap(129, 129, 129))
            .addGroup(layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(btnClick)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(lblMensagem)
                .addGap(46, 46, 46)
                .addComponent(btnClick, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClickActionPerformed
       
        lblMensagem.setText("Olá, Mundo!");
    }//GEN-LAST:event_btnClickActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OlaMundoJava().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClick;
    private javax.swing.JLabel lblMensagem;
    // End of variables declaration//GEN-END:variables
}
