public class Calculadora {
    private double a, b;

    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Operações básicas
    public double soma() {
        return this.a + this.b;
    }

    public double subtracao() {
        return this.a - this.b;
    }

    public double multiplicacao() {
        return this.a * this.b;
    }

    public double divisao() {
        if (this.b == 0) {
            throw new ArithmeticException("Divisão por zero não permitida!");
        }
        return this.a / this.b;
    }

    // Operações avançadas
    public double potencia() {
        return Math.pow(this.a, this.b);
    }

    public double raizQuadradaA() {
        if (this.a < 0) throw new ArithmeticException("Raiz de número negativo!");
        return Math.sqrt(this.a);
    }

    public double raizQuadradaB() {
        if (this.b < 0) throw new ArithmeticException("Raiz de número negativo!");
        return Math.sqrt(this.b);
    }

    public double porcentagem() {
        return (this.a * this.b) / 100.0;
    }

    public long fatorialA() {
        if (this.a < 0) throw new ArithmeticException("Fatorial não definido para negativos!");
        return fatorial((int)this.a);
    }

    public long fatorialB() {
        if (this.b < 0) throw new ArithmeticException("Fatorial não definido para negativos!");
        return fatorial((int)this.b);
    }

    private long fatorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * fatorial(n - 1);
    }

    public double logBase() {
        if (this.a <= 0) throw new ArithmeticException("Logaritmo não definido para números <= 0!");
        if (this.b <= 0 || this.b == 1) throw new ArithmeticException("Base do logaritmo deve ser positiva e diferente de 1!");
        return Math.log(this.a) / Math.log(this.b);
    }
}
