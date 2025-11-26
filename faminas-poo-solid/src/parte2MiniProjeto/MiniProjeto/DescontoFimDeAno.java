package MiniProjeto;

public class DescontoFimDeAno implements RegraDeDesconto {
    @Override
    public double calcular(double valorTotal) {
        return valorTotal * 0.20;
    }
}