package ExemploViolacao;

public class SMSServiceViolacao implements ServicoDeNotificacao {
    @Override
    public void enviarMensagem(String mensagem, String destinatario) {
        System.out.println("SMS enviado para: " + destinatario + " | Mensagem: " + mensagem);
    }

    @Override
    public void logarEntrega(String destinatario, boolean sucesso) {
        // Implementação inútil para o SMS Service.
        // Isso introduz código desnecessário e potencial risco de erro.
        System.out.println("AVISO: Log de entrega não é suportado pelo serviço de SMS (Método Inútil).");
    }
}