package ExemploViolacao;

public class Retangulo {
    protected int largura;
    protected int altura;

    public int getArea() {
        return largura * altura;
    }
    
    // Contrato Implícito: setLargura não deve alterar a altura.
    public void setLargura(int l) { 
        this.largura = l;
    }
    
    public void setAltura(int a) {
        this.altura = a;
    }
}