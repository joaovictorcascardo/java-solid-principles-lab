package ExemploViolacao;

public interface ServicoDeNotificacao {
    // Funcionalidade 1: Enviar a mensagem
    void enviarMensagem(String mensagem, String destinatario);
    
    // Funcionalidade 2: Logar a entrega
    void logarEntrega(String destinatario, boolean sucesso); 
}