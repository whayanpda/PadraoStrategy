import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class teststrategy {

    private Jogo jogo;

    @BeforeEach
    public void setUp() {
        jogo = new Jogo();
    }

    @Test
    public void testJogoComEstrategiaFacil() {
        assertTrue(jogo.jogarStrategy instanceof FacilStrategy);


        jogo.jogar();
    }

    @Test
    public void testMudancaParaEstrategiaMedia() {

        jogo.setJogarStrategy(new MedioStrategy());


        assertTrue(jogo.jogarStrategy instanceof MedioStrategy);


        jogo.jogar();
    }

    @Test
    public void testMudancaParaEstrategiaDificil() {

        jogo.setJogarStrategy(new DificilStrategy());


        assertTrue(jogo.jogarStrategy instanceof DificilStrategy);


        jogo.jogar();
    }

    @Test
    public void testAlternanciaEntreEstrategias() {

        jogo.setJogarStrategy(new MedioStrategy());
        assertTrue(jogo.jogarStrategy instanceof MedioStrategy);
        jogo.jogar();

        jogo.setJogarStrategy(new DificilStrategy());
        assertTrue(jogo.jogarStrategy instanceof DificilStrategy);
        jogo.jogar();

        jogo.setJogarStrategy(new FacilStrategy());
        assertTrue(jogo.jogarStrategy instanceof FacilStrategy);
        jogo.jogar();
    }
}
