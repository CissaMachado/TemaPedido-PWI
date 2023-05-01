package menu;

public enum MenuEnum {
    CAD (1, "– Cadastrar Cliente"),
    PESQ_NUM (2, "- Pesquisar Cliente o nome ou a razão social do cliente"),
    PESQ_PED (3, "- Pesquisar Cliente usando o número do pedido"),
    LIST_CLI (4, "- Listar todos Clientes"),
    LIST_NAME (5, "- Listar todos Clientes ordenados pelo nome"),
    SAIR (6, "-Sair");

    private int numMenu;
    private String textoMenu;
    private MenuEnum(int numMenu, String textoMenu){
        this.numMenu = numMenu;
        this.textoMenu = textoMenu;
    };
    public int getNumMenu(){
        return numMenu;
    };
    public String getTextoMenu(){
        return textoMenu;
    }

}

