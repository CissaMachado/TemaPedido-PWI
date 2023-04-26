package pedidos;

import utils.Situacao;
import utils.Validador;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Pedido implements Comparable<Pedido>, Validador {
    private double valor;
    private String data;
    private Situacao sitEnum;
    private ArrayList<Item_Pedido> item_pedidos;
    private static int numeroPedidos = 0;

    public Pedido(double valor, String data, Situacao sitEnum, ArrayList<Item_Pedido> item_pedidos) {
        this.valor = valor;
        this.data = data;
        this.sitEnum = sitEnum;
        this.item_pedidos = item_pedidos;
        numeroPedidos++;
    }

    public void cancelado(){
        this.sitEnum = Situacao.CANCELADO;
    }
    public void entregue(){
        this.sitEnum = Situacao.ENTREGUE;
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

    public ArrayList<Item_Pedido> getItem_pedidos() {
        return item_pedidos;
    }

    public void setItem_pedidos(ArrayList<Item_Pedido> item_pedidos) {
        this.item_pedidos = item_pedidos;
    }

    public static int getTotalPedidos(){
        return numeroPedidos;
    }

    @Override
    public boolean validaData() {
        // Converte a data de String para LocalDate
        LocalDate dataPedido = LocalDate.parse(this.data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        // Obtém o ano da data do pedido
        int anoPedido = dataPedido.getYear();
        if(anoPedido >= 2019){
            return true;
        }else
        return false;
    }
    @Override
    public int compareTo(Pedido pedido) {
        return Double.compare(this.valor, pedido.valor);
    }

    @Override
    public String toString() {
        return "Pedido: " +
                "valor: " + valor + '\'' +
                "data: " + data + '\'' +
                "sitEnum: " + sitEnum + '\'' +
                "item_pedidos: " + item_pedidos +
                ' ';
    }
}
