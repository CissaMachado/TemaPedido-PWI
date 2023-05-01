package pedidos;

import utils.Situacao;
import utils.Validador;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

public class Pedido implements Comparable<Pedido> , Validador {
    private double valor;
    private String data;
    private Situacao sitEnum;
    private ArrayList<Item_Pedido> item_pedidos;

    private int numero ;

    private static int numeroPedidos = 0;

    public Pedido(String data, ArrayList<Item_Pedido> item_pedidos)  {
        this.valor = valor;
        this.data = data;
        this.sitEnum = Situacao.ABERTO;
        this.item_pedidos = item_pedidos;
        this.numero = numeroPedidos++;
    }

    public void cancelado(){
        this.sitEnum = Situacao.CANCELADO;
    }
    public void entregue(){
        this.sitEnum = Situacao.ENTREGUE;
    }

    public double getValor() {
        double valor = 0;
        for (Item_Pedido item_pedido: item_pedidos){
            double quantidade = (double) item_pedido.getQuantidade();
                    valor += (quantidade * (item_pedido.getValor()));
        }
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

    public int getNumero() {
        return numero;
    }

    @Override
    public boolean validaData(String data) {
        // Converte a data de String para LocalDate
        LocalDate dataPedido = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        // Obtém o ano da data do pedido
        int anoPedido = dataPedido.getYear();
        if(anoPedido < 2019){
            this.sitEnum = Situacao.CANCELADO;
            return false;
        }else
            return true;
    }

    @Override
    public int compareTo(Pedido pedido) {
        return Double.compare(this.valor, pedido.valor);
    }

    @Override
    public String toString() {
        return "\nPedido: " + '\n' +
                "Numero do pedido: " + numero + '\n' +
                "valor: " + getValor() + '\n' +
                "data: " + data + " "+ validaData(data) + '\n' +
                "sitEnum: " + sitEnum.getNome() + '\n' +
                "itens:  " + item_pedidos ;
    }
}
