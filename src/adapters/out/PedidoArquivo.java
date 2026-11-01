package adapters.out;

import application.PedidoRepository;
import domain.Pedido;
import java.io.FileWriter;
import java.io.IOException;

public class PedidoArquivo implements PedidoRepository {
    @Override
    public void salvar(Pedido pedido) {
        try (FileWriter fw = new FileWriter("pedidos.txt", true)) {
            fw.write(pedido.getCliente() + ";" + pedido.getValor() + "\n");
            System.out.println("[ARQUIVO] Pedido gravado em pedidos.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
