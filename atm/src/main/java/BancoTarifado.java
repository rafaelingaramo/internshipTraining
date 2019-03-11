public class BancoTarifado implements Atm {

    private Double saldo,tarifa=5.0;

    public BancoTarifado() {
        this.saldo = 0.0;
    }

    public Double getSaldo() {
        return saldo;
    }

    @Override
    public void withdrawal(Double value) throws Exception {
        if ((value+tarifa) > saldo) {
            throw new Exception("Voce nao pode sacar este valor");
        } else {
            this.saldo = saldo - (value+tarifa);
        }

    }

    @Override
    public void deposit(Double value) {
        if (value >= 0){
            this.saldo += value;
        }
    }
}
