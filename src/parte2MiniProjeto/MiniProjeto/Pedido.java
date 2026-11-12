package MiniProjeto;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Produto> produtos = new ArrayList<>();

    // Dependências (DIP applied: dependemos de abstrações)
    private RegraDeDesconto descontoService;
    private ServicoPagamento pagamentoService;
    private ServicoNotificacao notificacaoService;

    public Pedido(RegraDeDesconto desconto, ServicoPagamento pagamento, ServicoNotificacao notificacao) {
        this.descontoService = desconto;
        this.pagamentoService = pagamento;
        this.notificacaoService = notificacao;
    }

    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    public void processarPedido(String cliente) {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getPreco();
        }

        // Aplica desconto (OCP)
        double desconto = descontoService.calcular(total);
        double valorFinal = total - desconto;

        System.out.println("--- PEDIDO FINALIZADO ---");
        System.out.println("Cliente: " + cliente);
        System.out.println("Total Bruto: R$ " + total);
        System.out.println("Desconto Aplicado: R$ " + desconto);
        System.out.println("Valor a Pagar: R$ " + valorFinal);

        // Processa pagamento (OCP/LSP)
        pagamentoService.pagar(valorFinal);

        // Envia notificação (SRP/DIP)
        notificacaoService.enviar("Seu pedido foi processado com sucesso!", cliente);
    }
}