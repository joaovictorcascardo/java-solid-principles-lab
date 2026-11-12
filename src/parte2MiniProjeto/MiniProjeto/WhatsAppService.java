package MiniProjeto;

public class WhatsAppService implements ServicoNotificacao {
    @Override
    public void enviar(String mensagem, String destinatario) {
        System.out.println("Enviando ZAP para (" + destinatario + "): " + mensagem);
    }
}