package ExemploViolacao;

// Matematicamente correto, mas comportamentalmente errado.
public class QuadradoViolacao extends Retangulo {
    
    // Sobrescreve o comportamento de forma a quebrar o contrato da superclasse.
    @Override
    public void setLargura(int l) {
        super.setLargura(l);
        // PONTO DA VIOLAÇÃO LSP:
        // Ao definir a largura, o quadrado TAMBÉM define a altura,
        // quebrando a expectativa do cliente que usa o Retangulo.
        super.setAltura(l); 
    }

    @Override
    public void setAltura(int a) {
        super.setAltura(a);
        super.setLargura(a); 
    }
}