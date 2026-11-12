package ExemploViolacao;

public class MainViolacao {
    public static void main(String[] args) {
        CalculadoraDescontoViolacao calc = new CalculadoraDescontoViolacao();
        
        double valor = 100.0;

        System.out.println(valor - calc.calcularParaEstudante(valor));

        System.out.println(valor - calc.calcularParaIdoso(valor));
    }
}