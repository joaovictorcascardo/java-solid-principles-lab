package ExemploCorreto;

// Interface apenas para a responsabilidade de registro/log.
public interface ServicoDeLog {
    void logarEntrega(String destinatario, boolean sucesso);
}