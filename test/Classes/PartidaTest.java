package Classes;

import org.junit.Test;
import static org.junit.Assert.*;

public class PartidaTest {
    
    @Test
    public void testCriaPergunta() {
        Partida P1 = new Partida();
        P1.criaPergunta(0, "O que gerou o ápice da degradação ambiental ?", "Periódo pós-revolução industrial", "Período pós-segunda guerra", "Período pós-primeira guerra", "Período pós-guerra fria", "A");
        assertEquals(P1.getPerguntas(0), "O que gerou o ápice da degradação ambiental ?");
    }
    
    @Test
    public void testPreenchePerguntas() {
        Partida P1 = new Partida();
        assertEquals(P1.getFases(0), "5 Mil");
    }
    
    @Test
    public void testGetPerguntas() {
        Partida P1 = new Partida();
        P1.criaPergunta(0, "O que gerou o ápice da degradação ambiental ?", "Periódo pós-revolução industrial", "Período pós-segunda guerra", "Período pós-primeira guerra", "Período pós-guerra fria", "A");
        assertEquals(P1.getPerguntas(0), "O que gerou o ápice da degradação ambiental ?");
    }
    
    @Test
    public void testSetPerguntas() {
        Partida P1 = new Partida();
        P1.criaPergunta(0, "O que gerou o ápice da degradação ambiental ?", "Periódo pós-revolução industrial", "Período pós-segunda guerra", "Período pós-primeira guerra", "Período pós-guerra fria", "A");
        P1.setPerguntas(0, "Qual desses eventos gerou o ápice da degradação ambiental ?");
        assertEquals(P1.getPerguntas(0), "Qual desses eventos gerou o ápice da degradação ambiental ?");
    }
    
    @Test
    public void testGetAlternativas_a() {
        Partida P1 = new Partida();
        P1.criaPergunta(0, "O que gerou o ápice da degradação ambiental ?", "Periódo pós-revolução industrial", "Período pós-segunda guerra", "Período pós-primeira guerra", "Período pós-guerra fria", "A");
        assertEquals(P1.getAlternativas_a(0), "Periódo pós-revolução industrial");
    }
    
    @Test
    public void testSetAlternativas_a() {
        Partida P1 = new Partida();
        P1.criaPergunta(0, "O que gerou o ápice da degradação ambiental ?", "Periódo pós-revolução industrial", "Período pós-segunda guerra", "Período pós-primeira guerra", "Período pós-guerra fria", "A");
        P1.setAlternativas_a(0, "Pós-revolução industrial");
        assertEquals(P1.getAlternativas_a(0),"Pós-revolução industrial");
    }
    
    @Test
    public void testGetAlternativas_b() {
        Partida P1 = new Partida();
        P1.criaPergunta(0, "O que gerou o ápice da degradação ambiental ?", "Periódo pós-revolução industrial", "Período pós-segunda guerra", "Período pós-primeira guerra", "Período pós-guerra fria", "A");
        assertEquals(P1.getAlternativas_b(0), "Período pós-segunda guerra");
    }
    
    @Test
    public void testSetAlternativas_b() {
        Partida P1 = new Partida();
        P1.criaPergunta(0, "O que gerou o ápice da degradação ambiental ?", "Periódo pós-revolução industrial", "Período pós-segunda guerra", "Período pós-primeira guerra", "Período pós-guerra fria", "A");
        P1.setAlternativas_b(0, "Pós-segunda guerra");
        assertEquals(P1.getAlternativas_b(0),"Pós-segunda guerra");
    }
    
    @Test
    public void testGetAlternativas_c() {
        Partida P1 = new Partida();
        P1.criaPergunta(0, "O que gerou o ápice da degradação ambiental ?", "Periódo pós-revolução industrial", "Período pós-segunda guerra", "Período pós-primeira guerra", "Período pós-guerra fria", "A");
        assertEquals(P1.getAlternativas_c(0), "Período pós-primeira guerra");
    }
    
    @Test
    public void testSetAlternativas_c() {
        Partida P1 = new Partida();
        P1.criaPergunta(0, "O que gerou o ápice da degradação ambiental ?", "Periódo pós-revolução industrial", "Período pós-segunda guerra", "Período pós-primeira guerra", "Período pós-guerra fria", "A");
        P1.setAlternativas_c(0, "Pós-primeira guerra");
        assertEquals(P1.getAlternativas_c(0),"Pós-primeira guerra");
    }
    
    @Test
    public void testGetAlternativas_d() {
        Partida P1 = new Partida();
        P1.criaPergunta(0, "O que gerou o ápice da degradação ambiental ?", "Periódo pós-revolução industrial", "Período pós-segunda guerra", "Período pós-primeira guerra", "Período pós-guerra fria", "A");
        assertEquals(P1.getAlternativas_d(0), "Período pós-guerra fria");
    }
    
    @Test
    public void testSetAlternativas_d() {
        Partida P1 = new Partida();
        P1.criaPergunta(0, "O que gerou o ápice da degradação ambiental ?", "Periódo pós-revolução industrial", "Período pós-segunda guerra", "Período pós-primeira guerra", "Período pós-guerra fria", "A");
        P1.setAlternativas_d(0, "Pós-guerra fria");
        assertEquals(P1.getAlternativas_d(0),"Pós-guerra fria");
    }
    
    @Test
    public void testGetRespostas() {
        Partida P1 = new Partida();
        P1.criaPergunta(0, "O que gerou o ápice da degradação ambiental ?", "Periódo pós-revolução industrial", "Período pós-segunda guerra", "Período pós-primeira guerra", "Período pós-guerra fria", "A");
        assertEquals(P1.getRespostas(0), "A");
    }
    
    @Test
    public void testSetRespostas() {
        Partida P1 = new Partida();
        P1.criaPergunta(0, "O que gerou o ápice da degradação ambiental ?", "Periódo pós-revolução industrial", "Período pós-segunda guerra", "Período pós-primeira guerra", "Período pós-guerra fria", "A");
        P1.setRespostas(0, "B");
        assertEquals(P1.getRespostas(0), "B");
    }
    
    @Test
    public void testGetFases() {
        Partida P1 = new Partida();
        P1.preenchePerguntas();
        assertEquals(P1.getFases(0), "5 Mil");
    }
    
    @Test
    public void testSetFases() {
        Partida P1 = new Partida();
        P1.preenchePerguntas();
        P1.setFases(0, "1 Mil");
        assertEquals(P1.getFases(0), "1 Mil");
    }
        
}
