package application;

import domain.Pedido;

public interface CriarPedido {
    Pedido executar(String cliente, double valor);
}
