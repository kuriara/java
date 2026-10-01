package Cinema;

public class Filme {

    String titulo;
    String genero;
    int duracao;
    int idadeMinima;

    public Filme(String titulo, String genero, int duracao, int idadeMinima) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
        this.idadeMinima = idadeMinima;
    }

    boolean verificarIdade(int idade) {
        if (idade >= idadeMinima) {
            return true;
        }
        return false;
    }

    void exibirDados() {
        System.out.println("Título do filme: " + titulo);
        System.out.println("Gênero do filme: " + genero);
        System.out.println("Duração do filme: " + duracao);
        System.out.println("Idade mínima: " + idadeMinima);
    }

}
