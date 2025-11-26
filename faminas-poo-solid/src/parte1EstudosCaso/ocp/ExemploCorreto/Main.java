package ExemploCorreto;

public class Main {
    public static void main(String[] args) {
        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        
        double valorCompra = 100.00;

        double totalEstudante = valorCompra - calculadora.calcular(valorCompra, new DescontoEstudante());
        System.out.println("Valor para Estudante: R$ " + totalEstudante);

        double totalIdoso = valorCompra - calculadora.calcular(valorCompra, new DescontoIdoso());
        System.out.println("Valor para Idoso: R$ " + totalIdoso);

        // A classe CalculadoraDesconto NÃO precisa ser tocada caso algum outro tipo de desconto seja implementado!
    }
}