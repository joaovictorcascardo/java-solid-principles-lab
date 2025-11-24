package MiniProjeto;

public class EmailService implements ServicoNotificacao {
    @Override
    public void enviar(String mensagem, String destinatario) {
        System.out.println("Enviando E-MAIL para [" + destinatario + "]: " + mensagem);
    }
}