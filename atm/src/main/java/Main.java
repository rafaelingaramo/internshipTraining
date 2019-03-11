public class Main {

    public static void main(String[] args) {

        Bank b = new Bank();
        BancoTarifado b1 = new BancoTarifado();
        b.deposit(100.0);
        b1.deposit(125.0);
        System.out.println(b.getSaldo());
        try {
           // b.withdrawal(120.0);
            b1.withdrawal(120.0);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("saldo"+ b1.getSaldo());
    }
}
