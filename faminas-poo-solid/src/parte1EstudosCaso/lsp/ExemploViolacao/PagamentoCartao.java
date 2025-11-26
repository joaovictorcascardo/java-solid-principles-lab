package ExemploViolacao;

public class PagamentoCartao extends PagamentoBase{
    public PagamentoCartao(double valor) {
        super(valor);
    }
    @Override
    public double calcularTaxa() {
        return 5.00;
    }
}