package ExemploCorreto;

public class DescontoIdoso implements Desconto {
    @Override
    public double aplicarDesconto(double valor) {
        return valor * 0.20; 
    }
}