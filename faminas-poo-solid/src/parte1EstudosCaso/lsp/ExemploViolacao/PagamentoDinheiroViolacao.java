package ExemploViolacao;

public class PagamentoDinheiroViolacao extends PagamentoBase {
    public PagamentoDinheiroViolacao(double valor) {
        super(valor);
    }

    @Override
    public double getTaxaDeJuros() {
        // ERRO: Lançar exceção ou retornar algo inesperado
        // quebra a suposição do cliente que espera um número double.
        throw new UnsupportedOperationException("Dinheiro não tem taxa de juros!");
    }
}