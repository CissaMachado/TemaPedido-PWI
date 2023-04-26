package utils;

import pedidos.Pedido;

public interface Validador {
    boolean validaData();

    int compareTo(Pedido pedido);
}
