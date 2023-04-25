
import pedidos.Item_Pedido;
import pedidos.Pedido;
import pessoas.ClientePF;
import utils.Situacao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Item_Pedido iP1 = new Item_Pedido(2,"oioioi", 5.99);
        ArrayList<Item_Pedido> item_pedidos = new ArrayList<>();
        item_pedidos.add(iP1);

        System.out.println(item_pedidos);

        Pedido p1 = new Pedido(5.99,"22/11/2003", 2,Situacao.ABERTO, item_pedidos);

        System.out.println(p1);

        TreeSet<Pedido> pedidos = new TreeSet<>();
        pedidos.add(p1);

        Iterator var3 =pedidos.iterator();
        while(var3.hasNext()) {
            Pedido item = (Pedido) var3.next();
            System.out.println(item.toString());
        }

        //ClientePF clientePF = new ClientePF("nnn","867","999","9990", (Set<Pedido>) iterador);

        //System.out.println(clientePF);

        }

}