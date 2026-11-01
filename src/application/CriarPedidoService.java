package application;

import domain.Pedido;

public class CriarPedidoService implements CriarPedido {
    private final PedidoRepository repository;

    // Recebe a PORTA, nao sabe qual adaptador e (injecao de dependencia)
    public CriarPedidoService(PedidoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Pedido executar(String cliente, double valor) {
        Pedido pedido = new Pedido(cliente, valor);
        repository.salvar(pedido);
        return pedido;
    }
}
