public class Circulo extends Figuras{
    private double raio;

    public Circulo(String cor, double raio){
        super(cor);
        this.raio = raio;
    }
    public Circulo(String cor){
        super(cor);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo [raio = " + raio + ", cor = " + super.getCor() + "]";
    }

    @Override
    public double area() {
        return raio * 3.14 * 2;
    }
}
