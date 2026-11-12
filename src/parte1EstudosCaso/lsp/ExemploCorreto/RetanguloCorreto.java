package ExemploCorreto;

// O Retangulo implementa a interface de forma redimensionável.
public class RetanguloCorreto implements IFormaRedimensionavel {
    private int largura;
    private int altura;

    @Override
    public void setLargura(int l) { 
        this.largura = l; // Apenas largura muda.
    }
    
    @Override
    public void setAltura(int a) {
        this.altura = a; // Apenas altura muda.
    }
    
    // ...
}