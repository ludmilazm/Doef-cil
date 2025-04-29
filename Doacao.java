public class Doacao {
    private String nome;
    private String descricao;
    private String categoria;

    public Doacao(String nome, String descricao, String categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
    public String getCategoria() { return categoria; }

    @Override
    public String toString() {
        return nome + " - " + categoria + ": " + descricao;
    }
}
