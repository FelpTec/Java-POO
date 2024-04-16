//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();

        c1.estadoAtual();
        c1.setNumConta(1234);
        c1.setDono("Jeff");
        c1.abrirConta("CC");
        c1.estadoAtual();
        c1.depositar(1000);
        c1.estadoAtual();
        c1.fecharConta();
        c1.sacar(1051);
        c1.estadoAtual();
        c1.pagarMensalidade();
        c1.fecharConta();
        c1.estadoAtual();

    }
}