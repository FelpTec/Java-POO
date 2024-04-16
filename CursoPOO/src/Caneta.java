public class Caneta {
    private String modelo;
    private String cor;
    private String tamanho;
    private boolean tampada;
    private float ponta;

    public Caneta(String modelo, String cor, String tamanho, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.tamanho = tamanho;
        this.ponta = ponta;
        tampar();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Tampada: " + this.tampada);
    }
}
