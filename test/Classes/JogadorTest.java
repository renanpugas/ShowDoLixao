package Classes;

import org.junit.Test;
import static org.junit.Assert.*;

public class JogadorTest {
    
    @Test
    public void testGetNome() {
        Jogador J1 = new Jogador();
        J1.setNome("Renan");
        assertEquals(J1.getNome(), "Renan");
    }
    
    @Test
    public void testSetNome() {
        Jogador J1 = new Jogador();
        J1.setNome("Renan");
        assertEquals(J1.getNome(), "Renan");
    }
    
    @Test
    public void testeGetQntd_pular() {
        Jogador J1 = new Jogador();
        assertEquals(J1.getQntd_pular(), 1);
    }
    
    @Test
    public void testeSetQntd_pular() {
        Jogador J1 = new Jogador();
        J1.setQntd_pular(2);
        assertEquals(J1.getQntd_pular(), 2);
    }
    
    @Test
    public void testeGetQntd_eliminar_alternativa() {
        Jogador J1 = new Jogador();
        assertEquals(J1.getQntd_eliminar_alternativa(), 2);
    }
    
    @Test
    public void testeSetQntd_eliminar_alternativa() {
        Jogador J1 = new Jogador();
        J1.setQntd_eliminar_alternativa(1);
        assertEquals(J1.getQntd_eliminar_alternativa(), 1);
    }
    
    @Test
    public void testeGetFase_atual() {
        Jogador J1 = new Jogador();
        assertEquals(J1.getFase_atual(), 0);
    }
    
    @Test
    public void testeSetFase_atual() {
        Jogador J1 = new Jogador();
        J1.setFase_atual(1);
        assertEquals(J1.getFase_atual(), 1);
    }
    
    @Test
    public void testeGetQntd_ajuda_universitarios() {
        Jogador J1 = new Jogador();
        assertEquals(J1.getQntd_ajuda_universitarios(), 1);
    }
    
    @Test
    public void testeSetQntd_ajuda_universitarios() {
        Jogador J1 = new Jogador();
        J1.setQntd_ajuda_universitarios(2);
        assertEquals(J1.getQntd_ajuda_universitarios(), 2);
    }
     
}
