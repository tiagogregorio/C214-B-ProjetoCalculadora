import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void testSoma() {
        Calculadora c = new Calculadora(2, 8);
        assertEquals(10, c.soma(), 0.001);
    }

    @Test
    public void testSubtracao() {
        Calculadora c = new Calculadora(10, 4);
        assertEquals(6, c.subtracao(), 0.001);
    }

    @Test
    public void testMultiplicacao() {
        Calculadora c = new Calculadora(3, 5);
        assertEquals(15, c.multiplicacao(), 0.001);
    }

    @Test
    public void testDivisao() {
        Calculadora c = new Calculadora(20, 4);
        assertEquals(5, c.divisao(), 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisaoPorZero() {
        Calculadora c = new Calculadora(20, 0);
        c.divisao();
    }

    @Test
    public void testPotencia() {
        Calculadora c = new Calculadora(2, 3);
        assertEquals(8, c.potencia(), 0.001);
    }

    @Test
    public void testRaizQuadrada() {
        Calculadora c = new Calculadora(9, 16);
        assertEquals(3, c.raizQuadradaA(), 0.001);
        assertEquals(4, c.raizQuadradaB(), 0.001);
    }

    @Test
    public void testPorcentagem() {
        Calculadora c = new Calculadora(200, 10);
        assertEquals(20, c.porcentagem(), 0.001);
    }

    @Test
    public void testFatorial() {
        Calculadora c = new Calculadora(5, 3);
        assertEquals(120, c.fatorialA());
        assertEquals(6, c.fatorialB());
    }
}
