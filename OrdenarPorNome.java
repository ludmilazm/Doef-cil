import java.util.Comparator;
import java.util.List;

public class OrdenarPorNome implements OrdenacaoStrategy {
    @Override
    public void ordenar(List<Doacao> lista) {
        lista.sort(Comparator.comparing(Doacao::getNome));
    }
}
