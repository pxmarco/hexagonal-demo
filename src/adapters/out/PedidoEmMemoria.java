package adapters.out;

import application.PedidoRepository;
import domain.Pedido;
import java.util.ArrayList;
import java.util.List;

public class PedidoEmMemoria implements PedidoRepository {
    private final List<Pedido> pedidos = new ArrayList<>();

    @Override
    public void salvar(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("[MEMORIA] Pedido salvo na lista. Total: " + pedidos.size());
    }
}
