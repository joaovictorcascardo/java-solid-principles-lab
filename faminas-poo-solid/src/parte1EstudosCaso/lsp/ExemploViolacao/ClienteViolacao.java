package ExemploViolacao;

public class ClienteViolacao {
    public static void processar(PagamentoBase pagamento) {
        // O método recebe a classe PAI (PagamentoBase).
        double total = pagamento.getTotalComTaxa(); 
        System.out.println("Total a pagar: R$ " + total);
        System.out.println("-------------------------------");
    }
    public static void main(String[] args) {
        System.out.println("=== Iniciando Sistema de Pagamentos ===\n");
        processar(new PagamentoCartao(100.00)); 
        // Esse funciona porque implementou calcularTaxa retornando um número.
        processar(new PagamentoDinheiro(100.00)); 
        // A aplicação vai parar aqui com uma RuntimeException.
    }
}