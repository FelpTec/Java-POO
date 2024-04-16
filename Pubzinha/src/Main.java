public class Main {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[2];
        Livro[] livros = new Livro[3];

        pessoas[0] = new Pessoa("Jeff", 32, "Masculino");
        pessoas[1] = new Pessoa("Creuza", 23, "Feminino");

        livros[0] = new Livro("Java", "Curso em Vídeo", 50, pessoas[0]);
        livros[1] = new Livro("POO", "Guanabara", 32, pessoas[1]);
        livros[2] = new Livro("Algoritmos", "Felps", 76, pessoas[0]);

        livros[0].abrir();
        livros[0].folhear(20);
        livros[0].fechar();

        System.out.println(livros[0].detalhes());
    }
}