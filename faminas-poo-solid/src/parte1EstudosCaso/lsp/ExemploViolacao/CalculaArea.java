package ExemploViolacao;

public class CalculadoraArea {
    
    // O cliente espera que ao chamar setLargura, a altura não mude.
    public static void testar(Retangulo forma) {
        
        forma.setAltura(5);
        forma.setLargura(4); // Se for um Retangulo, a altura é 5.

        // Se o objeto for um Quadrado, a altura AGORA É 4!
        // O cliente não esperava que o setLargura mudasse a altura.
        if (forma.getArea() != 20) {
            //FALHA
            System.out.println("ERRO: A forma não é substituível. Área esperada 20, obtida: " + forma.getArea());
        }
    }
}