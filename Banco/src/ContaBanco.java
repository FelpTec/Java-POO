public class ContaBanco {
    public int numConta;
    protected String tipoConta;
    private String dono;
    private Double saldo;
    private boolean status;

    public ContaBanco() {
        this.status = false;
        this.saldo = 0.0;
        this.numConta = 0;
        this.tipoConta = "";
        this.dono = "";
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {

        this.tipoConta = tipoConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipoConta) {
        setTipoConta(tipoConta);
        this.setStatus(true);

        if(tipoConta.equals("CC"))
        {
            this.tipoConta = "CC";
            setSaldo(saldo + 50);
        }
        else if (tipoConta.equals("CP"))
        {
            this.tipoConta = "CP";
            setSaldo(saldo + 150);
        }
        else
        {
            this.tipoConta = "Tipo de conta é inválido!";
        }
    }
    public void fecharConta() {
        if(saldo != 0.0)
        {
            this.setStatus(true);
            System.out.println("Conta não pode ser fechada!Possui saldo ou débitos!");
        }
        else {
            setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(double valor) {
        if(this.getStatus()) {
            this.setSaldo(this.getSaldo() + valor);
        }
        else{
            System.out.println("Conta inativa, não é possível depositar da conta do(a)" + this.getDono());
        }
    }
    public void sacar(double valor) {
        if(this.getStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
            } else {
                System.out.println("Saldo insuficiente!Titular: " + this.getDono());
            }
        }
        else {
            System.out.println("Conta inativa, não é possível sacar da conta do(a)" + this.getDono());
        }
    }
    public void pagarMensalidade() {
        int v = 0;

        if(getTipoConta().equals("CC")){
            v = 12;
        }
        else if(getTipoConta().equals("CP")){
            v = 20;
        }
        if(this.getStatus()) {
            this.setSaldo(getSaldo() - v);
        }
        else{
            System.out.println("Impossível pagar a mensalidade!Conta inativa.");
        }
    }

    public void estadoAtual() {
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipoConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("======================");
    }
}
