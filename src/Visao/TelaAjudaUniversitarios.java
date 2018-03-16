package Visao;

import java.util.Random;

public class TelaAjudaUniversitarios extends javax.swing.JFrame {

    String[] sorteioAlternativas = {"A","B","C","D"};
    Random R1 = new Random();
    
    public TelaAjudaUniversitarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelEstilo = new javax.swing.JLabel();
        jLabelMestre = new javax.swing.JLabel();
        jLabelAlex = new javax.swing.JLabel();
        jLabelRespostaEstilo = new javax.swing.JLabel();
        jLabelRespostaMestre = new javax.swing.JLabel();
        jLabelRespostaAlex = new javax.swing.JLabel();
        jLabelIgor = new javax.swing.JLabel();
        jLabelRespostaIgor = new javax.swing.JLabel();
        jLabelBalaoIgor = new javax.swing.JLabel();
        jLabelImgIgor = new javax.swing.JLabel();
        jLabelImgEstilo = new javax.swing.JLabel();
        jLabelBalaoEstilo = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelImgMestre = new javax.swing.JLabel();
        jLabelBalaoMestre = new javax.swing.JLabel();
        jLabelImgAlex = new javax.swing.JLabel();
        jLabelBalaoAlex = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelEstilo.setText("Estilo");
        getContentPane().add(jLabelEstilo);
        jLabelEstilo.setBounds(20, 80, 80, 14);

        jLabelMestre.setText("Mestre");
        getContentPane().add(jLabelMestre);
        jLabelMestre.setBounds(130, 80, 80, 14);

        jLabelAlex.setText("Alex");
        getContentPane().add(jLabelAlex);
        jLabelAlex.setBounds(290, 80, 100, 14);

        jLabelRespostaEstilo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelRespostaEstilo.setText("A");
        getContentPane().add(jLabelRespostaEstilo);
        jLabelRespostaEstilo.setBounds(60, 130, 70, 14);

        jLabelRespostaMestre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelRespostaMestre.setText("B");
        getContentPane().add(jLabelRespostaMestre);
        jLabelRespostaMestre.setBounds(180, 130, 70, 22);

        jLabelRespostaAlex.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelRespostaAlex.setText("C");
        getContentPane().add(jLabelRespostaAlex);
        jLabelRespostaAlex.setBounds(320, 130, 70, 22);

        jLabelIgor.setText("Igor");
        getContentPane().add(jLabelIgor);
        jLabelIgor.setBounds(430, 80, 80, 14);

        jLabelRespostaIgor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelRespostaIgor.setText("D");
        getContentPane().add(jLabelRespostaIgor);
        jLabelRespostaIgor.setBounds(480, 130, 80, 14);

        jLabelBalaoIgor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/balao_pensamento_universitarios.png"))); // NOI18N
        getContentPane().add(jLabelBalaoIgor);
        jLabelBalaoIgor.setBounds(430, 100, 100, 90);

        jLabelImgIgor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imagem_estudante_igor.jpg"))); // NOI18N
        getContentPane().add(jLabelImgIgor);
        jLabelImgIgor.setBounds(420, 190, 70, 70);

        jLabelImgEstilo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imagem_estudante_estilo.jpg"))); // NOI18N
        getContentPane().add(jLabelImgEstilo);
        jLabelImgEstilo.setBounds(10, 190, 70, 70);

        jLabelBalaoEstilo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/balao_pensamento_universitarios.png"))); // NOI18N
        getContentPane().add(jLabelBalaoEstilo);
        jLabelBalaoEstilo.setBounds(10, 100, 110, 90);

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTitulo.setText("Ajuda dos Universitários");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(150, 20, 210, 40);

        jLabelImgMestre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imagem_estudante_mestre.jpg"))); // NOI18N
        getContentPane().add(jLabelImgMestre);
        jLabelImgMestre.setBounds(130, 190, 70, 70);

        jLabelBalaoMestre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/balao_pensamento_universitarios.png"))); // NOI18N
        getContentPane().add(jLabelBalaoMestre);
        jLabelBalaoMestre.setBounds(130, 100, 120, 90);

        jLabelImgAlex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imagem_estudante_alex.jpg"))); // NOI18N
        getContentPane().add(jLabelImgAlex);
        jLabelImgAlex.setBounds(270, 190, 70, 70);

        jLabelBalaoAlex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/balao_pensamento_universitarios.png"))); // NOI18N
        getContentPane().add(jLabelBalaoAlex);
        jLabelBalaoAlex.setBounds(270, 100, 110, 90);

        setBounds(100, 200, 551, 351);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaAjudaUniversitarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAjudaUniversitarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAjudaUniversitarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAjudaUniversitarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAjudaUniversitarios().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelAlex;
    private javax.swing.JLabel jLabelBalaoAlex;
    private javax.swing.JLabel jLabelBalaoEstilo;
    private javax.swing.JLabel jLabelBalaoIgor;
    private javax.swing.JLabel jLabelBalaoMestre;
    private javax.swing.JLabel jLabelEstilo;
    private javax.swing.JLabel jLabelIgor;
    private javax.swing.JLabel jLabelImgAlex;
    private javax.swing.JLabel jLabelImgEstilo;
    private javax.swing.JLabel jLabelImgIgor;
    private javax.swing.JLabel jLabelImgMestre;
    private javax.swing.JLabel jLabelMestre;
    private javax.swing.JLabel jLabelRespostaAlex;
    private static javax.swing.JLabel jLabelRespostaEstilo;
    private javax.swing.JLabel jLabelRespostaIgor;
    private javax.swing.JLabel jLabelRespostaMestre;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
    
    public void recebendo(String recebe){
        jLabelRespostaEstilo.setText(sorteioAlternativas[R1.nextInt(3)]);
        jLabelRespostaMestre.setText(recebe);
        jLabelRespostaAlex.setText(sorteioAlternativas[R1.nextInt(3)]);
        jLabelRespostaIgor.setText(sorteioAlternativas[R1.nextInt(3)]);
        
    }
    
}
