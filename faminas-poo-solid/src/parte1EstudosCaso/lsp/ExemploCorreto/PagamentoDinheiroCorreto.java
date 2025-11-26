package ExemploCorreto;

public class PagamentoDinheiroCorreto extends PagamentoBase {
    public PagamentoDinheiroCorreto(double valor) {
        super(valor);
    }

    @Override
    public double getTaxaDeJuros() {
        // Implementa o contrato corretamente, retornando o valor esperado (0.0).
        return 0.0; 
    }
}