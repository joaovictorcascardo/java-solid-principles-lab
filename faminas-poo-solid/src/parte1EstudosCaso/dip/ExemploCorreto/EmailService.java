package ExemploCorreto;

public class EmailService implements Mensageiro {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando E-MAIL: " + mensagem);
    }
}