public class Livro implements Publicacao{
    //Atributos
    private String titulo;
    private String autor;
    private int totalPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //Construtor
    public Livro(String titulo, String autor, int totalPag, Pessoa leitor){
        setTitulo(titulo);
        setAutor(autor);
        setTotalPag(totalPag);
        setLeitor(leitor);
    }


    //Métodos

    public String detalhes() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ",\n autor ='" + autor + '\'' +
                ",\n totalPag =" + totalPag +
                ", pagAtual =" + pagAtual +
                ", aberto =" + aberto +
                ",\n leitor =" + leitor.getNome() +
                ", Idade =" + leitor.getIdade() +
                ", Sexo =" + leitor.getSexo() +
                '}';
    }


    //Getters and Setters


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPag() {
        return totalPag;
    }

    public void setTotalPag(int totalPag) {
        this.totalPag = totalPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    //Implementação
    @Override
    public void abrir() {
        setAberto(true);
    }

    @Override
    public void fechar() {
        setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if(p > this.totalPag)
        {
            this.pagAtual = 0;
        }
        else{
            setPagAtual(getPagAtual() + p);
        }
    }

    @Override
    public void avancarPag() {
        setPagAtual(+1);
    }

    @Override
    public void voltarPag() {
        setPagAtual(-1);
    }
}
