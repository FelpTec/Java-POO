import java.util.*;

public class Luta {

    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Construtor

    //Métodos
    public void marcarLuta (Lutador Lut1, Lutador Lut2) {
        if(Objects.equals(Lut1.getCategoria(), Lut2.getCategoria()) && Lut1 != Lut2) {
            setAprovada(true);
            setDesafiado(Lut1);
            setDesafiante(Lut2);
        }
        else {
            setAprovada(false);
            setDesafiado(null);
            setDesafiante(null);
        }
    }

    public void lutar() {
        if(getAprovada()) {
            System.out.println("===== DESAFIADO =====");
            this.desafiado.apresentar();
            System.out.println("===== DESAFIANTE =====");
            this.desafiante.apresentar();

            Random sorte = new Random();
            int winner = sorte.nextInt(3);

            System.out.println("====== RESULTADO DA LUTA ======");
            switch(winner) {
                case 0:
                {
                    System.out.println("EMPATE!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                }
                case 1:
                {
                    System.out.println(desafiado.getNome() + " É O VENCEDOR!");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                }
                case 2:
                {
                    System.out.println(desafiante.getNome() + " É O VENCEDOR!");
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;
                }
            }
            desafiado.status();
            desafiante.status();
        }
        else{
            System.out.println("A luta não pode acontecer!");
        }
    }

    //Getters and Setters

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
