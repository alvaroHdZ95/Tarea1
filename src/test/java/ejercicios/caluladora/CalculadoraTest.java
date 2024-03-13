package ejercicios.caluladora;

import ejercicios.calculadora.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    private Calculadora c;

    @BeforeEach
    public void beforeEach(){
        this.c = new Calculadora();
    }

    @Test
    @DisplayName("Constructor No Nulo")
    public void testInit(){
        assertNotNull(c);
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0, 1, 1",
            "1, 2, 3",
            "49, 51, 100",
            "1, 100, 101"
    })
    @DisplayName("Test parametrizado de sumas vía CSV")
    public void testSuma(Integer a, Integer b, Integer r){
        assertEquals(r,c.suma(a,b));
    }

    @Test
    @DisplayName("Test Multiplicación")
    public void testMulti(){
        assertEquals(2,c.multi(1,2));
    }

    @Test
    @DisplayName("Test División")
    public void testDiv(){
        assertEquals(2,c.div(2,1));
    }

    @Test
    @DisplayName("Test Potencia")
    public void testPow(){
        assertEquals(32,c.pow(2, 5));
    }
}
