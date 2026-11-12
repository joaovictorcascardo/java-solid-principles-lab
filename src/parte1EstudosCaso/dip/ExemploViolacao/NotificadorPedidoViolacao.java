package ExemploViolacao;

public class NotificadorPedidoViolacao {
    private GmailService email = new GmailService();
    // A classe de Notificações está amarrada ao serviço de g-mail
    // Se quiser trocar para outro serviço de noficações quebrará classe.
    
    public void avisarCliente(String msg) {
        System.out.println("Preparando notificação...");
        email.enviarEmail(msg);
    }
}