package ExemploViolacao;

public class RelatorioViolacao {
    public void gerarRelatorio() {
        System.out.println("Gerando dados do relatório...");
    }

    // VIOLAÇÃO: A classe de relatório não deveria saber como enviar e-mail.
    // Se a forma de envio mudar, essa classe precisa ser alterada.
    public void enviarPorEmail() {
        System.out.println("Enviando relatório por e-mail...");
    }
}