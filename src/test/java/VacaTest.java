import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class VacaTest {
    @Test
    void deveRetornarPrecoNelore(){
        Vaca vaca = new Nelore(100f);
        assertEquals(100f,vaca.getPreco());
    }
    @Test
    void deveRetornarPrecoGorda(){
        Vaca vaca = new Gorda(new Nelore(100f));
        assertEquals(150f,vaca.getPreco());
    }

    @Test
    void deveRetornarPrecoGordaTetuda(){
        Vaca vaca = new PremioTetuda(new Gorda(new Nelore(100f)));
        assertEquals(195f,vaca.getPreco());
    }
    @Test
    void deveRetornarPrecoClassicaTetuda(){
        Vaca vaca = new PremioTetuda(new OuvirMusicaClassica(new Nelore(100f)));
        assertEquals(260f,vaca.getPreco());
    }

    @Test
    void deveRetornarPrecoClassicaGorda(){
        Vaca vaca = new Gorda(new OuvirMusicaClassica(new Nelore(100f)));
        assertEquals(300f,vaca.getPreco());
    }
    @Test
    void deveRetornarPrecoClassicaGordaTetudaOuvidndo()
    {
        Vaca vaca = new Gorda(new PremioTetuda(new OuvirMusicaClassica(new Nelore(100f))));
        assertEquals(390f,vaca.getPreco());
    }
}
