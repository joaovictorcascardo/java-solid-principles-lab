public class SMSApenasServiceCorreto implements ServicoDeMensagemCorreto {
    
    @Override
    public void enviarMensagem(String mensagem, String destinatario) {
        System.out.println("SMS enviado para: " + destinatario);
    }
    
    // <<<<< PONTO DA CORREÇÃO ISP >>>>>
    // Não é mais forçado a implementar 'logarEntrega'.
    // A classe é limpa e coesa.
}