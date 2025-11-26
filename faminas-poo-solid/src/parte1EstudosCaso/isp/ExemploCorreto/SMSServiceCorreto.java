package ExemploCorreto;

// O SMS Service implementa APENAS o que lhe é relevante (o envio).
public class SMSApenasServiceCorreto implements ServicoDeMensagemCorreto {
    @Override
    public void enviarMensagem(String mensagem, String destinatario) {
        System.out.println("SMS enviado para: " + destinatario + " | Mensagem: " + mensagem);
    }
}