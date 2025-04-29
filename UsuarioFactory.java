public class UsuarioFactory {
    public static Usuario criarUsuario(String tipo, String nome) {
        if ("doador".equalsIgnoreCase(tipo)) return new Doador(nome);
        else if ("instituicao".equalsIgnoreCase(tipo)) return new Instituicao(nome);
        else throw new IllegalArgumentException("Tipo inválido: " + tipo);
    }
}
