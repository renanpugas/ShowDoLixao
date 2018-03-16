package Classes;

public class Partida {
    
    private String[] perguntas = new String[18];
    private String[] alternativas_a = new String[18];
    private String[] alternativas_b = new String[18];
    private String[] alternativas_c = new String[18];
    private String[] alternativas_d = new String[18];
    private String[] respostas = new String[18];
    private String[] fases = new String[9];
         

    public Partida() {
        preenchePerguntas();
    }
    
    
    public void criaPergunta(int index, String pergunta, String alt_a, String alt_b, String alt_c, String alt_d, String resp ) {
        setPerguntas(index, pergunta);
        setAlternativas_a(index, alt_a);   
        setAlternativas_b(index, alt_b);
        setAlternativas_c(index, alt_c);
        setAlternativas_d(index, alt_d);
        setRespostas(index, resp);
    }
    
    public void preenchePerguntas()
    {
       criaPergunta(0, "O que gerou o ápice da degradação ambiental ?", "Periódo pós-revolução industrial", "Período pós-segunda guerra", "Período pós-primeira guerra", "Período pós-guerra fria", "A");
       criaPergunta(1, "Qual o impacto da eutrofização?", "Prejuízos ao ar", "Aumento da emissão de gases que causam o efeito estufa", "Diminuição da temperatura local", "Prejuízos ao ecossistema aquático", "D");
       criaPergunta(2, "O que um automóvel libera após seu motor fazer uma combustão completa?", "Monóxido de Carbono", "Óxido de Enxofre ", "Óxido de Nitrogênio ", "Dióxido de Carbono", "D");
       criaPergunta(3, "Qual dos seguintes locais causa o menor impacto ao meio-ambiente ?", "Lixão", "Aterro Controlado", "Aterro Sanitário", "Usina Hidrelétrica", "C");
       criaPergunta(4, "Para qual tipo de lixo se recomenda a incineração?", "Lixo Hospitalar e Tóxico", "Lixo Doméstico", "Lixo Reciclável", "Lixo Eletrônico", "A");
       criaPergunta(5, "Qual o nome do processo que consiste no reaproveitamento de matéria orgânica?", "Eutrofização", "Compostagem", "Reflorestamento", "Fotoquímica", "B");
       criaPergunta(6, "Qual dessas palavras NÃO faz parte dos 5Rs?", "Reciclagem", "Repensar", "Reutilizar", "Re-Compostagem", "D");
       criaPergunta(7, "Qual a % do total de plástico reciclado (por ano) no Brasil ?", "30%", "10%", "17%", "21%", "D");
       criaPergunta(8, "Cada 100 toneladas de plástico economizam quantas toneladas de petróleo?", "1", "3", "5", "10", "A");
       criaPergunta(9, "Quais os tipos de poluição?", "Humana e Industrial", "Hídrica, Atmosférica e do Solo", "Industrial e do Solo", "Atmosférica e do Solo", "B");
       criaPergunta(10, "O que fazer com o lixo eletrônico ?", "Recolher, organizar e armazenar em casa o máximo de tempo que der", "Juntar com plásticos e metais", "Jogar no lixo comum", "Procurar locais específicos para seu descarte", "D");
       criaPergunta(11, "O que são poluentes primários?", "Aqueles formados a partir de uma reação química e fotoquímica", "Aqueles formados a partir de um reação fotoquímica", "Aqueles que são lançados diretamente na atmosfera", "Aqueles formados por uma reação química", "C");
       criaPergunta(12, "O que diferencia um aterro controlado de um lixão?", "Nada", "O fato de seu solo ser revestido com um plástico", "O fato de ser coberto por terra", "O fato de ser privado", "C");
       criaPergunta(13, "Por ano, cada brasileiro gera quantos quilos de lixo em média ?", "383", "282", "181", "13", "A");
       criaPergunta(14, "Qual o número do decreto brasileiro que fala sobre poluição nas águas?", "83.030/73", "93.031/72", "73.030/73", "82.304/92", "C");
       criaPergunta(15, "Quais são os tipos de aterros que existem ?", "Quente e Gelado", "Profundo e Submerso" ,"Seco e Molhado", "Sanitário e Controlado", "D");
       criaPergunta(16, "A compostagem gera: ", "Frutas", "Folhas", "Adubo e combustível", "Árvores", "C");
       criaPergunta(17, "Qual desses materiais NÃO é reciclável?", "Papel Toalha", "Papelão", "Cartolina", "Envelope", "A");
       
       this.setFases(0,"5 Mil");
       this.setFases(1,"10 Mil");
       this.setFases(2,"25 Mil");
       this.setFases(3,"50 Mil");
       this.setFases(4,"100 Mil");
       this.setFases(5,"250 Mil");
       this.setFases(6,"500 Mil");
       this.setFases(7,"750 Mil");
       this.setFases(8,"1 Milhão");
    }
    
    public String getPerguntas(int index) {
        return perguntas[index];    
    }

    public void setPerguntas(int index, String pergunta) {
        perguntas[index] = pergunta;
    }

    public String getAlternativas_a(int index) {
        return alternativas_a[index];
    }

    public void setAlternativas_a(int index, String alternativa_a) {
        alternativas_a[index] = alternativa_a;
    }

    public String getAlternativas_b(int index) {
        return alternativas_b[index];
    }

    public void setAlternativas_b(int index, String alternativa_b) {
        alternativas_b[index] = alternativa_b;
    }

    public String getAlternativas_c(int index) {
        return alternativas_c[index];
    }

    public void setAlternativas_c(int index, String alternativa_c) {
        alternativas_c[index] = alternativa_c;
    }

    public String getAlternativas_d(int index) {
        return alternativas_d[index];
    }

    public void setAlternativas_d(int index, String alternativa_d) {
        alternativas_d[index] = alternativa_d;
    }

    public String getRespostas(int index) {
        return respostas[index];
    }

    public void setRespostas(int index, String resposta) {
        respostas[index] = resposta;
    }

    public String getFases(int index) {
        return fases[index];
    }

    public void setFases(int index, String fase) {
        fases[index] = fase;
    }
    
    
    
}
