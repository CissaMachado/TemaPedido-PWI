package pessoas;

import pedidos.Pedido;

import java.util.Set;
import java.util.TreeSet;

public final class ClientePF extends Cliente {

    private String cpf;
    private String telefone;
    Set<Pedido> pedidos = new TreeSet<>();

    public ClientePF(String nome, String endereco, String cpf, String telefone, Set<Pedido> pedidos) {
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
}
