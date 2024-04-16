public class Main {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.play();
        c.aumentarVolume();
        c.ligarMudo();
        c.desligarMudo();
        c.pause();
        c.abrirMenu();
    }
}