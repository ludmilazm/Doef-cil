import java.util.ArrayList;
import java.util.List;

public class RepositorioDoacoes {
    private static RepositorioDoacoes instancia;
    private List<Doacao> doacoes;

    private RepositorioDoacoes() {
        doacoes = new ArrayList<>();
    }

    public static RepositorioDoacoes getInstancia() {
        if (instancia == null) instancia = new RepositorioDoacoes();
        return instancia;
    }

    public void adicionarDoacao(Doacao doacao) {
        doacoes.add(doacao);
    }

    public List<Doacao> listarDoacoes() {
        return doacoes;
    }
}
