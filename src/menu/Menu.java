package menu;

import pedidos.Item_Pedido;
import pedidos.Pedido;
import pessoas.ClientePF;
import utils.Situacao;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Menu {

    public static void main(String[] args) {
        ArrayList<ClientePF> clientePFS = new ArrayList<>();

        while (true) {
            switch (montaMenu()) {
                case 1:

                    String nome = JOptionPane.showInputDialog("informe seu nome:");
                    String enedereco = JOptionPane.showInputDialog("informe seu endereço:");
                    String cpf = JOptionPane.showInputDialog("informe seu cpf:");
                    String telefone = JOptionPane.showInputDialog("informe o seu telefone:");

                    Set<Pedido> pedidos = new TreeSet<>();
                    ArrayList<Item_Pedido> item_pedidos = new ArrayList<>();

                    int quant_pedido = Integer.parseInt(JOptionPane.showInputDialog("Quantos Pedidos você quer realizar?"));

                    for(int i=0; i<quant_pedido; i++) {

                    int itens =Integer.parseInt(JOptionPane.showInputDialog("Quantos itens você quer pedir? "));

                    for(int it=0; it<itens; it++){
                        String descricao = JOptionPane.showInputDialog("informe o nome do item: ");
                        int quantidade = Integer.parseInt((JOptionPane.showInputDialog("Informe a quantidade que você pediu dele:  ")));
                        double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do item? Use ponto, não virgula!"));
                        item_pedidos.add(new Item_Pedido(quantidade,descricao,valor));
                    }

                        String data = JOptionPane.showInputDialog("Qual é a data do seu pedido? Informe no padrão yy/yy/yyyy: ");
                        Pedido novo_pedido = new Pedido(data, item_pedidos);

                        if (novo_pedido.validaData(data) == false) {
                            JOptionPane.showMessageDialog(null, "A data informada é inválida");
                        }else {
                            int sit = Integer.parseInt(JOptionPane.showInputDialog("Qual o estado do frete: \n1- Aberto, \n2- Entregue, \n3 - Cancelado"));
                            if (sit == 1) {
                                pedidos.add(novo_pedido);
                            }
                            ;
                            if (sit == 2) {
                                novo_pedido.entregue();
                                pedidos.add(novo_pedido);
                            }
                            ;
                            if (sit == 3) {
                                novo_pedido.cancelado();
                                JOptionPane.showMessageDialog(null, "Seu pedido foi cancelado");
                            }
                            ;
                            clientePFS.add(new ClientePF(nome, enedereco, cpf, telefone, pedidos));
                        }
                        }
                    break;
                case 2:
                    boolean flag=false;
                    if(clientePFS!=null && !clientePFS.isEmpty()){
                        String pesquisa=JOptionPane.showInputDialog("Informe seu nome ou cpf:  ");
                        for(ClientePF clientePF: clientePFS){
                            if(clientePF!=null && clientePF.getNome().equals(pesquisa) ||clientePF.getCpf().equals(pesquisa) ){
                                JOptionPane.showMessageDialog(null,"Cliente: "+clientePF.toString());
                                flag=true;
                            }
                        }
                    }
                    if(!flag)
                        JOptionPane.showMessageDialog(null,"O nome ou cpf não existem no sistema");
                    break;
                case 3:
                    flag = false;
                    if(clientePFS!=null && !clientePFS.isEmpty() ){
                        int num_pesqu = Integer.parseInt(JOptionPane.showInputDialog("Informe o número do seu pedido para pesquisa"));
                        for(ClientePF clientePF: clientePFS){
                            for (Pedido pedido : clientePF.getPedidos()){
                                    if(pedido.getNumero() == num_pesqu){
                                        JOptionPane.showMessageDialog(null,"Cliente: "+clientePF.toString());
                                    }else
                                        JOptionPane.showMessageDialog(null,"O Pedido não existe no sistema");
                            }
                        }
                    }
                    if(!flag)
                        JOptionPane.showMessageDialog(null,"Não existem pedidos cadastrados no sistema");
                    break;
                case 4:
                    flag = false;
                    for(ClientePF clientePF: clientePFS) {
                        if (clientePF != null) {
                            JOptionPane.showMessageDialog(null, clientePF.toString());
                        }
                    }
                    if(!flag)
                        JOptionPane.showMessageDialog(null,"Não existem clientes cadastrados no sistema");
                    break;
                case 5:
                    flag = false;
                    for(ClientePF clientePF: clientePFS) {
                        if (clientePF != null) {
                            JOptionPane.showMessageDialog(null, clientePF.getNome());
                        }
                    }
                    if(!flag)
                        JOptionPane.showMessageDialog(null,"Não existem clientes cadastrados no sistema");
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }
    }
    private static int montaMenu() {
        String str = "";
        for(MenuEnum menuEnum : MenuEnum.values())
            str += menuEnum.getNumMenu()+ " " +
                    menuEnum.getTextoMenu() + "\n";
        return Integer.parseInt(JOptionPane.showInputDialog(str));

    }
}
