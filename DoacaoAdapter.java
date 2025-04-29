public class DoacaoAdapter extends Doacao {
    public DoacaoAdapter(DoacaoAntiga antiga) {
        super(antiga.getItem(), antiga.getDetalhes(), "Categoria Desconhecida");
    }
}
