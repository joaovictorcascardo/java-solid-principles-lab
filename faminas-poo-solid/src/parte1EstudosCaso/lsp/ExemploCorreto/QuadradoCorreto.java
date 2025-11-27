package AplicacaoLSP;

// O Quadrado NÃO implementa FormaRedimensionavel.
// Ele implementa apenas Forma (o que ele realmente é).
public class QuadradoCorreto implements IForma {
    private int lado;

    // Construtor ou método para definir o lado.
    public void setLado(int l) {
        this.lado = l;
    }

    @Override
    public int getArea() {
        return lado * lado;
    }
}