public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Construtor
    public Lutador(String no, String na, int id, float alt, float pe, int vi, int der, int emp ){
        setNome(no);
        setAltura(alt);
        setIdade(id);
        setNacionalidade(na);
        setPeso(pe);
        setVitorias(vi);
        setDerrotas(der);
        setEmpates(emp);
    }

    //Métodos
    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }

    public void apresentar() {
        System.out.println("============================================");
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println("Idade:" + getIdade());
        System.out.println("Com " + getAltura() + " m de altura");
        System.out.println("Pesando " + getPeso() + "Kgs");
        System.out.println("Já ganhou " + getVitorias() + " vezes!");
        System.out.println("Já perdeu " + getDerrotas() + " vezes!");
        System.out.println("E empatou " + getEmpates() + " vezes!");
    }

    public void status() {
        System.out.println("=============================================");
        System.out.println("Nome: " + getNome());
        System.out.println("Da categoria: " + getCategoria());
        System.out.println(getVitorias() + " vitórias");
        System.out.println(getDerrotas() + " derrotas");
        System.out.println(getEmpates() + " empates");
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2) {
            this.categoria = "Inválido!";
        }
        else if(this.peso <= 70.2) {
            this.categoria = "Leve";
        }
        else if(this.peso <= 83.9) {
            this.categoria = "Médio";
        }
        else if(this.peso <= 120.2) {
            this.categoria = "Pesado";
        }
        else{
            this.categoria = "Inválido!";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
