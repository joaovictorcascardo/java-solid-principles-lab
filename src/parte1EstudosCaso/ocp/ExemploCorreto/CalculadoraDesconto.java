package ExemploCorreto;

public class CalculadoraDesconto{
    public double calcular(double valor, Desconto regraDeDesconto) {
        return regraDeDesconto.aplicarDesconto(valor);
    }
}