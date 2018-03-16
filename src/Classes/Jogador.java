package Classes;

public class Jogador {

    private String nome;
    private int qntd_pular ;
    private int qntd_eliminar_alternativa;
    private int qntd_ajuda_universitarios;
    private int fase_atual; // guarda o nº da atual fase em que o jogador está
    
    public Jogador () {
        qntd_pular = 1;
        qntd_eliminar_alternativa = 2;
        qntd_ajuda_universitarios = 1;
        fase_atual = 0;
    }
    
    public String getNome() {
        return nome;
    }
   
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQntd_pular() {
        return qntd_pular;
    }

    public void setQntd_pular(int qntd_pular) {
        this.qntd_pular = qntd_pular;
    }

    public int getQntd_eliminar_alternativa() {
        return qntd_eliminar_alternativa;
    }

    public void setQntd_eliminar_alternativa(int qntd_eliminar_alternativa) {
        this.qntd_eliminar_alternativa = qntd_eliminar_alternativa;
    }

    public int getFase_atual() {
        return fase_atual;
    }

    public void setFase_atual(int fase_atual) {
        this.fase_atual = fase_atual;
    }
    
    public void reset() {
        qntd_pular = 1;
        qntd_eliminar_alternativa = 2;
        qntd_ajuda_universitarios = 1;
        fase_atual = 0;
    }

    public int getQntd_ajuda_universitarios() {
        return qntd_ajuda_universitarios;
    }

    public void setQntd_ajuda_universitarios(int qntd_ajuda_universitarios) {
        this.qntd_ajuda_universitarios = qntd_ajuda_universitarios;
    }
    

}
