package testes;

import pedidos.Item_Pedido;
import pedidos.Pedido;;
import pessoas.ClientePF;
import utils.Situacao;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class testePedidos {
    public static void main(String[] args)   {
        ArrayList<Item_Pedido> item_pedidos = new ArrayList<>();
        item_pedidos.add(new Item_Pedido(2, "aaa", 5.99));


            Pedido novoPedido = new Pedido("10/05/2019", item_pedidos);
            if(novoPedido.validaData(novoPedido.getData()) == false){
                System.out.println("Data inválida");
                novoPedido.cancelado();
            }else {
                Set<Pedido> pedidos = new TreeSet<>();
                pedidos.add(novoPedido);



            /*pedidos.add(new Pedido(10.50, "10/05/2020", Situacao.ABERTO, item_pedidos));
            pedidos.add(new Pedido(10.55, "10/05/2029", Situacao.CANCELADO, item_pedidos));
            pedidos.add(new Pedido(8.99, "15/11/2022", Situacao.ENTREGUE, item_pedidos));
            pedidos.add(new Pedido(150.78, "29/04/2019", Situacao.ENTREGUE, item_pedidos));
            pedidos.add(new Pedido(260.88, "18/12/2020", Situacao.ABERTO, item_pedidos));*/


                ClientePF clientePF = new ClientePF("ju", "ruacarlos", "867", "5199", pedidos);



                System.out.println("-----------------");
                System.out.println("\n");
                System.out.println(clientePF);
                System.out.println(Pedido.getTotalPedidos());

            }
    }
    }

