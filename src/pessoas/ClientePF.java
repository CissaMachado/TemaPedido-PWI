package pessoas;

import pedidos.Pedido;

import java.util.Set;
import java.util.TreeSet;

public final class ClientePF extends Cliente {

    private String cpf;
    private String telefone;
    private Set<Pedido> pedidos = new TreeSet<>();

    public ClientePF(String nome, String endereco, String cpf, String telefone,Set<Pedido> pedidos) {
        super(nome, endereco);
        this.cpf = cpf;
        this.telefone = telefone;
        this.pedidos = pedidos;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Set<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void removerPedido(Pedido pedido) {
        pedidos.remove(pedido);
    }

    @Override
    public String toString() {
        return "ClientePF: " + '\n' +
                "Nome: " + getNome() + '\n' +
                "Endereço: " + getEndereco() + '\n' +
                "CPF: " + cpf + '\n' +
                "Telefone: " + telefone + '\n' +
                "Pedidos: " + pedidos + '\n';
    }
}
