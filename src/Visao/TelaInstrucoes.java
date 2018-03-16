package Visao;

public class TelaInstrucoes extends javax.swing.JFrame {

    public TelaInstrucoes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelHistoria = new javax.swing.JPanel();
        jLabelHistoria = new javax.swing.JLabel();
        jPanelRegras = new javax.swing.JPanel();
        jLabelRegras = new javax.swing.JLabel();
        jPanelEliminarAlternativa = new javax.swing.JPanel();
        jLabelImg1EliminarAlternativas = new javax.swing.JLabel();
        jLabelImg2EliminarAlternativas = new javax.swing.JLabel();
        jLabelEliminarAlternativa = new javax.swing.JLabel();
        jPanelPularQuestao = new javax.swing.JPanel();
        jLabelImgPularQuestao = new javax.swing.JLabel();
        jLabelPularQuestao = new javax.swing.JLabel();
        jPanelAjudaUniversitarios = new javax.swing.JPanel();
        jLabelImg1AjudaUniversitarios = new javax.swing.JLabel();
        jLabelImg2AjudaUniversitarios = new javax.swing.JLabel();
        jLabelAjudaUniversitarios = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelHistoria.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelHistoria.setText("<html>Percebendo como a falta de árvores é um problema grande<br/> para o mundo, a empresa TAA resolveu criar em parceria com o canal de televisão</br> ECOTV um game show com um prêmio diferente do convencional.<br/><br/>   Nesse game show caso o participante acerte todas as perguntas 1 mihão de árvores serão plantadas em todo o Brasil.<br/> E mesmo que o jogador não chegue até a fase final há outros prêmios que visam a plantação de 5 mil a 750 mil árvores.</html> ");

        javax.swing.GroupLayout jPanelHistoriaLayout = new javax.swing.GroupLayout(jPanelHistoria);
        jPanelHistoria.setLayout(jPanelHistoriaLayout);
        jPanelHistoriaLayout.setHorizontalGroup(
            jPanelHistoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHistoriaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelHistoria, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanelHistoriaLayout.setVerticalGroup(
            jPanelHistoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHistoriaLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabelHistoria, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("História", jPanelHistoria);

        jLabelRegras.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelRegras.setText("<html>O jogo fornece os seguintes benefícios ao participante: <br/> <ul> <li>O direito de parar o jogo na hora que achar conveniente</li> <li>O direito de pedir ajuda a um grupo de quatro universitários</li> <li>O direito de pular a atual questão</li> <li>O direito de eliminar uma ou duas alternativas (por duas vezes) da atual questão</li> </ul> Se o usuário resolver parar o jogo, ele conquista todo o prêmio adquirido até aqui.<br/> Se o usuário errar a questão, ele conquista o prêmio equivalente a duas fases anteriores.<br/> </html>");

        javax.swing.GroupLayout jPanelRegrasLayout = new javax.swing.GroupLayout(jPanelRegras);
        jPanelRegras.setLayout(jPanelRegrasLayout);
        jPanelRegrasLayout.setHorizontalGroup(
            jPanelRegrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegrasLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabelRegras, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanelRegrasLayout.setVerticalGroup(
            jPanelRegrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegrasLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabelRegras, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        jTabbedPane1.addTab("Regras", jPanelRegras);

        jPanelEliminarAlternativa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelImg1EliminarAlternativas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/tuto_eliminar_alternativa2.jpg"))); // NOI18N
        jPanelEliminarAlternativa.add(jLabelImg1EliminarAlternativas, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        jLabelImg2EliminarAlternativas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/tuto_eliminar_alternativa3.jpg"))); // NOI18N
        jPanelEliminarAlternativa.add(jLabelImg2EliminarAlternativas, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 400, 230));

        jLabelEliminarAlternativa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEliminarAlternativa.setText("<html>Clicando na opção eliminar alternativas haverá a remoção <br />\nde uma ou duas alternativas incorretas.<br /> <br />\nO numero entre parenteses no <br />\nbotão indica a quantidade de <br />\nvezes que o jogador ainda pode usar a opção.</html>");
        jPanelEliminarAlternativa.add(jLabelEliminarAlternativa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 92, 290, 210));

        jTabbedPane1.addTab("Eliminar Alternativa", jPanelEliminarAlternativa);

        jPanelPularQuestao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelImgPularQuestao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/tuto_pular_questao.jpg"))); // NOI18N
        jPanelPularQuestao.add(jLabelImgPularQuestao, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 415, 220));

        jLabelPularQuestao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPularQuestao.setText("<html>\nClicando na opção pular pergunta,  uma nova pergunta é gerada, pulando a atual questão. \n<br /> <br />O número entre parênteses mostra quantas vezes o jogador ainda pode usar essa opção.\n</html>");
        jPanelPularQuestao.add(jLabelPularQuestao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 92, 310, 270));

        jTabbedPane1.addTab("Pular Questão", jPanelPularQuestao);

        jLabelImg1AjudaUniversitarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/tuto_ajuda_universitarios_1.jpg"))); // NOI18N

        jLabelImg2AjudaUniversitarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/tuto_ajuda_universitarios_2.jpg"))); // NOI18N

        jLabelAjudaUniversitarios.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelAjudaUniversitarios.setText("<html>Clicando na opção pedir ajuda<br/> é aberta uma tela que mostra a opinião de quatro alunos universitários sobre qual<br /> é a alternativa correta. \n<br/> <br/>O número entre parênteses mostra quantas vezes o jogador ainda pode usar essa opção.\n<br/> <br/>A letra dentro do balãozinho mostra qual é a resposta correta segundo a opinião<br/> do universitário.\n</html>\n");

        javax.swing.GroupLayout jPanelAjudaUniversitariosLayout = new javax.swing.GroupLayout(jPanelAjudaUniversitarios);
        jPanelAjudaUniversitarios.setLayout(jPanelAjudaUniversitariosLayout);
        jPanelAjudaUniversitariosLayout.setHorizontalGroup(
            jPanelAjudaUniversitariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAjudaUniversitariosLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabelAjudaUniversitarios, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanelAjudaUniversitariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelImg1AjudaUniversitarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelImg2AjudaUniversitarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelAjudaUniversitariosLayout.setVerticalGroup(
            jPanelAjudaUniversitariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAjudaUniversitariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImg1AjudaUniversitarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelImg2AjudaUniversitarios, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelAjudaUniversitariosLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabelAjudaUniversitarios, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pedir Ajuda aos Universitários", jPanelAjudaUniversitarios);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 800, -1));

        pack();
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
            java.util.logging.Logger.getLogger(TelaInstrucoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInstrucoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInstrucoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInstrucoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInstrucoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelAjudaUniversitarios;
    private javax.swing.JLabel jLabelEliminarAlternativa;
    private javax.swing.JLabel jLabelHistoria;
    private javax.swing.JLabel jLabelImg1AjudaUniversitarios;
    private javax.swing.JLabel jLabelImg1EliminarAlternativas;
    private javax.swing.JLabel jLabelImg2AjudaUniversitarios;
    private javax.swing.JLabel jLabelImg2EliminarAlternativas;
    private javax.swing.JLabel jLabelImgPularQuestao;
    private javax.swing.JLabel jLabelPularQuestao;
    private javax.swing.JLabel jLabelRegras;
    private javax.swing.JPanel jPanelAjudaUniversitarios;
    private javax.swing.JPanel jPanelEliminarAlternativa;
    private javax.swing.JPanel jPanelHistoria;
    private javax.swing.JPanel jPanelPularQuestao;
    private javax.swing.JPanel jPanelRegras;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
