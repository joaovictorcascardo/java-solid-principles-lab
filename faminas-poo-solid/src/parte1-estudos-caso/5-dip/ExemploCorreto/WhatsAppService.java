package ExemploCorreto;

public class WhatsAppService implements Mensageiro {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando Whatsapp: " + mensagem);
    }
}