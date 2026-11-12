# Princípios SOLID em Java

Trabalho da disciplina de Programação Orientada a Objetos (ADS, Faminas). Cada princípio do SOLID tem um exemplo que viola a regra e outro com a versão corrigida, e no final um mini projeto junta tudo num sistema de pedidos e pagamentos.

## Parte 1: estudos de caso (`src/parte1EstudosCaso`)

| Princípio | Violação | Correção |
| --- | --- | --- |
| **S**RP, responsabilidade única | `RelatorioViolacao` gera e envia o relatório | `Relatorio` só gera, `EnviadorRelatorio` só envia |
| **O**CP, aberto/fechado | `CalculadoraDescontoViolacao` cheia de `if` por tipo de cliente | interface `Desconto` com `DescontoEstudante` e `DescontoIdoso` |
| **L**SP, substituição de Liskov | `QuadradoViolacao` herda de `Retangulo` e quebra o comportamento | `Forma` e `FormaRedimencional` separam o que cada forma faz |
| **I**SP, segregação de interfaces | `ServicoDeNotificacao` obriga a implementar métodos que não usa | interfaces menores, `ServicoDeMensagemCorreto` e `ServicoDeLog` |
| **D**IP, inversão de dependência | `NotificadorPedidoViolacao` cria o `GmailService` direto | `NotificadorPedido` depende da interface `Mensageiro` (e-mail ou WhatsApp) |

## Parte 2: mini projeto (`src/parte2MiniProjeto`)

Sistema de pedidos onde as regras de desconto, a forma de pagamento e o canal de notificação são interfaces. Dá pra trocar desconto padrão por desconto de fim de ano, cartão por PIX e e-mail por WhatsApp sem mexer na classe `Pedido`.

## Como rodar o mini projeto

```bash
cd src/parte2MiniProjeto
javac MiniProjeto/*.java
java MiniProjeto.Main
```
