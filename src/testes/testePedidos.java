package testes;

import pedidos.Item_Pedido;
import pedidos.Pedido;;
import pessoas.ClientePF;
import utils.Situacao;

import java.util.ArrayList;
import java.util.TreeSet;

public class testePedidos {
    public static void main(String[] args) {

        ArrayList<Item_Pedido> item_pedidos = new ArrayList<>();
        item_pedidos.add(new Item_Pedido(2, "aaa", 5.99));

        TreeSet<Pedido> pedidos = new TreeSet<>();
        pedidos.add(new Pedido(5.99, "22/11/2019", Situacao.ABERTO, item_pedidos));
        pedidos.add(new Pedido(6.99,"22/11/2024", Situacao.ENTREGUE, item_pedidos));

        ClientePF clientePF = new ClientePF("ju", "ruacarlos", "867", "5199", pedidos);
        System.out.println(pedidos);
        System.out.println("-----------------");
        System.out.println("\n");
        System.out.println(clientePF);

        }

    }
