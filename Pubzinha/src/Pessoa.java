public class zc\\Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private String sexo;

    //Construtor
    public Pessoa(String nome, int idade, String sexo){
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
    }

    //Métodos
    public void fazerNiver() {
        this.setIdade(this.getIdade() + 1);
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
