import org.example.Calculadora;
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
    public void testSubtracaoNegativo() {
        Calculadora c = new Calculadora(3, 7);
        assertEquals(-4, c.subtracao(), 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void testPotenciaExpoenteNegativo() {
        Calculadora c = new Calculadora(2, -3);
        c.potencia(); // deve lançar exceção, caso não implemente potências fracionárias
    }

    @Test
    public void testMultiplicacao() {
        Calculadora c = new Calculadora(3, 5);
        assertEquals(15, c.multiplicacao(), 0.001);
    }

    @Test
    public void testMultiplicacaoPorZero() {
        Calculadora c = new Calculadora(9, 0);
        assertEquals(0, c.multiplicacao(), 0.001);
    }

    @Test
    public void testDivisao() {
        Calculadora c = new Calculadora(20, 4);
        assertEquals(5, c.divisao(), 0.001);
    }

    @Test
    public void testDivisaoDecimal() {
        Calculadora c = new Calculadora(7, 2);
        assertEquals(3.5, c.divisao(), 0.001);
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
    public void testPotenciaExpoenteZero() {
        Calculadora c = new Calculadora(5, 0);
        assertEquals(1, c.potencia(), 0.001);
    }

    @Test
    public void testRaizQuadrada() {
        Calculadora c = new Calculadora(9, 16);
        assertEquals(3, c.raizQuadradaA(), 0.001);
        assertEquals(4, c.raizQuadradaB(), 0.001);
    }
    @Test
    public void testRaizQuadradaZero() {
        Calculadora c = new Calculadora(0, 0);
        assertEquals(0, c.raizQuadradaA(), 0.001);
        assertEquals(0, c.raizQuadradaB(), 0.001);
    }
    @Test(expected = ArithmeticException.class)
    public void testRaizQuadradaNegativo() {
        Calculadora c = new Calculadora(-9, 4);
        c.raizQuadradaA();
    }

    @Test
    public void testPorcentagem() {
        Calculadora c = new Calculadora(200, 10);
        assertEquals(20, c.porcentagem(), 0.001);
    }
    @Test
    public void testPorcentagemCem() {
        Calculadora c = new Calculadora(250, 100);
        assertEquals(250, c.porcentagem(), 0.001);
    }

    @Test
    public void testFatorial() {
        Calculadora c = new Calculadora(5, 3);
        assertEquals(120, c.fatorialA());
        assertEquals(6, c.fatorialB());
    }
    @Test
    public void testFatorialZero() {
        Calculadora c = new Calculadora(0, 0);
        assertEquals(1, c.fatorialA());
        assertEquals(1, c.fatorialB());

    }

    @Test(expected = ArithmeticException.class)
    public void testFatorialNegativo() {
        Calculadora c = new Calculadora(-5, 0);
        c.fatorialA();
    }

    @Test
    public void testLogBase2De8() {
        Calculadora c = new Calculadora(8, 2);
        assertEquals(3, c.logBase(), 0.001); // log2(8) = 3
    }

    @Test
    public void testLogBase10De1000() {
        Calculadora c = new Calculadora(1000, 10);
        assertEquals(3, c.logBase(), 0.001); // log10(1000) = 3
    }

    @Test
    public void testLogDeUm() {
        Calculadora c = new Calculadora(1, 10);
        assertEquals(0, c.logBase(), 0.001); // log10(1) = 0
    }

    @Test(expected = ArithmeticException.class)
    public void testLogComBaseUm() {
        Calculadora c = new Calculadora(10, 1);
        c.logBase();
    }

    @Test(expected = ArithmeticException.class)
    public void testLogComBaseNegativa() {
        Calculadora c = new Calculadora(10, -2);
        c.logBase();
    }
}
