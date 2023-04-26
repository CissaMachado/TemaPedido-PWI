package utils;

public enum Situacao {
    ABERTO("Pedido em aberto", 1),
    CANCELADO("Pedido Canecelado", 2),
    ENTREGUE("Pedido entregue", 3);
    private String nome;
    private int id;

    Situacao(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
