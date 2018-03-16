package Visao;

import Classes.Jogador;
import Classes.Partida;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class TelaPrincipal extends javax.swing.JFrame {

    Partida Partida1 = new Partida();
    static Jogador P1 = new Jogador();
    TelaAjudaUniversitarios envia;
    static TelaInicial TP;
    //ArrayList para guardar os numeros que serão sorteados para gerar perguntas aleatórias
    private static ArrayList<Integer> nuns_sorteio = new ArrayList<>();
    
    //Classes e variáveis usadas para o funcionamento do Timer
    private int secondsPassed = 30;
    private Timer myTimer = new Timer();
    private TimerTask task = new TimerTask() {
    
        @Override
        public void run() {
            if(secondsPassed > 0) {
                //se o usuario responder a pergunta o cronometro para
                if("-".equals(jLabelTempo.getText())) {
                }                
                else {
                secondsPassed--;
                jLabelTempo.setText(Integer.toString(secondsPassed));
                }

            }
            else{
                jLabelTempo.setText("ESGOTADO!");
                envia.setVisible(false);
                derrota();
                myTimer.cancel();                                       
            }
            }
            
    };
    
    public void start() {
        myTimer.scheduleAtFixedRate(task, 1000, 1000); 
    }
    
    
   
    
    public TelaPrincipal() {
       initComponents();
 
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButtonPularQuestao = new javax.swing.JButton();
        jButtonParar = new javax.swing.JButton();
        jButtonEliminarAlternativa = new javax.swing.JButton();
        jButtonProximaPergunta = new javax.swing.JButton();
        jButtonResposta = new javax.swing.JButton();
        jPanelFases = new javax.swing.JPanel();
        jButton1Milhao = new javax.swing.JButton();
        jButton500Mil = new javax.swing.JButton();
        jButton250Mil = new javax.swing.JButton();
        jButton100Mil = new javax.swing.JButton();
        jButton50Mil = new javax.swing.JButton();
        jButton25Mil = new javax.swing.JButton();
        jButton5Mil = new javax.swing.JButton();
        jButton10Mil = new javax.swing.JButton();
        jButton750Mil = new javax.swing.JButton();
        jButtonAjudaUniversitarios = new javax.swing.JButton();
        jPanelAlternativas = new javax.swing.JPanel();
        jButtonAlternativaA = new javax.swing.JButton();
        jButtonAlternativaB = new javax.swing.JButton();
        jButtonAlternativaC = new javax.swing.JButton();
        jButtonAlternativaD = new javax.swing.JButton();
        jLabelAlternativaA = new javax.swing.JLabel();
        jLabelAlternativaB = new javax.swing.JLabel();
        jLabelAlternativaC = new javax.swing.JLabel();
        jLabelAlternativaD = new javax.swing.JLabel();
        jPanelPergunta = new javax.swing.JPanel();
        jLabelPergunta = new javax.swing.JLabel();
        jPanelTempo = new javax.swing.JPanel();
        jLabelTempo = new javax.swing.JLabel();
        jPanelAcertar = new javax.swing.JPanel();
        jLabelAcertar = new javax.swing.JLabel();
        jPanelParar = new javax.swing.JPanel();
        jLabelParar = new javax.swing.JLabel();
        jPanelErrar = new javax.swing.JPanel();
        jLabelErrar = new javax.swing.JLabel();
        jPanelParticipante = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jButtonPularQuestao.setText("Pular Questão (1)");
        jButtonPularQuestao.setEnabled(false);
        jButtonPularQuestao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPularQuestaoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPularQuestao);
        jButtonPularQuestao.setBounds(560, 290, 160, 30);

        jButtonParar.setText("Parar");
        jButtonParar.setEnabled(false);
        jButtonParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPararActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonParar);
        jButtonParar.setBounds(560, 210, 160, 30);

        jButtonEliminarAlternativa.setText("Eliminar Alternativas (2)");
        jButtonEliminarAlternativa.setEnabled(false);
        jButtonEliminarAlternativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarAlternativaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminarAlternativa);
        jButtonEliminarAlternativa.setBounds(560, 250, 160, 30);

        jButtonProximaPergunta.setText("Próxima Pergunta");
        jButtonProximaPergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximaPerguntaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonProximaPergunta);
        jButtonProximaPergunta.setBounds(560, 170, 160, 30);

        jButtonResposta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonResposta.setName(""); // NOI18N
        jButtonResposta.setVisible(false);
        getContentPane().add(jButtonResposta);
        jButtonResposta.setBounds(600, 380, 70, 30);

        jPanelFases.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FASES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanelFases.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1Milhao.setText("1.000.000");
        jButton1Milhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1MilhaoActionPerformed(evt);
            }
        });
        jPanelFases.add(jButton1Milhao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 120, 23));

        jButton500Mil.setText("500.000");
        jPanelFases.add(jButton500Mil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 80, 23));

        jButton250Mil.setText("250.000");
        jPanelFases.add(jButton250Mil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 80, -1));

        jButton100Mil.setText("100.000");
        jPanelFases.add(jButton100Mil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 80, -1));

        jButton50Mil.setText("50.000");
        jPanelFases.add(jButton50Mil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 80, -1));

        jButton25Mil.setText("25.000");
        jPanelFases.add(jButton25Mil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 80, -1));

        jButton5Mil.setText("5.000");
        jButton5Mil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5MilActionPerformed(evt);
            }
        });
        jPanelFases.add(jButton5Mil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 80, -1));

        jButton10Mil.setText("10.000");
        jPanelFases.add(jButton10Mil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 80, -1));

        jButton750Mil.setText("750.000");
        jPanelFases.add(jButton750Mil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 80, 23));

        getContentPane().add(jPanelFases);
        jPanelFases.setBounds(730, 20, 140, 400);

        jButtonAjudaUniversitarios.setText("Pedir Ajuda (1)");
        jButtonAjudaUniversitarios.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonAjudaUniversitarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonAjudaUniversitarios.setEnabled(false);
        jButtonAjudaUniversitarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjudaUniversitariosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAjudaUniversitarios);
        jButtonAjudaUniversitarios.setBounds(560, 330, 160, 30);

        jPanelAlternativas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAlternativaA.setEnabled(false);
        jButtonAlternativaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlternativaAActionPerformed(evt);
            }
        });
        jPanelAlternativas.add(jButtonAlternativaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 460, 40));

        jButtonAlternativaB.setEnabled(false);
        jButtonAlternativaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlternativaBActionPerformed(evt);
            }
        });
        jPanelAlternativas.add(jButtonAlternativaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 460, 40));

        jButtonAlternativaC.setEnabled(false);
        jButtonAlternativaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlternativaCActionPerformed(evt);
            }
        });
        jPanelAlternativas.add(jButtonAlternativaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 460, 40));

        jButtonAlternativaD.setEnabled(false);
        jButtonAlternativaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlternativaDActionPerformed(evt);
            }
        });
        jPanelAlternativas.add(jButtonAlternativaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 460, 40));

        jLabelAlternativaA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelAlternativaA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imagem_alternativa_a.png"))); // NOI18N
        jPanelAlternativas.add(jLabelAlternativaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabelAlternativaB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelAlternativaB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imagem_alternativa_b.png"))); // NOI18N
        jPanelAlternativas.add(jLabelAlternativaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabelAlternativaC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelAlternativaC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imagem_alternativa_c.png"))); // NOI18N
        jPanelAlternativas.add(jLabelAlternativaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabelAlternativaD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelAlternativaD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imagem_alternativa_d.png"))); // NOI18N
        jPanelAlternativas.add(jLabelAlternativaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        getContentPane().add(jPanelAlternativas);
        jPanelAlternativas.setBounds(20, 160, 520, 230);

        jPanelPergunta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPergunta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPergunta.setText("Pergunta");
        jLabelPergunta.setToolTipText("");
        jPanelPergunta.add(jLabelPergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 670, -1));

        getContentPane().add(jPanelPergunta);
        jPanelPergunta.setBounds(20, 90, 700, 60);

        jPanelTempo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TEMPO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanelTempo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTempo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelTempo.add(jLabelTempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, 40));

        getContentPane().add(jPanelTempo);
        jPanelTempo.setBounds(530, 10, 170, 70);

        jPanelAcertar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acertar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanelAcertar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelAcertar.add(jLabelAcertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, 20));

        getContentPane().add(jPanelAcertar);
        jPanelAcertar.setBounds(40, 10, 90, 50);

        jPanelParar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Parar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanelParar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelParar.add(jLabelParar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, 20));

        getContentPane().add(jPanelParar);
        jPanelParar.setBounds(150, 10, 90, 50);

        jPanelErrar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Errar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanelErrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelErrar.add(jLabelErrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, 20));

        getContentPane().add(jPanelErrar);
        jPanelErrar.setBounds(260, 10, 90, 50);

        jPanelParticipante.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Participante", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanelParticipante.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelParticipante.add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 30));

        getContentPane().add(jPanelParticipante);
        jPanelParticipante.setBounds(380, 10, 110, 50);

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imagem_fundo.jpg"))); // NOI18N
        getContentPane().add(jLabelBackground);
        jLabelBackground.setBounds(-210, -150, 1150, 630);

        setSize(new java.awt.Dimension(895, 480));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPararActionPerformed
       jLabelTempo.setText("-");
       jButtonAlternativaA.setEnabled(false);
       jButtonAlternativaB.setEnabled(false);
       jButtonAlternativaC.setEnabled(false);
       jButtonAlternativaD.setEnabled(false);
       jButtonEliminarAlternativa.setEnabled(false);
       jButtonParar.setEnabled(false);
       jButtonPularQuestao.setEnabled(false);
       jButtonProximaPergunta.setEnabled(false);
       String ganho = Partida1.getFases(P1.getFase_atual() - 1);
       JOptionPane.showMessageDialog(rootPane, "Você plantou " + ganho + " árvores", "Você parou!", JOptionPane.INFORMATION_MESSAGE);
       setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
       int resposta = JOptionPane.showConfirmDialog(null, "Você deseja jogar novamente ?","Jogar novamente ?", JOptionPane.YES_NO_OPTION);
       if (resposta == 0){
           reset();
           TelaInicial TI = new TelaInicial();
           TI.setVisible(true);
           this.dispose();
        } 
       else 
           System.exit(0);
    }//GEN-LAST:event_jButtonPararActionPerformed

    private void jButtonProximaPerguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximaPerguntaActionPerformed
       
       atualizaLabelFases();
        
       Collections.shuffle(nuns_sorteio);
       int num_aleatorio = nuns_sorteio.get(0);
       nuns_sorteio.remove(0);
       
       jButtonAlternativaA.setEnabled(true);
       jButtonAlternativaB.setEnabled(true);
       jButtonAlternativaC.setEnabled(true);
       jButtonAlternativaD.setEnabled(true);
       if(P1.getQntd_eliminar_alternativa() > 0)
        jButtonEliminarAlternativa.setEnabled(true);
       if(P1.getFase_atual() > 0)
        jButtonParar.setEnabled(true);
       if(P1.getQntd_pular() > 0) {
        jButtonPularQuestao.setEnabled(true);
       }     
       if(P1.getQntd_ajuda_universitarios() > 0)
           jButtonAjudaUniversitarios.setEnabled(true);
       jButtonProximaPergunta.setEnabled(false);
       
       jLabelPergunta.setText(Partida1.getPerguntas(num_aleatorio));
       jButtonAlternativaA.setText(Partida1.getAlternativas_a(num_aleatorio));
       jButtonAlternativaB.setText(Partida1.getAlternativas_b(num_aleatorio));
       jButtonAlternativaC.setText(Partida1.getAlternativas_c(num_aleatorio));
       jButtonAlternativaD.setText(Partida1.getAlternativas_d(num_aleatorio));
       
       jButtonResposta.setText(String.valueOf(num_aleatorio));
       
       atualizaBotoesNiveis();
       //se a label do tempo estiver vazia inicia-se o timer
       if("".equals(jLabelTempo.getText())) 
           start(); 
       
       secondsPassed = 30;
       jLabelTempo.setText(Integer.toString(secondsPassed));

    }//GEN-LAST:event_jButtonProximaPerguntaActionPerformed

    private void jButtonAlternativaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlternativaBActionPerformed

        if("B".equals(Partida1.getRespostas(Integer.parseInt(jButtonResposta.getText())))) {
            jLabelTempo.setText("-");
            desabilitaBotoes();
            JOptionPane.showMessageDialog(null, "RESPOSTA CORRETA!");
            atualizaFase();
            
        }
        else {
            jLabelTempo.setText("-");
            JOptionPane.showMessageDialog(null, "RESPOSTA ERRADA! \nA resposta correta é alternativa " + Partida1.getRespostas(Integer.parseInt(jButtonResposta.getText())));
            derrota();           
        }
    }//GEN-LAST:event_jButtonAlternativaBActionPerformed

    private void jButtonAlternativaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlternativaAActionPerformed
        if("A".equals(Partida1.getRespostas(Integer.parseInt(jButtonResposta.getText())))) {
            jLabelTempo.setText("-");
            desabilitaBotoes();
            JOptionPane.showMessageDialog(null, "RESPOSTA CORRETA!");
            atualizaFase();
        }
        else {
            jLabelTempo.setText("-");
            JOptionPane.showMessageDialog(null, "RESPOSTA ERRADA! \nA resposta correta é alternativa " + Partida1.getRespostas(Integer.parseInt(jButtonResposta.getText())));
            derrota();
        }
    }//GEN-LAST:event_jButtonAlternativaAActionPerformed

    private void jButtonAlternativaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlternativaCActionPerformed
        if("C".equals(Partida1.getRespostas(Integer.parseInt(jButtonResposta.getText())))) {
            jLabelTempo.setText("-");
            desabilitaBotoes();
            JOptionPane.showMessageDialog(null, "RESPOSTA CORRETA!");
            atualizaFase();
        }
        else {
            jLabelTempo.setText("-");
            JOptionPane.showMessageDialog(null, "RESPOSTA ERRADA! \nA resposta correta é alternativa " + Partida1.getRespostas(Integer.parseInt(jButtonResposta.getText())));
            derrota();
        }
    }//GEN-LAST:event_jButtonAlternativaCActionPerformed

    private void jButtonAlternativaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlternativaDActionPerformed
        if("D".equals(Partida1.getRespostas(Integer.parseInt(jButtonResposta.getText())))) {
            jLabelTempo.setText("-");
            desabilitaBotoes();
            JOptionPane.showMessageDialog(null, "RESPOSTA CORRETA!");
            atualizaFase();
        }
        else {
            jLabelTempo.setText("-");
            JOptionPane.showMessageDialog(null, "RESPOSTA ERRADA! \nA resposta correta é alternativa " + Partida1.getRespostas(Integer.parseInt(jButtonResposta.getText())));
            derrota();
        }
    }//GEN-LAST:event_jButtonAlternativaDActionPerformed

    private void jButtonEliminarAlternativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarAlternativaActionPerformed

            //P1.EliminarAlternativa();
            P1.setQntd_eliminar_alternativa(P1.getQntd_eliminar_alternativa() - 1);
            
            ArrayList<String> sorteioAlternativas = new ArrayList<>();
            sorteioAlternativas.add("A");
            sorteioAlternativas.add("B");
            sorteioAlternativas.add("C");
            sorteioAlternativas.add("D");
            
            Random R1 = new Random();
            
            //elimina (ou não) a primeira alternativa
            String alternativa_eliminada = sorteioAlternativas.get(R1.nextInt(4));
            if (alternativa_eliminada != Partida1.getRespostas(Integer.parseInt(jButtonResposta.getText()))) {
                if(alternativa_eliminada.equals("A")) {
                    jButtonAlternativaA.setEnabled(false);
                    sorteioAlternativas.remove(alternativa_eliminada);
                }
                if(alternativa_eliminada.equals("B")) {
                    jButtonAlternativaB.setEnabled(false);
                    sorteioAlternativas.remove(alternativa_eliminada);
                }
                if(alternativa_eliminada.equals("C")) {
                    jButtonAlternativaC.setEnabled(false);
                    sorteioAlternativas.remove(alternativa_eliminada);
                }
                if(alternativa_eliminada.equals("D")) {
                    jButtonAlternativaD.setEnabled(false);
                    sorteioAlternativas.remove(alternativa_eliminada);
                }  
            }
            
            //elimina a segunda alternativa
            alternativa_eliminada = sorteioAlternativas.get(R1.nextInt(3));
            if (alternativa_eliminada != Partida1.getRespostas(Integer.parseInt(jButtonResposta.getText()))) {
                if(alternativa_eliminada.equals("A")) {
                    jButtonAlternativaA.setEnabled(false);
                    sorteioAlternativas.remove(alternativa_eliminada);
                }
                if(alternativa_eliminada.equals("B")) {
                    jButtonAlternativaB.setEnabled(false);
                    sorteioAlternativas.remove(alternativa_eliminada);
                }
                if(alternativa_eliminada.equals("C")) {
                    jButtonAlternativaC.setEnabled(false);
                    sorteioAlternativas.remove(alternativa_eliminada);
                }
                if(alternativa_eliminada.equals("D")) {
                    jButtonAlternativaD.setEnabled(false);
                    sorteioAlternativas.remove(alternativa_eliminada);
                }  
            }    
            jButtonEliminarAlternativa.setEnabled(false);
            jButtonEliminarAlternativa.setText("Eliminar Alternativas (" + P1.getQntd_eliminar_alternativa()+ ")");
        
    }//GEN-LAST:event_jButtonEliminarAlternativaActionPerformed

    private void jButton5MilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5MilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MilActionPerformed

    private void jButtonAjudaUniversitariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjudaUniversitariosActionPerformed
        envia = new TelaAjudaUniversitarios();
        envia.setVisible(true);
        envia.recebendo(Partida1.getRespostas(Integer.parseInt(jButtonResposta.getText())));
        P1.setQntd_ajuda_universitarios(P1.getQntd_ajuda_universitarios() - 1);
        jButtonAjudaUniversitarios.setText("Pedir Ajuda (" + P1.getQntd_ajuda_universitarios()+ ")");
        jButtonAjudaUniversitarios.setEnabled(false);
        
        
    }//GEN-LAST:event_jButtonAjudaUniversitariosActionPerformed

    private void jButtonPularQuestaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPularQuestaoActionPerformed
            jButtonProximaPerguntaActionPerformed(evt);
            P1.setQntd_pular(P1.getQntd_pular()- 1);
            jButtonPularQuestao.setText("Pular questão (" + P1.getQntd_pular() + ")");
            jButtonPularQuestao.setEnabled(false);
        
    }//GEN-LAST:event_jButtonPularQuestaoActionPerformed

    private void jButton1MilhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1MilhaoActionPerformed

    }//GEN-LAST:event_jButton1MilhaoActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            //@Override
            public void run() {
            TP = new TelaInicial();
            TP.setVisible(true);
            new TelaPrincipal().setVisible(false);  
            //gera a lista de numeros que podem ser sorteados
            for (int i = 0; i < 18; i++) {
                nuns_sorteio.add(i);
            }        
            //alinha o texto dos botoes
            jButtonAlternativaA.setHorizontalAlignment(SwingConstants.LEFT);
            jButtonAlternativaB.setHorizontalAlignment(SwingConstants.LEFT);
            jButtonAlternativaC.setHorizontalAlignment(SwingConstants.LEFT);
            jButtonAlternativaD.setHorizontalAlignment(SwingConstants.LEFT);
            
            }  
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton100Mil;
    private javax.swing.JButton jButton10Mil;
    private javax.swing.JButton jButton1Milhao;
    private javax.swing.JButton jButton250Mil;
    private javax.swing.JButton jButton25Mil;
    private javax.swing.JButton jButton500Mil;
    private javax.swing.JButton jButton50Mil;
    private javax.swing.JButton jButton5Mil;
    private javax.swing.JButton jButton750Mil;
    private javax.swing.JButton jButtonAjudaUniversitarios;
    private static javax.swing.JButton jButtonAlternativaA;
    private static javax.swing.JButton jButtonAlternativaB;
    private static javax.swing.JButton jButtonAlternativaC;
    private static javax.swing.JButton jButtonAlternativaD;
    private javax.swing.JButton jButtonEliminarAlternativa;
    private javax.swing.JButton jButtonParar;
    private javax.swing.JButton jButtonProximaPergunta;
    private javax.swing.JButton jButtonPularQuestao;
    private javax.swing.JButton jButtonResposta;
    private javax.swing.JLabel jLabelAcertar;
    private javax.swing.JLabel jLabelAlternativaA;
    private javax.swing.JLabel jLabelAlternativaB;
    private javax.swing.JLabel jLabelAlternativaC;
    private javax.swing.JLabel jLabelAlternativaD;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelErrar;
    private static javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelParar;
    private static javax.swing.JLabel jLabelPergunta;
    private javax.swing.JLabel jLabelTempo;
    private javax.swing.JPanel jPanelAcertar;
    private javax.swing.JPanel jPanelAlternativas;
    private javax.swing.JPanel jPanelErrar;
    private javax.swing.JPanel jPanelFases;
    private javax.swing.JPanel jPanelParar;
    private javax.swing.JPanel jPanelParticipante;
    private javax.swing.JPanel jPanelPergunta;
    private javax.swing.JPanel jPanelTempo;
    // End of variables declaration//GEN-END:variables
        

    public void desabilitaBotoes() {
       jButtonAlternativaA.setEnabled(false);
       jButtonAlternativaB.setEnabled(false);
       jButtonAlternativaC.setEnabled(false);
       jButtonAlternativaD.setEnabled(false);
       jButtonEliminarAlternativa.setEnabled(false);
       jButtonParar.setEnabled(false);
       jButtonPularQuestao.setEnabled(false);
       jButtonProximaPergunta.setEnabled(true);
    }
    
    public void atualizaFase() {
        if(P1.getFase_atual() == 8) { 
           JOptionPane.showMessageDialog(null, "PARABÉNS, VOCÊ VENCEU!");
           int resposta = JOptionPane.showConfirmDialog(null, "Você deseja jogar novamente ?","Jogar novamente ?", JOptionPane.YES_NO_OPTION);
            if (resposta == 0){
                reset();
                TelaInicial TI = new TelaInicial();
                TI.setVisible(true);
                this.dispose();
            } 
            else 
                System.exit(0);
        }
            
        else {
        P1.setFase_atual(P1.getFase_atual() + 1);
        }
    }
    
    public void atualizaBotoesNiveis() {
        switch (P1.getFase_atual()) {
            case 0:
                jButton5Mil.setBackground(Color.green);
                break;
            case 1:
                jButton10Mil.setBackground(Color.green);
                break;
            case 2:
                jButton25Mil.setBackground(Color.green);
                break;
            case 3 :
                jButton50Mil.setBackground(Color.green);
                break;
            case 4 :
                jButton100Mil.setBackground(Color.green);
                break;
            case 5 :
                jButton250Mil.setBackground(Color.green);
                break;
            case 6 :
                jButton500Mil.setBackground(Color.green);
                break;
            case 7 :
                jButton750Mil.setBackground(Color.green);
                break;
            case 8 :
                jButton1Milhao.setBackground(Color.green);
                break;
            default:
                break;
        }
        
        if(P1.getFase_atual() - 1 == 0)
            jButton5Mil.setBackground(new java.awt.Color(240,240,240));
        if(P1.getFase_atual() - 1 == 1)
            jButton10Mil.setBackground(new java.awt.Color(240,240,240));
        if(P1.getFase_atual() - 1 == 2)
            jButton25Mil.setBackground(new java.awt.Color(240,240,240));
        if(P1.getFase_atual() - 1 == 3)
            jButton50Mil.setBackground(new java.awt.Color(240,240,240));
        if(P1.getFase_atual() - 1 == 4)
            jButton100Mil.setBackground(new java.awt.Color(240,240,240));
        if(P1.getFase_atual() - 1 == 5)
            jButton250Mil.setBackground(new java.awt.Color(240,240,240));
        if(P1.getFase_atual() - 1 == 6)
            jButton500Mil.setBackground(new java.awt.Color(240,240,240));
        if(P1.getFase_atual() - 1 == 7)
            jButton750Mil.setBackground(new java.awt.Color(240,240,240));
    }
    
    public void escreveNome() {
        P1.setNome(JOptionPane.showInputDialog("Qual o seu nome?"));
        jLabelNome.setText(P1.getNome());
        JOptionPane.showMessageDialog(rootPane, "Para começar o jogo clique no botão próxima pergunta");
    }
    
    public void derrota() {    
       jButtonAlternativaA.setEnabled(false);
       jButtonAlternativaB.setEnabled(false);
       jButtonAlternativaC.setEnabled(false);
       jButtonAlternativaD.setEnabled(false);
       jButtonEliminarAlternativa.setEnabled(false);
       jButtonParar.setEnabled(false);
       jButtonPularQuestao.setEnabled(false);
       jButtonProximaPergunta.setEnabled(false);
       if(P1.getFase_atual() >= 2) 
            JOptionPane.showMessageDialog(rootPane, "Você Perdeu, porém conseguiu plantar " + jLabelErrar.getText() + " árvores!");
       else
            JOptionPane.showMessageDialog(rootPane, "Você Perdeu!");
       setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
       int resposta = JOptionPane.showConfirmDialog(null, "Você deseja jogar novamente ?","Jogar novamente ?",  JOptionPane.YES_NO_OPTION);
       if (resposta == 0){
           reset();
           TelaInicial TI = new TelaInicial();
           TI.setVisible(true);
           this.dispose();
        } 
       else 
           System.exit(0);
        
    }

    public void reset() {
        P1.setQntd_pular(1);
        P1.setQntd_eliminar_alternativa(2);
        P1.setFase_atual(0);
        P1.setQntd_ajuda_universitarios(1);
        nuns_sorteio.clear();
        for (int i = 0; i < 18; i++) {
                nuns_sorteio.add(i);
           }
        
    }

    
    public void atualizaLabelFases() {
        jLabelAcertar.setText(Partida1.getFases(P1.getFase_atual())); 
        
        if(P1.getFase_atual() > 0)
            jLabelParar.setText(Partida1.getFases(P1.getFase_atual() - 1));
        else
            jLabelParar.setText("0");
        
        if(P1.getFase_atual() > 1)
            jLabelErrar.setText(Partida1.getFases(P1.getFase_atual() - 2));
        else
            jLabelErrar.setText("0");
    }
    

    
}
