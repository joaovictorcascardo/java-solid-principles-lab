package ExemploViolacao;

public abstract class PagamentoBase {
    protected double valor;

    public PagamentoBase(double valor) {
        this.valor = valor;
    }

    public abstract double getTaxaDeJuros();

    public double calcularTotal() {
        return valor * (1 + getTaxaDeJuros());
    }
}