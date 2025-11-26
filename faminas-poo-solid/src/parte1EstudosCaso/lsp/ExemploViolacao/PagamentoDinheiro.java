package ExemploViolacao;

public class PagamentoDinheiro extends PagamentoBase {
    public PagamentoDinheiro(double valor) {
        super(valor);
    }

    @Override
    public double calcularTaxa() {
        // A classe pai espera um double para somar.
        // Aqui lançamos erro porque "dinheiro não tem taxa".
        throw new RuntimeException("Não existe taxa para dinheiro!");
    }
}