public class Bank implements Atm {

    private Double saldo;

    public Bank() {
        this.saldo = 0.0;
    }

    public Double getSaldo() {
        return saldo;
    }


    @Override
    public void withdrawal(Double value) throws Exception {
        if (value > saldo) {
            throw new Exception("Voce nao pode sacar este valor");
        } else {
            this.saldo = saldo - value;
        }
    }

    @Override
    public void deposit(Double value) {
        if (value >= 0){
            this.saldo += value;
        }
    }
}
