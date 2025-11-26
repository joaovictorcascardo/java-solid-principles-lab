package ExemploViolacao;

public class CalculadoraDescontoViolacao {
    // chamo O método do estudante explicitamente
    public double calcularParaEstudante(double valor) {
        return valor * 0.10; 
    }
    public double calcularParaIdoso(double valor) {
        return valor * 0.20; 
    }
    
}