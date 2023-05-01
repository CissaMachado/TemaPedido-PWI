package utils;

import pedidos.Pedido;

public interface Validador {

    boolean validaData(String data);

    int compareTo(Pedido pedido);
}
