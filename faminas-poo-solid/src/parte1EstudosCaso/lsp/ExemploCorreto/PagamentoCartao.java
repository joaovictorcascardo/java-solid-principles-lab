package ExemploViolacao;

public class PagamentoCartao extends PagamentoBase {
    public PagamentoCartao(double valor) {
        super(valor);
    }

    @Override
    public double getTaxaDeJuros() {
        return 0.03; // 3% de juros no cartão
    }
}