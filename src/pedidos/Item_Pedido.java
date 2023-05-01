package pedidos;

public class Item_Pedido {
    private int quantidade;
    private String descricao;
    private double valor;

    public Item_Pedido(int quantidade, String descricao, double valor) {
        super();
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "\nItens: " + '\n' +
                "quantidade: " + quantidade + '\n' +
                "descricao: " + descricao + '\n' +
                "valor: " + valor ;
    }
}
