
# Doef-cil

> Sistema de doações desenvolvido em Java utilizando padrões de projeto.

## 💡 Descrição

O **Doef-cil** é um sistema simples para gerenciar doações entre doadores e instituições. O projeto foi desenvolvido em Java e faz uso de diversos padrões de projeto para organizar e estruturar melhor o código, como Strategy, Observer, Factory e Adapter.


## 🧠 Padrões de Projeto Utilizados

- **Strategy**: Para diferentes formas de ordenação de doações.
- **Observer**: Para notificar instituições sobre novas doações.
- **Factory**: Para criação de usuários.
- **Adapter**: Para integrar doações antigas ao novo formato.


## 🗂️ Estrutura de Arquivos

| Arquivo                        | Descrição |
|-------------------------------|-----------|
| `Main.java`                   | Classe principal que inicializa o sistema. |
| `Doacao.java`                 | Representa uma doação no sistema. |
| `DoacaoAdapter.java`          | Adapta uma `DoacaoAntiga` ao novo modelo `Doacao`. Implementa o padrão Adapter. |
| `DoacaoAntiga.java`           | Modelo legado de doação utilizado para compatibilidade com versões anteriores. |
| `Doador.java`                 | Representa o doador no sistema, podendo realizar doações. |
| `Instituicao.java`            | Representa uma instituição que pode receber doações. Implementa `Observer`. |
| `InstituicaoObserver.java`    | Implementação do padrão Observer, que reage a novas doações. |
| `Observer.java`               | Interface do padrão Observer, define métodos de notificação. |
| `OrdenacaoStrategy.java`      | Interface do padrão Strategy para definir regras de ordenação. |
| `OrdenarPorNome.java`         | Implementa ordenação de doações por nome. |
| `OrdenarPorCategoria.java`    | Implementa ordenação de doações por categoria. |
| `RepositorioDoacoes.java`     | Armazena e gerencia as doações feitas no sistema. Também notifica observadores. |
| `Usuario.java`                | Classe base abstrata para usuários (doadores e instituições). |
| `UsuarioFactory.java`         | Implementa o padrão Factory, criando instâncias de usuários com base em parâmetros. |
| `README.md`                   | Arquivo de documentação do projeto. |

