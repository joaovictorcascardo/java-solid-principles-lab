package MiniProjeto;
// (OCP): essa interface define uma regra pra qualquer outro tipo de desconto que seja feito no futuro.
public interface RegraDeDesconto {
    double calcular(double valorTotal);
}