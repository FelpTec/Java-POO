//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public abstract class Figuras {
    private String cor;

    public Figuras() {

    }

    public Figuras(String cor) {
        super();
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    @Override
    public String toString() {
        return "Figuras [cor=" + cor + "]";
    }

    public abstract double area();
}
