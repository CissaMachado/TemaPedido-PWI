package pedidos;

import utils.Situacao;
import utils.Validador;

import java.util.List;

public class Pedido implements Validador {
    private double valor;
    private String data;
    private int numero;
    private Situacao sitEnum;
    private List<Item_Pedido> item_pedidos;


    public Pedido(double valor, String data, int numero, Situacao sitEnum, List<Item_Pedido> item_pedidos) {
        this.valor = valor;
        this.data = data;
        this.numero = numero;
        this.sitEnum = Situacao.ABERTO;
        this.item_pedidos = item_pedidos;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Situacao getSitEnum() {
        return sitEnum;
    }

    public void setSitEnum(Situacao sitEnum) {
        this.sitEnum = sitEnum;
    }

    public List<Item_Pedido> getItem_pedidos() {
        return item_pedidos;
    }

    public void setItem_pedidos(List<Item_Pedido> item_pedidos) {
        this.item_pedidos = item_pedidos;
    }

    @Override
    public boolean validaData() {
        return false;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "valor=" + valor +
                ", data='" + data + '\'' +
                ", numero=" + numero +
                ", sitEnum=" + sitEnum +
                ", item_pedidos=" + item_pedidos +
                '}';
    }

}
