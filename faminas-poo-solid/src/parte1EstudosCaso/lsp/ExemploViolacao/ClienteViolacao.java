package ExemploViolacao;

public class ClienteViolacao {
    public static void processar(PagamentoBase pagamento) {
        try {
            double total = pagamento.calcularTotal(); 
            System.out.println("Total a pagar: R$ " + total);
        } catch (UnsupportedOperationException e) {
            System.out.println("ERRO LSP: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        processar(new PagamentoCartao(100.00)); // Funciona
        processar(new PagamentoDinheiroViolacao(100.00)); // Quebra a aplicação
    }
}