package co.joaodev.banco;

public class Conta {

    private String agencia;
    private String conta;
    private String nome;
    private double balanco;

    private static final int MAX_LENGTH = 12;

    private Log logger;

    public Conta(String agencia, String conta, String nome) {
        this.agencia = agencia;
        this.conta = conta;
        setNome(nome);
        logger = new Log();
    }

    public void setNome(String nome) {
        if(nome.length() > MAX_LENGTH){
            this.nome = nome.substring(0, MAX_LENGTH);
        } else {
            this.nome = nome;
        }
    }

    public boolean Sacar(double valor){
        if (balanco < valor){
            logger.out("SAQUE - R$ " + valor + " Seu saldo é de R$ " + balanco);
            return false;
        }
        balanco -= valor;
        logger.out("SAQUE - R$ " + valor + " Sua conta agora é de R$ " + balanco);
        return true;
    }

    public void Depositar(double valor){
        balanco += valor;
        logger.out(" DEPOSITO - R$ " + valor + " Sua conta agora é de R$ " + balanco);
    }

    @Override
    public String toString(){
        String resultado = "A conta: " + this.nome + " / " + this.agencia + " / " + this.conta + " / possui: R$ " + balanco;
        return resultado;
    }
}
