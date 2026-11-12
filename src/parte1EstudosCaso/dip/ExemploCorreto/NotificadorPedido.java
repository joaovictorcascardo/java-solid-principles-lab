package ExemploCorreto;

public class NotificadorPedido {
    
    private Mensageiro meioDeComunicacao;

    public NotificadorPedido(Mensageiro meioDeComunicacao) {
        this.meioDeComunicacao = meioDeComunicacao;
    }

    public void notificarCliente(String mensagem) {
        meioDeComunicacao.enviar(mensagem);
    }
}