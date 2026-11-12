// Conteúdo de SMSServiceViolacao.java
public class SMSServiceViolacao implements ServicoDeNotificacao {
    
    @Override
    public void enviarMensagem(String mensagem, String destinatario) {
        // Implementação necessária
    }

    @Override
    public void logarEntrega(String destinatario, boolean sucesso) {
        // <<<<< PONTO DA VIOLAÇÃO ISP >>>>>
        // Implementação forçada e inútil para o SMS Service.
        System.out.println("AVISO: Log de entrega não é suportado pelo serviço de SMS.");
    }
}