package adapters.in;

import adapters.out.PedidoArquivo;
import adapters.out.PedidoEmMemoria;
import application.CriarPedido;
import application.CriarPedidoService;
import application.PedidoRepository;
import domain.Pedido;

public class Main {
    public static void main(String[] args) {
        String tipo = args.length > 0 ? args[0] : "memoria";

        PedidoRepository repo = tipo.equals("arquivo")
                ? new PedidoArquivo()
                : new PedidoEmMemoria();

        CriarPedido criarPedido = new CriarPedidoService(repo);

        Pedido p1 = criarPedido.executar("Maria", 150.0);
        System.out.println("Frete gratis? " + p1.temFreteGratis());

        Pedido p2 = criarPedido.executar("Joao", 60.0);
        System.out.println("Frete gratis? " + p2.temFreteGratis());
    }
}
