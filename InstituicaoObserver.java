public class InstituicaoObserver implements Observer {
    private String nomeInstituicao;

    public InstituicaoObserver(String nome) {
        this.nomeInstituicao = nome;
    }

    @Override
    public void notificar(Doacao doacao) {
        System.out.println("[Notificação] " + nomeInstituicao + " recebeu nova doação: " + doacao.getNome());
    }
}
