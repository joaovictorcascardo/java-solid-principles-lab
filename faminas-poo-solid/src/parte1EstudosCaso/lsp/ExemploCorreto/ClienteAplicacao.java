package ExemploCorreto;

public class ClienteViolacao {
    public static void processar(PagamentoBase pagamento) {
        double total = pagamento.calcularTotal(); 
        System.out.println("Processando " + pagamento.getClass().getSimpleName() + "...");
        System.out.println("Total a pagar: R$ " + total);
    }

    public static void main(String[] args) {
        processar(new PagamentoCartao(100.00)); // Funciona
        processar(new PagamentoDinheiroCorreto(100.00)); // Quebra a aplicação!
    }
}