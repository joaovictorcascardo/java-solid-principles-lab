package ExemploViolacao;

public abstract class PagamentoBase {
    protected double valor;
    
    public PagamentoBase(double valor) {
        this.valor = valor;
    }
    // A promessa: toda subclasse deve ter uma taxa
    public abstract double calcularTaxa();

    public double getTotalComTaxa() {
        return valor + calcularTaxa();
    }
}