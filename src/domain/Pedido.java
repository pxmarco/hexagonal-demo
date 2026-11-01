package domain;

public class Pedido {
    private final String cliente;
    private final double valor;

    public Pedido(String cliente, double valor) {
        if (valor <= 0) throw new IllegalArgumentException("Valor deve ser positivo");
        this.cliente = cliente;
        this.valor = valor;
    }

    // Regra de negocio: acima de R$ 100 ganha frete gratis
    public boolean temFreteGratis() {
        return valor > 100;
    }

    public String getCliente() { return cliente; }
    public double getValor() { return valor; }
}
