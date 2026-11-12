package MiniProjeto;

public class PagamentoCartao implements ServicoPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado via CARTÃO DE CRÉDITO.");
    }
}