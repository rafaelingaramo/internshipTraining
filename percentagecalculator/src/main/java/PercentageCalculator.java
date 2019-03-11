/*
    Por que esse código imprime zero?
    Quais são as ciladas de trabalhar com tipos numericos primitivos
    Quais conversoes devem ser feitas para exibir o valor corretamente
    AutoUnboxing e AutoBoxing
    Operações entre Tipos Maiores e Menores (Double / Integer) o que acontece por baixo dos panos?
    Inicialização de valores default do Java
 */
public class PercentageCalculator {
    public static void main(String[] args) {
        int total = 100;
        int partial = 50;

        System.out.println("O Percentual do todo é: " + partial/total*100);
        System.out.println("O Percentual do todo é: " + (partial/total)*100);

        System.out.println("O Percentual do todo é: " + Integer.valueOf(partial).doubleValue()/
            Integer.valueOf(total).doubleValue()*100);

        System.out.println("O Percentual do todo é: " + Integer.valueOf(partial).doubleValue()/
            total*100);


    }
}
