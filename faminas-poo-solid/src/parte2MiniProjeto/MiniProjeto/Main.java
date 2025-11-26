package MiniProjeto;

public class Main {
    public static void main(String[] args) {
        // 1. Criar produtos
        Produto p1 = new Produto("Teclado Mecânico", 300.00);
        Produto p2 = new Produto("Mouse Gamer", 150.00);

        // 2. Definir regras (Aqui aplicamos a Injeção de Dependência)
        // Podemos trocar facilmente as estratégias sem mudar o código do Pedido
        RegraDeDesconto regraDesconto = new DescontoFimDeAno(); // ou DescontoPadrao
        ServicoPagamento formaPagamento = new PagamentoPix(); // ou PagamentoCartao
        ServicoNotificacao meioNotificacao = new WhatsAppService(); // ou EmailService

        // 3. Criar e processar o pedido
        Pedido pedido = new Pedido(regraDesconto, formaPagamento, meioNotificacao);
        pedido.adicionarProduto(p1);
        pedido.adicionarProduto(p2);

        pedido.processarPedido("João Victor");
    }
}